-- MySQL dump 10.13  Distrib 5.7.21, for Win64 (x86_64)
--
-- Host: localhost    Database: tietopeli
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `tietopeli`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `tietopeli` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `tietopeli`;

--
-- Table structure for table `kysymys`
--

DROP TABLE IF EXISTS `kysymys`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kysymys` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Teksti` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kysymys`
--

LOCK TABLES `kysymys` WRITE;
/*!40000 ALTER TABLE `kysymys` DISABLE KEYS */;
/*!40000 ALTER TABLE `kysymys` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kysymysvaihtoehdot`
--

DROP TABLE IF EXISTS `kysymysvaihtoehdot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kysymysvaihtoehdot` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kysymysid` int(11) NOT NULL,
  `teksti` varchar(255) NOT NULL,
  `oikeavastaus t/f` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `kysymysvaihtoehdot_kysymys_id_fk` (`kysymysid`),
  CONSTRAINT `kysymysvaihtoehdot_kysymys_id_fk` FOREIGN KEY (`kysymysid`) REFERENCES `kysymys` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kysymysvaihtoehdot`
--

LOCK TABLES `kysymysvaihtoehdot` WRITE;
/*!40000 ALTER TABLE `kysymysvaihtoehdot` DISABLE KEYS */;
/*!40000 ALTER TABLE `kysymysvaihtoehdot` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-22 10:52:26

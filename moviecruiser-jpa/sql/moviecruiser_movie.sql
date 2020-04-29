-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: moviecruiser
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie` (
  `mv_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `mv_active` bit(1) DEFAULT NULL,
  `mv_box_office` varchar(255) DEFAULT NULL,
  `mv_date_of_launch` date DEFAULT NULL,
  `mv_genre` varchar(255) DEFAULT NULL,
  `mv_has_teaser` bit(1) DEFAULT NULL,
  `poster` varchar(255) DEFAULT NULL,
  `mv_title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`mv_id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (1,_binary '','100','2020-04-24','Action',_binary '','https://www.joblo.com/assets/images/joblo/posters/2020/03/extraction_netflix_xlg_thumb.jpg','Extraction'),(2,_binary '','100','2020-05-15','Animation',_binary '','https://www.joblo.com/assets/images/joblo/posters/2020/03/1_thumb.jpg','Generic Movie Name'),(3,_binary '','89','2019-11-27','Drama',_binary '\0','https://www.joblo.com/assets/images/joblo/posters/2019/12/two-popes_thumb.jpg','The Two Popes'),(4,_binary '','63','2018-11-14','Horror',_binary '','https://www.joblo.com/assets/images/joblo/posters/2018/12/bird-box-poster_thumb.jpg','Birdbox'),(5,_binary '\0','5','2017-12-22','Thriller',_binary '','https://www.joblo.com/assets/images/oldsite/posters/images/full/hangman-poster1big_thumb.jpg','Hangman');
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-29 21:16:47

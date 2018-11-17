-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: railway
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `person` (
  `user_id` int(11) NOT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `contact_no` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (78,'Janita','Joy','1998-06-23',NULL,'Mira Road','Female',NULL),(119,'Janice','Johnson','1998-11-03',NULL,'Andheri East, Mumbai','Female',NULL),(123,'Janice','Johnson','1998-11-03',NULL,'Andheri East','Female',NULL),(151,'a','b','1990-01-01',NULL,'b','Female',NULL),(153,'Natasha ','Birader','1993-05-04',NULL,'Malad','Female',NULL),(198,'Leena','Johnson','1997-07-10',NULL,'Andheri East','Female',NULL),(201,'c','c','1990-04-01',NULL,'hello','Male',NULL),(281,'Prerna','Bhavsar','1993-01-06',NULL,'Malad','Female',NULL),(323,'Rita','Roy','1994-03-01',NULL,'Here		','Female',NULL),(326,'john','john','1990-01-01',NULL,'john	','Male',NULL),(423,'Rita ','Royy','1990-05-04',NULL,'hereeeeee','Female',NULL),(472,'Ivan','Francis','1993-04-29',NULL,'andheri','Male',NULL),(487,'cc','cc','1990-01-01',NULL,'gg','Male',NULL),(531,'Tommy','hello','1990-01-01',NULL,'svsd','Male',NULL),(537,'hij','hij','1990-01-01',NULL,'hij','Male',NULL),(615,'Clay','Jenson','1994-03-04',NULL,'Chicago','Male',NULL),(649,'Kitty','Shah','1990-01-03',NULL,'Andheri','Female',NULL),(682,'Tom','Hanks','1990-01-03',NULL,'andheri','Male',NULL),(818,'Johnson','j','1990-01-01',NULL,'jj	','Male',NULL),(1009,'Kiran','Roy','1998-11-03',19,'Here','Female',342),(1029,'Janita','Joy','1998-07-23',NULL,'Mira Road','Female',NULL),(1063,'john','o','1990-01-01',NULL,'jlj','Female',NULL),(1233,'joke','joke','1998-11-03',56,'hiii','Female',899565656);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-09-24 10:50:16

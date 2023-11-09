-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: stu
-- ------------------------------------------------------
-- Server version	5.7.24

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
-- Table structure for table `stu_class`
--

DROP TABLE IF EXISTS `stu_class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stu_class` (
  `class_id` int(11) NOT NULL,
  `class_name` varchar(45) DEFAULT NULL,
  `class_starttime` date DEFAULT NULL,
  `class_lasttime` date DEFAULT NULL,
  `terch_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='学生班级表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stu_class`
--

LOCK TABLES `stu_class` WRITE;
/*!40000 ALTER TABLE `stu_class` DISABLE KEYS */;
INSERT INTO `stu_class` VALUES (1,'java班','2023-05-20','2023-11-01',1),(2,'日语班','2023-06-20','2023-12-30',2);
/*!40000 ALTER TABLE `stu_class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stu_class_relation`
--

DROP TABLE IF EXISTS `stu_class_relation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stu_class_relation` (
  `relation_id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` int(11) DEFAULT NULL,
  `class_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`relation_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stu_class_relation`
--

LOCK TABLES `stu_class_relation` WRITE;
/*!40000 ALTER TABLE `stu_class_relation` DISABLE KEYS */;
INSERT INTO `stu_class_relation` VALUES (1,1001,'1'),(2,1001,'2'),(3,1002,'1'),(4,1003,'2'),(5,1004,'1'),(6,1004,'2');
/*!40000 ALTER TABLE `stu_class_relation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stu_course`
--

DROP TABLE IF EXISTS `stu_course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stu_course` (
  `idstu_course` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idstu_course`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stu_course`
--

LOCK TABLES `stu_course` WRITE;
/*!40000 ALTER TABLE `stu_course` DISABLE KEYS */;
/*!40000 ALTER TABLE `stu_course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stu_getday`
--

DROP TABLE IF EXISTS `stu_getday`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stu_getday` (
  `getday_id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` int(11) DEFAULT NULL,
  `周一` varchar(45) DEFAULT NULL,
  `周二` varchar(45) DEFAULT NULL,
  `周三` varchar(45) DEFAULT NULL,
  `周四` varchar(45) DEFAULT NULL,
  `周五` varchar(45) DEFAULT NULL,
  `teach_leave` varchar(45) DEFAULT NULL,
  `主动性` varchar(45) DEFAULT NULL COMMENT '满分十分',
  `动手能力` varchar(45) DEFAULT NULL,
  `沟通` varchar(45) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`getday_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COMMENT='出勤表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stu_getday`
--

LOCK TABLES `stu_getday` WRITE;
/*!40000 ALTER TABLE `stu_getday` DISABLE KEYS */;
INSERT INTO `stu_getday` VALUES (1,1001,'1','2','1','1','1','有进步','8','9','7',1),(2,1001,'2','1','1','2','2','经常旷课','7','6','5',2);
/*!40000 ALTER TABLE `stu_getday` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stu_table`
--

DROP TABLE IF EXISTS `stu_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stu_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学生编号',
  `stu_id` int(11) NOT NULL COMMENT '学生状态',
  `stu_name` varchar(10) NOT NULL COMMENT '学生名',
  `stu_gender` char(2) NOT NULL COMMENT '性别',
  `stu_day` date DEFAULT NULL COMMENT '出生日期',
  `stu_state` varchar(45) DEFAULT NULL COMMENT '出勤状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COMMENT='学生信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stu_table`
--

LOCK TABLES `stu_table` WRITE;
/*!40000 ALTER TABLE `stu_table` DISABLE KEYS */;
INSERT INTO `stu_table` VALUES (12,1001,'jack','女','2001-01-02',NULL),(13,1002,'tom','男','2001-03-02',NULL),(14,1003,'H','男','2001-04-05',NULL),(15,1004,'小刘','男','2003-01-09',NULL);
/*!40000 ALTER TABLE `stu_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stu_teach`
--

DROP TABLE IF EXISTS `stu_teach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stu_teach` (
  `teach_id` int(11) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `nick_name` varchar(45) DEFAULT NULL,
  `lastLoginTime` date DEFAULT NULL,
  PRIMARY KEY (`teach_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stu_teach`
--

LOCK TABLES `stu_teach` WRITE;
/*!40000 ALTER TABLE `stu_teach` DISABLE KEYS */;
INSERT INTO `stu_teach` VALUES (1,'单老师','123456','单',NULL),(2,'娄老师','666666','娄',NULL);
/*!40000 ALTER TABLE `stu_teach` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-09 22:33:30

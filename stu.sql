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
CREATE TABLE `stu_class`
(
    `class_id`   int(11) NOT NULL,
    `class_name` varchar(45) DEFAULT NULL,
    PRIMARY KEY (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='学生班级表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stu_class`
--

LOCK
TABLES `stu_class` WRITE;
/*!40000 ALTER TABLE `stu_class` DISABLE KEYS */;
INSERT INTO `stu_class`
VALUES (1, '小班'),
       (2, '中班');
/*!40000 ALTER TABLE `stu_class` ENABLE KEYS */;
UNLOCK
TABLES;

--
-- Table structure for table `stu_grade`
--

DROP TABLE IF EXISTS `stu_grade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stu_grade`
(
    `id_grade` int(11) NOT NULL,
    `chinese`  int(11) DEFAULT NULL,
    `math`     int(11) DEFAULT NULL,
    `english`  int(11) DEFAULT NULL,
    `science`  int(11) DEFAULT NULL,
    `stu_id`   int(11) DEFAULT NULL,
    PRIMARY KEY (`id_grade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='学生成绩表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stu_grade`
--

LOCK
TABLES `stu_grade` WRITE;
/*!40000 ALTER TABLE `stu_grade` DISABLE KEYS */;
INSERT INTO `stu_grade`
VALUES (1, 80, 70, 85, 60, 1001),
       (2, 90, 40, 70, 95, 1002),
       (3, 70, 85, 40, 65, 1003),
       (4, 80, 34, 55, 96, 1004);
/*!40000 ALTER TABLE `stu_grade` ENABLE KEYS */;
UNLOCK
TABLES;

--
-- Table structure for table `stu_table`
--

DROP TABLE IF EXISTS `stu_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stu_table`
(
    `id`         int(11) NOT NULL COMMENT '学生编号',
    `stu_name`   varchar(10) NOT NULL COMMENT '学生名',
    `stu_gender` char(2)     NOT NULL COMMENT '性别',
    `stu_day`    date DEFAULT NULL COMMENT '出生日期',
    `stu_id`     int(11) NOT NULL COMMENT '学生状态',
    `class_id`   int(11) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='学生信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stu_table`
--

LOCK
TABLES `stu_table` WRITE;
/*!40000 ALTER TABLE `stu_table` DISABLE KEYS */;
INSERT INTO `stu_table`
VALUES (12, 'jack', '女', '2001-01-02', 1001, 1),
       (13, 'tom', '男', '2001-03-02', 1002, 2),
       (14, 'H', '男', '2001-04-05', 1003, 2),
       (15, '小刘', '男', '2003-01-09', 1004, 1);
/*!40000 ALTER TABLE `stu_table` ENABLE KEYS */;
UNLOCK
TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-25 13:47:14

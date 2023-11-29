-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ssmbighomework
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `answertable`
--

DROP TABLE IF EXISTS `answertable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `answertable` (
  `answerID` int NOT NULL AUTO_INCREMENT COMMENT '答疑表：答疑ID',
  `answerTeacherID` int DEFAULT NULL COMMENT '答疑表：老师ID',
  `answerStudentID` int DEFAULT NULL COMMENT '答疑表：学生ID',
  `answerQuestion` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '答疑表：提出的问题',
  `answerSolution` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '答疑表：解决方法',
  PRIMARY KEY (`answerID`),
  KEY `answerTable_studenttable_studentID_fk` (`answerStudentID`),
  KEY `answerTable_teachertable_teacherID_fk` (`answerTeacherID`),
  CONSTRAINT `answerTable_studenttable_studentID_fk` FOREIGN KEY (`answerStudentID`) REFERENCES `studenttable` (`studentID`),
  CONSTRAINT `answerTable_teachertable_teacherID_fk` FOREIGN KEY (`answerTeacherID`) REFERENCES `teachertable` (`teacherID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='答疑表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `answertable`
--

LOCK TABLES `answertable` WRITE;
/*!40000 ALTER TABLE `answertable` DISABLE KEYS */;
/*!40000 ALTER TABLE `answertable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `infotable`
--

DROP TABLE IF EXISTS `infotable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `infotable` (
  `infoID` int NOT NULL AUTO_INCREMENT COMMENT '通知表：通知ID',
  `infoTeacherID` int DEFAULT NULL COMMENT '通知表：老师ID',
  `infoBody` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '通知表：通知主体',
  PRIMARY KEY (`infoID`),
  KEY `infoTable_teachertable_teacherID_fk` (`infoTeacherID`),
  CONSTRAINT `infoTable_teachertable_teacherID_fk` FOREIGN KEY (`infoTeacherID`) REFERENCES `teachertable` (`teacherID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='通知表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `infotable`
--

LOCK TABLES `infotable` WRITE;
/*!40000 ALTER TABLE `infotable` DISABLE KEYS */;
/*!40000 ALTER TABLE `infotable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `programtable`
--

DROP TABLE IF EXISTS `programtable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `programtable` (
  `programID` int NOT NULL AUTO_INCREMENT COMMENT '项目表：项目ID',
  `programName` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '项目表：项目名称',
  `programPath` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '项目表：项目路径',
  `programAuthorID` int DEFAULT NULL COMMENT '项目表：作者ID',
  `programScore` int DEFAULT NULL COMMENT '项目表：项目分数',
  `programTeacherID` int DEFAULT NULL COMMENT '项目表：老师ID',
  PRIMARY KEY (`programID`),
  KEY `programTable_studenttable_studentID_fk` (`programAuthorID`),
  KEY `programtable_teachertable_teacherID_fk` (`programTeacherID`),
  CONSTRAINT `programTable_studenttable_studentID_fk` FOREIGN KEY (`programAuthorID`) REFERENCES `studenttable` (`studentID`),
  CONSTRAINT `programtable_teachertable_teacherID_fk` FOREIGN KEY (`programTeacherID`) REFERENCES `teachertable` (`teacherID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='项目表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `programtable`
--

LOCK TABLES `programtable` WRITE;
/*!40000 ALTER TABLE `programtable` DISABLE KEYS */;
/*!40000 ALTER TABLE `programtable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studenttable`
--

DROP TABLE IF EXISTS `studenttable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studenttable` (
  `studentID` int NOT NULL AUTO_INCREMENT COMMENT '学生表：学生ID',
  `studentName` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '学生表：学生姓名',
  `password` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '学生表：密码',
  PRIMARY KEY (`studentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='学生表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studenttable`
--

LOCK TABLES `studenttable` WRITE;
/*!40000 ALTER TABLE `studenttable` DISABLE KEYS */;
/*!40000 ALTER TABLE `studenttable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teachertable`
--

DROP TABLE IF EXISTS `teachertable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teachertable` (
  `teacherID` int NOT NULL AUTO_INCREMENT COMMENT '老师表：老师ID',
  `teacherName` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '老师表：老师姓名',
  `password` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '老师表：密码',
  PRIMARY KEY (`teacherID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='老师表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teachertable`
--

LOCK TABLES `teachertable` WRITE;
/*!40000 ALTER TABLE `teachertable` DISABLE KEYS */;
/*!40000 ALTER TABLE `teachertable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-29 10:39:55

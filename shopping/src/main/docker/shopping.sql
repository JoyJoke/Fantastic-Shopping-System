-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: online_shopping
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT = @@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS = @@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION = @@COLLATION_CONNECTION */;
SET NAMES utf8mb4;
/*!40103 SET @OLD_TIME_ZONE = @@TIME_ZONE */;
/*!40103 SET TIME_ZONE = '+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0 */;
/*!40101 SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE = 'NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES = @@SQL_NOTES, SQL_NOTES = 0 */;
drop database if exists `online_shopping`;
CREATE DATABASE `online_shopping`;
--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `items` (
  `item_id`     int(11)     NOT NULL AUTO_INCREMENT
  COMMENT 'id',
  `item_name`   varchar(50) NOT NULL DEFAULT ''
  COMMENT 'itemName',
  `detail`      varchar(50) NOT NULL DEFAULT ''
  COMMENT 'detail',
  `price`       float(4, 2) NOT NULL DEFAULT '0.00',
  `picture`     varchar(50) NOT NULL DEFAULT ''
  COMMENT 'picture',
  `create_time` datetime    NOT NULL DEFAULT '1000-01-01 00:00:00'
  COMMENT 'createTine',
  PRIMARY KEY (`item_id`),
  KEY `item_name` (`item_name`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 4
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  COMMENT = 'items';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items`
  DISABLE KEYS */;
INSERT INTO `items` (`item_id`, `item_name`, `detail`, `price`, `picture`, `create_time`)
VALUES (1, 'fackbook', 'milk', 0.00, 'p1', '2019-05-24 19:25:55'),
       (2, 'joker', 'juice', 0.00, 'p2', '2019-05-24 19:26:16'),
       (3, 'faker', 'game', 0.00, 'p3', '1000-01-01 00:00:00');
/*!40000 ALTER TABLE `items`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_detail`
--

DROP TABLE IF EXISTS `order_detail`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `order_detail` (
  `detail_id` int(11) NOT NULL AUTO_INCREMENT
  COMMENT 'id',
  `order_id`  int(11) NOT NULL DEFAULT '-1'
  COMMENT 'orderId',
  `item_id`   int(11) NOT NULL DEFAULT '-1'
  COMMENT 'itemId',
  `item_num`  int(11) NOT NULL DEFAULT '-1'
  COMMENT 'itemNum',
  PRIMARY KEY (`detail_id`),
  KEY `order_id` (`order_id`),
  KEY `item_id` (`item_id`),
  CONSTRAINT `detail_item` FOREIGN KEY (`item_id`) REFERENCES `items` (`item_id`),
  CONSTRAINT `detail_order` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 5
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  COMMENT = 'order_detail';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_detail`
--

LOCK TABLES `order_detail` WRITE;
/*!40000 ALTER TABLE `order_detail`
  DISABLE KEYS */;
INSERT INTO `order_detail` (`detail_id`, `order_id`, `item_id`, `item_num`)
VALUES (1, 1, 1, 5),
       (2, 2, 2, 10),
       (3, 3, 3, 50),
       (4, 1, 2, 10);
/*!40000 ALTER TABLE `order_detail`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `orders` (
  `order_id`    int(11)     NOT NULL AUTO_INCREMENT
  COMMENT 'id',
  `user_id`     int(11)     NOT NULL DEFAULT '-1'
  COMMENT 'userId',
  `number`      varchar(50) NOT NULL DEFAULT ''
  COMMENT 'number',
  `create_time` date        NOT NULL DEFAULT '1000-01-01'
  COMMENT 'createTime',
  PRIMARY KEY (`order_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `order_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 6
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  COMMENT = 'orders';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders`
  DISABLE KEYS */;
INSERT INTO `orders` (`order_id`, `user_id`, `number`, `create_time`)
VALUES (1, 1, 'a1', '2019-05-24'),
       (2, 1, 'a2', '2019-05-24'),
       (3, 1, 'a3', '2019-05-24'),
       (4, 2, 'a4', '2019-05-24');
/*!40000 ALTER TABLE `orders`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `role` (
  `role_id` int(11)     NOT NULL AUTO_INCREMENT
  COMMENT 'roleId',
  `name`    varchar(50) NOT NULL DEFAULT ''
  COMMENT 'name',
  PRIMARY KEY (`role_id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 4
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  COMMENT = 'role';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role`
  DISABLE KEYS */;
INSERT INTO `role` (`role_id`, `name`)
VALUES (1, 'ROLE_USER'),
       (2, 'ROLE_ADMIN'),
       (3, 'ROLE_DBA');
/*!40000 ALTER TABLE `role`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `user` (
  `user_id`  int(11)      NOT NULL AUTO_INCREMENT
  COMMENT 'id',
  `username` varchar(50)  NOT NULL DEFAULT ''
  COMMENT 'username',
  `sex`      varchar(50)  NOT NULL DEFAULT ''
  COMMENT 'sex',
  `birthday` datetime     NOT NULL DEFAULT '1000-01-01 00:00:00'
  COMMENT 'birthday',
  `password` varchar(100) NOT NULL DEFAULT '',
  `phone`    char(11)     NOT NULL,
  PRIMARY KEY (`user_id`),
  KEY `username` (`username`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  COMMENT = '用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user`
  DISABLE KEYS */;
INSERT INTO `user` (`user_id`, `username`, `sex`, `birthday`, `password`, `phone`)
VALUES (1,
        'herman',
        'male',
        '2019-05-24 19:28:36',
        '$2a$10$kjmIpalZjAg5ZwkuKerJYOuDbKiU4gLchGlyfRnjDIQfxi3BDRBl.',
        '13532456666'),
       (2,
        'mary',
        'female',
        '2019-05-24 19:31:21',
        '$2a$10$kjmIpalZjAg5ZwkuKerJYOuDbKiU4gLchGlyfRnjDIQfxi3BDRBl.',
        '17896567777');
/*!40000 ALTER TABLE `user`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `user_role` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  KEY `user_role_user_user_id_fk` (`user_id`),
  KEY `user_role_role_role_id_fk` (`role_id`),
  CONSTRAINT `user_role_role_role_id_fk` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`),
  CONSTRAINT `user_role_user_user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role`
  DISABLE KEYS */;
INSERT INTO `user_role` (`user_id`, `role_id`)
VALUES (1, 1),
       (2, 2);
/*!40000 ALTER TABLE `user_role`
  ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE = @OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE = @OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT = @OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS = @OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION = @OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES = @OLD_SQL_NOTES */;

-- Dump completed on 2019-06-01 13:53:24

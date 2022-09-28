-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: super_shop_management_dtbs
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `product_info`
--

DROP TABLE IF EXISTS `product_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_info` (
  `p_id` int NOT NULL,
  `p_name` varchar(45) DEFAULT NULL,
  `brand` varchar(45) DEFAULT NULL,
  `catagory` varchar(45) DEFAULT NULL,
  `p_unit` varchar(45) DEFAULT NULL,
  `unit_price` decimal(8,2) DEFAULT NULL,
  `stock` int DEFAULT '0',
  `rak_no` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_info`
--

LOCK TABLES `product_info` WRITE;
/*!40000 ALTER TABLE `product_info` DISABLE KEYS */;
INSERT INTO `product_info` VALUES (1001,'Banana','N/A','Fruits','4 pc',40.00,197,'201'),(1002,'Potato','N/A','Vegetables','1 kg',30.00,16,'202'),(1003,'Soyabin Oil','Teer','Vegetable Oil','1 kg',175.00,15,'204'),(1004,'Soyabin Oil','Teer','Vegetable Oil','500 gm',85.00,73,'204'),(1005,'Soyabin Oil','Rupchanda','Vegetable Oil','500 gm',90.00,158,'203'),(1006,'Soyabin Oil','Rupchanda','Vegetable Oil','1 litre',174.00,10,'203'),(1008,'Grape','N/A','Fruits','1 kg',350.00,50,'207'),(1009,'Coca Cola','Coca Cola','Beverage','1 Litre',70.00,40,'205'),(1010,'Salt','Square','Spices','1 kg',45.00,20,'206'),(1011,'Broilar Chicken','N/A','Meat','1 kg',180.00,20,'301'),(1012,'Beef','N/A','Meat','1 kg',800.00,10,'301'),(1013,'Drinko Lichi Juice','Pran','Beverage','250 ml',30.00,20,'301'),(1014,'Mango Juice','Pran','Beverage','180 ml',25.00,20,'302'),(1015,'Mum Drinking Water','Mum','Beverage','2 L',35.00,20,'302'),(1016,'Spa Drinking Water','Spa','Beverage','5 L',70.00,5,'302'),(1017,'Fresh Drinking Water','Fresh','Beverage','500 ml',15.00,0,'502'),(1018,'Ball Pen','Matador','Stationary','12 pc',60.00,20,'503'),(1019,'Econo Pencil Pen','Econo','Stationary','12 pc',60.00,40,'504'),(1020,'Stamp Pad','Horse','Stationary','1 pc',170.00,5,'504'),(1021,'A4 paper','Bashundhara','Stationary','500 pc',350.00,2,'505'),(1022,'Jira','Radhuni','Spices','100 gm',60.00,20,'101'),(1023,'Holud Powder','Radhuni','Spices','100 gm',45.00,40,'101'),(1024,'Dried Chilis','Radhuni','Spices','100 gm',40.00,35,'101'),(1025,'Garam Masala','Radhuni','Spices','100 gm',140.00,70,'101');
/*!40000 ALTER TABLE `product_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-01 12:18:24

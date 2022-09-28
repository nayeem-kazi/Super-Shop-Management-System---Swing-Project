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
-- Table structure for table `product_history`
--

DROP TABLE IF EXISTS `product_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_history` (
  `transaction_id` int NOT NULL AUTO_INCREMENT,
  `c_d_id` int NOT NULL,
  `p_id` int DEFAULT NULL,
  `p_name` varchar(45) DEFAULT NULL,
  `brand` varchar(45) DEFAULT NULL,
  `p_catagory` varchar(45) DEFAULT NULL,
  `p_unit` varchar(45) DEFAULT NULL,
  `p_unit_price` decimal(8,2) DEFAULT NULL,
  `qty` int DEFAULT NULL,
  `total_price` decimal(8,2) DEFAULT NULL,
  `payemnt` decimal(8,2) DEFAULT NULL,
  `due` decimal(8,2) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`transaction_id`)
) ENGINE=InnoDB AUTO_INCREMENT=220051 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_history`
--

LOCK TABLES `product_history` WRITE;
/*!40000 ALTER TABLE `product_history` DISABLE KEYS */;
INSERT INTO `product_history` VALUES (220001,123456,1001,'Banana','N/A','Fruits','1 Hali',40.00,50,2000.00,NULL,NULL,'Purchases','2022-07-28'),(220002,123456,1005,'Soyabin Oil','Rupchanda','Vegetable Oil','500 gm',90.00,59,5310.00,NULL,NULL,'Purchases','2022-07-28'),(220003,123456,1005,'Soyabin Oil','Rupchanda','Vegetable Oil','500 gm',90.00,59,5310.00,NULL,NULL,'Purchases','2022-07-28'),(220004,123456,1005,'Soyabin Oil','Rupchanda','Vegetable Oil','500 gm',90.00,59,5310.00,NULL,NULL,'Purchases','2022-07-28'),(220005,123456,1005,'Soyabin Oil','Rupchanda','Vegetable Oil','500 gm',90.00,59,5310.00,NULL,NULL,'Purchases','2022-07-28'),(220006,123456,1005,'Soyabin Oil','Rupchanda','Vegetable Oil','500 gm',90.00,59,5310.00,NULL,NULL,'Purchases','2022-07-28'),(220007,123456,1005,'Soyabin Oil','Rupchanda','Vegetable Oil','500 gm',90.00,59,5310.00,NULL,NULL,'Purchases','2022-07-28'),(220008,123456,1005,'Soyabin Oil','Rupchanda','Vegetable Oil','500 gm',90.00,59,5310.00,NULL,NULL,'Purchases','2022-07-28'),(220009,123456,1005,'Soyabin Oil','Rupchanda','Vegetable Oil','500 gm',90.00,59,5310.00,NULL,NULL,'Purchases','2022-07-28'),(220010,123457,1005,'Soyabin Oil','Rupchanda','Vegetable Oil','500 gm',90.00,59,5310.00,NULL,NULL,'Purchases','2022-07-28'),(220011,123456,1004,'Soyabin Oil','Teer','Vegetable Oil','500 gm',175.00,60,10500.00,NULL,NULL,'Purchases','2022-07-29'),(220012,123456,1003,'Soyabin Oil','Teer','Vegetable Oil','1 kg',175.00,60,10500.00,NULL,NULL,'Purchases','2022-07-29'),(220013,123456,1006,'Soyabin Oil','Rupchanda','Vegetable Oil','1 kg',174.00,60,10500.00,NULL,NULL,'Purchases','2022-07-29'),(220014,123456,1004,'Soyabin Oil','Teer','Vegetable Oil','500 gm',175.00,67,11725.00,NULL,NULL,'Purchases','2022-07-29'),(220015,123456,1005,'Soyabin Oil','Rupchanda','Vegetable Oil','500 gm',90.00,87,7830.00,NULL,NULL,'Purchases','2022-07-29'),(220016,123456,1006,'Soyabin Oil','Rupchanda','Vegetable Oil','1 kg',174.00,20,3480.00,NULL,NULL,'Purchases','2022-07-29'),(220017,123458,1004,'Soyabin Oil','Teer','Vegetable Oil','500 gm',175.00,6,1050.00,NULL,NULL,'Purchases','2022-07-29'),(220018,123458,1005,'Soyabin Oil','Rupchanda','Vegetable Oil','500 gm',90.00,6,540.00,NULL,NULL,'Purchases','2022-07-29'),(220019,123458,1001,'Banana','N/A','Fruits','1 Hali',40.00,6,240.00,NULL,NULL,'Purchases','2022-07-29'),(220020,234567,1003,'Soyabin Oil','Teer','Vegetable Oil','1 kg',175.00,8,1400.00,NULL,NULL,'Sells','2022-07-29'),(220021,123457,1007,'7 UP','Pepsi','Beverage','1 Litre',60.00,0,0.00,NULL,NULL,'Purchases','2022-07-29'),(220022,123458,1010,'Salt','ACI','Spices','1 kg',45.00,10,450.00,NULL,NULL,'Purchases','2022-07-29'),(220023,123459,1010,'Salt','ACI','Spices','1 kg',45.00,5,225.00,NULL,NULL,'Purchases','2022-07-29'),(220024,234568,1003,'Soyabin Oil','Teer','Vegetable Oil','1 kg',175.00,15,2625.00,NULL,NULL,'Sells','2022-07-29'),(220025,123456,1006,'Soyabin Oil','Rupchanda','Vegetable Oil','1 kg',174.00,100,17400.00,NULL,NULL,'Returned','2022-07-29'),(220026,123456,1003,'Soyabin Oil','Teer','Vegetable Oil','1 kg',175.00,100,17400.00,NULL,NULL,'Returned','2022-07-29'),(220027,123456,1001,'Banana','N/A','Fruits','1 Hali',40.00,50,2000.00,NULL,NULL,'Returned','2022-07-29'),(220028,123450,1001,'Banana','N/A','Fruits','1 Hali',40.00,60,2400.00,NULL,NULL,'Purchases','2022-07-29'),(220029,123456,1001,'Banana','N/A','Fruits','1 Hali',40.00,82,3280.00,NULL,NULL,'Purchases','2022-07-30'),(220030,234567,1001,'Banana','N/A','Fruits','1 Hali',40.00,5,200.00,NULL,NULL,'Sells','2022-07-30'),(220031,123460,1025,'Garam Masala','Radhuni','Spices','100 gm',133.00,80,10640.00,NULL,NULL,'Purchases','2022-08-01'),(220032,123460,1024,'Dried Chilis','Radhuni','Spices','100 gm',38.00,40,1520.00,NULL,NULL,'Purchases','2022-08-01'),(220033,123460,1023,'Holud Powder','Radhuni','Spices','100 gm',42.75,40,1710.00,NULL,NULL,'Purchases','2022-08-01'),(220034,123461,1022,'Jira','Radhuni','Spices','100 gm',57.00,10,570.00,NULL,NULL,'Purchases','2022-08-01'),(220035,123461,1021,'A4 paper','Bashundhara','Stationary','500 pc',297.50,5,1487.50,NULL,NULL,'Purchases','2022-08-01'),(220036,123461,1020,'Stamp Pad','Horse','Stationary','1 pc',136.00,5,680.00,NULL,NULL,'Purchases','2022-08-01'),(220037,123461,1019,'Econo Pencil Pen','Econo','Stationary','12 pc',54.00,50,2700.00,NULL,NULL,'Purchases','2022-08-01'),(220038,123462,1018,'Ball Pen','Matador','Stationary','12 pc',57.00,20,1140.00,NULL,NULL,'Purchases','2022-08-01'),(220039,123462,1016,'Spa Drinking Water','Spa','Beverage','5 L',66.50,5,332.50,NULL,NULL,'Purchases','2022-08-01'),(220040,123462,1015,'Mum Drinking Water','Mum','Beverage','2 L',33.25,20,665.00,NULL,NULL,'Purchases','2022-08-01'),(220041,234569,1025,'Garam Masala','Radhuni','Spices','100 gm',140.00,20,2800.00,NULL,NULL,'Sells','2022-08-01'),(220042,234569,1024,'Dried Chilis','Radhuni','Spices','100 gm',40.00,5,200.00,NULL,NULL,'Sells','2022-08-01'),(220043,234569,1021,'A4 paper','Bashundhara','Stationary','500 pc',350.00,3,1050.00,NULL,NULL,'Sells','2022-08-01'),(220044,234570,1002,'Potato','N/A','Vegetables','1 kg',30.00,50,1500.00,NULL,NULL,'Sells','2022-08-01'),(220045,234570,1004,'Soyabin Oil','Teer','Vegetable Oil','500 gm',85.00,50,4250.00,NULL,NULL,'Sells','2022-08-01'),(220046,234570,1002,'Potato','N/A','Vegetables','1 kg',30.00,4,120.00,NULL,NULL,'Sells','2022-08-01'),(220047,234571,1004,'Soyabin Oil','Teer','Vegetable Oil','500 gm',85.00,10,850.00,NULL,NULL,'Sells','2022-08-01'),(220048,123460,1025,'Garam Masala','Radhuni','Spices','100 gm',140.00,50,7000.00,NULL,NULL,'Returned','2022-08-01'),(220049,123461,1019,'Econo Pencil Pen','Econo','Stationary','12 pc',60.00,10,600.00,NULL,NULL,'Returned','2022-08-01'),(220050,123456,1022,'Jira','Radhuni','Spices','100 gm',57.00,10,570.00,NULL,NULL,'Purchases','2022-08-01');
/*!40000 ALTER TABLE `product_history` ENABLE KEYS */;
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

-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: fsofttask
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
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `idproduct` bigint NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `condition_id` int NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `manufacturer` varchar(255) DEFAULT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `price` int NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `stock` int NOT NULL,
  PRIMARY KEY (`idproduct`),
  UNIQUE KEY `UK_383i0awxqlq7pc33hil7afbgo` (`product_name`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Samsung',1,'The Samsung Galaxy S20 Fan Edition technically isnt the Galaxy S20 Lite that many were expecting, but that distinction is in name only, because the mid-range Galaxy phone is essentially a more affordable spin on the Galaxy S20 from early 2020.','Samsung','https://cdn.tgdd.vn/Products/Images/42/224859/samsung-galaxy-s20-fe-xanhduong-200x200-org.png',999,'S20FE',476),(2,'apple',1,' ??i???n tho???i iPhone SE 2020 ???? b???t ng??? ra m???t v???i thi???t k??? 4.7 inch nh??? g???n, chip A13 Bionic m???nh m??? nh?? tr??n iPhone 11 v?? ?????c bi???t s??? h???u m???c gi?? t???t ch??a t???ng c??.','Apple','https://cdn.tgdd.vn/Products/Images/42/230410/iphone-se-64gb-2020-hop-moi-do-1-1-org.jpg',499,'iPhone SE 2022 ',494),(5,'google',1,'Google ???? ch??nh th???c tr??nh l??ng b??? ????i s???n ph???m m???i Pixel 2 v?? Pixel 2 XL v???i nhi???u ??i???m c???i ti???n ?????t ph?? v??? thi???t k??? v?? camera.','Google','https://cdn.tgdd.vn/Products/Images/42/106464/google-pixel-21.jpg',399,'Google Pixel 2',598);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-22 10:57:55

-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: jjwz
-- ------------------------------------------------------
-- Server version	5.7.31-log

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
-- Table structure for table `t_admin`
--

DROP TABLE IF EXISTS `t_admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_admin` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(64) DEFAULT NULL COMMENT '姓名',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `telephone` varchar(20) DEFAULT NULL COMMENT '住宅电话',
  `address` varchar(64) DEFAULT NULL COMMENT '联系地址',
  `username` varchar(20) DEFAULT NULL COMMENT '用户名',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `user_face` varchar(600) DEFAULT NULL COMMENT '用户头像',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `enabled` tinyint(4) DEFAULT '1' COMMENT '是否启用1 0',
  `sex` tinyint(4) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COMMENT='员工表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_admin`
--

LOCK TABLES `t_admin` WRITE;
/*!40000 ALTER TABLE `t_admin` DISABLE KEYS */;
INSERT INTO `t_admin` VALUES (1,'系统管理员','13761719602','3259272','广东深圳','admin','$2a$10$kMiEaKxQPMLxN2aLmJoErufsJHpRyrx4IdLMcsWAgFU2S2OoszXSW','https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2871119264,233376496&fm=26&gp=0.jpg','还没有备注',1,1),(2,'采购员','12345678922','2154875','浙江杭州','purchase','$2a$10$kMiEaKxQPMLxN2aLmJoErufsJHpRyrx4IdLMcsWAgFU2S2OoszXSW','https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.jj20.com%2Fup%2Fallimg%2Ftp05%2F1910021010125G2-0-lp.jpg&refer=http%3A%2F%2Fimg.jj20.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1648978987&t=f32072b3d74d9daef342b2978b6ce88b','还没有备注',1,1),(3,'检验员','154876465252','1334412233','asdf123123','use','123','','asdf',1,1);
/*!40000 ALTER TABLE `t_admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_admin_role`
--

DROP TABLE IF EXISTS `t_admin_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_admin_role` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `admin_id` int(11) DEFAULT NULL COMMENT '用户id',
  `rid` int(11) DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COMMENT='管理员角色中间表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_admin_role`
--

LOCK TABLES `t_admin_role` WRITE;
/*!40000 ALTER TABLE `t_admin_role` DISABLE KEYS */;
INSERT INTO `t_admin_role` VALUES (1,1,1),(3,2,3),(4,2,4),(11,3,4);
/*!40000 ALTER TABLE `t_admin_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_big_type`
--

DROP TABLE IF EXISTS `t_big_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_big_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_big_type`
--

LOCK TABLES `t_big_type` WRITE;
/*!40000 ALTER TABLE `t_big_type` DISABLE KEYS */;
INSERT INTO `t_big_type` VALUES (1,'防护用品'),(2,'生命救助'),(3,'生命支持'),(5,'测试用品');
/*!40000 ALTER TABLE `t_big_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_city`
--

DROP TABLE IF EXISTS `t_city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_city` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(30) DEFAULT NULL COMMENT '市名字',
  `province_id` int(11) DEFAULT NULL COMMENT '省份id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='市表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_city`
--

LOCK TABLES `t_city` WRITE;
/*!40000 ALTER TABLE `t_city` DISABLE KEYS */;
INSERT INTO `t_city` VALUES (1,'南昌市',1),(2,'吉安市',1),(3,'赣州市',1),(4,'南京市',5),(5,'苏州市',5);
/*!40000 ALTER TABLE `t_city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_county`
--

DROP TABLE IF EXISTS `t_county`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_county` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(30) DEFAULT NULL COMMENT '县名字',
  `city_id` int(11) DEFAULT NULL COMMENT '市id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='县表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_county`
--

LOCK TABLES `t_county` WRITE;
/*!40000 ALTER TABLE `t_county` DISABLE KEYS */;
INSERT INTO `t_county` VALUES (1,'南昌县',1),(2,'吉安县',2),(3,'遂川县',2),(4,'安义县',1),(5,'南京市',4);
/*!40000 ALTER TABLE `t_county` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_manage_warehouse_admin`
--

DROP TABLE IF EXISTS `t_manage_warehouse_admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_manage_warehouse_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `warehouse_id` int(11) DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_manage_warehouse_admin`
--

LOCK TABLES `t_manage_warehouse_admin` WRITE;
/*!40000 ALTER TABLE `t_manage_warehouse_admin` DISABLE KEYS */;
INSERT INTO `t_manage_warehouse_admin` VALUES (6,1,1),(7,2,1),(8,3,2),(9,4,2),(10,5,3),(11,6,3),(12,7,2);
/*!40000 ALTER TABLE `t_manage_warehouse_admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_material`
--

DROP TABLE IF EXISTS `t_material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_material` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `measure_id` int(11) DEFAULT NULL,
  `small_id` int(11) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `remark` varchar(45) DEFAULT NULL,
  `size` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_material`
--

LOCK TABLES `t_material` WRITE;
/*!40000 ALTER TABLE `t_material` DISABLE KEYS */;
INSERT INTO `t_material` VALUES (1,'乐治便携医用急救包',4,5,99.00,'无','200*130*60mm'),(2,'煤矿专用急救箱',5,6,150.00,'无','30*20*20cm'),(3,'急救创伤绷带',1,3,19.00,'急救创伤绷带','4英寸、6英寸'),(4,'手电筒',2,4,13.22,'','20*10*10cm'),(5,'乐治便携医用急救包2',2,5,13.00,'12','123');
/*!40000 ALTER TABLE `t_material` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_measure`
--

DROP TABLE IF EXISTS `t_measure`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_measure` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_measure`
--

LOCK TABLES `t_measure` WRITE;
/*!40000 ALTER TABLE `t_measure` DISABLE KEYS */;
INSERT INTO `t_measure` VALUES (1,'个'),(2,'包'),(3,'斤'),(4,'套'),(5,'件');
/*!40000 ALTER TABLE `t_measure` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_menu`
--

DROP TABLE IF EXISTS `t_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_menu` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `url` varchar(64) DEFAULT NULL COMMENT 'url',
  `path` varchar(64) DEFAULT NULL COMMENT 'path',
  `component` varchar(64) DEFAULT NULL COMMENT '组件',
  `name` varchar(64) DEFAULT NULL COMMENT '菜单名',
  `icon_cls` varchar(64) DEFAULT NULL COMMENT '图标',
  `keep_alive` tinyint(1) DEFAULT NULL COMMENT '是否保持激活',
  `require_auth` tinyint(1) DEFAULT NULL COMMENT '是否要求权限',
  `parent_id` int(11) DEFAULT NULL COMMENT '父id',
  `enabled` tinyint(1) DEFAULT NULL COMMENT '是否启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COMMENT='菜单表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_menu`
--

LOCK TABLES `t_menu` WRITE;
/*!40000 ALTER TABLE `t_menu` DISABLE KEYS */;
INSERT INTO `t_menu` VALUES (1,'/',NULL,NULL,'所有',NULL,NULL,NULL,NULL,1),(2,'/','/home','Home','物资采购管理','fa fa-user-circle-o',NULL,1,1,1),(3,'/','/home','Home','物资批准管理','fa fa-address-card-o',NULL,1,1,1),(4,'/','/home','Home','物资检验管理','fa fa-money',NULL,1,1,1),(5,'/','/home','Home','物资调拨管理','fa fa-bar-chart',NULL,1,1,1),(6,'/','/home','Home','物资报表管理','fa fa-windows',NULL,1,1,1),(7,'/','/home','Home','物资仓库管理','fa fa-windows',NULL,1,1,1),(8,'/','/home','Home','基本信息管理','fa fa-windows',NULL,1,1,1),(9,'/','/home','Home','系统维护管理','fa fa-windows',NULL,1,1,1),(10,'/purchase/plan/**','/purchase/plan','PurchasePlan','采购计划',NULL,NULL,1,2,1),(11,'/purchase/order/**','/purchase/order','PurchaseOrder','采购订单',NULL,NULL,1,2,1),(12,'/purchase/query/**','/purchase/query','PurchaseQuery','采购查询',NULL,NULL,1,2,1),(13,'/ratify/inout/**','/ratify/inout','RatifyInout','出入库批准',NULL,NULL,1,3,1),(14,'/ratify/scrap/**','/ratify/scrap','RatifyScrap','报废批准',NULL,NULL,1,3,1),(15,'/ratify/query/**','/ratify/Query','RatifyQuery','批准查询',NULL,NULL,1,3,1),(16,'/check/inout/**','/check/inout','CheckInout','出入库检验',NULL,NULL,1,4,1),(17,'/check/scrap/**','/check/scrap','CheckScrap','报废检验',NULL,NULL,1,4,1),(18,'/check/query/**','/check/Query','CheckQuery','检验查询',NULL,NULL,1,4,1),(19,'/allot/plan/**','/allot/plan','AllotPlan','调拨计划',NULL,NULL,1,5,1),(20,'/allot/order/**','/allot/order','AllotOrder','调拨订单',NULL,NULL,1,5,1),(21,'/allot/query/**','/allot/query','AllotQuery','调拨查询',NULL,NULL,1,5,1),(22,'/report/Inout/**','/report/Inout','ReportInout','出入库报表',NULL,NULL,1,6,1),(23,'/report/stock/**','/report/stock','ReportStock','库存报表',NULL,NULL,1,6,1),(24,'/report/apply/**','/report/apply','ReportApply','申请报表',NULL,NULL,1,6,1),(25,'/warehouse/info/**','/warehouse/info','WarehouseInfo','库存信息管理',NULL,NULL,1,7,1),(26,'/basic/category/**','/basic/category','BasicCategory','物资类别管理',NULL,NULL,1,8,1),(27,'/basic/info/**','/basic/info','BasicInfo','物资信息管理',NULL,NULL,1,8,1),(28,'/basic/warehouse/**','/basic/warehouse','BasicWarehouse','仓库信息管理',NULL,NULL,1,8,1),(29,'/system/basic/**','/system/basic','SystemBasic','基础信息设置',NULL,NULL,1,9,1),(30,'/system/config/**','/system/config','SystemConfig','系统管理',NULL,NULL,1,9,1),(31,'/system/log/**','/system/log','SystemLog','操作日志管理',NULL,NULL,1,9,1),(32,'/system/admin/**','/system/admin','SystemAdmin','用户管理',NULL,NULL,1,9,1),(33,'/system/data/**','/system/data','SystemData','备份恢复数据库',NULL,NULL,1,9,1),(34,'/system/init/**','/system/init','SystemmInit','初始化数据库',NULL,NULL,1,9,1);
/*!40000 ALTER TABLE `t_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_menu_role`
--

DROP TABLE IF EXISTS `t_menu_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_menu_role` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `mid` int(11) DEFAULT NULL COMMENT '菜单id',
  `rid` int(11) DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COMMENT='菜单角色中间表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_menu_role`
--

LOCK TABLES `t_menu_role` WRITE;
/*!40000 ALTER TABLE `t_menu_role` DISABLE KEYS */;
INSERT INTO `t_menu_role` VALUES (1,10,1),(2,11,1),(3,12,1),(4,13,1),(5,14,1),(6,15,1),(7,16,1),(8,17,1),(9,18,1),(10,19,1),(11,20,1),(12,21,1),(13,22,1),(14,23,1),(15,24,1),(16,25,1),(17,26,1),(18,27,1),(19,28,1),(20,29,1),(21,30,1),(22,31,1),(23,32,1),(24,33,1),(25,34,1),(36,10,3),(37,11,3),(38,12,3),(39,16,4),(40,17,4),(41,18,4);
/*!40000 ALTER TABLE `t_menu_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_operation_info`
--

DROP TABLE IF EXISTS `t_operation_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_operation_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `input_id` int(11) DEFAULT NULL,
  `input_time` datetime DEFAULT NULL,
  `ratify_id` int(11) DEFAULT NULL,
  `ratify_time` datetime DEFAULT NULL,
  `verify_id` int(11) DEFAULT NULL,
  `verify_time` datetime DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  `warehouse_id` int(11) DEFAULT NULL,
  `service_type_id` int(11) DEFAULT NULL,
  `total_money` decimal(20,2) DEFAULT NULL,
  `remark` varchar(45) DEFAULT NULL,
  `county_id` int(11) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `postcode` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `concat` varchar(45) DEFAULT NULL,
  `fax` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_operation_info`
--

LOCK TABLES `t_operation_info` WRITE;
/*!40000 ALTER TABLE `t_operation_info` DISABLE KEYS */;
INSERT INTO `t_operation_info` VALUES (2,1,'2022-04-10 14:56:57',1,'2022-04-11 22:15:03',1,'2022-04-12 21:21:37',5,4,1,2134.00,'4123',1,'南昌县红角洲','134124','42131','联系人','4123'),(4,1,'2022-04-11 20:37:21',1,'2022-04-15 19:12:46',1,'2022-04-15 19:12:59',5,4,1,1200.00,'发生的',4,'安义县万达广场','343900','18742158748','王万达','sdfad'),(5,1,'2022-04-11 20:38:40',1,'2022-04-11 22:19:30',1,'2022-04-12 21:35:06',6,4,2,2808.00,'2341234',2,'32414234','343900','2134241234','41234','41234'),(6,1,'2022-04-11 20:45:45',1,'2022-04-15 19:12:51',1,'2022-04-15 19:13:00',5,4,1,6783.00,'43214',5,'2412342','1231','4234','42343214','42421'),(7,1,'2022-04-11 20:46:27',NULL,NULL,NULL,NULL,2,4,2,7429.00,'4',3,'2341234','231','234234','34123','4234'),(8,1,'2022-04-12 21:24:27',1,'2022-04-12 21:24:45',1,'2022-04-12 21:24:57',5,4,1,169.00,'sf',1,'32rr2r2','rweqrr23r','32r23r','r2r32r','fasdf'),(9,1,'2022-04-12 21:37:54',1,'2022-04-12 21:38:08',NULL,NULL,4,4,2,276.00,'123',1,'1233','12','3123','1231231','23123'),(10,1,'2022-04-15 19:11:19',NULL,NULL,NULL,NULL,1,4,1,276.00,NULL,NULL,'','','','',''),(11,1,'2022-04-15 19:12:17',1,'2022-04-15 19:12:52',1,'2022-04-15 19:13:01',5,4,1,384.00,'4234',1,'23423412','2142','34234','3421342','234');
/*!40000 ALTER TABLE `t_operation_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_operation_material`
--

DROP TABLE IF EXISTS `t_operation_material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_operation_material` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `operation_id` int(11) DEFAULT NULL,
  `material_id` int(11) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_operation_material`
--

LOCK TABLES `t_operation_material` WRITE;
/*!40000 ALTER TABLE `t_operation_material` DISABLE KEYS */;
INSERT INTO `t_operation_material` VALUES (1,NULL,2,13,13.00),(2,NULL,1,131,15.00),(3,2,2,13,13.00),(4,2,1,131,15.00),(5,4,1,12,100.00),(6,5,1,12,234.00),(7,6,2,21,323.00),(8,7,1,23,323.00),(9,8,1,12,13.00),(10,8,4,1,13.00),(11,9,3,12,23.00),(12,10,5,12,23.00),(13,11,5,12,32.00);
/*!40000 ALTER TABLE `t_operation_material` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_province`
--

DROP TABLE IF EXISTS `t_province`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_province` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(30) DEFAULT NULL COMMENT '省份名字',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COMMENT='省份表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_province`
--

LOCK TABLES `t_province` WRITE;
/*!40000 ALTER TABLE `t_province` DISABLE KEYS */;
INSERT INTO `t_province` VALUES (1,'江西省'),(2,'湖北省'),(3,'湖南省'),(4,'浙江省'),(5,'江苏省'),(9,'山东省');
/*!40000 ALTER TABLE `t_province` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_role`
--

DROP TABLE IF EXISTS `t_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_role` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(20) DEFAULT NULL COMMENT '名称',
  `name_zh` varchar(60) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COMMENT='角色表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_role`
--

LOCK TABLES `t_role` WRITE;
/*!40000 ALTER TABLE `t_role` DISABLE KEYS */;
INSERT INTO `t_role` VALUES (1,'ROLE_admin','系统管理员'),(3,'ROLE_purchase','采购员'),(4,'ROLE_check','检验员');
/*!40000 ALTER TABLE `t_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_service_type`
--

DROP TABLE IF EXISTS `t_service_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_service_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_service_type`
--

LOCK TABLES `t_service_type` WRITE;
/*!40000 ALTER TABLE `t_service_type` DISABLE KEYS */;
INSERT INTO `t_service_type` VALUES (1,'采购业务'),(2,'调拨业务'),(3,'报废业务');
/*!40000 ALTER TABLE `t_service_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_small_type`
--

DROP TABLE IF EXISTS `t_small_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_small_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `big_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_small_type`
--

LOCK TABLES `t_small_type` WRITE;
/*!40000 ALTER TABLE `t_small_type` DISABLE KEYS */;
INSERT INTO `t_small_type` VALUES (1,'防护服(衣、帽、鞋、手套、眼镜)',1),(2,'防毒面具',1),(3,'止血绷带',2),(4,'手电筒',2),(5,'急救包',3),(6,'急救箱',3);
/*!40000 ALTER TABLE `t_small_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_status`
--

DROP TABLE IF EXISTS `t_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_status`
--

LOCK TABLES `t_status` WRITE;
/*!40000 ALTER TABLE `t_status` DISABLE KEYS */;
INSERT INTO `t_status` VALUES (1,'采购订单新建'),(2,'调拨订单新建'),(3,'采购订单批准'),(4,'调拨订单批准'),(5,'采购订单入库'),(6,'调拨订单出库');
/*!40000 ALTER TABLE `t_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_warehouse`
--

DROP TABLE IF EXISTS `t_warehouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_warehouse` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `address` varchar(128) DEFAULT NULL COMMENT '详细地址',
  `postcode` varchar(64) DEFAULT NULL COMMENT '邮编',
  `phone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `name` varchar(64) DEFAULT NULL COMMENT '联系人名字',
  `title` varchar(64) DEFAULT NULL COMMENT '仓库名称',
  `county_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COMMENT='仓库表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_warehouse`
--

LOCK TABLES `t_warehouse` WRITE;
/*!40000 ALTER TABLE `t_warehouse` DISABLE KEYS */;
INSERT INTO `t_warehouse` VALUES (1,'江西省南昌市南昌县万达广场','330000','12546587956','系统仓库','系统仓库管理员',1),(2,'江西省南昌市南昌县万达广场','330000','12546587956','万达仓库','王万达',1),(3,'江西省吉安市吉安县住宅广场','330011','15946874524','吉安仓库','李吉安',2),(4,'江西省吉安市遂川县财富广场','343900','15487543475','遂川仓库','叶遂川',3),(5,'江苏省南京市南京县南京广场','132456','12345457735','南京仓库','魏南京',5),(6,'fas','asdf','asdf','af','fasd',3),(7,'41234','143241','4234141234','qw3q3','423411',1);
/*!40000 ALTER TABLE `t_warehouse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_warehouse_admin`
--

DROP TABLE IF EXISTS `t_warehouse_admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_warehouse_admin` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `admin_id` int(11) DEFAULT NULL COMMENT '用户id',
  `warehouse_id` int(11) DEFAULT NULL COMMENT '仓库id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COMMENT='用户仓库中间表表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_warehouse_admin`
--

LOCK TABLES `t_warehouse_admin` WRITE;
/*!40000 ALTER TABLE `t_warehouse_admin` DISABLE KEYS */;
INSERT INTO `t_warehouse_admin` VALUES (1,3,2),(8,1,4),(10,2,6);
/*!40000 ALTER TABLE `t_warehouse_admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_warehouse_material`
--

DROP TABLE IF EXISTS `t_warehouse_material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_warehouse_material` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `warehouse_id` int(11) DEFAULT NULL,
  `material_id` int(11) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `max` int(11) DEFAULT NULL,
  `min` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_warehouse_material`
--

LOCK TABLES `t_warehouse_material` WRITE;
/*!40000 ALTER TABLE `t_warehouse_material` DISABLE KEYS */;
INSERT INTO `t_warehouse_material` VALUES (1,4,2,34,NULL,NULL,NULL),(2,4,1,143,123.00,412,1234),(3,4,4,1,NULL,NULL,NULL),(4,4,5,12,NULL,NULL,NULL);
/*!40000 ALTER TABLE `t_warehouse_material` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-16 18:39:39

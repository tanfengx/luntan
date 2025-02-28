-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springbootil464u7m
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `springbootil464u7m`
--

/*!40000 DROP DATABASE IF EXISTS `springbootil464u7m`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springbootil464u7m` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springbootil464u7m`;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  `url` varchar(500) DEFAULT NULL COMMENT 'url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg',NULL),(2,'picture2','upload/picture2.jpg',NULL),(3,'picture3','upload/picture3.jpg',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussyouxiutiezi`
--

DROP TABLE IF EXISTS `discussyouxiutiezi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussyouxiutiezi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COMMENT '头像',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='优秀帖子评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussyouxiutiezi`
--

LOCK TABLES `discussyouxiutiezi` WRITE;
/*!40000 ALTER TABLE `discussyouxiutiezi` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussyouxiutiezi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huiyuan`
--

DROP TABLE IF EXISTS `huiyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huiyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huiyuanzhanghao` varchar(200) DEFAULT NULL COMMENT '会员账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `huiyuanxingming` varchar(200) DEFAULT NULL COMMENT '会员姓名',
  `nicheng` varchar(200) DEFAULT NULL COMMENT '昵称',
  `touxiang` longtext COMMENT '头像',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `gexingqianming` varchar(200) DEFAULT NULL COMMENT '个性签名',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `pquestion` varchar(200) DEFAULT NULL COMMENT '密保问题',
  `panswer` varchar(200) DEFAULT NULL COMMENT '密保答案',
  `status` int(11) DEFAULT '0' COMMENT '状态',
  `passwordwrongnum` int(11) DEFAULT '0' COMMENT '密码错误次数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `huiyuanzhanghao` (`huiyuanzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='会员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huiyuan`
--

LOCK TABLES `huiyuan` WRITE;
/*!40000 ALTER TABLE `huiyuan` DISABLE KEYS */;
INSERT INTO `huiyuan` VALUES (11,'2024-12-31 04:27:49','会员账号1','123456','会员姓名1','昵称1','upload/huiyuan_touxiang1.jpg','男','个性签名1','773890001@qq.com','13823888881','密保问题1','密保答案1',0,0),(12,'2024-12-31 04:27:49','会员账号2','123456','会员姓名2','昵称2','upload/huiyuan_touxiang2.jpg','男','个性签名2','773890002@qq.com','13823888882','密保问题2','密保答案2',0,0),(13,'2024-12-31 04:27:49','会员账号3','123456','会员姓名3','昵称3','upload/huiyuan_touxiang3.jpg','男','个性签名3','773890003@qq.com','13823888883','密保问题3','密保答案3',0,0),(14,'2024-12-31 04:27:49','会员账号4','123456','会员姓名4','昵称4','upload/huiyuan_touxiang4.jpg','男','个性签名4','773890004@qq.com','13823888884','密保问题4','密保答案4',0,0),(15,'2024-12-31 04:27:49','会员账号5','123456','会员姓名5','昵称5','upload/huiyuan_touxiang5.jpg','男','个性签名5','773890005@qq.com','13823888885','密保问题5','密保答案5',0,0),(16,'2024-12-31 04:27:49','会员账号6','123456','会员姓名6','昵称6','upload/huiyuan_touxiang6.jpg','男','个性签名6','773890006@qq.com','13823888886','密保问题6','密保答案6',0,0),(17,'2024-12-31 04:27:49','会员账号7','123456','会员姓名7','昵称7','upload/huiyuan_touxiang7.jpg','男','个性签名7','773890007@qq.com','13823888887','密保问题7','密保答案7',0,0),(18,'2024-12-31 04:27:49','会员账号8','123456','会员姓名8','昵称8','upload/huiyuan_touxiang8.jpg','男','个性签名8','773890008@qq.com','13823888888','密保问题8','密保答案8',0,0);
/*!40000 ALTER TABLE `huiyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext COMMENT '图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `systemintro`
--

DROP TABLE IF EXISTS `systemintro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `systemintro` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `subtitle` varchar(200) DEFAULT NULL COMMENT '副标题',
  `content` longtext NOT NULL COMMENT '内容',
  `picture1` longtext COMMENT '图片1',
  `picture2` longtext COMMENT '图片2',
  `picture3` longtext COMMENT '图片3',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='系统简介';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `systemintro`
--

LOCK TABLES `systemintro` WRITE;
/*!40000 ALTER TABLE `systemintro` DISABLE KEYS */;
INSERT INTO `systemintro` VALUES (1,'2024-12-31 04:27:49','系统简介','SYSTEM INTRODUCTION','在平静的海平面上，每个人都可以成为领航员。但如果只有阳光而没有阴影，只有欢乐而没有痛苦，那就不是完整的人生。就拿最幸福的人来说吧——他的幸福是一团纠结的纱线。痛苦和幸福轮番而至，让我们悲喜交集，甚至死亡都让人生更加可爱。人在生命的严肃时刻，在悲伤与丧亲的阴影下，才最接近真实的自我。在生活和事业的各个方面，才智的功能远不如性格，头脑的功能远不如心性，天分远不如自制力、毅力与教养。我始终认为内心开始过严肃生活的人，他外在的生活会开始变得更为俭朴。在一个奢侈浪费的年代，但愿我能让世人了解：人类真正的需求是多么的稀少。不重蹈覆辙才是真正的醒悟。比别人优秀并无任何高贵之处，真正的高贵在于超越从前的自我。','upload/systemintro_picture1.jpg','upload/systemintro_picture2.jpg','upload/systemintro_picture3.jpg');
/*!40000 ALTER TABLE `systemintro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `systemnotice`
--

DROP TABLE IF EXISTS `systemnotice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `systemnotice` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='系统公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `systemnotice`
--

LOCK TABLES `systemnotice` WRITE;
/*!40000 ALTER TABLE `systemnotice` DISABLE KEYS */;
INSERT INTO `systemnotice` VALUES (1,'2024-12-31 04:27:49','这是系统公告');
/*!40000 ALTER TABLE `systemnotice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiezifenlei`
--

DROP TABLE IF EXISTS `tiezifenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tiezifenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tiezifenlei` varchar(200) DEFAULT NULL COMMENT '帖子分类',
  `image` longtext COMMENT '图片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `tiezifenlei` (`tiezifenlei`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='帖子分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiezifenlei`
--

LOCK TABLES `tiezifenlei` WRITE;
/*!40000 ALTER TABLE `tiezifenlei` DISABLE KEYS */;
INSERT INTO `tiezifenlei` VALUES (21,'2024-12-31 04:27:49','帖子分类1','upload/tiezifenlei_image1.jpg,upload/tiezifenlei_image2.jpg,upload/tiezifenlei_image3.jpg'),(22,'2024-12-31 04:27:49','帖子分类2','upload/tiezifenlei_image2.jpg,upload/tiezifenlei_image3.jpg,upload/tiezifenlei_image4.jpg'),(23,'2024-12-31 04:27:49','帖子分类3','upload/tiezifenlei_image3.jpg,upload/tiezifenlei_image4.jpg,upload/tiezifenlei_image5.jpg'),(24,'2024-12-31 04:27:49','帖子分类4','upload/tiezifenlei_image4.jpg,upload/tiezifenlei_image5.jpg,upload/tiezifenlei_image6.jpg'),(25,'2024-12-31 04:27:49','帖子分类5','upload/tiezifenlei_image5.jpg,upload/tiezifenlei_image6.jpg,upload/tiezifenlei_image7.jpg'),(26,'2024-12-31 04:27:49','帖子分类6','upload/tiezifenlei_image6.jpg,upload/tiezifenlei_image7.jpg,upload/tiezifenlei_image8.jpg'),(27,'2024-12-31 04:27:49','帖子分类7','upload/tiezifenlei_image7.jpg,upload/tiezifenlei_image8.jpg,upload/tiezifenlei_image9.jpg'),(28,'2024-12-31 04:27:49','帖子分类8','upload/tiezifenlei_image8.jpg,upload/tiezifenlei_image9.jpg,upload/tiezifenlei_image10.jpg');
/*!40000 ALTER TABLE `tiezifenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `image` varchar(200) DEFAULT NULL COMMENT '头像',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','upload/image1.jpg','管理员','2024-12-31 04:27:49');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `youxiutiezi`
--

DROP TABLE IF EXISTS `youxiutiezi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `youxiutiezi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tiezibiaoti` varchar(200) NOT NULL COMMENT '帖子标题',
  `fengmiantupian` longtext COMMENT '封面图片',
  `tiezifenlei` varchar(200) NOT NULL COMMENT '帖子分类',
  `biaoqian` varchar(200) DEFAULT NULL COMMENT '标签',
  `shipinzhanshi` longtext COMMENT '视频展示',
  `tiezineirong` longtext NOT NULL COMMENT '帖子内容',
  `huiyuanzhanghao` varchar(200) DEFAULT NULL COMMENT '会员账号',
  `nicheng` varchar(200) DEFAULT NULL COMMENT '昵称',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `discussnum` int(11) DEFAULT '0' COMMENT '评论数',
  `storeupnum` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='优秀帖子';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `youxiutiezi`
--

LOCK TABLES `youxiutiezi` WRITE;
/*!40000 ALTER TABLE `youxiutiezi` DISABLE KEYS */;
INSERT INTO `youxiutiezi` VALUES (31,'2024-12-31 04:27:49','帖子标题1','upload/youxiutiezi_fengmiantupian1.jpg,upload/youxiutiezi_fengmiantupian2.jpg,upload/youxiutiezi_fengmiantupian3.jpg','帖子分类1','标签1','','帖子内容1','会员账号1','昵称1','2024-12-31','是','','2024-12-31 12:27:49',1,0,1),(32,'2024-12-31 04:27:49','帖子标题2','upload/youxiutiezi_fengmiantupian2.jpg,upload/youxiutiezi_fengmiantupian3.jpg,upload/youxiutiezi_fengmiantupian4.jpg','帖子分类2','标签2','','帖子内容2','会员账号2','昵称2','2024-12-31','是','','2024-12-31 12:27:49',2,0,2),(33,'2024-12-31 04:27:49','帖子标题3','upload/youxiutiezi_fengmiantupian3.jpg,upload/youxiutiezi_fengmiantupian4.jpg,upload/youxiutiezi_fengmiantupian5.jpg','帖子分类3','标签3','','帖子内容3','会员账号3','昵称3','2024-12-31','是','','2024-12-31 12:27:49',3,0,3),(34,'2024-12-31 04:27:49','帖子标题4','upload/youxiutiezi_fengmiantupian4.jpg,upload/youxiutiezi_fengmiantupian5.jpg,upload/youxiutiezi_fengmiantupian6.jpg','帖子分类4','标签4','','帖子内容4','会员账号4','昵称4','2024-12-31','是','','2024-12-31 12:27:49',4,0,4),(35,'2024-12-31 04:27:49','帖子标题5','upload/youxiutiezi_fengmiantupian5.jpg,upload/youxiutiezi_fengmiantupian6.jpg,upload/youxiutiezi_fengmiantupian7.jpg','帖子分类5','标签5','','帖子内容5','会员账号5','昵称5','2024-12-31','是','','2024-12-31 12:27:49',5,0,5),(36,'2024-12-31 04:27:49','帖子标题6','upload/youxiutiezi_fengmiantupian6.jpg,upload/youxiutiezi_fengmiantupian7.jpg,upload/youxiutiezi_fengmiantupian8.jpg','帖子分类6','标签6','','帖子内容6','会员账号6','昵称6','2024-12-31','是','','2024-12-31 12:27:49',6,0,6),(37,'2024-12-31 04:27:49','帖子标题7','upload/youxiutiezi_fengmiantupian7.jpg,upload/youxiutiezi_fengmiantupian8.jpg,upload/youxiutiezi_fengmiantupian9.jpg','帖子分类7','标签7','','帖子内容7','会员账号7','昵称7','2024-12-31','是','','2024-12-31 12:27:49',7,0,7),(38,'2024-12-31 04:27:49','帖子标题8','upload/youxiutiezi_fengmiantupian8.jpg,upload/youxiutiezi_fengmiantupian9.jpg,upload/youxiutiezi_fengmiantupian10.jpg','帖子分类8','标签8','','帖子内容8','会员账号8','昵称8','2024-12-31','是','','2024-12-31 12:27:49',8,0,8);
/*!40000 ALTER TABLE `youxiutiezi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-08 11:31:12

/*
SQLyog Ultimate v11.42 (64 bit)
MySQL - 5.6.38 : Database - notebook
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`notebook` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `notebook`;

/*Table structure for table `admin_meun` */

DROP TABLE IF EXISTS `admin_meun`;

CREATE TABLE `admin_meun` (
  `id` int(11) NOT NULL,
  `path` varchar(64) DEFAULT NULL,
  `nav_item` varchar(64) DEFAULT NULL,
  `icon` varchar(64) DEFAULT NULL,
  `component` varchar(64) DEFAULT NULL,
  `is_auth_required` tinyint(1) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_meun` */

insert  into `admin_meun`(`id`,`path`,`nav_item`,`icon`,`component`,`is_auth_required`,`parent_id`) values (0,'/','首页',NULL,NULL,1,1),(1,'/','学霸笔记',NULL,NULL,1,1),(2,'/','管理中心',NULL,NULL,1,1);

/*Table structure for table `admin_role` */

DROP TABLE IF EXISTS `admin_role`;

CREATE TABLE `admin_role` (
  `id` bigint(20) NOT NULL,
  `name` varchar(225) DEFAULT NULL,
  `name_zh` varchar(225) CHARACTER SET utf8 COLLATE utf8_croatian_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_role` */

insert  into `admin_role`(`id`,`name`,`name_zh`) values (1,'admin','管理员'),(2,'viewer','用户');

/*Table structure for table `admin_role_menu` */

DROP TABLE IF EXISTS `admin_role_menu`;

CREATE TABLE `admin_role_menu` (
  `id` int(11) NOT NULL,
  `rid` int(11) DEFAULT NULL,
  `mid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_role_menu` */

/*Table structure for table `admin_user_role` */

DROP TABLE IF EXISTS `admin_user_role`;

CREATE TABLE `admin_user_role` (
  `id` bigint(20) NOT NULL,
  `uid` bigint(20) DEFAULT NULL,
  `rid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_user_role` */

/*Table structure for table `note` */

DROP TABLE IF EXISTS `note`;

CREATE TABLE `note` (
  `noteid` int(11) NOT NULL,
  `notename` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `Pic` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `text` longtext CHARACTER SET latin1,
  PRIMARY KEY (`noteid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `note` */

insert  into `note`(`noteid`,`notename`,`Pic`,`text`) values (1,'text','xxx.jpg','gextttsgdn');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(50) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `salt` varchar(50) DEFAULT NULL,
  `role` int(11) DEFAULT NULL,
  KEY `user_ibfk_1` (`role`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`role`) REFERENCES `admin_meun` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`salt`,`role`) values (0,'admin','admin',NULL,2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

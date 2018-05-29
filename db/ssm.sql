/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.20 : Database - ssm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `ssm`;

/*Table structure for table `test` */

DROP TABLE IF EXISTS `test`;

CREATE TABLE `test` (
  `testID` varchar(11) NOT NULL,
  `testName` varchar(20) NOT NULL,
  `testSex` varchar(20) NOT NULL,
  `testAge` varchar(11) NOT NULL,
  PRIMARY KEY (`testID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `test` */

insert  into `test`(`testID`,`testName`,`testSex`,`testAge`) values ('1','1','1','1');
insert  into `test`(`testID`,`testName`,`testSex`,`testAge`) values ('2','2','2','2');
insert  into `test`(`testID`,`testName`,`testSex`,`testAge`) values ('3','3','3','3');
insert  into `test`(`testID`,`testName`,`testSex`,`testAge`) values ('4','4','4','4');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

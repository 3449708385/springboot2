/*
读写分离
Navicat MySQL Data Transfer

Source Server         : 192.168.1.3
Source Server Version : 50718
Source Host           : 192.168.1.3:3306
Source Database       : mysqlCopy

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2020-01-17 13:17:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mycat_test
-- ----------------------------
DROP TABLE IF EXISTS `mycat_test`;
CREATE TABLE `mycat_test` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dataId` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of mycat_test
-- ----------------------------
INSERT INTO `mycat_test` VALUES ('1', '1');
INSERT INTO `mycat_test` VALUES ('2', '1');
INSERT INTO `mycat_test` VALUES ('3', '1');
INSERT INTO `mycat_test` VALUES ('4', '1');
INSERT INTO `mycat_test` VALUES ('5', '1');
INSERT INTO `mycat_test` VALUES ('6', '1');

-- ----------------------------
-- Table structure for t_mm
-- ----------------------------
DROP TABLE IF EXISTS `t_mm`;
CREATE TABLE `t_mm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_mm
-- ----------------------------
INSERT INTO `t_mm` VALUES ('1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` smallint(6) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `age` tinyint(4) DEFAULT NULL,
  `sex` enum('男','女','保密') DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `addr` varchar(200) DEFAULT NULL,
  `birth` year(4) DEFAULT NULL,
  `salary` float(8,2) DEFAULT NULL,
  `tel` int(11) DEFAULT NULL,
  `married` tinyint(1) DEFAULT NULL COMMENT '0代表未结婚，非零代表已结婚'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

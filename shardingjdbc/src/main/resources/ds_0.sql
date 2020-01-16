/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50719
Source Host           : 127.0.0.1:3306
Source Database       : ds_0

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2020-01-16 15:18:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_smt
-- ----------------------------
DROP TABLE IF EXISTS `t_smt`;
CREATE TABLE `t_smt` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `smt_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of t_smt
-- ----------------------------
INSERT INTO `t_smt` VALUES ('1', '0');
INSERT INTO `t_smt` VALUES ('2', '3');
INSERT INTO `t_smt` VALUES ('3', '6');
INSERT INTO `t_smt` VALUES ('4', '9');
INSERT INTO `t_smt` VALUES ('5', '12');
INSERT INTO `t_smt` VALUES ('6', '15');
INSERT INTO `t_smt` VALUES ('7', '18');
INSERT INTO `t_smt` VALUES ('8', '21');
INSERT INTO `t_smt` VALUES ('9', '24');
INSERT INTO `t_smt` VALUES ('10', '27');
INSERT INTO `t_smt` VALUES ('11', '30');
INSERT INTO `t_smt` VALUES ('12', '33');
INSERT INTO `t_smt` VALUES ('13', '36');
INSERT INTO `t_smt` VALUES ('14', '39');
INSERT INTO `t_smt` VALUES ('15', '42');
INSERT INTO `t_smt` VALUES ('16', '45');
INSERT INTO `t_smt` VALUES ('17', '48');
INSERT INTO `t_smt` VALUES ('18', '51');
INSERT INTO `t_smt` VALUES ('19', '54');
INSERT INTO `t_smt` VALUES ('20', '57');
INSERT INTO `t_smt` VALUES ('21', '60');
INSERT INTO `t_smt` VALUES ('22', '63');
INSERT INTO `t_smt` VALUES ('23', '66');
INSERT INTO `t_smt` VALUES ('24', '69');
INSERT INTO `t_smt` VALUES ('25', '72');
INSERT INTO `t_smt` VALUES ('26', '75');
INSERT INTO `t_smt` VALUES ('27', '78');
INSERT INTO `t_smt` VALUES ('28', '81');
INSERT INTO `t_smt` VALUES ('29', '84');
INSERT INTO `t_smt` VALUES ('30', '87');
INSERT INTO `t_smt` VALUES ('31', '90');
INSERT INTO `t_smt` VALUES ('32', '93');
INSERT INTO `t_smt` VALUES ('33', '96');
INSERT INTO `t_smt` VALUES ('34', '99');

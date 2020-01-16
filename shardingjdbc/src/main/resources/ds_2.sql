/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50719
Source Host           : 127.0.0.1:3306
Source Database       : ds_2

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2020-01-16 15:18:13
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
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of t_smt
-- ----------------------------
INSERT INTO `t_smt` VALUES ('1', '2');
INSERT INTO `t_smt` VALUES ('2', '5');
INSERT INTO `t_smt` VALUES ('3', '8');
INSERT INTO `t_smt` VALUES ('4', '11');
INSERT INTO `t_smt` VALUES ('5', '14');
INSERT INTO `t_smt` VALUES ('6', '17');
INSERT INTO `t_smt` VALUES ('7', '20');
INSERT INTO `t_smt` VALUES ('8', '23');
INSERT INTO `t_smt` VALUES ('9', '26');
INSERT INTO `t_smt` VALUES ('10', '29');
INSERT INTO `t_smt` VALUES ('11', '32');
INSERT INTO `t_smt` VALUES ('12', '35');
INSERT INTO `t_smt` VALUES ('13', '38');
INSERT INTO `t_smt` VALUES ('14', '41');
INSERT INTO `t_smt` VALUES ('15', '44');
INSERT INTO `t_smt` VALUES ('16', '47');
INSERT INTO `t_smt` VALUES ('17', '50');
INSERT INTO `t_smt` VALUES ('18', '53');
INSERT INTO `t_smt` VALUES ('19', '56');
INSERT INTO `t_smt` VALUES ('20', '59');
INSERT INTO `t_smt` VALUES ('21', '62');
INSERT INTO `t_smt` VALUES ('22', '65');
INSERT INTO `t_smt` VALUES ('23', '68');
INSERT INTO `t_smt` VALUES ('24', '71');
INSERT INTO `t_smt` VALUES ('25', '74');
INSERT INTO `t_smt` VALUES ('26', '77');
INSERT INTO `t_smt` VALUES ('27', '80');
INSERT INTO `t_smt` VALUES ('28', '83');
INSERT INTO `t_smt` VALUES ('29', '86');
INSERT INTO `t_smt` VALUES ('30', '89');
INSERT INTO `t_smt` VALUES ('31', '92');
INSERT INTO `t_smt` VALUES ('32', '95');
INSERT INTO `t_smt` VALUES ('33', '98');

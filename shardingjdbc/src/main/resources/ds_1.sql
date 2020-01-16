/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50719
Source Host           : 127.0.0.1:3306
Source Database       : ds_1

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2020-01-16 15:18:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_order_0
-- ----------------------------
DROP TABLE IF EXISTS `t_order_0`;
CREATE TABLE `t_order_0` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of t_order_0
-- ----------------------------
INSERT INTO `t_order_0` VALUES ('1', '0');
INSERT INTO `t_order_0` VALUES ('2', '2');
INSERT INTO `t_order_0` VALUES ('3', '4');
INSERT INTO `t_order_0` VALUES ('4', '6');
INSERT INTO `t_order_0` VALUES ('5', '8');
INSERT INTO `t_order_0` VALUES ('6', '10');
INSERT INTO `t_order_0` VALUES ('7', '12');
INSERT INTO `t_order_0` VALUES ('8', '14');
INSERT INTO `t_order_0` VALUES ('9', '16');
INSERT INTO `t_order_0` VALUES ('10', '18');
INSERT INTO `t_order_0` VALUES ('11', '20');
INSERT INTO `t_order_0` VALUES ('12', '22');
INSERT INTO `t_order_0` VALUES ('13', '24');
INSERT INTO `t_order_0` VALUES ('14', '26');
INSERT INTO `t_order_0` VALUES ('15', '28');
INSERT INTO `t_order_0` VALUES ('16', '30');
INSERT INTO `t_order_0` VALUES ('17', '32');
INSERT INTO `t_order_0` VALUES ('18', '34');
INSERT INTO `t_order_0` VALUES ('19', '36');
INSERT INTO `t_order_0` VALUES ('20', '38');
INSERT INTO `t_order_0` VALUES ('21', '40');
INSERT INTO `t_order_0` VALUES ('22', '42');
INSERT INTO `t_order_0` VALUES ('23', '44');
INSERT INTO `t_order_0` VALUES ('24', '46');
INSERT INTO `t_order_0` VALUES ('25', '48');
INSERT INTO `t_order_0` VALUES ('26', '50');
INSERT INTO `t_order_0` VALUES ('27', '52');
INSERT INTO `t_order_0` VALUES ('28', '54');
INSERT INTO `t_order_0` VALUES ('29', '56');
INSERT INTO `t_order_0` VALUES ('30', '58');
INSERT INTO `t_order_0` VALUES ('31', '60');
INSERT INTO `t_order_0` VALUES ('32', '62');
INSERT INTO `t_order_0` VALUES ('33', '64');
INSERT INTO `t_order_0` VALUES ('34', '66');
INSERT INTO `t_order_0` VALUES ('35', '68');
INSERT INTO `t_order_0` VALUES ('36', '70');
INSERT INTO `t_order_0` VALUES ('37', '72');
INSERT INTO `t_order_0` VALUES ('38', '74');
INSERT INTO `t_order_0` VALUES ('39', '76');
INSERT INTO `t_order_0` VALUES ('40', '78');
INSERT INTO `t_order_0` VALUES ('41', '80');
INSERT INTO `t_order_0` VALUES ('42', '82');
INSERT INTO `t_order_0` VALUES ('43', '84');
INSERT INTO `t_order_0` VALUES ('44', '86');
INSERT INTO `t_order_0` VALUES ('45', '88');
INSERT INTO `t_order_0` VALUES ('46', '90');
INSERT INTO `t_order_0` VALUES ('47', '92');
INSERT INTO `t_order_0` VALUES ('48', '94');
INSERT INTO `t_order_0` VALUES ('49', '96');
INSERT INTO `t_order_0` VALUES ('50', '98');
INSERT INTO `t_order_0` VALUES ('51', '0');
INSERT INTO `t_order_0` VALUES ('52', '2');
INSERT INTO `t_order_0` VALUES ('53', '4');
INSERT INTO `t_order_0` VALUES ('54', '6');
INSERT INTO `t_order_0` VALUES ('55', '8');
INSERT INTO `t_order_0` VALUES ('56', '10');
INSERT INTO `t_order_0` VALUES ('57', '12');
INSERT INTO `t_order_0` VALUES ('58', '14');
INSERT INTO `t_order_0` VALUES ('59', '16');
INSERT INTO `t_order_0` VALUES ('60', '18');
INSERT INTO `t_order_0` VALUES ('61', '20');
INSERT INTO `t_order_0` VALUES ('62', '22');
INSERT INTO `t_order_0` VALUES ('63', '24');
INSERT INTO `t_order_0` VALUES ('64', '26');
INSERT INTO `t_order_0` VALUES ('65', '28');
INSERT INTO `t_order_0` VALUES ('66', '30');
INSERT INTO `t_order_0` VALUES ('67', '32');
INSERT INTO `t_order_0` VALUES ('68', '34');
INSERT INTO `t_order_0` VALUES ('69', '36');
INSERT INTO `t_order_0` VALUES ('70', '38');
INSERT INTO `t_order_0` VALUES ('71', '40');
INSERT INTO `t_order_0` VALUES ('72', '42');
INSERT INTO `t_order_0` VALUES ('73', '44');
INSERT INTO `t_order_0` VALUES ('74', '46');
INSERT INTO `t_order_0` VALUES ('75', '48');
INSERT INTO `t_order_0` VALUES ('76', '50');
INSERT INTO `t_order_0` VALUES ('77', '52');
INSERT INTO `t_order_0` VALUES ('78', '54');
INSERT INTO `t_order_0` VALUES ('79', '56');
INSERT INTO `t_order_0` VALUES ('80', '58');
INSERT INTO `t_order_0` VALUES ('81', '60');
INSERT INTO `t_order_0` VALUES ('82', '62');
INSERT INTO `t_order_0` VALUES ('83', '64');
INSERT INTO `t_order_0` VALUES ('84', '66');
INSERT INTO `t_order_0` VALUES ('85', '68');
INSERT INTO `t_order_0` VALUES ('86', '70');
INSERT INTO `t_order_0` VALUES ('87', '72');
INSERT INTO `t_order_0` VALUES ('88', '74');
INSERT INTO `t_order_0` VALUES ('89', '76');
INSERT INTO `t_order_0` VALUES ('90', '78');
INSERT INTO `t_order_0` VALUES ('91', '80');
INSERT INTO `t_order_0` VALUES ('92', '82');
INSERT INTO `t_order_0` VALUES ('93', '84');
INSERT INTO `t_order_0` VALUES ('94', '86');
INSERT INTO `t_order_0` VALUES ('95', '88');
INSERT INTO `t_order_0` VALUES ('96', '90');
INSERT INTO `t_order_0` VALUES ('97', '92');
INSERT INTO `t_order_0` VALUES ('98', '94');
INSERT INTO `t_order_0` VALUES ('99', '96');
INSERT INTO `t_order_0` VALUES ('100', '98');

-- ----------------------------
-- Table structure for t_order_1
-- ----------------------------
DROP TABLE IF EXISTS `t_order_1`;
CREATE TABLE `t_order_1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of t_order_1
-- ----------------------------
INSERT INTO `t_order_1` VALUES ('1', '1');
INSERT INTO `t_order_1` VALUES ('2', '3');
INSERT INTO `t_order_1` VALUES ('3', '5');
INSERT INTO `t_order_1` VALUES ('4', '7');
INSERT INTO `t_order_1` VALUES ('5', '9');
INSERT INTO `t_order_1` VALUES ('6', '11');
INSERT INTO `t_order_1` VALUES ('7', '13');
INSERT INTO `t_order_1` VALUES ('8', '15');
INSERT INTO `t_order_1` VALUES ('9', '17');
INSERT INTO `t_order_1` VALUES ('10', '19');
INSERT INTO `t_order_1` VALUES ('11', '21');
INSERT INTO `t_order_1` VALUES ('12', '23');
INSERT INTO `t_order_1` VALUES ('13', '25');
INSERT INTO `t_order_1` VALUES ('14', '27');
INSERT INTO `t_order_1` VALUES ('15', '29');
INSERT INTO `t_order_1` VALUES ('16', '31');
INSERT INTO `t_order_1` VALUES ('17', '33');
INSERT INTO `t_order_1` VALUES ('18', '35');
INSERT INTO `t_order_1` VALUES ('19', '37');
INSERT INTO `t_order_1` VALUES ('20', '39');
INSERT INTO `t_order_1` VALUES ('21', '41');
INSERT INTO `t_order_1` VALUES ('22', '43');
INSERT INTO `t_order_1` VALUES ('23', '45');
INSERT INTO `t_order_1` VALUES ('24', '47');
INSERT INTO `t_order_1` VALUES ('25', '49');
INSERT INTO `t_order_1` VALUES ('26', '51');
INSERT INTO `t_order_1` VALUES ('27', '53');
INSERT INTO `t_order_1` VALUES ('28', '55');
INSERT INTO `t_order_1` VALUES ('29', '57');
INSERT INTO `t_order_1` VALUES ('30', '59');
INSERT INTO `t_order_1` VALUES ('31', '61');
INSERT INTO `t_order_1` VALUES ('32', '63');
INSERT INTO `t_order_1` VALUES ('33', '65');
INSERT INTO `t_order_1` VALUES ('34', '67');
INSERT INTO `t_order_1` VALUES ('35', '69');
INSERT INTO `t_order_1` VALUES ('36', '71');
INSERT INTO `t_order_1` VALUES ('37', '73');
INSERT INTO `t_order_1` VALUES ('38', '75');
INSERT INTO `t_order_1` VALUES ('39', '77');
INSERT INTO `t_order_1` VALUES ('40', '79');
INSERT INTO `t_order_1` VALUES ('41', '81');
INSERT INTO `t_order_1` VALUES ('42', '83');
INSERT INTO `t_order_1` VALUES ('43', '85');
INSERT INTO `t_order_1` VALUES ('44', '87');
INSERT INTO `t_order_1` VALUES ('45', '89');
INSERT INTO `t_order_1` VALUES ('46', '91');
INSERT INTO `t_order_1` VALUES ('47', '93');
INSERT INTO `t_order_1` VALUES ('48', '95');
INSERT INTO `t_order_1` VALUES ('49', '97');
INSERT INTO `t_order_1` VALUES ('50', '99');
INSERT INTO `t_order_1` VALUES ('51', '1');
INSERT INTO `t_order_1` VALUES ('52', '3');
INSERT INTO `t_order_1` VALUES ('53', '5');
INSERT INTO `t_order_1` VALUES ('54', '7');
INSERT INTO `t_order_1` VALUES ('55', '9');
INSERT INTO `t_order_1` VALUES ('56', '11');
INSERT INTO `t_order_1` VALUES ('57', '13');
INSERT INTO `t_order_1` VALUES ('58', '15');
INSERT INTO `t_order_1` VALUES ('59', '17');
INSERT INTO `t_order_1` VALUES ('60', '19');
INSERT INTO `t_order_1` VALUES ('61', '21');
INSERT INTO `t_order_1` VALUES ('62', '23');
INSERT INTO `t_order_1` VALUES ('63', '25');
INSERT INTO `t_order_1` VALUES ('64', '27');
INSERT INTO `t_order_1` VALUES ('65', '29');
INSERT INTO `t_order_1` VALUES ('66', '31');
INSERT INTO `t_order_1` VALUES ('67', '33');
INSERT INTO `t_order_1` VALUES ('68', '35');
INSERT INTO `t_order_1` VALUES ('69', '37');
INSERT INTO `t_order_1` VALUES ('70', '39');
INSERT INTO `t_order_1` VALUES ('71', '41');
INSERT INTO `t_order_1` VALUES ('72', '43');
INSERT INTO `t_order_1` VALUES ('73', '45');
INSERT INTO `t_order_1` VALUES ('74', '47');
INSERT INTO `t_order_1` VALUES ('75', '49');
INSERT INTO `t_order_1` VALUES ('76', '51');
INSERT INTO `t_order_1` VALUES ('77', '53');
INSERT INTO `t_order_1` VALUES ('78', '55');
INSERT INTO `t_order_1` VALUES ('79', '57');
INSERT INTO `t_order_1` VALUES ('80', '59');
INSERT INTO `t_order_1` VALUES ('81', '61');
INSERT INTO `t_order_1` VALUES ('82', '63');
INSERT INTO `t_order_1` VALUES ('83', '65');
INSERT INTO `t_order_1` VALUES ('84', '67');
INSERT INTO `t_order_1` VALUES ('85', '69');
INSERT INTO `t_order_1` VALUES ('86', '71');
INSERT INTO `t_order_1` VALUES ('87', '73');
INSERT INTO `t_order_1` VALUES ('88', '75');
INSERT INTO `t_order_1` VALUES ('89', '77');
INSERT INTO `t_order_1` VALUES ('90', '79');
INSERT INTO `t_order_1` VALUES ('91', '81');
INSERT INTO `t_order_1` VALUES ('92', '83');
INSERT INTO `t_order_1` VALUES ('93', '85');
INSERT INTO `t_order_1` VALUES ('94', '87');
INSERT INTO `t_order_1` VALUES ('95', '89');
INSERT INTO `t_order_1` VALUES ('96', '91');
INSERT INTO `t_order_1` VALUES ('97', '93');
INSERT INTO `t_order_1` VALUES ('98', '95');
INSERT INTO `t_order_1` VALUES ('99', '97');
INSERT INTO `t_order_1` VALUES ('100', '99');

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
INSERT INTO `t_smt` VALUES ('1', '1');
INSERT INTO `t_smt` VALUES ('2', '4');
INSERT INTO `t_smt` VALUES ('3', '7');
INSERT INTO `t_smt` VALUES ('4', '10');
INSERT INTO `t_smt` VALUES ('5', '13');
INSERT INTO `t_smt` VALUES ('6', '16');
INSERT INTO `t_smt` VALUES ('7', '19');
INSERT INTO `t_smt` VALUES ('8', '22');
INSERT INTO `t_smt` VALUES ('9', '25');
INSERT INTO `t_smt` VALUES ('10', '28');
INSERT INTO `t_smt` VALUES ('11', '31');
INSERT INTO `t_smt` VALUES ('12', '34');
INSERT INTO `t_smt` VALUES ('13', '37');
INSERT INTO `t_smt` VALUES ('14', '40');
INSERT INTO `t_smt` VALUES ('15', '43');
INSERT INTO `t_smt` VALUES ('16', '46');
INSERT INTO `t_smt` VALUES ('17', '49');
INSERT INTO `t_smt` VALUES ('18', '52');
INSERT INTO `t_smt` VALUES ('19', '55');
INSERT INTO `t_smt` VALUES ('20', '58');
INSERT INTO `t_smt` VALUES ('21', '61');
INSERT INTO `t_smt` VALUES ('22', '64');
INSERT INTO `t_smt` VALUES ('23', '67');
INSERT INTO `t_smt` VALUES ('24', '70');
INSERT INTO `t_smt` VALUES ('25', '73');
INSERT INTO `t_smt` VALUES ('26', '76');
INSERT INTO `t_smt` VALUES ('27', '79');
INSERT INTO `t_smt` VALUES ('28', '82');
INSERT INTO `t_smt` VALUES ('29', '85');
INSERT INTO `t_smt` VALUES ('30', '88');
INSERT INTO `t_smt` VALUES ('31', '91');
INSERT INTO `t_smt` VALUES ('32', '94');
INSERT INTO `t_smt` VALUES ('33', '97');

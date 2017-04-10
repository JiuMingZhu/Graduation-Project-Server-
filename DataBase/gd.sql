/*
Navicat MySQL Data Transfer

Source Server         : 毕设
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : gd

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2017-04-10 15:30:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `source`
-- ----------------------------
DROP TABLE IF EXISTS `source`;
CREATE TABLE `source` (
  `sourceId` int(20) NOT NULL,
  `sourceName` varchar(20) NOT NULL,
  PRIMARY KEY (`sourceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of source
-- ----------------------------
INSERT INTO `source` VALUES ('1', 'This');
INSERT INTO `source` VALUES ('2', 'Is');
INSERT INTO `source` VALUES ('3', 'A');
INSERT INTO `source` VALUES ('4', 'Test');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userName` varchar(20) NOT NULL,
  `userPasswd` varchar(20) NOT NULL,
  PRIMARY KEY (`userName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('4131169041', '13142mm');
INSERT INTO `user` VALUES ('UserName', '1');
INSERT INTO `user` VALUES ('UserName3', 'UserPasswd');

/*
Navicat MySQL Data Transfer

Source Server         : 毕设
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : gd

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2017-04-28 09:17:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sourcelist_1`
-- ----------------------------
DROP TABLE IF EXISTS `sourcelist_1`;
CREATE TABLE `sourcelist_1` (
  `sourceId` int(20) NOT NULL,
  `sourceName` varchar(20) NOT NULL,
  PRIMARY KEY (`sourceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sourcelist_1
-- ----------------------------
INSERT INTO `sourcelist_1` VALUES ('1', 'TL原子能技术');
INSERT INTO `sourcelist_1` VALUES ('2', 'TM电工技术');
INSERT INTO `sourcelist_1` VALUES ('3', 'TN无线电电子学、电信技术');
INSERT INTO `sourcelist_1` VALUES ('4', 'TP自动化技术、计算机技术');
INSERT INTO `sourcelist_1` VALUES ('5', 'TQ化学工业');

-- ----------------------------
-- Table structure for `tl原子能技术`
-- ----------------------------
DROP TABLE IF EXISTS `tl原子能技术`;
CREATE TABLE `tl原子能技术` (
  `sourceId` int(20) NOT NULL,
  `sourceName` varchar(20) NOT NULL,
  PRIMARY KEY (`sourceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tl原子能技术
-- ----------------------------
INSERT INTO `tl原子能技术` VALUES ('1', 'TL1基础理论');
INSERT INTO `tl原子能技术` VALUES ('2', 'TL2核燃料及其生产');
INSERT INTO `tl原子能技术` VALUES ('3', 'TL3核反应堆工程');
INSERT INTO `tl原子能技术` VALUES ('4', 'TL4各种核反应堆、核电厂');
INSERT INTO `tl原子能技术` VALUES ('5', 'TL5加速器');

-- ----------------------------
-- Table structure for `tm电工技术`
-- ----------------------------
DROP TABLE IF EXISTS `tm电工技术`;
CREATE TABLE `tm电工技术` (
  `sourceId` int(20) NOT NULL,
  `sourceName` varchar(20) NOT NULL,
  PRIMARY KEY (`sourceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tm电工技术
-- ----------------------------
INSERT INTO `tm电工技术` VALUES ('1', 'TM0一般性问题');
INSERT INTO `tm电工技术` VALUES ('2', 'TM1电工基础理论');
INSERT INTO `tm电工技术` VALUES ('3', 'TM2电工材料');
INSERT INTO `tm电工技术` VALUES ('4', 'TM3电机');
INSERT INTO `tm电工技术` VALUES ('5', 'TM4变压器、变流器及电抗器');

-- ----------------------------
-- Table structure for `tn无线电电子学、电信技术`
-- ----------------------------
DROP TABLE IF EXISTS `tn无线电电子学、电信技术`;
CREATE TABLE `tn无线电电子学、电信技术` (
  `sourceId` int(20) NOT NULL,
  `sourceName` varchar(20) NOT NULL,
  PRIMARY KEY (`sourceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tn无线电电子学、电信技术
-- ----------------------------
INSERT INTO `tn无线电电子学、电信技术` VALUES ('1', 'TN0一般性问题');
INSERT INTO `tn无线电电子学、电信技术` VALUES ('2', 'TN1真空电子技术');
INSERT INTO `tn无线电电子学、电信技术` VALUES ('3', 'TN2光电子技术、激光技术');
INSERT INTO `tn无线电电子学、电信技术` VALUES ('4', 'TN3半导体技术');
INSERT INTO `tn无线电电子学、电信技术` VALUES ('5', 'TN4微电子学、集成电路（IC）');

-- ----------------------------
-- Table structure for `tp1自动化基础理论`
-- ----------------------------
DROP TABLE IF EXISTS `tp1自动化基础理论`;
CREATE TABLE `tp1自动化基础理论` (
  `sourceId` int(20) NOT NULL,
  `sourceName` varchar(20) NOT NULL,
  PRIMARY KEY (`sourceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tp1自动化基础理论
-- ----------------------------
INSERT INTO `tp1自动化基础理论` VALUES ('1', 'TP11自动化系统理论');
INSERT INTO `tp1自动化基础理论` VALUES ('2', 'TP13自动控制理论');
INSERT INTO `tp1自动化基础理论` VALUES ('3', 'TP14自动信息理论');
INSERT INTO `tp1自动化基础理论` VALUES ('4', 'TP15自动模拟理论（自动仿真理论）');
INSERT INTO `tp1自动化基础理论` VALUES ('5', 'TP17开关电路理论');

-- ----------------------------
-- Table structure for `tp2自动化技术及设备`
-- ----------------------------
DROP TABLE IF EXISTS `tp2自动化技术及设备`;
CREATE TABLE `tp2自动化技术及设备` (
  `sourceId` int(20) NOT NULL,
  `sourceName` varchar(20) NOT NULL,
  PRIMARY KEY (`sourceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tp2自动化技术及设备
-- ----------------------------
INSERT INTO `tp2自动化技术及设备` VALUES ('1', 'TP20一般性问题');
INSERT INTO `tp2自动化技术及设备` VALUES ('2', 'TP21自动化元件、部件');
INSERT INTO `tp2自动化技术及设备` VALUES ('3', 'TP23自动化装置与设备');
INSERT INTO `tp2自动化技术及设备` VALUES ('4', 'TP24机器人技术');
INSERT INTO `tp2自动化技术及设备` VALUES ('5', 'TP27自动化系统');

-- ----------------------------
-- Table structure for `tp312程序语言、算法语言`
-- ----------------------------
DROP TABLE IF EXISTS `tp312程序语言、算法语言`;
CREATE TABLE `tp312程序语言、算法语言` (
  `sourceId` int(20) NOT NULL,
  `sourceName` varchar(20) NOT NULL,
  PRIMARY KEY (`sourceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tp312程序语言、算法语言
-- ----------------------------
INSERT INTO `tp312程序语言、算法语言` VALUES ('1', 'Java程序设计');
INSERT INTO `tp312程序语言、算法语言` VALUES ('2', 'C#程序设计');
INSERT INTO `tp312程序语言、算法语言` VALUES ('3', 'C程序设计');
INSERT INTO `tp312程序语言、算法语言` VALUES ('4', 'CSS从入门到精通');
INSERT INTO `tp312程序语言、算法语言` VALUES ('5', 'Html5讲解');

-- ----------------------------
-- Table structure for `tp3计算技术、计算机技术`
-- ----------------------------
DROP TABLE IF EXISTS `tp3计算技术、计算机技术`;
CREATE TABLE `tp3计算技术、计算机技术` (
  `sourceId` int(20) NOT NULL,
  `sourceName` varchar(20) NOT NULL,
  PRIMARY KEY (`sourceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tp3计算技术、计算机技术
-- ----------------------------
INSERT INTO `tp3计算技术、计算机技术` VALUES ('1', 'TP311程序设计、软件工程');
INSERT INTO `tp3计算技术、计算机技术` VALUES ('2', 'TP312程序语言、算法语言');
INSERT INTO `tp3计算技术、计算机技术` VALUES ('3', 'TP313计算技术、计算机技术');
INSERT INTO `tp3计算技术、计算机技术` VALUES ('4', 'TP314编译程序、解释程序');
INSERT INTO `tp3计算技术、计算机技术` VALUES ('5', 'TP315管理程序、管理系统');

-- ----------------------------
-- Table structure for `tp6射流技术（流控技术）`
-- ----------------------------
DROP TABLE IF EXISTS `tp6射流技术（流控技术）`;
CREATE TABLE `tp6射流技术（流控技术）` (
  `sourceId` int(20) NOT NULL,
  `sourceName` varchar(20) NOT NULL,
  PRIMARY KEY (`sourceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tp6射流技术（流控技术）
-- ----------------------------
INSERT INTO `tp6射流技术（流控技术）` VALUES ('1', 'TP60一般性问题');
INSERT INTO `tp6射流技术（流控技术）` VALUES ('2', 'TP61射流元件');
INSERT INTO `tp6射流技术（流控技术）` VALUES ('3', 'TP62射流附件');
INSERT INTO `tp6射流技术（流控技术）` VALUES ('4', 'TP63检测发信装置');
INSERT INTO `tp6射流技术（流控技术）` VALUES ('5', 'TP64执行机构');

-- ----------------------------
-- Table structure for `tp7遥感技术`
-- ----------------------------
DROP TABLE IF EXISTS `tp7遥感技术`;
CREATE TABLE `tp7遥感技术` (
  `sourceId` int(20) NOT NULL,
  `sourceName` varchar(20) NOT NULL,
  PRIMARY KEY (`sourceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tp7遥感技术
-- ----------------------------
INSERT INTO `tp7遥感技术` VALUES ('1', 'TP70一般性问题');
INSERT INTO `tp7遥感技术` VALUES ('2', 'TP72遥感方式');
INSERT INTO `tp7遥感技术` VALUES ('3', 'TP73探测仪器及系统');
INSERT INTO `tp7遥感技术` VALUES ('4', 'TP75遥感图像的解译、识别与处理');
INSERT INTO `tp7遥感技术` VALUES ('5', 'TP79遥感技术的应用');

-- ----------------------------
-- Table structure for `tp自动化技术、计算机技术`
-- ----------------------------
DROP TABLE IF EXISTS `tp自动化技术、计算机技术`;
CREATE TABLE `tp自动化技术、计算机技术` (
  `sourceId` int(20) NOT NULL,
  `sourceName` varchar(20) NOT NULL,
  PRIMARY KEY (`sourceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tp自动化技术、计算机技术
-- ----------------------------
INSERT INTO `tp自动化技术、计算机技术` VALUES ('1', 'TP1自动化基础理论');
INSERT INTO `tp自动化技术、计算机技术` VALUES ('2', 'TP2自动化技术及设备');
INSERT INTO `tp自动化技术、计算机技术` VALUES ('3', 'TP3计算技术、计算机技术');
INSERT INTO `tp自动化技术、计算机技术` VALUES ('4', 'TP6射流技术（流控技术）');
INSERT INTO `tp自动化技术、计算机技术` VALUES ('5', 'TP7遥感技术');

-- ----------------------------
-- Table structure for `tq化学工业`
-- ----------------------------
DROP TABLE IF EXISTS `tq化学工业`;
CREATE TABLE `tq化学工业` (
  `sourceId` int(20) NOT NULL,
  `sourceName` varchar(20) NOT NULL,
  PRIMARY KEY (`sourceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tq化学工业
-- ----------------------------
INSERT INTO `tq化学工业` VALUES ('1', 'TQ0一般性问题');
INSERT INTO `tq化学工业` VALUES ('2', 'TQ11基本无机化学工业');
INSERT INTO `tq化学工业` VALUES ('3', 'TQ12非金属元素及其无机化合物化学工业');
INSERT INTO `tq化学工业` VALUES ('4', 'TQ13金属元素的无机化合物化学工业');
INSERT INTO `tq化学工业` VALUES ('5', 'TQ15电化学工业');

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

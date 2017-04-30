/*
Navicat MySQL Data Transfer

Source Server         : zhu
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : works

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-04-30 20:22:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `books`
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `author` varchar(255) DEFAULT NULL,
  `status` int(10) DEFAULT NULL,
  `borrowdate` date DEFAULT NULL,
  `backdate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of books
-- ----------------------------

-- ----------------------------
-- Table structure for `works`
-- ----------------------------
DROP TABLE IF EXISTS `works`;
CREATE TABLE `works` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of works
-- ----------------------------
INSERT INTO `works` VALUES ('1', 'zhu', '123');

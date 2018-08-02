/*
 Navicat Premium Data Transfer

 Source Server         : 本地mysql
 Source Server Type    : MySQL
 Source Server Version : 50536
 Source Host           : localhost:3306
 Source Schema         : dongtech

 Target Server Type    : MySQL
 Target Server Version : 50536
 File Encoding         : 65001

 Date: 02/08/2018 17:33:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for permissioninfo
-- ----------------------------
DROP TABLE IF EXISTS `permissioninfo`;
CREATE TABLE `permissioninfo`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `permissionnum` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `permissionexplain` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of permissioninfo
-- ----------------------------
INSERT INTO `permissioninfo` VALUES ('1', '1', '超级管理员');
INSERT INTO `permissioninfo` VALUES ('2', '2', '管理员');
INSERT INTO `permissioninfo` VALUES ('3', '3', '普通权限');

-- ----------------------------
-- Table structure for permissionpath
-- ----------------------------
DROP TABLE IF EXISTS `permissionpath`;
CREATE TABLE `permissionpath`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `permissionnum` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `permissionpath` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of permissionpath
-- ----------------------------
INSERT INTO `permissionpath` VALUES ('1', '1', '/menu/roledocument');
INSERT INTO `permissionpath` VALUES ('2', '1', '/menu/profiledocument');
INSERT INTO `permissionpath` VALUES ('3', '1', '/menu/userdocument');
INSERT INTO `permissionpath` VALUES ('4', '1', '/menu/permissiondocument');
INSERT INTO `permissionpath` VALUES ('5', '2', '/menu/profiledocument');
INSERT INTO `permissionpath` VALUES ('6', '2', '/menu/userdocument');
INSERT INTO `permissionpath` VALUES ('7', '3', '/menu/profiledocument');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `worktime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `workstatus` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', 'dongtech', '2016-06-30', '1', '123456', 'zld126126@126.com');
INSERT INTO `userinfo` VALUES ('2', 'dongbao', '2017-08-30', '0', '666666', 'zld163163@163.com');
INSERT INTO `userinfo` VALUES ('3', 'donglong', '2018-03-22', '1', '123456', 'yy@126.com');
INSERT INTO `userinfo` VALUES ('60bff6c9fd734d8986dc4482bc08ec4d', 'zld126126', '2018-08-02', '1', 'dd931226', 'z@qq.com');
INSERT INTO `userinfo` VALUES ('70cb8354fda04daeb6acaef13df9fd14', 'zld163163', '2018-08-02', '1', 'dd931226', 'xxx@126.com');

-- ----------------------------
-- Table structure for userrole
-- ----------------------------
DROP TABLE IF EXISTS `userrole`;
CREATE TABLE `userrole`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `permissonid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userrole
-- ----------------------------
INSERT INTO `userrole` VALUES ('1', '1', '1');
INSERT INTO `userrole` VALUES ('2', '2', '2');
INSERT INTO `userrole` VALUES ('3', '3', '3');

SET FOREIGN_KEY_CHECKS = 1;

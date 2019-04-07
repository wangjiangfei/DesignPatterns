/*
 Navicat Premium Data Transfer

 Source Server         : wangjiangfei
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 04/04/2019 11:12:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_dep
-- ----------------------------
DROP TABLE IF EXISTS `tbl_dep`;
CREATE TABLE `tbl_dep`  (
  `depid` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`depid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_dep
-- ----------------------------
INSERT INTO `tbl_dep` VALUES ('01', '总公司');
INSERT INTO `tbl_dep` VALUES ('0101', '一分公司');
INSERT INTO `tbl_dep` VALUES ('010101', '开发部');
INSERT INTO `tbl_dep` VALUES ('010102', '测试部');
INSERT INTO `tbl_dep` VALUES ('0102', '二分公司');
INSERT INTO `tbl_dep` VALUES ('010201', '开发部');
INSERT INTO `tbl_dep` VALUES ('010202', '客服部');

-- ----------------------------
-- Table structure for tbl_user
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user`  (
  `userid` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `depid` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userid`) USING BTREE,
  INDEX `depid`(`depid`) USING BTREE,
  CONSTRAINT `tbl_user_ibfk_1` FOREIGN KEY (`depid`) REFERENCES `tbl_dep` (`depid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------
INSERT INTO `tbl_user` VALUES ('user0001', '张三1', '010101', '男');
INSERT INTO `tbl_user` VALUES ('user0002', '张三2', '010101', '男');
INSERT INTO `tbl_user` VALUES ('user0003', '张三3', '010102', '男');
INSERT INTO `tbl_user` VALUES ('user0004', '张三4', '010201', '男');
INSERT INTO `tbl_user` VALUES ('user0005', '张三5', '010201', '男');
INSERT INTO `tbl_user` VALUES ('user0006', '张三6', '010202', '男');

SET FOREIGN_KEY_CHECKS = 1;

/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50018
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50018
 File Encoding         : 65001

 Date: 26/08/2018 10:51:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `ID` int(11) NOT NULL DEFAULT '' AUTO_INCREMENT,
  `CNAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `STREET` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CITY` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY USING BTREE (`ID`)
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES (1, 'tom', '新华路', '北京');
INSERT INTO `customer` VALUES (5, '123', '123', '123');
INSERT INTO `customer` VALUES (6, 'aaa', 'sssd', 'dd');

-- ----------------------------
-- Table structure for invoice
-- ----------------------------
DROP TABLE IF EXISTS `invoice`;
CREATE TABLE `invoice`  (
  `ID` int(11) NOT NULL DEFAULT '' AUTO_INCREMENT,
  `CUSTOMERID` int(11) NULL DEFAULT NULL,
  `TOTAL` decimal(10, 0) NULL DEFAULT NULL,
  PRIMARY KEY USING BTREE (`ID`),
  INDEX `SYS_FK_67` USING BTREE(`CUSTOMERID`),
  CONSTRAINT `SYS_FK_67` FOREIGN KEY (`CUSTOMERID`) REFERENCES `customer` (`ID`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'InnoDB free: 4096 kB; (`CUSTOMERID`) REFER `test/customer`(`ID`) ON DELETE CASCA' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of invoice
-- ----------------------------
INSERT INTO `invoice` VALUES (1, 1, 1);
INSERT INTO `invoice` VALUES (3, 6, 0);

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item`  (
  `ID` int(11) NOT NULL DEFAULT '',
  `INVOICEID` int(11) NOT NULL DEFAULT '',
  `ITEM` int(11) NOT NULL DEFAULT '',
  `PRODUCTID` int(11) NULL DEFAULT NULL,
  `QUANTITY` int(11) NULL DEFAULT NULL,
  `COST` decimal(10, 0) NULL DEFAULT NULL,
  PRIMARY KEY USING BTREE (`ID`),
  INDEX `SYS_FK_72` USING BTREE(`INVOICEID`),
  INDEX `SYS_FK_73` USING BTREE(`PRODUCTID`),
  CONSTRAINT `SYS_FK_72` FOREIGN KEY (`INVOICEID`) REFERENCES `invoice` (`ID`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `SYS_FK_73` FOREIGN KEY (`PRODUCTID`) REFERENCES `product` (`ID`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'InnoDB free: 4096 kB; (`INVOICEID`) REFER `test/invoice`(`ID`) ON DELETE CASCADE' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES (1, 1, 1, 1, 1, 1);

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `ID` int(11) NOT NULL DEFAULT '' AUTO_INCREMENT,
  `NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PRICE` decimal(10, 0) NULL DEFAULT NULL,
  PRIMARY KEY USING BTREE (`ID`)
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, 'aa', 10);


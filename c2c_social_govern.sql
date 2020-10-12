/*
Navicat MySQL Data Transfer
Source Server         : localhost
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : c2c_social
Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001
Date: 2020-09-10 14:24:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for report_task
-- ----------------------------
DROP TABLE IF EXISTS `report_task`;
CREATE TABLE `report_task` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(50) NOT NULL,
  `report_user_id` int(11) NOT NULL,
  `report_content` varchar(255) NOT NULL,
  `target_id` int(11) NOT NULL,
  `vote_result` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for report_task_vote
-- ----------------------------
DROP TABLE IF EXISTS `report_task_vote`;
CREATE TABLE `report_task_vote` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `report_task_id` int(11) NOT NULL,
  `reviewer_id` int(11) NOT NULL,
  `vote_result` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for reviewer_task_status
-- ----------------------------
DROP TABLE IF EXISTS `reviewer_task_status`;
CREATE TABLE `reviewer_task_status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `reviewer_id` int(11) NOT NULL,
  `report_task_id` int(11) NOT NULL,
  `status` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for reward_coin
-- ----------------------------
DROP TABLE IF EXISTS `reward_coin`;
CREATE TABLE `reward_coin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `reviewer_id` int(11) DEFAULT NULL,
  `coins` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
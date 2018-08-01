/*
Navicat MySQL Data Transfer

Source Server         : 123
Source Server Version : 50154
Source Host           : localhost:3306
Source Database       : crm_ssm

Target Server Type    : MYSQL
Target Server Version : 50154
File Encoding         : 65001

Date: 2018-08-01 15:26:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(255) DEFAULT NULL,
  `c_gender` char(1) DEFAULT NULL,
  `c_phone` varchar(255) DEFAULT NULL,
  `c_email` varchar(255) DEFAULT NULL,
  `c_age` int(11) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', '小李', null, null, null, null);
INSERT INTO `customer` VALUES ('2', 'feng', null, null, null, null);
INSERT INTO `customer` VALUES ('3', 'feng', null, null, null, null);
INSERT INTO `customer` VALUES ('4', 'feng', null, null, null, null);
INSERT INTO `customer` VALUES ('5', 'feng', null, null, null, null);
INSERT INTO `customer` VALUES ('6', 'feng', null, null, null, null);
INSERT INTO `customer` VALUES ('7', 'feng', null, null, null, null);
INSERT INTO `customer` VALUES ('8', 'feng', null, null, null, null);
INSERT INTO `customer` VALUES ('9', 'feng', null, null, null, null);
INSERT INTO `customer` VALUES ('10', 'feng', null, null, null, '11');
INSERT INTO `customer` VALUES ('11', 'feng', null, null, null, '11');
INSERT INTO `customer` VALUES ('12', 'feng', null, null, null, '11');

-- ----------------------------
-- Table structure for customer_care
-- ----------------------------
DROP TABLE IF EXISTS `customer_care`;
CREATE TABLE `customer_care` (
  `care_id` int(10) NOT NULL AUTO_INCREMENT,
  `customer_id` int(10) DEFAULT NULL,
  `care_theme` varchar(50) DEFAULT NULL,
  `care_way` varchar(50) DEFAULT NULL,
  `care_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `care_remark` varchar(1000) DEFAULT NULL,
  `care_nexttime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `care_people` varchar(50) DEFAULT NULL,
  `is_used` varchar(10) DEFAULT '1',
  PRIMARY KEY (`care_id`),
  KEY `FK_Reference_15` (`customer_id`),
  CONSTRAINT `FK_Reference_15` FOREIGN KEY (`customer_id`) REFERENCES `customer_info` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer_care
-- ----------------------------
INSERT INTO `customer_care` VALUES ('1', '1', '纪念日', '送礼品', '2013-05-23 23:12:29', '节日纪念<img src=\"http://localhost:8080/CRM_SSM02/kindeditor/plugins/emoticons/etc_20.gif\" border=\"0\" />', '2018-07-12 11:36:37', '孙悟空', '1');
INSERT INTO `customer_care` VALUES ('2', '1', '生日', '送礼品', '2013-05-23 23:14:00', '过生日', '2013-06-13 13:14:15', '猪八戒', '1');
INSERT INTO `customer_care` VALUES ('3', '7', '生日', '送礼品', '2018-06-04 10:53:48', '过生日', '2016-12-06 12:56:50', '唐僧', '1');
INSERT INTO `customer_care` VALUES ('4', '1', '生日', '送礼品', '2018-06-01 10:53:51', '过生日', '2018-07-27 09:35:25', '沙和尚', '1');

-- ----------------------------
-- Table structure for customer_condition
-- ----------------------------
DROP TABLE IF EXISTS `customer_condition`;
CREATE TABLE `customer_condition` (
  `condition_id` int(10) NOT NULL AUTO_INCREMENT,
  `condition_name` varchar(50) DEFAULT NULL,
  `condition_explain` varchar(1000) DEFAULT NULL,
  `is_used` varchar(10) DEFAULT '1',
  `customer_name` varchar(255) DEFAULT NULL,
  `customer_sex` varchar(255) DEFAULT NULL,
  `customer_mobile` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`condition_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer_condition
-- ----------------------------
INSERT INTO `customer_condition` VALUES ('1', '潜在客户', '可能成为客户的人', '1', null, null, null);
INSERT INTO `customer_condition` VALUES ('2', '意向客户', '有意愿车成为客户的人', '1', null, null, null);
INSERT INTO `customer_condition` VALUES ('3', '交易客户', '正在交易的客户', '1', null, null, null);

-- ----------------------------
-- Table structure for customer_info
-- ----------------------------
DROP TABLE IF EXISTS `customer_info`;
CREATE TABLE `customer_info` (
  `customer_id` int(10) NOT NULL AUTO_INCREMENT,
  `condition_id` int(10) DEFAULT NULL,
  `source_id` int(10) DEFAULT NULL,
  `user_id` int(10) DEFAULT NULL,
  `type_id` int(10) DEFAULT NULL,
  `customer_name` varchar(50) DEFAULT NULL,
  `customer_sex` varchar(10) DEFAULT NULL,
  `customer_mobile` varchar(20) DEFAULT NULL,
  `customer_qq` varchar(20) DEFAULT NULL,
  `customer_address` varchar(500) DEFAULT NULL,
  `customer_email` varchar(100) DEFAULT NULL,
  `customer_remark` varchar(1000) DEFAULT NULL,
  `customer_job` varchar(100) DEFAULT NULL,
  `customer_blog` varchar(100) DEFAULT NULL,
  `customer_tel` varchar(20) DEFAULT NULL,
  `customer_msn` varchar(50) DEFAULT NULL,
  `birth_day` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `customer_addtime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `customer_addman` varchar(50) DEFAULT NULL,
  `customer_changtime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `change_man` varchar(20) DEFAULT NULL,
  `customer_company` varchar(50) DEFAULT NULL,
  `is_used` varchar(10) DEFAULT '1',
  PRIMARY KEY (`customer_id`),
  KEY `FK_Reference_16` (`condition_id`),
  KEY `FK_Reference_17` (`source_id`),
  KEY `FK_Reference_18` (`type_id`),
  KEY `FK_Reference_23` (`user_id`),
  CONSTRAINT `FKdv2yjy7ho9dbbfkoy4pmv644t` FOREIGN KEY (`condition_id`) REFERENCES `customer_condition` (`condition_id`),
  CONSTRAINT `FKe58ic62nywuhc9abtlabil3ct` FOREIGN KEY (`source_id`) REFERENCES `customer_source` (`source_id`),
  CONSTRAINT `FK_Reference_16` FOREIGN KEY (`condition_id`) REFERENCES `customer_condition` (`condition_id`),
  CONSTRAINT `FK_Reference_17` FOREIGN KEY (`source_id`) REFERENCES `customer_source` (`source_id`),
  CONSTRAINT `FK_Reference_18` FOREIGN KEY (`type_id`) REFERENCES `customer_type` (`type_id`),
  CONSTRAINT `FK_Reference_23` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer_info
-- ----------------------------
INSERT INTO `customer_info` VALUES ('1', '1', '1', '1', '1', '李四', '男', '15797768089', '2334343', '重庆', '15797768089@163.com', '厉害<img src=\"http://localhost:8080/CRM_SSM02/kindeditor/plugins/emoticons/etc_01.gif\" border=\"0\" />', '学生', '6567', '52454789', '53423134', '2013-08-01 00:00:00', '2013-05-10 02:30:40', '张三', '2018-07-31 14:23:14', '123', '微微', '1');
INSERT INTO `customer_info` VALUES ('2', '1', '1', '1', '1', '华纳', '男', '13854545454', '23456', '重庆三峡', '15797768089@163.com', '<img src=\"http://localhost:8080/CRM_SSM02/kindeditor/plugins/emoticons/etc_16.gif\" border=\"0\" />如同仁堂', '学生', '6567', '52454789', '53423134', '2013-08-01 00:00:00', '2013-05-24 13:05:44', '张三', '2018-07-31 14:23:27', '123', '微微', '0');
INSERT INTO `customer_info` VALUES ('3', '1', '1', '3', '1', '刘欢', '男', '13854545454', '23245', '重庆', '15797768089@163.com', '如同仁堂', '学生', '6567', '52454789', '53423134', '2013-08-01 00:00:00', '2013-05-23 23:08:52', '张三', '2018-05-31 11:54:53', '123', '微微', '1');
INSERT INTO `customer_info` VALUES ('4', '1', '3', '1', '1', '阿黄', '男', '13544455544', '454578', '重庆三峡学院', '15797768089@163.com', '			法国风格\r\n		', '学生', '6565', '25478547', '45444455', '2013-08-01 15:40:54', '2013-05-23 23:10:17', '张三', '2013-05-25 09:33:24', '恒河', '三峡学院', '1');
INSERT INTO `customer_info` VALUES ('7', '1', '1', '1', '3', '黄晓军', '男', '15111866066', '909239200', '重庆云阳', '15797768089@163.com', '这个客户很水', '屌丝', 'guanzhuwo@blog.com', '42232323', '2323232', '1992-08-01 16:21:00', '2013-05-25 16:20:38', '蒋大爷', '2013-05-25 16:20:38', '', '敏军网络科技有限公司', '1');
INSERT INTO `customer_info` VALUES ('8', '1', '1', '1', '1', '温庆心', '男', '13652354533', '454578', '爱上对方', '15797768089@163.com', '很有钱', '码农', '1', '', '', '1991-08-30 16:50:38', '2013-05-26 06:49:28', 'admin', '2018-07-18 16:11:52', '', '', '1');
INSERT INTO `customer_info` VALUES ('9', '1', '2', '6', '2', '刘老师', '男', '15111866066', '454578', '重庆丰都', '15797768089@163.com', '			\r\n		这是个好老师', '程序猿', '', '58105789', '', '1987-05-13 20:02:29', '2013-05-25 20:00:42', '蒋元征', '2013-05-25 20:04:57', '蒋元征', '中软国际', '1');
INSERT INTO `customer_info` VALUES ('10', '1', '2', '1', '1', 'feng', '男', null, null, null, null, null, null, null, null, null, '2018-01-01 00:00:00', '2018-05-31 10:03:35', null, '2018-07-23 12:03:00', null, null, '1');
INSERT INTO `customer_info` VALUES ('11', '1', '2', '1', '1', 'feng', '男', null, null, null, null, null, null, null, null, null, '2018-01-01 00:00:00', '2018-05-31 10:08:15', null, '2018-05-31 10:08:15', null, null, '1');
INSERT INTO `customer_info` VALUES ('12', '1', '3', '4', '1', 'feng', '男', null, null, null, null, null, null, null, null, null, '2018-01-02 00:00:00', '2018-05-31 10:08:15', null, '2018-07-25 11:34:05', null, null, '1');
INSERT INTO `customer_info` VALUES ('13', '1', '2', '1', '1', 'feng', '男', null, null, null, null, null, null, null, null, null, '2018-01-03 00:00:00', '2018-05-31 10:08:15', null, '2018-05-31 10:08:15', null, null, '1');
INSERT INTO `customer_info` VALUES ('14', '1', '3', '1', '1', 'feng', '男', null, null, null, null, null, null, null, null, null, '2018-01-04 00:00:00', '2018-05-31 10:08:15', null, '2018-05-31 10:08:15', null, null, '1');
INSERT INTO `customer_info` VALUES ('15', '1', '3', '1', '1', 'feng', '男', null, null, null, null, null, null, null, null, null, '2018-01-05 00:00:00', '2018-05-31 10:08:15', null, '2018-05-31 10:08:15', null, null, '1');
INSERT INTO `customer_info` VALUES ('16', '1', '3', '1', '1', 'feng', '男', null, null, null, null, null, null, null, null, null, '2018-01-06 00:00:00', '2018-05-31 10:08:15', null, '2018-05-31 10:08:15', null, null, '1');
INSERT INTO `customer_info` VALUES ('19', '1', '1', '1', '1', '', '男', '', '', '', '1111111111@qq.com', '', '', '', '', '', '2018-07-18 11:31:02', '2018-07-18 11:31:02', null, '2018-07-18 11:31:02', null, '', null);
INSERT INTO `customer_info` VALUES ('20', '1', '1', '4', '1', '1111', '男', '', '', '', '1234567891@qq.com', '', '', '', '', '', '2018-07-18 11:48:01', '2018-07-18 11:48:01', null, '2018-07-18 11:48:01', null, '', null);
INSERT INTO `customer_info` VALUES ('21', '1', '1', '1', '1', '1111', '男', '', '', '', '1111111111@qq.com', '', '', '', '', '', '2018-07-12 11:26:41', '2018-07-23 11:26:47', null, '2018-07-23 11:26:47', null, '', null);
INSERT INTO `customer_info` VALUES ('22', '1', '1', '1', '1', '1111', '男', '', '', '', '1111111111@qq.com', '<img src=\"http://localhost:8080/CRM_SSM02/kindeditor/plugins/emoticons/etc_09.gif\" border=\"0\" /><img src=\"http://localhost:8080/CRM_SSM02/kindeditor/plugins/emoticons/etc_11.gif\" border=\"0\" />', '', '', '', '', '2018-07-21 11:31:37', '2018-07-23 11:31:50', null, '2018-07-31 14:23:41', '', '', null);
INSERT INTO `customer_info` VALUES ('23', '1', '1', '1', '1', '李四', '男', '15797768089', '2334343', '重庆', '379727687@qq.com', '厉害<img src=\"http://localhost:8080/CRM_SSM02/kindeditor/plugins/emoticons/etc_16.gif\" border=\"0\" />', '学生', '6567', '52454789', '53423134', '2013-05-01 00:00:00', '2013-05-10 02:30:40', '张三', '2018-07-31 14:23:54', '123', '微微', '1');
INSERT INTO `customer_info` VALUES ('24', '1', '1', '1', '1', '华纳', '男', '13854545454', '23456', '重庆三峡', '379727687@qq.com', '<img src=\"http://localhost:8080/CRM_SSM02/kindeditor/plugins/emoticons/etc_13.gif\" border=\"0\" />如同仁堂11111111', '学生', '6567', '52454789', '53423134', '2013-05-01 00:00:00', '2013-05-24 13:05:44', '张三', '2018-07-31 14:24:06', '123', '微微', '0');
INSERT INTO `customer_info` VALUES ('25', '1', '1', '3', '1', '刘欢', '男', '13854545454', '23245', '重庆', '379727687@qq.com', '如同仁堂', '学生', '6567', '52454789', '53423134', '2013-05-21 00:00:00', '2013-05-23 23:08:52', '张三', '2018-05-31 11:54:53', '123', '微微', '1');
INSERT INTO `customer_info` VALUES ('26', '1', '3', '1', '1', '阿黄', '男', '13544455544', '454578', '重庆三峡学院', '379727687@qq.com', '法国风格', '学生', '6565', '25478547', '45444455', '2013-05-01 15:40:54', '2013-05-23 23:10:17', '张三', '2013-05-25 09:33:24', '恒河', '三峡学院', '1');
INSERT INTO `customer_info` VALUES ('27', '1', '1', '1', '3', '黄晓军', '男', '15111866066', '909239200', '重庆云阳', '909239200@qq.com', '这个客户很水', '屌丝', 'guanzhuwo@blog.com', '42232323', '2323232', '1992-09-10 16:21:00', '2013-05-25 16:20:38', '蒋大爷', '2013-05-25 16:20:38', '', '敏军网络科技有限公司', '1');
INSERT INTO `customer_info` VALUES ('28', '1', '1', '1', '1', '温庆心', '男', '13652354533', '454578', '爱上对方', '123156@qq.com', '很有钱', '码农', '1', '', '', '1991-11-03 16:50:38', '2013-05-26 06:49:28', 'admin', '2018-07-18 16:11:52', '', '', '1');
INSERT INTO `customer_info` VALUES ('29', '1', '2', '6', '2', '刘老师', '男', '15111866066', '454578', '重庆丰都', '379727687@qq.com', '这是个好老师', '程序猿', '', '58105789', '', '1987-05-13 20:02:29', '2013-05-25 20:00:42', '蒋元征', '2013-05-25 20:04:57', '蒋元征', '中软国际', '1');
INSERT INTO `customer_info` VALUES ('30', '1', '1', '1', '1', '李四', '男', '15797768089', '2334343', '重庆', '379727687@qq.com', '厉害<img src=\"http://localhost:8080/CRM_SSM02/kindeditor/plugins/emoticons/etc_14.gif\" border=\"0\" />', '学生', '6567', '52454789', '53423134', '2013-05-01 00:00:00', '2013-05-10 02:30:40', '张三', '2018-07-31 14:24:17', '123', '微微', '1');
INSERT INTO `customer_info` VALUES ('31', '1', '1', '1', '1', '华纳', '男', '13854545454', '23456', '重庆三峡', '379727687@qq.com', '<img src=\"http://localhost:8080/CRM_SSM02/kindeditor/plugins/emoticons/etc_13.gif\" border=\"0\" />如同仁堂11111111', '学生', '6567', '52454789', '53423134', '2013-05-01 00:00:00', '2013-05-24 13:05:44', '张三', '2018-07-31 14:24:28', '123', '微微', '0');
INSERT INTO `customer_info` VALUES ('32', '1', '1', '3', '1', '刘欢', '男', '13854545454', '23245', '重庆', '379727687@qq.com', '如同仁堂', '学生', '6567', '52454789', '53423134', '2013-05-21 00:00:00', '2013-05-23 23:08:52', '张三', '2018-05-31 11:54:53', '123', '微微', '1');
INSERT INTO `customer_info` VALUES ('33', '1', '3', '1', '1', '阿黄', '男', '13544455544', '454578', '重庆三峡学院', '379727687@qq.com', '法国风格', '学生', '6565', '25478547', '45444455', '2013-05-01 15:40:54', '2013-05-23 23:10:17', '张三', '2013-05-25 09:33:24', '恒河', '三峡学院', '1');
INSERT INTO `customer_info` VALUES ('34', '1', '1', '1', '3', '黄晓军', '男', '15111866066', '909239200', '重庆云阳', '909239200@qq.com', '这个客户很水', '屌丝', 'guanzhuwo@blog.com', '42232323', '2323232', '1992-09-10 16:21:00', '2013-05-25 16:20:38', '蒋大爷', '2013-05-25 16:20:38', '', '敏军网络科技有限公司', '1');
INSERT INTO `customer_info` VALUES ('35', '1', '1', '1', '1', '温庆心', '男', '13652354533', '454578', '爱上对方', '123156@qq.com', '很有钱', '码农', '1', '', '', '1991-11-03 16:50:38', '2013-05-26 06:49:28', 'admin', '2018-07-18 16:11:52', '', '', '1');
INSERT INTO `customer_info` VALUES ('36', '1', '2', '6', '2', '刘老师', '男', '15111866066', '454578', '重庆丰都', '379727687@qq.com', '这是个好老师', '程序猿', '', '58105789', '', '1987-05-13 20:02:29', '2013-05-25 20:00:42', '蒋元征', '2013-05-25 20:04:57', '蒋元征', '中软国际', '1');
INSERT INTO `customer_info` VALUES ('38', '1', '1', '1', '1', '李四', '男', '15797768089', '2334343', '重庆', '379727687@qq.com', '厉害<img src=\"http://localhost:8080/CRM_SSM02/kindeditor/plugins/emoticons/etc_08.gif\" border=\"0\" />111', '学生', '6567', '52454789', '53423134', '2013-05-01 00:00:00', '2013-05-10 02:30:40', '张三', '2018-07-31 14:25:06', '123', '微微', '1');
INSERT INTO `customer_info` VALUES ('39', '1', '1', '1', '1', '华纳', '男', '13854545454', '23456', '重庆三峡', '379727687@qq.com', '<img src=\"http://localhost:8080/CRM_SSM02/kindeditor/plugins/emoticons/etc_09.gif\" border=\"0\" />如同仁堂11111111', '学生', '6567', '52454789', '53423134', '2013-05-01 00:00:00', '2013-05-24 13:05:44', '张三', '2018-07-31 14:24:57', '123', '微微', '0');
INSERT INTO `customer_info` VALUES ('40', '1', '1', '3', '1', '刘欢', '男', '13854545454', '23245', '重庆', '379727687@qq.com', '如同仁堂', '学生', '6567', '52454789', '53423134', '2013-05-21 00:00:00', '2013-05-23 23:08:52', '张三', '2018-05-31 11:54:53', '123', '微微', '1');
INSERT INTO `customer_info` VALUES ('41', '1', '3', '1', '1', '阿黄', '男', '13544455544', '454578', '重庆三峡学院', '379727687@qq.com', '法国风格', '学生', '6565', '25478547', '45444455', '2013-05-01 15:40:54', '2013-05-23 23:10:17', '张三', '2013-05-25 09:33:24', '恒河', '三峡学院', '1');
INSERT INTO `customer_info` VALUES ('42', '1', '1', '1', '3', '黄晓军', '男', '15111866066', '909239200', '重庆云阳', '909239200@qq.com', '这个客户很水', '屌丝', 'guanzhuwo@blog.com', '42232323', '2323232', '1992-09-10 16:21:00', '2013-05-25 16:20:38', '蒋大爷', '2013-05-25 16:20:38', '', '敏军网络科技有限公司', '1');
INSERT INTO `customer_info` VALUES ('43', '1', '1', '1', '1', '温庆心', '男', '13652354533', '454578', '爱上对方', '123156@qq.com', '很有钱', '码农', '1', '', '', '1991-11-03 16:50:38', '2013-05-26 06:49:28', 'admin', '2018-07-18 16:11:52', '', '', '1');
INSERT INTO `customer_info` VALUES ('44', '1', '2', '6', '2', '刘老师', '男', '15111866066', '454578', '重庆丰都', '379727687@qq.com', '这是个好老师', '程序猿', '', '58105789', '', '1987-05-13 20:02:29', '2013-05-25 20:00:42', '蒋元征', '2013-05-25 20:04:57', '蒋元征', '中软国际', '1');
INSERT INTO `customer_info` VALUES ('46', '1', '1', '1', '1', '李四', '男', '15797768089', '2334343', '重庆', '379727687@qq.com', '厉害<img src=\"http://localhost:8080/CRM_SSM02/kindeditor/plugins/emoticons/etc_07.gif\" border=\"0\" />', '学生', '6567', '52454789', '53423134', '2013-05-01 00:00:00', '2013-05-10 02:30:40', '张三', '2018-07-31 14:24:43', '123', '微微', '1');
INSERT INTO `customer_info` VALUES ('47', '1', '1', '1', '1', '华纳', '男', '13854545454', '23456', '重庆三峡', '379727687@qq.com', '<img src=\"http://localhost:8080/CRM_SSM02/kindeditor/plugins/emoticons/etc_08.gif\" border=\"0\" />如同仁堂11111111', '学生', '6567', '52454789', '53423134', '2013-05-01 00:00:00', '2013-05-24 13:05:44', '张三', '2018-07-31 14:25:17', '123', '微微', '0');
INSERT INTO `customer_info` VALUES ('48', '1', '1', '3', '1', '刘欢', '男', '13854545454', '23245', '重庆', '379727687@qq.com', '如同仁堂', '学生', '6567', '52454789', '53423134', '2013-05-21 00:00:00', '2013-05-23 23:08:52', '张三', '2018-05-31 11:54:53', '123', '微微', '1');
INSERT INTO `customer_info` VALUES ('49', '1', '3', '1', '1', '阿黄', '男', '13544455544', '454578', '重庆三峡学院', '379727687@qq.com', '法国风格', '学生', '6565', '25478547', '45444455', '2013-05-01 15:40:54', '2013-05-23 23:10:17', '张三', '2013-05-25 09:33:24', '恒河', '三峡学院', '1');
INSERT INTO `customer_info` VALUES ('50', '1', '1', '1', '3', '黄晓军', '男', '15111866066', '909239200', '重庆云阳', '909239200@qq.com', '这个客户很水', '屌丝', 'guanzhuwo@blog.com', '42232323', '2323232', '1992-09-10 16:21:00', '2013-05-25 16:20:38', '蒋大爷', '2013-05-25 16:20:38', '', '敏军网络科技有限公司', '1');
INSERT INTO `customer_info` VALUES ('51', '1', '1', '1', '1', '温庆心', '男', '13652354533', '454578', '爱上对方', '123156@qq.com', '很有钱', '码农', '1', '', '', '1991-11-03 16:50:38', '2013-05-26 06:49:28', 'admin', '2018-07-18 16:11:52', '', '', '1');
INSERT INTO `customer_info` VALUES ('52', '1', '2', '6', '2', '刘老师', '男', '15111866066', '454578', '重庆丰都', '379727687@qq.com', '这是个好老师', '程序猿', '', '58105789', '', '1987-05-13 20:02:29', '2013-05-25 20:00:42', '蒋元征', '2013-05-25 20:04:57', '蒋元征', '中软国际', '1');

-- ----------------------------
-- Table structure for customer_linkman
-- ----------------------------
DROP TABLE IF EXISTS `customer_linkman`;
CREATE TABLE `customer_linkman` (
  `linkman_id` int(10) NOT NULL AUTO_INCREMENT,
  `customer_id` int(10) DEFAULT NULL,
  `linkman_name` varchar(50) DEFAULT NULL,
  `linkman_sex` varchar(20) DEFAULT NULL,
  `linkman_job` varchar(100) DEFAULT NULL,
  `linkman_mobile` varchar(20) DEFAULT NULL,
  `linkman_age` int(10) DEFAULT NULL,
  `linkman_relation` varchar(50) DEFAULT NULL,
  `is_used` varchar(10) DEFAULT '1',
  PRIMARY KEY (`linkman_id`),
  KEY `FK_Reference_20` (`customer_id`),
  CONSTRAINT `FK_Reference_20` FOREIGN KEY (`customer_id`) REFERENCES `customer_info` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer_linkman
-- ----------------------------
INSERT INTO `customer_linkman` VALUES ('1', '2', '小李', '男', '老板', '35667', '34', '上下属', '1');

-- ----------------------------
-- Table structure for customer_linkreord
-- ----------------------------
DROP TABLE IF EXISTS `customer_linkreord`;
CREATE TABLE `customer_linkreord` (
  `record_id` int(10) NOT NULL AUTO_INCREMENT,
  `customer_id` int(10) DEFAULT NULL,
  `link_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `who_link` varchar(50) DEFAULT NULL,
  `link_type` varchar(50) DEFAULT NULL,
  `link_theme` varchar(200) DEFAULT NULL,
  `link_nexttime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `link_remark` varchar(1000) DEFAULT NULL,
  `is_used` varchar(10) DEFAULT '1',
  PRIMARY KEY (`record_id`),
  KEY `FK_Reference_19` (`customer_id`),
  CONSTRAINT `FK_Reference_19` FOREIGN KEY (`customer_id`) REFERENCES `customer_info` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer_linkreord
-- ----------------------------
INSERT INTO `customer_linkreord` VALUES ('1', '1', '2013-05-23 23:15:11', '张三', '打电话', '过来买房', '2013-05-28 23:15:14', '很好', '1');

-- ----------------------------
-- Table structure for customer_source
-- ----------------------------
DROP TABLE IF EXISTS `customer_source`;
CREATE TABLE `customer_source` (
  `source_id` int(10) NOT NULL AUTO_INCREMENT,
  `source_name` varchar(50) DEFAULT NULL,
  `is_used` varchar(10) DEFAULT '1',
  PRIMARY KEY (`source_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer_source
-- ----------------------------
INSERT INTO `customer_source` VALUES ('1', '自己上门', '1');
INSERT INTO `customer_source` VALUES ('2', '网上咨询', '1');
INSERT INTO `customer_source` VALUES ('3', '朋友推荐', '1');

-- ----------------------------
-- Table structure for customer_type
-- ----------------------------
DROP TABLE IF EXISTS `customer_type`;
CREATE TABLE `customer_type` (
  `type_id` int(10) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(50) DEFAULT NULL,
  `is_used` varchar(10) DEFAULT '1',
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer_type
-- ----------------------------
INSERT INTO `customer_type` VALUES ('1', '客户', '1');
INSERT INTO `customer_type` VALUES ('2', '合作伙伴', '1');
INSERT INTO `customer_type` VALUES ('3', '供应商', '1');
INSERT INTO `customer_type` VALUES ('4', '合作伙伴', '1');

-- ----------------------------
-- Table structure for department_info
-- ----------------------------
DROP TABLE IF EXISTS `department_info`;
CREATE TABLE `department_info` (
  `department_id` int(10) NOT NULL AUTO_INCREMENT,
  `department_name` varchar(50) DEFAULT NULL,
  `department_desc` varchar(500) DEFAULT NULL,
  `is_used` varchar(10) DEFAULT '1',
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department_info
-- ----------------------------
INSERT INTO `department_info` VALUES ('1', '财务部', '很有钱', '1');
INSERT INTO `department_info` VALUES ('2', '人事部', '管人的', '1');
INSERT INTO `department_info` VALUES ('3', '销售部', '搞销售的', '1');

-- ----------------------------
-- Table structure for email_info
-- ----------------------------
DROP TABLE IF EXISTS `email_info`;
CREATE TABLE `email_info` (
  `email_id` int(10) NOT NULL AUTO_INCREMENT,
  `customer_id` int(10) DEFAULT NULL,
  `user_id` int(10) DEFAULT NULL,
  `email_content` varchar(2000) DEFAULT NULL,
  `email_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `email_state` varchar(50) DEFAULT NULL,
  `email_theme` varchar(200) DEFAULT NULL,
  `is_used` varchar(10) DEFAULT '1',
  PRIMARY KEY (`email_id`),
  KEY `FK_Reference_14` (`user_id`),
  KEY `FK_Reference_21` (`customer_id`),
  CONSTRAINT `FK_Reference_14` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`),
  CONSTRAINT `FK_Reference_21` FOREIGN KEY (`customer_id`) REFERENCES `customer_info` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of email_info
-- ----------------------------
INSERT INTO `email_info` VALUES ('21', '4', '1', '第三代是的大多数都是', '2013-05-25 19:48:27', '1', '地地道道是', '1');
INSERT INTO `email_info` VALUES ('22', '4', '4', '反对反对', '2013-05-25 19:49:15', '0', '风格大方的', '0');
INSERT INTO `email_info` VALUES ('23', '4', '4', '反对反对', '2013-05-25 19:49:28', '1', '风格大方的', '1');
INSERT INTO `email_info` VALUES ('24', '2', '1', '刚刚', '2013-05-25 19:50:38', '1', '123', '1');
INSERT INTO `email_info` VALUES ('25', '9', '1', '祝你生日快乐！身体健康！', '2013-05-25 20:22:31', '0', '生日快乐', '0');
INSERT INTO `email_info` VALUES ('26', '9', '1', '祝你生日快乐！身体健康！', '2017-06-13 17:36:49', '0', '生日快乐', '1');

-- ----------------------------
-- Table structure for house_info
-- ----------------------------
DROP TABLE IF EXISTS `house_info`;
CREATE TABLE `house_info` (
  `house_id` int(10) NOT NULL AUTO_INCREMENT,
  `type_id` int(10) DEFAULT NULL,
  `user_id` int(10) DEFAULT NULL,
  `house_address` varchar(500) DEFAULT NULL,
  `house_price` int(20) DEFAULT NULL,
  `house_ambient` varchar(1000) DEFAULT NULL,
  `is_used` varchar(10) DEFAULT '1',
  PRIMARY KEY (`house_id`),
  KEY `FK_Reference_13` (`user_id`),
  KEY `FK_Reference_26` (`type_id`),
  CONSTRAINT `FK_Reference_13` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`),
  CONSTRAINT `FK_Reference_26` FOREIGN KEY (`type_id`) REFERENCES `house_type` (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of house_info
-- ----------------------------
INSERT INTO `house_info` VALUES ('6', '2', '3', '滨江路', '10000', '很好啦！都来看看啊！', '1');
INSERT INTO `house_info` VALUES ('7', '1', '1', '三峡学院', '500', '你猜！', '1');
INSERT INTO `house_info` VALUES ('8', '1', '4', '2000', '500', 'gh ', '1');
INSERT INTO `house_info` VALUES ('9', '1', '1', '重庆云烟', '111', '这里是结婚生子的好地方', '1');
INSERT INTO `house_info` VALUES ('10', '1', '6', '重庆万州', '1200', '案发大发第三方', '1');
INSERT INTO `house_info` VALUES ('11', '1', '1', '重庆万州', '234', '', '1');
INSERT INTO `house_info` VALUES ('12', '1', '6', '重庆万州', '1200', '5555', '1');

-- ----------------------------
-- Table structure for house_type
-- ----------------------------
DROP TABLE IF EXISTS `house_type`;
CREATE TABLE `house_type` (
  `type_id` int(10) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(50) DEFAULT NULL,
  `is_used` varchar(10) DEFAULT '1',
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of house_type
-- ----------------------------
INSERT INTO `house_type` VALUES ('1', '三室一厅', '1');
INSERT INTO `house_type` VALUES ('2', '三室两厅', '1');
INSERT INTO `house_type` VALUES ('3', '两室一厅', '1');
INSERT INTO `house_type` VALUES ('4', '四室两厅', '1');

-- ----------------------------
-- Table structure for notice_info
-- ----------------------------
DROP TABLE IF EXISTS `notice_info`;
CREATE TABLE `notice_info` (
  `notice_id` int(10) NOT NULL AUTO_INCREMENT,
  `user_id` int(10) DEFAULT NULL,
  `notice_item` varchar(100) DEFAULT NULL,
  `notice_content` varchar(2000) DEFAULT NULL,
  `notice_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `notice_endtime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `is_used` varchar(10) DEFAULT '1',
  PRIMARY KEY (`notice_id`),
  KEY `FK_Reference_12` (`user_id`),
  CONSTRAINT `FK_Reference_12` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice_info
-- ----------------------------
INSERT INTO `notice_info` VALUES ('3', '4', '最近要开会', '记得带钱', '2013-05-23 23:22:12', '2013-05-30 23:22:29', '1');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `p_id` int(11) NOT NULL AUTO_INCREMENT,
  `p_name` varchar(50) NOT NULL,
  `p_source` varchar(100) NOT NULL DEFAULT '""',
  `p_isparent` tinyint(4) DEFAULT NULL,
  `p_parentid` int(11) DEFAULT '0',
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', '客户相关', '\"\"', '1', '0');
INSERT INTO `permission` VALUES ('2', '客户信息', '/customer/customerlist1?page=1&differ=1', '0', '1');
INSERT INTO `permission` VALUES ('3', '客户分配', '/customer/customerDistributelist1?page=1&differ=1', '0', '1');
INSERT INTO `permission` VALUES ('4', '客户关怀', '/customer/customerCarelist1?page=1&differ=1', '0', '1');
INSERT INTO `permission` VALUES ('5', '客户状态', '/customer/customerStatelist1?page=1&differ=1', '0', '1');
INSERT INTO `permission` VALUES ('6', '客户来源', '/customer/customerSourcelist1?page=1&differ=1', '0', '1');
INSERT INTO `permission` VALUES ('7', '员工相关', '\"\"', '1', '0');
INSERT INTO `permission` VALUES ('8', '员工信息', '/user/userlist3', '0', '7');
INSERT INTO `permission` VALUES ('9', '房屋信息', '/user/houselist', '0', '7');
INSERT INTO `permission` VALUES ('10', '房屋类型', '/user/housetypelist', '0', '7');
INSERT INTO `permission` VALUES ('11', '部门信息', '/user/deptlist', '0', '7');
INSERT INTO `permission` VALUES ('12', '公告', '/user/noticelist', '0', '7');
INSERT INTO `permission` VALUES ('13', '管理员', '\"\"', '1', '0');
INSERT INTO `permission` VALUES ('14', '添加员工', '/admin/adminAddCustomer', '0', '13');
INSERT INTO `permission` VALUES ('15', '添加部门', '/jsp/admin/dept_add.jsp', '0', '13');
INSERT INTO `permission` VALUES ('16', '添加角色', '/jsp/admin/role_add.jsp', '0', '13');
INSERT INTO `permission` VALUES ('17', '分配角色', '/admin/adminDistributeRole1', '0', '13');
INSERT INTO `permission` VALUES ('18', '分配权限', '/admin/adminDistributePermission1', '0', '13');

-- ----------------------------
-- Table structure for role_p
-- ----------------------------
DROP TABLE IF EXISTS `role_p`;
CREATE TABLE `role_p` (
  `role_id` int(11) NOT NULL,
  `p_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_p
-- ----------------------------
INSERT INTO `role_p` VALUES ('2', '7');
INSERT INTO `role_p` VALUES ('2', '8');
INSERT INTO `role_p` VALUES ('2', '9');
INSERT INTO `role_p` VALUES ('2', '10');
INSERT INTO `role_p` VALUES ('2', '11');
INSERT INTO `role_p` VALUES ('2', '12');
INSERT INTO `role_p` VALUES ('3', '1');
INSERT INTO `role_p` VALUES ('3', '2');
INSERT INTO `role_p` VALUES ('3', '3');
INSERT INTO `role_p` VALUES ('3', '4');
INSERT INTO `role_p` VALUES ('3', '5');
INSERT INTO `role_p` VALUES ('3', '6');
INSERT INTO `role_p` VALUES ('3', '7');
INSERT INTO `role_p` VALUES ('3', '8');
INSERT INTO `role_p` VALUES ('3', '9');
INSERT INTO `role_p` VALUES ('3', '10');
INSERT INTO `role_p` VALUES ('3', '11');
INSERT INTO `role_p` VALUES ('3', '12');
INSERT INTO `role_p` VALUES ('1', '1');
INSERT INTO `role_p` VALUES ('1', '2');
INSERT INTO `role_p` VALUES ('1', '3');
INSERT INTO `role_p` VALUES ('1', '4');
INSERT INTO `role_p` VALUES ('1', '5');
INSERT INTO `role_p` VALUES ('1', '6');
INSERT INTO `role_p` VALUES ('1', '7');
INSERT INTO `role_p` VALUES ('1', '8');
INSERT INTO `role_p` VALUES ('1', '9');
INSERT INTO `role_p` VALUES ('1', '10');
INSERT INTO `role_p` VALUES ('1', '11');
INSERT INTO `role_p` VALUES ('1', '12');
INSERT INTO `role_p` VALUES ('1', '13');
INSERT INTO `role_p` VALUES ('1', '14');
INSERT INTO `role_p` VALUES ('1', '15');
INSERT INTO `role_p` VALUES ('1', '16');
INSERT INTO `role_p` VALUES ('1', '17');
INSERT INTO `role_p` VALUES ('1', '18');
INSERT INTO `role_p` VALUES ('4', '1');
INSERT INTO `role_p` VALUES ('4', '7');
INSERT INTO `role_p` VALUES ('4', '8');
INSERT INTO `role_p` VALUES ('4', '9');
INSERT INTO `role_p` VALUES ('4', '10');
INSERT INTO `role_p` VALUES ('4', '11');
INSERT INTO `role_p` VALUES ('4', '12');
INSERT INTO `role_p` VALUES ('4', '13');
INSERT INTO `role_p` VALUES ('4', '14');
INSERT INTO `role_p` VALUES ('4', '15');
INSERT INTO `role_p` VALUES ('4', '16');
INSERT INTO `role_p` VALUES ('4', '17');
INSERT INTO `role_p` VALUES ('4', '18');
INSERT INTO `role_p` VALUES ('5', '1');
INSERT INTO `role_p` VALUES ('5', '7');
INSERT INTO `role_p` VALUES ('5', '8');
INSERT INTO `role_p` VALUES ('5', '11');
INSERT INTO `role_p` VALUES ('5', '12');
INSERT INTO `role_p` VALUES ('5', '13');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` int(10) NOT NULL AUTO_INCREMENT,
  `department_id` int(10) DEFAULT NULL,
  `role_id` int(10) DEFAULT NULL,
  `pic` varchar(80) DEFAULT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `user_sex` varchar(10) DEFAULT NULL,
  `user_mobile` varchar(20) DEFAULT NULL,
  `user_age` int(10) DEFAULT NULL,
  `user_address` varchar(500) DEFAULT NULL,
  `user_num` varchar(100) DEFAULT NULL,
  `user_pw` varchar(50) DEFAULT NULL,
  `user_tel` varchar(20) DEFAULT NULL,
  `user_idnum` varchar(20) DEFAULT NULL,
  `user_email` varchar(100) DEFAULT NULL,
  `user_addtime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `user_addman` varchar(50) DEFAULT NULL,
  `user_changetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `user_changeman` varchar(50) DEFAULT NULL,
  `user_intest` varchar(1000) DEFAULT NULL,
  `user_diploma` varchar(20) DEFAULT NULL,
  `user_bankcard` varchar(20) DEFAULT NULL,
  `user_nation` varchar(20) DEFAULT NULL,
  `is_married` varchar(10) DEFAULT NULL,
  `is_used` varchar(10) DEFAULT '1',
  PRIMARY KEY (`user_id`),
  KEY `FK_Reference_22` (`department_id`),
  KEY `FK_Reference_24` (`role_id`),
  CONSTRAINT `FK_Reference_22` FOREIGN KEY (`department_id`) REFERENCES `department_info` (`department_id`),
  CONSTRAINT `FK_Reference_24` FOREIGN KEY (`role_id`) REFERENCES `user_role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', '1', '1', 'df48c49c96ef434b90ea6d827f90a61c.jpg', '张三', '女', '13525452584', '20', '北京', '1213', 'c4ca4238a0b923820dcc509a6f75849b', '6666666', '', '', '2017-08-14 16:40:15', null, '2018-07-31 14:12:15', '张三', '', '初中', '123', '', '已婚', null);
INSERT INTO `user_info` VALUES ('3', '1', '2', null, '李四', '男', '13254545454', '22', '上海', 'sdsd', 'c4ca4238a0b923820dcc509a6f75849b', '520400112', null, null, '2017-08-11 14:44:35', null, '2017-08-11 14:44:35', null, null, null, null, null, null, null);
INSERT INTO `user_info` VALUES ('4', '1', '1', null, '李会儿', '女', '13545454545', '55', '北京职业科技学院', 'qqq', 'c4ca4238a0b923820dcc509a6f75849b', '5200660112', null, null, '2017-08-11 14:48:49', null, '2017-08-11 14:48:49', null, null, null, null, null, null, null);
INSERT INTO `user_info` VALUES ('5', '1', '2', null, '123', '男', '13544477747', '2', '高老庄', '789', 'c4ca4238a0b923820dcc509a6f75849b', '52000112', '524154655895854744', '3963547@qq.com', '2013-05-25 09:36:59', '张三', '2013-05-25 09:29:33', '未修改', '吃西瓜', '初中', '3535355555454787887', '汉', '已婚', '1');
INSERT INTO `user_info` VALUES ('6', '3', '1', null, '蒋元征', '男', '15923219017', '20', '重庆双桥', 'jiang', 'c4ca4238a0b923820dcc509a6f75849b', '58105789', '500111199205191111', '253507692@qq.com', '2013-05-25 16:18:31', 'admin', '2013-05-25 16:20:27', '未修改', '上网、玩游戏', '本科', '6222023100045180177', '汉族', '未婚', '1');
INSERT INTO `user_info` VALUES ('7', '3', '1', null, '黄建新', '男', '15923219011', '21', '重庆开县', 'huang', 'c4ca4238a0b923820dcc509a6f75849b', '58105744', '500111199205191114', '253507692@qq.com', '2013-05-25 19:55:29', '蒋元征', '2013-05-25 19:58:04', '未修改', '上网、DNF', '初中', '6222023100045180111', '汉族', '已婚', '1');
INSERT INTO `user_info` VALUES ('8', '1', '1', null, '1', '男', '', '11', '', '11', 'c4ca4238a0b923820dcc509a6f75849b', '', '', '', '2018-07-25 11:57:07', '123', '2018-07-25 11:57:07', null, '', '初中', '', '', '已婚', '1');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `role_id` int(10) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(50) DEFAULT NULL,
  `role_power` int(10) DEFAULT NULL,
  `is_used` varchar(10) DEFAULT '1',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '管理员', '3', '1');
INSERT INTO `user_role` VALUES ('2', '员工', '2', '1');
INSERT INTO `user_role` VALUES ('3', '老板', '1', '1');
INSERT INTO `user_role` VALUES ('4', '部门经理', '4', '1');

-- ----------------------------
-- Table structure for u_role
-- ----------------------------
DROP TABLE IF EXISTS `u_role`;
CREATE TABLE `u_role` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of u_role
-- ----------------------------
INSERT INTO `u_role` VALUES ('1', '1');
INSERT INTO `u_role` VALUES ('3', '3');
INSERT INTO `u_role` VALUES ('4', '1');
INSERT INTO `u_role` VALUES ('5', '5');

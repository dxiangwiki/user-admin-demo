-- 用户管理系统数据库初始化脚本
-- 作者：董翔
-- GitHub：dxiangwiki

CREATE DATABASE IF NOT EXISTS user_admin_demo;
USE user_admin_demo;

CREATE TABLE `user` (
  id INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
  username VARCHAR(50) NOT NULL COMMENT '用户名',
  age INT COMMENT '年龄',
  phone VARCHAR(20) COMMENT '手机号',
  create_time DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';
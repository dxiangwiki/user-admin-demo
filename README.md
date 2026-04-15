
# 用户管理系统 - 全栈入门项目

> 作者：董翔
> GitHub：https://github.com/dxiangwiki
> 邮箱：3631247406@qq.com

这是一个基于 **Spring Boot + Vue 3 + MySQL** 的前后端分离用户管理系统，实现了用户数据的增、删、查功能，是入门全栈开发的练手项目。

---

## 🛠️ 技术栈

| 模块   | 技术选型                       |
|--------|--------------------------------|
| 后端   | Spring Boot 3.x, MyBatis, MySQL |
| 前端   | Vue 3, Axios, Vue Router       |
| 工具   | Maven, Node.js, MySQL          |

---

## 📁 项目结构

```text
user-admin-demo/
├── README.md               # 项目说明文档
├── backend/                # Spring Boot 后端项目
│   └── user-admin-server/
│       ├── src/main/java/com/example/useradmin/
│       │   ├── controller/    # 接口层
│       │   ├── service/       # 业务层
│       │   ├── mapper/        # DAO层
│       │   └── entity/        # 实体类
│       └── src/main/resources/
│           └── application.yml # 配置文件
├── frontend/               # Vue 3 前端项目
│   └── user-admin-web/
│       ├── src/
│       │   ├── components/    # 组件（用户列表页）
│       │   └── router/       # 路由配置
│       └── package.json
└── database/               # SQL 脚本
    └── init_schema.sql
```

---

## 🚀 快速启动

### 1. 环境准备
- JDK 17+
- MySQL 8.0+
- Node.js 16+ & npm
- IDEA / VS Code

### 2. 数据库初始化
在 MySQL 中执行以下脚本（`database/init_schema.sql`）：
```sql
CREATE DATABASE IF NOT EXISTS user_admin_demo;
USE user_admin_demo;

CREATE TABLE `user` (
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(50) NOT NULL,
  age INT,
  phone VARCHAR(20),
  create_time DATETIME DEFAULT CURRENT_TIMESTAMP
);
```

### 3. 启动后端
1. 修改 `application.yml` 中的数据库账号密码：
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/user_admin_demo?useSSL=false&serverTimezone=Asia/Shanghai
    username: root
    password: 你的MySQL密码
```
2. 运行 `UserAdminServerApplication.java`
3. 访问接口测试：`http://localhost:8080/user/list`

### 4. 启动前端
```bash
cd frontend/user-admin-web
npm install
npm run serve
```
访问地址：`http://localhost:8081`

---

## ✨ 功能说明
- 用户列表：展示所有用户数据
- 添加用户：通过表单新增用户信息
- 删除用户：点击删除按钮移除用户数据
- 前后端分离：接口独立，支持跨域请求

---

## 📌 开发要点
1. 跨域配置：后端通过 `@CrossOrigin` 注解实现跨域访问
2. 三层架构：后端采用 Controller-Service-Mapper 分层设计
3. 前后端交互：前端使用 Axios 调用后端接口，实现数据同步
4. 数据库映射：MyBatis 实现数据库字段与实体类的驼峰映射

---

## 📝 后续优化方向
- 引入 Element Plus 美化前端页面
- 增加用户编辑、分页查询功能
- 添加登录认证和权限控制
- 完善异常处理和统一返回格式

---

© 2026 董翔

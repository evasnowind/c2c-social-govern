# c2c-social-govern  

C2C 电商系统微服务架构 

本项目主要为了展示spring cloud alibaba各种组件的使用。


## 运行说明  
- 准备一个mysql 数据库，将c2c.sql导入到数据库中
- 修改项目中配置文件有关数据库的配置
- 修改nacos注册中心配置，改为你所搭建的nacos集群
    - c2c-social-govern-report
    - c2c-social-govern-reviewer
    - c2c-social-govern-reward
- 修改数据库配置，改为你的mysql数据库
    - c2c-social-govern-report
    - c2c-social-govern-reviewer
    - c2c-social-govern-reward
- 启动时首先运行c2c-social-govern-reward、c2c-social-govern-reviewer（作为service provider），然后再启动c2c-social-govern-report（作为service consumer）

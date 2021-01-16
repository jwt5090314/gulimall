package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
* 1. 整合MyBatis-Plus
* 	1). 导入依赖
* 	2). 配置
* 		a. 配置数据源
* 			导入数据库驱动
* 			在application.yml中配置数据源相关信息
* 		b. 配置MyBatis-Plus
* 			使用@MpperScan
* 			告诉MyBatis-Plus, sql映射文件位置
*
* */

@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallProductApplication.class, args);
	}

}

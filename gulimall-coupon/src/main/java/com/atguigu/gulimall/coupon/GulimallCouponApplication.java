package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
* 如何使用nacos作为配置中心统一管理配置
* 	1. 引入依赖 spring-cloud-starter-alibaba-nacos-config
* 	2. 创建一个bootstrap.properties
 *		spring.application.name=gulimall-coupon
 *		spring.cloud.nacos.config.server-addr=192.168.0.4:8848
* 	3. 需要给配置中心默认添加一个数据集(Data Id) gulimall-coupon.properties  命名规则: 应用名.properties
* 	4. 给应用名.properties添加配置
* 	5. 动态获取配置
* 		@RefreshScope -- 动态获取并刷新配置
* 		@Value("${配置项的名}")  -- 获取到配置
* 		如果配置中心和当前应用的配置文件都配置了相同的项，优先使用配置中心的项
*
*  细节
* 	1. 命名空间：配置隔离， 可以基于环境配置，也可以基于不同的微服务配置,只需要在bootstrap.properties中给spring.cloud.nacos.config.namespace设置不同的值
* 		默认是public(保留空间): 默认新增的所有配置都在public空间
* 			比如开发、生产、测试，利用命名空间来做环境隔离
* 				注意：在bootstrap.properties：配置上需要使用哪个命名空间下的配置
* 					 spring.cloud.nacos.config.namespace=3e55c21f-f396-48b8-b871-246ee15b2aa1
* 					 很长的id是在nacos配置管理中找到
* 			每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
*
* 	2. 配置集：所有的配置的集合
*
* 	3. 配置集ID：类似配置文件名。
* 		Data Id: 文件名
* 	4. 配置分组
* 		默认所有的配置集都属于：DEFAULT_GROUP。
* 		1111， 618， 1212
*  每个微服务，创建自己的命名空间，使用配置分组区分环境: dev, test, prod
*
* 同时加载多个配置集
* 	微服务任何配置信息，任何配置文件都可以放在配置中心中
* 	只需要在bootstrap.properties说明加载配置中心中哪些配置文件即可
* 	@Value，@ConfigurationProperties...
* 	以前SpringBoot任何方式从配置文件中获取值的方法都能使用
* 	配置中心有的优先使用配置中心中的值
*
* */


@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallCouponApplication.class, args);
	}

}

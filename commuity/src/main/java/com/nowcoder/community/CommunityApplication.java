package com.nowcoder.community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.nowcoder.comunity.dao"})
@SpringBootApplication
public class CommunityApplication {

	/**
	 * SpringApplication除了帮我们创建底层框架，还自动帮我们创建Spring容器
	 * 而且还能自动装配Bean，ComponentScan类会扫描配置类所在的包，以及子包下面的Bean
	 * @param args
	 */
	public static void main(String[] args) {

		SpringApplication.run(CommunityApplication.class, args);
	}

}

package com.nowcoder.community;

import com.nowcoder.community.dao.BetaDao;
import com.nowcoder.community.service.AlphaService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)//用之前的案例来测试，需要用相同的类
class CommunityApplicationTests implements ApplicationContextAware {
	private  ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Test
	public  void testApplicationContext() {
		System.out.println(applicationContext);
		BetaDao betaDao = applicationContext.getBean(BetaDao.class);
		System.out.println(betaDao.select());
		betaDao = applicationContext.getBean( "hibernate",BetaDao.class);
		System.out.println(betaDao.select());
	}
	@Test
	public  void  testBeanManagement() {
		AlphaService alphaService = applicationContext.getBean(AlphaService.class);
		System.out.println(alphaService);
		alphaService = applicationContext.getBean(AlphaService.class);
		System.out.println(alphaService);
	}
	@Test
	public void testBeanConfig() {
		SimpleDateFormat simpleDateFormat = 	applicationContext.getBean(SimpleDateFormat.class);
		System.out.println(simpleDateFormat.format(new Date()));
	}

	@Autowired
	@Qualifier("hibernate")
	private BetaDao betaDao;

	@Autowired
	private  AlphaService alphaService;

	@Autowired
	private SimpleDateFormat simpleDateFormat;

	@Test
	public void testDI() {
		System.out.println(betaDao);
	}

}

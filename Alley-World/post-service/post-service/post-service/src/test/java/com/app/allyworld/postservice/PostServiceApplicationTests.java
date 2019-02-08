package com.app.allyworld.postservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostServiceApplicationTests {
	
	@Test
	public void contextLoads() {
	}
	
	@Bean 
	private TestRestTemplate iniTestRestTemplate()
	{
		return new TestRestTemplate();
	}
}


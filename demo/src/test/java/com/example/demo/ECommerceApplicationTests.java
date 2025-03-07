package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource("classpath:test-application.properties")
public class ECommerceApplicationTests {

	@Test
	void contextLoads() {
	}

}

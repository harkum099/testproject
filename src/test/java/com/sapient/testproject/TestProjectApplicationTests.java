package com.sapient.testproject;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestProjectApplicationTests {

	@Test
	void contextLoads() {
		String str = "abcd";
		assertThat(str.length()).isEqualTo(4);
	}
	
	@Test
	public void countChar() {
		String str = "abcd";
		assertThat(str.length()).isEqualTo(4);
	}
}

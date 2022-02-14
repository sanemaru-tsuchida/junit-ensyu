package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class StringUtilsTest2 {
	

	@Test
	void test() {
		assertEquals("aaa", StringUtils.toSnakeCase("aaa") ," StringUtilsのtoSnakeCaseテスト");
		assertEquals("hello_world", StringUtils.toSnakeCase("HelloWorld") ," StringUtilsのtoSnakeCaseテスト");
		assertEquals("practice_junit", StringUtils.toSnakeCase("practiceJunit") ," StringUtilsのtoSnakeCaseテスト");
		
	}

}

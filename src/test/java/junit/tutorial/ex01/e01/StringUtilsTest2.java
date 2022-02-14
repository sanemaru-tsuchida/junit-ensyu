package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StringUtilsTest2 {


	@Test
	void test() {
		assertEquals("aaa", StringUtils.toSnakeCase("aaa"));
	}

}

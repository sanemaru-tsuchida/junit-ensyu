package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.*;


import java.util.List;

import org.assertj.core.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	private FizzBuzz fizzBuzz = new FizzBuzz();
	
	
	
	@Test
	@DisplayName("2-1")

	void test() {
		String[] test = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16"};
		List<Object> testList = Arrays.asList(test);
	
		assertIterableEquals(testList,fizzBuzz.createFizzBuzzList(16),"１６を指定してcreateFizzBuzzListメソッドを実行する");
		for(Object t:testList) {
			System.out.println(t);
		}
	}

}

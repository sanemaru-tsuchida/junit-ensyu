package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {
	
	@Test
	void test() {
		assertTrue(NumberUtils.isEven(10),"・入力値に「１０」を与えると、trueを返す");
		assertFalse(NumberUtils.isEven(7),"・入力値に「7」を与えると、falseを返す");
	}

}

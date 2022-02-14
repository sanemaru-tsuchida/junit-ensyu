package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	private Calculator calculator = new Calculator();
	@Test
	void test() {
		try {
			calculator.divide(0, 0);
			fail("失敗");
		}catch (Exception e) {
			System.out.println("CALCULATORテストケース成功");
		}
	}

}

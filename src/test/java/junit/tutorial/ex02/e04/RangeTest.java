package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

	@DisplayName("2-4 ・min=0.0、max=10.5のRangeのとき")
	@ParameterizedTest
	@CsvSource({ 
		"1,-0.1,", 
		"2,10.5", 
		"2,0.0", 
		"1,10.6"
		})
	void test(int num,double value) {
		Range range = new Range(0.0, 10.5);
		if(num % 2 == 0) {
		assertTrue(range.contains(value), "1 Tureテスト");
		}else {
			assertFalse( range.contains(value), "2 Falseテスト");

		}

	}
	@DisplayName("2-4 min=-5.1、max=5.1のRangeのとき")
	@ParameterizedTest
	@CsvSource({ 
		"1,-5.2", 
		"2,-5.1", 
		"2,5.1", 
		"1,5.2"
		})
	void test2(int num,double value) {
		Range range = new Range(-5.1, 5.1);
		if(num % 2 == 0) {
		assertTrue(range.contains(value), "2 Tureテスト");
		}else {
			assertFalse( range.contains(value), "2 Falseテスト");

		}

	}

}

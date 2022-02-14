package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CounterTest {
	private Counter counter = new Counter();
	@Test
	void test() {
		assertEquals(1, counter.increment(),"incrementメソッドを実行すると１が取得できる");
		assertEquals(2, counter.increment(),"・incrementメソッドを１回実行した状態で、incrementメソッドを実行すると２が取得できる");
	
		
		Counter counter2 = new Counter();

		for(int i=0;i<50;i++) {
			counter2.increment();
		}
		assertEquals(51, counter2.increment(),"incrementメソッドを50回実行した状態で、incrementメソッドを実行すると５１が取得できる");
	}

}

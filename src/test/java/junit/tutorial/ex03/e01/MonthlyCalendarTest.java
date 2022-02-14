package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonthlyCalendarTest {

	@Test
	void test() {
		LocalDate date = LocalDate.of(2012, 1, 31);

		MonthlyCalendar monthlyCalendar = new MonthlyCalendar(date);

		assertEquals(0, monthlyCalendar.getRemainingDays(),"2012/1/31の場合,0を返す");
		
		LocalDate date2 = LocalDate.of(2012, 1, 30);

		MonthlyCalendar monthlyCalendar2 = new MonthlyCalendar(date2);

		assertEquals(1, monthlyCalendar2.getRemainingDays(),"2012/1/30の場合,0を返す");
		LocalDate date3 = LocalDate.of(2012, 2, 1);

		MonthlyCalendar monthlyCalendar3 = new MonthlyCalendar(date3);

		assertEquals(28, monthlyCalendar3.getRemainingDays(),"2012/2/1の場合,0を返す");
	}

	

}

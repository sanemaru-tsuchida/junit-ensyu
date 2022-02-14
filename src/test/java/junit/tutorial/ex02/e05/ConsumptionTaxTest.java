package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ConsumptionTaxTest {

	@DisplayName("2-5")
	@ParameterizedTest
	@CsvSource({
		"5,100",
		"5,3000",
		"10,50",
		"5,50",
		"3,50"
		})
	void test(int tax,int index) {
		//**税率　ソート*/
		if(tax==5) {
			ConsumptionTax consumptionTax = new ConsumptionTax(tax);
			//**入力値（価格） ソート*/
			if(index == 100) {
				assertEquals(105,consumptionTax.apply(index));

			}else if(index == 3000) {
				assertEquals(3150,consumptionTax.apply(index));

			}else {
				assertEquals(52,consumptionTax.apply(index));

			}

		}else if(tax==10) {
			ConsumptionTax consumptionTax = new ConsumptionTax(tax);
			assertEquals(55,consumptionTax.apply(index));

		}else {
			ConsumptionTax consumptionTax = new ConsumptionTax(tax);
			assertEquals(51,consumptionTax.apply(index));
		}
	}

}

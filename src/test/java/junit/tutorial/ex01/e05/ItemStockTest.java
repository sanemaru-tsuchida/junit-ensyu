package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ItemStockTest {
	private ItemStock itemStock = new ItemStock();
	private Item item = new Item();

	@Test
	void test() {
		assertEquals(0, itemStock.getNum(item),"初期状態で、getNumで０が取得できる");
		/** アイテム追加*/
		Item item2 = new Item("book", 1000);
		itemStock.add(item2);
		assertEquals(1,itemStock.getNum(item2),"初期状態で、addでItemを追加するとgetNumで１が取得できる");
		assertEquals(1,itemStock.getNum(item2),"Itemが一つ追加されている状態でgetNumで１が取得できる");
		
		/** 同じアイテム追加*/
		itemStock.add(item2);
		assertEquals(2,itemStock.getNum(item2),"Itemが１つ追加されている状態で、addで同じItemオブジェクトを追加するとgetNumで２が取得できる");
		
		/**別アイテムの追加*/
		Item item3 = new Item("CD", 1000);
		itemStock.add(item3);
		assertEquals(1,itemStock.getNum(item3),"Itemが１つ追加されている状態で、addで異なるItemオブジェクトを追加するとgetNumで１が取得できる");

	}

}

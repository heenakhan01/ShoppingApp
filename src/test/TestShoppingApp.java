package test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.shopping.service.CalculateOrder;



public class TestShoppingApp{
	
	
	@Test
	public void testCalcOrder() {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("orange");
		list.add("apple");
		double actualValue = CalculateOrder.calcOrder(list);
		double expectedValue = 0.85;
		assertEquals(expectedValue, actualValue,0.0);
	}
	
	
}


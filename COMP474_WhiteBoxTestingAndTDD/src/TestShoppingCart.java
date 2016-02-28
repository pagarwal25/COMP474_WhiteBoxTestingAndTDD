import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestShoppingCart {

	private ShoppingCart fixture;
	private List<Items> list;
	private Items item;
	
	@Before
	public void setUp() throws Exception {
		
		fixture = new ShoppingCart();
		list = new ArrayList<Items>();
	}
	
	@After
	public void tearDown() throws Exception {
		list = null;
	}
	
	@Test
	public void testCountNullItems(){
		assertEquals(0,fixture.itemCount(list));
	}
	
	@Test
	public void testCountZeroItems(){
		assertEquals(0,fixture.itemCount(list));
  	}
 	
  	@Test
  	public void testCountOneItems(){
  		item = new Items();
  		list.add(item);
		assertEquals(1,fixture.itemCount(list));
	}
}

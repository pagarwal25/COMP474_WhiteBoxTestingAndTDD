import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
	
	int totalItems;
	
	public Items getItems(){
		Items item = new Items();
//		Item getItem (String ItemID);that returns a pointer to Item object if found and NULL otherwise
		
	}
	
		
	//itemCount method to check total items in the cart
	public int itemCount(List<Items> items){
		totalItems = items.size();
		return totalItems;
	}
	
	//exceedMax method to check items in cart is > 50
	public boolean exceedMax(){
		boolean exceed = false;
		List<Items> items = new LinkedList<Items>();
		int totalItems = itemCount(items);
		
		if(totalItems > 50){
			exceed = true;
			return exceed;
		}
		
		return exceed;
	}
	
	//method to calculate Purchase price
	public float calculatePurchasePrice(List<String> Products, Customer customer){
		float purchasePrice = 0, totalDiscount = 0, bulkDiscount = 0, clubDiscount = 0;
		
		return purchasePrice;
	}
	
	public static void main(String[]args){
		
	}
	
}

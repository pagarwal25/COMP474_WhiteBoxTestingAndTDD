
public class Customer {
	 
	boolean cutomerTaxExempted;
	
	Customer(boolean exempt){
		cutomerTaxExempted = exempt;
	}
	
	public boolean isTaxExempt(){
		
		if(cutomerTaxExempted == true){
						
			return true;
		}
		
		return false;
		
	}

}

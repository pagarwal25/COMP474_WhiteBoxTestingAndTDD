
public class Customer {
	 
	boolean cutomerTaxExempted;
	
	Customer(boolean exempt){
		cutomerTaxExempted = exempt;
	}
	
	public boolean isTaxExempt(){
		
		//check on this condition
		if(cutomerTaxExempted == true){
						
			return true;
		}
		
		return false;
		
	}

}

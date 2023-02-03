package Test;

class Shipment{
	 public boolean checkProductNameValidity(String productName) {
    String regex="[A-Z]{1,}+[a-z]{1,10}+[\\s]+[A-Z]{1,}+[a-z]{1,10}";
    if(productName.matches(regex)) {
    	return true;
    }
		 return false; 
	}
	public boolean checkProductIdValidity(String productId) {
		String regex="[\\w]{2,20}";
			if(productId.matches(regex)) {
     	return true;
	}
		return false; 
	}
	public boolean checkTrackerIdValidity(String trackerId) {
	String regex="[A-Z]{1}+:+[A-Z]{4}+:+[a-z]{3}+:[0-9]{2}";
	if(trackerId.matches(regex)) {
	    return true;
	}
	 	return false; 
	} }
	class RegularExpressionA_3 {
	 
	 public static void main(String[] args) {
	 
	 Shipment shipment = new Shipment();
	 
	 //Change the values for testing your code with different values
	 
	 String productName = "Digital Camera";
	 System.out.println("The product name is "+ 
	(shipment.checkProductNameValidity(productName) ? "valid!" : "invalid!"));
	 String productId = "DC1911";
	 System.out.println("The product Id is "+ (shipment.checkProductIdValidity(productId) ? "valid!" : 
	"invalid!"));
	 String trackerId = "D:CMDC:cmd:23";
	 System.out.println("The tracker Id is "+ (shipment.checkTrackerIdValidity(trackerId) ? "valid!" : 
	"invalid!"));
	 
	 }
	}
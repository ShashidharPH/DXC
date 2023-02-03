package Test;

class webaddress {
	 public static boolean checkWebAddressValidity(String webAddress) {
    String regex="http://www.+[a-z]{3,20}+.com";
    if(webAddress.matches(regex))
    {
    	return true;
    }
    else
		 return false; 
	 }
	 public class Webaddress { 
	 public static void main(String[] args) {
	 
	 //Change the value of webAddress for testing your code with different web addresses
	 String webAddress = "http://www.compa123ny.com";
	 System.out.println("The web address is "+ (checkWebAddressValidity(webAddress) ? "valid!" :"invalid!"));
	 }
	}
	 }
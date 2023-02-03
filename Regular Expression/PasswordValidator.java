package Test;
import java.util.Scanner;
public   class PasswordValidator {
	private String password;

	public static boolean PasswordValidator(String password) {
		//this.password=password;
       		String regex = "[A-Z{1,}+a-z{1,}+0-9{1,}[!@#$%&*]{1,}]{8,20}";
       		if(password.matches(regex)) {
       			return true;
       		}
       		else
		return false;
	}

	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter your password");
           String password=sc.nextLine();
           PasswordValidator obj=new  PasswordValidator();
           obj.PasswordValidator(password);
           System.out.println("The password is "+ (PasswordValidator(password) ? "valid!" :"invalid!"));
	}

}

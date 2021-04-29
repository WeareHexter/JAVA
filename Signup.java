package PROJECT;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Signup {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String uname ;
	String pass1 ;

	public void signup() throws Exception {
		System.out.println("Enter your Username");
		 uname = br.readLine();
		System.out.println("Enter your password");
		 pass1 = br.readLine();
		System.out.println("Enter your password again");
		String pass2 = br.readLine();
		
		
		if (pass1.equals(pass2)) {
			System.out.println("password matches");
		} else {
			System.out.println("password did't matches");
		}
		
	}
	public void display() {
		System.out.println("your Username :" + uname);
		System.out.println("your password :" + pass1);
	}
	public static void main(String[] args) throws Exception {
		
		Signup su = new Signup();
		su.signup();
		su.display();
	}
}

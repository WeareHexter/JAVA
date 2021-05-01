package PROJECT;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Signup {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String uname ;
	String pass1 ;
	String pass2 ;

	public void signup() throws Exception {
		System.out.println("Enter your Username");
		 uname = br.readLine();
		System.out.println("Enter your password");
		 pass1 = br.readLine();
		System.out.println("Enter your password again");
		 pass2 = br.readLine();
		
		
		if (pass1.equals(pass2)) {
			System.out.println("password matches");
			///////////////////////
			Connection con = DBConnection.getConnection();
			if (con != null) {

				try {
					// make a table for it
					String insert = "insert into cred (username , password ) values ( '"+uname+"','"+pass1+"')";
					Statement stmt = con.createStatement();

					int result = stmt.executeUpdate(insert);
					if (result > 0)
						System.out.println(result + " row inserted");

				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			//////////////////////
		} else {
			System.out.println("password did't matches");
		}
		
	}
	public void display() {
		System.out.println("your Username :" + uname);
		System.out.println("your password :" + pass1);
		System.out.println("your Repassword :" + pass2);
	}
	public static void main(String[] args) throws Exception {
		
		Signup su = new Signup();
		su.signup();
		su.display();
	}
}

package PROJECT;

import java.util.Scanner;

public class userlogin {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void display() {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (i == 1) {

			System.out.println("Enter the Username");
			username = sc.next();

			System.out.println("Enter the Password");
			password = sc.next();

			if ("Demo".equals(username) && "P@ssw0rd".equals(password)) {
				
				System.out.println("Login Successfully");
				i++;
			} else {
				System.out.println("Invalid login");
			}
		}
	}

	public static void main(String[] args) {
		userlogin l1 = new userlogin();
		l1.display();
	}
}

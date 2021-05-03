package PROJECT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		int j = 3;
		for (; j >= 1;) {

			System.out.println(j + " chance left ");

			System.out.println("Enter the Username");
			username = sc.next();

			System.out.println("Enter the Password");
			password = sc.next();

			Connection con = DBConnection.getConnection();
			String display_product = "select  *  from cred Where username ='" + username + "' ";

			if (con != null) {

				try {
					Statement stmt = con.createStatement();
					ResultSet rs1 = stmt.executeQuery(display_product);

					while (rs1.next()) {

						if (((rs1.getString(2)).equals(password))) {
							System.out.println("Credientials matches ");
							System.out.println(username);
							System.out.println(password);
							System.out.println("Login Successfully");
							j = 0;
						} else {
							System.out.println("Error Credientials did't matches  ");
							System.out.println(username);
							System.out.println(password);
							System.out.println("Invalid login");
							System.out.println("Please try again ");
							j--;
						}
					}

				} catch (Exception e) {

					e.printStackTrace();
				}

			}
		}
	}

	public static void main(String[] args) {
		userlogin l1 = new userlogin();
		l1.display();
	}
}

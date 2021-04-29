package PROJECT;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class LogOUT {
	String comment;
	int rate;

	public void Rate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Rate Us ( 1 to 10 )");
		rate = sc.nextInt();

		System.out.println("Thank You For Ratings Us " + rate);
		///////
		Connection con = DBConnection.getConnection();
		if (con != null) {

			try {
				// make a table for it
				String insert = "insert into rate values ( " + rate + ")";
				Statement stmt = con.createStatement();

				int result = stmt.executeUpdate(insert);
				if (result > 0)
					System.out.println(result + " row inserted");

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	public void comment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give a Comment for Us ");
		comment = sc.nextLine();

		System.out.println("Thank you for your precious comment " + comment);
		/////////
		Connection con = DBConnection.getConnection();
		if (con != null) {

			try {
				// make a table for it
				String insert = "insert into comt values ( '" + comment + "')";
				Statement stmt = con.createStatement();

				int result = stmt.executeUpdate(insert);
				if (result > 0)
					System.out.println(result + " row inserted");

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	public void yes() {

		System.out.println("logging out ..........");
		System.out.println("You're Successfully Logged Out");

	}

	public void no() {

		System.out.println("Returning to Main Menu ");

	}

	public static void main(String[] args) {

		LogOUT lg = new LogOUT();
		lg.Rate();
		lg.comment();

	}
}

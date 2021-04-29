package PROJECT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class counter {
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void break_fast() {
		System.out.println("Good Morning , Sir !!!");
		System.out.println("Great to see you here");
		System.out.println("So What are you Eating , Sir !!");
	}

	public void Lunch() {
		System.out.println("Good Afternoon , Sir !!!");
		System.out.println("Great to see you here");
		System.out.println("So What are you Eating , Sir !!");
	}

	public void Dinner() {
		System.out.println("Good Evening , Sir !!!");
		System.out.println("Great to see you here");
		System.out.println("So What are you Eating , Sir !!");
	}

	public void Snacks() {
		System.out.println("Great to see you here");
		System.out.println("So What are you Eating , Sir !!");
	}

	public void calDisplay(String item1, String item2, String item3) {
		System.out.println("So, you are eatting this : ");
		System.out.println(item1);
		System.out.println(item2);
		System.out.println(item3);
		Connection con = DBConnection.getConnection();

		String display_product = "select  sum(CALORIES),sum(PROTEIN),sum(CARBOHYDRATES),sum(FATS)  from Food_items Where name in ('"
				+ item1 + "','" + item2 + "','" + item3 + "') ";

		if (con != null) {

			try {
				Statement stmt = con.createStatement();
				ResultSet rs1 = stmt.executeQuery(display_product);
				System.out.println("DISPLAYING THE CONTENT ");
				String text = String.format("%-10s %-10s %-10s %-10s \n", "Total(CALORIES)", "Total(PROTEIN)",
						"Total(CARBOHYDRATES)", "Total(FATS)");
				System.out.println(text);

				while (rs1.next()) {
					String dis = String.format("%-20s %-15s %-15s %-5s \n", rs1.getDouble(1), rs1.getDouble(2),
							rs1.getDouble(3), rs1.getDouble(4));
					System.out.println(dis);

				}
				System.out.println("Query Executed Successfully...  of product");

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}

	public void calDisplay(String item1, String item2, String item3, String item4, String item5, String item6) {
		System.out.println("So, you are eatting this : ");
		System.out.println(item1);
		System.out.println(item2);
		System.out.println(item3);
		System.out.println(item4);
		System.out.println(item5);
		System.out.println(item6);

		Connection con = DBConnection.getConnection();

		String display_product = "select  sum(CALORIES),sum(PROTEIN),sum(CARBOHYDRATES),sum(FATS)  from Food_items Where name in ('"
				+ item1 + "','" + item2 + "','" + item3 + "','" + item4 + "','" + item5 + "','" + item6 + "')";

		if (con != null) {

			try {
				Statement stmt = con.createStatement();
				ResultSet rs1 = stmt.executeQuery(display_product);
				System.out.println("DISPLAYING THE CONTENT ");
				String text = String.format("%-10s %-10s %-10s %-10s \n", "Total(CALORIES)", "Total(PROTEIN)",
						"Total(CARBOHYDRATES)", "Total(FATS)");
				System.out.println(text);

				while (rs1.next()) {
					String dis = String.format("%-20s %-15s %-15s %-5s \n", rs1.getDouble(1), rs1.getDouble(2),
							rs1.getDouble(3), rs1.getDouble(4));
					System.out.println(dis);

				}
				System.out.println("Query Executed Successfully...  of product");

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}

	public void mood() throws Exception {

		System.out.println("* 1. Break-Fast");
		System.out.println("* 2. Lunch");
		System.out.println("* 3. Dinner");
		System.out.println("* 4. Snacks");

		int meal = sc.nextInt();

		switch (meal) {
		case 1:
			break_fast();

			System.out.println("* 1. for 3 items ");
			System.out.println("* 2. for 6 items ");
			System.out.println("enter");
			int itb = sc.nextInt();

			switch (itb) {
			case 1:
				System.out.println("Enter 3 Food items (if less, Then press enter)");
				String test1 = br.readLine();
				String test2 = br.readLine();
				String test3 = br.readLine();
				calDisplay(test1, test2, test3);
				break;
			case 2:
				System.out.println("Enter 6 Food items (if less, Then press enter)");
				String test4 = br.readLine();
				String test5 = br.readLine();
				String test6 = br.readLine();
				String test7 = br.readLine();
				String test8 = br.readLine();
				String test9 = br.readLine();
//				String test4 = "Tea";
//				String test5 = "Coffee" ;
//				String test6 = "Salad";
//				String test7 = "Burger";
//				String test8 = "Momos" ;
//				String test9 = "Rajma" ;
				calDisplay(test4, test5, test6, test7, test8, test9);
				break;

			default:
				break;
			}
			break;
		//
		case 2:
			Lunch();
			System.out.println("* 1. for 3 items ");
			System.out.println("* 2. for 6 items ");
			System.out.println("enter");
			int itl = sc.nextInt();

			switch (itl) {
			case 1:
				System.out.println("Enter 3 Food items (if less, Then press enter)");
				String test10 = br.readLine();
				String test11 = br.readLine();
				String test12 = br.readLine();
				calDisplay(test10, test11, test12);
				break;
			case 2:
				System.out.println("Enter 6 Food items (if less, Then press enter)");
				String test13 = br.readLine();
				String test14 = br.readLine();
				String test15 = br.readLine();
				String test16 = br.readLine();
				String test17 = br.readLine();
				String test18 = br.readLine();
				calDisplay(test13, test14, test15, test16, test17, test18);
				break;

			default:
				break;
			}
			break;
		//
		case 3:
			Dinner();
			System.out.println("* 1. for 3 items ");
			System.out.println("* 2. for 6 items ");
			System.out.println("enter");
			int itd = sc.nextInt();

			switch (itd) {
			case 1:
				System.out.println("Enter 3 Food items (if less, Then press enter)");
				String test19 = br.readLine();
				String test20 = br.readLine();
				String test21 = br.readLine();
				calDisplay(test19, test20, test21);
				break;
			case 2:
				System.out.println("Enter 6 Food items (if less, Then press enter)");
				String test22 = br.readLine();
				String test23 = br.readLine();
				String test24 = br.readLine();
				String test25 = br.readLine();
				String test26 = br.readLine();
				String test27 = br.readLine();
				calDisplay(test22, test23, test24, test25, test26, test27);
				break;

			default:
				break;
			}
			break;
		//
		case 4:
			Snacks();
			System.out.println("Enter 3 Food items (if less, Then press enter)");
			String test28 = br.readLine();
			String test29 = br.readLine();
			String test30 = br.readLine();
//			String test28 = "Tea";
//			String test29 = "Coffee";
//			String test30 = "Salad";
			calDisplay(test28, test29, test30);
			break;
		//

		default:
			break;
		}

	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		counter co = new counter();
int i = 1 ;
while (i == 1) {
	

		co.mood();

	}
	}
}

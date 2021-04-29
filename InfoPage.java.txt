package PROJECT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InfoPage {
	public String name;
	public String phno;
	public int age;
	public String gender;
	public double weight;
	public double height;
	public double BMI;
	public int option;
	public int active;
	public double calories;

	public void infoPage() throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		while (i == 1) {

			System.out.println("Enter the user name");
			name = br.readLine();
			if (name.isBlank()) {
				System.out.println("Please provide a name ");

			} else {
				i++;
			}
		}
		int p = 1;
		while (p == 1) {

			System.out.println("Enter the Phone number of user");
			phno = sc.nextLine();
			String regex = "\\d{10}";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(phno);
			if (matcher.matches()) {
				System.out.println("Given phone number is valid");
				p++;
			} else {
				System.out.println("Given phone number is not valid");
			}

		}

		System.out.println("Enter the Age of user");
		age = Integer.parseInt(br.readLine());

		System.out.println("Choose the Gender");
		System.out.println("1. Male for Male\n2. Female for Female");
		gender = sc.next();

		switch (gender) {
		case "Male":
			System.out.println("Male");
			break;
		case "Female":
			System.out.println("Female");
			break;
		default:
			System.out.println("Please select the correct option");
		}

		System.out.println("Enter your Weight in kgs");
		weight = sc.nextDouble();

		System.out.println("Enter your Height in Meters");
		height = sc.nextFloat();

		BMI = weight / (height * height);

		System.out.println("Choose the option according to your need");
		System.out.println("Choose\n1.for Maintain weight\n2.for Gain weight\n3.for Lose weight");
		option = sc.nextInt();

		System.out.println("Choose\n1. Sedentary\n2. Lightly active\n3. Moderately active\n4. Active\n5. Very active");
		active = sc.nextInt();

	}

	public void details() {
		System.out.println("User Name " + name);
		System.out.println("User Phone number " + phno);
		System.out.println("User Age " + age);
		System.out.println("Gender " + gender);
		System.out.println("Hi " + name + " your BMI is " + BMI);

		if (BMI < 18.5) {
			System.out.println("Hello, " + name + " on the basis of your BMI, you are underweight");
		} else if (BMI >= 18.5 && BMI < 25) {
			System.out.println("Hello, " + name + " on the basis of your BMI, you are Fit");
		} else if (BMI >= 25 && BMI < 30) {
			System.out
					.println("Hello, " + name + " on the basis of your BMI, you are overweight, Please Start jogging");
		} else if (BMI >= 30) {
			System.out.println("Hello, " + name
					+ " on the basis of your BMI, you are obese, Please start jogging and try to reduce your weight");
		} else {
			System.out.println("Not a valid BMI");
		}

		System.out.println("Don't worry " + name
				+ " ,we are here to help you because in our application, we provide you some facilities of gaining and losing weight. ");

		switch (option) {
		case 1:
			if (gender == "Male") {
				System.out.println(" You can refer to exercise page");
				System.out.println("If you want to maintain weight, follow our instructions");

				calories = 66.47d + (13.75d * weight) + (5.003d * (height * 100)) - (6.755d * age);
				System.out.println(
						"This much calories you consume daily on the basis of your weight " + calories * 1.5 + " /day");
				System.out.println("If you want to main your weight eat this much calories, on the daily basis "
						+ calories * 1.5 + " /day");

			}

			else {
				System.out.println(" You can refer to exercise page");
				System.out.println("If you want to maintain weight, follow our instructions");

				double calories = 655.1d + (9.563d * weight) + (1.850d * (height * 100)) - (4.676d * age);
				System.out.println(
						"This much calories you consume daily on the basis of your weight " + calories * 1.5 + "/day");
				System.out.println("If you want to main your weight eat this much calories, on the daily basis "
						+ calories * 1.5 + "/day");
			}
			break;

		case 2:
			if (gender == "Male") {
				System.out.println(" You can refer to exercise page");
				System.out.println("If you want to gain weight, follow our instructions");
				calories = 66.47d + (13.75d * weight) + (5.003d * (height * 100)) - (6.755d * age);
				System.out
						.println("This much calories you consume daily on the basis of your weight " + calories * 1.5);
				System.out.println(
						"If you want to gain Mild weight (0.25kgs/week) eat this much calories, on the daily basis "
								+ ((calories * 1.5) + 250) + "/day");
				System.out
						.println("If you want to gain weight (0.5kgs/week) eat this much calories, on the daily basis "
								+ ((calories * 1.5) + 500) + "/day");
				System.out.println(
						"If you want to gain Extreme weight (1 kgs/week) eat this much calories, on the daily basis "
								+ ((calories * 1.5) + 1000) + "/day");
			}

			else {
				System.out.println(" You can refer to exercise page");
				System.out.println("If you want to gain weight, follow our instructions");

				calories = 655.1d + (9.563d * weight) + (1.850d * (height * 100)) - (4.676d * age);
				System.out.println(
						"This much calories you consume daily on the basis of your weight " + calories * 1.5 + " /day");
				System.out.println(
						"If you want to gain Mild weight (0.25kgs/week) eat this much calories, on the daily basis "
								+ ((calories * 1.5) + 250) + "/day");
				System.out
						.println("If you want to gain weight (0.5kgs/week) eat this much calories, on the daily basis "
								+ ((calories * 1.5) + 500) + "/day");
				System.out.println(
						"If you want to gain Extreme weight (1 kgs/week) eat this much calories, on the daily basis "
								+ ((calories * 1.5) + 1000) + "/day");

			}
			break;

		case 3:
			if (gender == "Male") {
				System.out.println("Refer to exercise page");
				System.out.println("If you want to lose weight, follow our instructions");

				calories = 66.47d + (13.75d * weight) + (5.003d * (height * 100)) - (6.755d * age);
				System.out
						.println("This much calories you consume daily on the basis of your weight " + calories * 1.5);
				System.out.println(
						"If you want to lose Mild weight (0.25kgs/week) eat this much calories, on the daily basis "
								+ ((calories * 1.5) - 250) + "/day");
				System.out
						.println("If you want to lose weight (0.5kgs/week) eat this much calories, on the daily basis "
								+ ((calories * 1.5) - 500) + "/day");
				System.out.println(
						"If you want to lose Extreme weight (1 kgs/week) eat this much calories, on the daily basis "
								+ ((calories * 1.5) - 1000) + "/day");
			}

			else {
				System.out.println("Refer to exercise page");
				System.out.println("If you want to lose weight, follow our instructions");

				calories = 655.1d + (9.563d * weight) + (1.850d * (height * 100)) - (4.676d * age);
				System.out
						.println("This much calories you consume daily on the basis of your weight " + calories * 1.5);
				System.out.println(
						"If you want to lose Mild weight (0.25kgs/week) eat this much calories, on the daily basis "
								+ ((calories * 1.5) - 250) + "/day");
				System.out
						.println("If you want to lose weight (0.5kgs/week) eat this much calories, on the daily basis "
								+ ((calories * 1.5) - 500) + "/day");
				System.out.println(
						"If you want to lose Extreme weight (1 kgs/week) eat this much calories, on the daily basis "
								+ ((calories * 1.5) - 1000) + "/day");

			}
			break;

		default:
			System.out.println("Something went wrong, please try again");
		}

	}

	public void details1() {
		switch (active) {
		case 1:
			System.out.println("You do little or no exercise");
			break;
		case 2:
			System.out.println("You need to do 1 to 3 exercises days/week");
			break;
		case 3:
			System.out.println("You need to do 3 to 5 exercises days/week");
			break;
		case 4:
			System.out.println("You need to do 6 to 7 exercises days/week");
			break;
		case 5:
			System.out.println("You need to do 7 to 8 exerciese days/week");
			break;
		}
	}

	public static void main(String[] args) throws IOException {

		InfoPage ip1 = new InfoPage();
		ip1.infoPage();
		ip1.details();
		ip1.details1();
	}
}

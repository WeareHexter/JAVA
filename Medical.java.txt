package PROJECT;

import java.util.Scanner;

public class Medical {
	Scanner sc = new Scanner(System.in);

	public void CheckUp() {

		System.out.println(
				"Welcome to the Online Medical Checkup Center, your one stop destination for all your medical needs");
		System.out.println("Please Choose one of the following");
		System.out.println("1. I have a medical problem");
		System.out.println("2. I don't have any medical problem");
		System.out.println("Choose a value");
		int n = sc.nextInt();
		if (n == 2) {
			System.out.println("Happy to see that you are well");
		} else {
			System.out.println("What are you suffering from");
			System.out.println("1.Common Cold");
			System.out.println("2.Headache");
			System.out.println("3.External Injury");
			System.out.println("4.Muscle Ache");
			System.out.println("5.Indigestion");
			System.out.println("6.Cough");
			System.out.println("7.COVID");
		}
		int dis = sc.nextInt();
		switch (dis) {
		case 1:
			System.out.println("How long have you been suffering from Common cold");
			System.out.println("1.Less than 7 days");
			System.out.println("2.More than 7 days");
			System.out.println("Choose a value");
			int a = sc.nextInt();
			if (a == 1) {
				System.out.println("Here are some home remidies for you to treat Common Cold");
				System.out.println(
						"Eat Fruits - Vitamin C plays an important role in your body and has many health benefits.");
				System.out.println(
						"VAPOR RUB -  some old-fashioned topical ointments, such as vapor rub, appear to reduce cold symptoms");
				System.out.println(
						"Warm bath - Sometimes all you need is a warm bath, it helps to reduce symptoms of cold and flu");
				System.out.println(
						"Sleep With an Extra Pillow Under Your Head - Elevating your head will help relieve congested nasal passages");
				System.out.println("Take Anti Allergic medicines with advise of doctors");
			} else {
				System.out.println("Please contact our Specialist ");
				System.out.println("Dr.Yashasvi Jaiswal ");
				System.out.println("ENT Specialist");
				System.out.println("Phone no :- 7017514644");
			}
			break;
		case 2:
			System.out.println("How long have you been suffering from Head Ache");
			System.out.println("1.Less than 3 days");
			System.out.println("2.More than 3 days");
			System.out.println("Choose a value");
			int b = sc.nextInt();
			if (b == 1) {
				System.out.println("Here are some home remidies for you to treat Head Ache");
				System.out.println("Drink Water - Inadequate hydration may lead you to develop a headache.");
				System.out.println("Get Adequate Sleep - Sleep deprivation may cause headaches in some people");
				System.out.println(
						"Drink Caffeinated Tea or Coffee - Sipping on beverages that contain caffeine, such as tea or coffee, may provide relief when you are experiencing a headache.");
				System.out.println("Try taking an Aspirin or a Dispirin");
			} else {
				System.out.println("Please contact our Specialist ");
				System.out.println("Dr.Prashant Saxena ");
				System.out.println("EdD Specialist");
				System.out.println("Phone no :- 8561057299");
			}
			break;
		case 3:
			System.out.println("How long have you been suffering from External Injury");
			System.out.println("1.Less than 3 days");
			System.out.println("2.More than 3 days");
			System.out.println("Choose a value");
			int c = sc.nextInt();
			if (c == 1) {
				System.out.println("Here are some home remidies for you to treat an External Injury");
				System.out.println("You must always wash your hands before treating an external injury");
				System.out.println("Use Antibacterial Cream or use Dettol");
				System.out.println(
						"Apply Aloe vera - It helps producecollagen. This substance is a protein that promotes wound healing.");
				System.out.println(
						"Keep your Vitamin K Levels Up - Eat foods like Green vegetables, eggs, raisns and Fish");
			} else {
				System.out.println("Please contact our Specialist ");
				System.out.println("Dr.Ravi Bishnoi");
				System.out.println("BDS Specialist");
				System.out.println("Phone no :- 9461835303");
			}
			break;
		case 4:
			System.out.println("How long have you been suffering from Muscle Ache");
			System.out.println("1.Less than 5 days");
			System.out.println("2.More than 5 days");
			System.out.println("Choose a value");
			int d = sc.nextInt();
			if (d == 1) {
				System.out.println("Here are some home remidies for you to treat Muscle Ache");
				System.out
						.println("Rest - Rest the affected area and discontinue the activity that caused the injury.");
				System.out.println(
						"Ice: Use an ice pack or bag of frozen peas to help relieve pain, Apply ice to the area for 15–20 minutes three times a day.");
				System.out.println("Use OTC Pain Killers");
				System.out.println("Carefully stretchen out the affected muscles");
			} else {
				System.out.println("Please contact our Specialist ");
				System.out.println("Dr.Devdutt Padikkal ");
				System.out.println("M.Ch Specialist");
				System.out.println("Phone no :- 6397877663");
			}
			break;
		case 5:
			System.out.println("How long have you been suffering from Indigestion");
			System.out.println("1.Less than 2 days");
			System.out.println("2.More than 2 days");
			int e = sc.nextInt();
			System.out.println("Choose a value");
			if (e == 1) {
				System.out.println("Here are some home remidies for you to treat Indigestion");
				System.out.println(
						"Avoiding lying down when the body is horizontal, the acid in the stomach is more likely to travel backward and move upward, which can cause heartburn.");
				System.out.println(
						"Baking Soda -  Baking soda has sodium bicarbonate that acts as an antacid helping to neutralise stomach acid");
				System.out.println(
						"Carom Seeds (Ajwain) - Carom seed or ajwain is known to cure various digestive disorders including indigestion, acidity, flatulence, et al ");
				System.out.println("Try taking Anti Biotics");
			} else {
				System.out.println("Please contact our Specialist ");
				System.out.println("Dr.Kyle Jamieson");
				System.out.println("MD Specialist");
				System.out.println("Phone no :- 7826356679");
			}
			break;
		case 6:
			System.out.println("How long have you been suffering from Cough");
			System.out.println("1.Less than 2 days");
			System.out.println("2.More than 2 days");
			System.out.println("Choose a value");
			int f = sc.nextInt();
			if (f == 1) {
				System.out.println("Here are some home remidies for you to treat Cough");
				System.out.println(
						"Cough drops are medicated lozenges designed to lubricate and soothe irritated throat tissues. Their ingredients vary and so do their actions ");
				System.out.println(
						"Cough syrups - work by diminishing the cough reflex. This alleviates the desire to cough, making them especially beneficial for dry coughs.");
				System.out.println(
						"Gargling with warm salt water will help ease the discomfort and irritation caused by a dry cough. Salt water also helps kill bacteria in the mouth and throat.");
				System.out.println("Steam- It would help kill the bacteria in the mouth and throat");
			} else {
				System.out.println("Please contact our Specialist ");
				System.out.println("Dr.Jhye Richardson");
				System.out.println("MBBS Specialist");
				System.out.println("Phone no :- 7012659188");
			}
			break;
		case 7:
			System.out.println("How long have you been suffering from COVID");
			System.out.println("1.Less than 7 days");
			System.out.println("2.More than 7 days");
			System.out.println("Choose a value");
			int g = sc.nextInt();
			if (g == 1) {
				System.out.println("Here are some home remidies for you to treat COVID");
				System.out.println("Please visit coronavaccine.org to get vaccinated");
				System.out.println("Build Immunity - Eat fruits");
				System.out.println("Maintain Social Distance from others and Sanitize your hands regularly");
			} else {
				System.out.println("Please contact our Specialist ");
				System.out.println("Dr.Pavan Deshpande");
				System.out.println("COVID Specialist");
				System.out.println("Phone no :- 8528415457");
			}
			break;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 20; i++) {

			Medical M = new Medical();
			M.CheckUp();

		}
	}
}

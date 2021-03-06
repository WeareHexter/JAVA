package PROJECT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainMenu {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" MM   MM     Y       Y       ");
		System.out.println(" M M M M      Y    Y         ");
		System.out.println(" M  M  M        YY           ");
		System.out.println(" M     M       Y             ");
		System.out.println(" M     M      Y              ");
		System.out.println();
		System.out.println(" H     H  EEEEEEE  AAAAAAA  LL   TTTTTTTT  H     H     ");
		System.out.println(" H     H  E        A     A  LL      TT     H     H     ");
		System.out.println(" HHHHHHH  EEEEE    AAAAAAA  LL      TT     HHHHHHH     ");
		System.out.println(" H     H  E        A     A  LL      TT     H     H     ");
		System.out.println(" H     H  EEEEEEE  A     A  LLLLLL  TT     H     H     ");
		System.out.println();
		System.out.println(" AAAAAAA  MM   MM  IIIIIIIIII  GGGGGGG   OOOOOO        ");
		System.out.println(" A     A  M M M M      II      G        O      O       ");
		System.out.println(" AAAAAAA  M  M  M      II      G  GGGG  O      O       ");
		System.out.println(" A     A  M     M      II      G     G  O      O       ");
		System.out.println(" A     A  M     M  IIIIIIIIII  GGGGGGG   OOOOOO        ");

		System.out.println();
		System.out.println();

// login page  done 		//html done 
		System.out.println("Welcome !!");
		System.out.println("1. Login");
		System.out.println("2. Sign In");
		int in = sc.nextInt();
		switch (in) {
		case 1:
			userlogin l1 = new userlogin();
			l1.display();
			break;
		case 2:
			Signup su = new Signup();
			su.signup();
			su.display();
			break;

		default:
			break;
		}
/////////////////////////////////////////////////////////////////////////////////////
		int i = 7;
		while (i == 7) {

			System.out.println();
// home page html done 	
			System.out.println("******** Main Menu ********");
			System.out.println(" 1. Info Page");
			System.out.println(" 2. Dairy");
			System.out.println(" 3. Exercises");
			System.out.println(" 4. Medical");
			System.out.println(" 5. Recipes");
			System.out.println(" 6. About Us");
			System.out.println(" 7. Logout");

			int you = sc.nextInt();
			switch (you) {
///////////////////////////////////////////////////////////////////////////////////////////////////
			case 1:
// page1 = info              //html done
				InfoPage ip1 = new InfoPage();
				ip1.infoPage();
				ip1.details();
				ip1.details1();
				break;
///////////////////////////////////////////////////////////////////////////////////////////////////
			case 2:
//page2 = dairy               //html half done 
				counter co = new counter();
				co.mood();
				break;
///////////////////////////////////////////////////////////////////////////////////////////////////
			case 3:
// page3 = exercises    //html  type/level/dis  done 
				System.out.println("Type of Exercises");
				System.out.println("1. Chest");
				System.out.println("2. Back");
				System.out.println("3. Core(abs)");
				System.out.println("4. Arms");
				System.out.println("5. Legs");
				Exercises ex = new Exercises();
				int type = sc.nextInt();

				switch (type) {
				case 1:
					ex.chest();
					break;

				case 2:
					ex.back();
					break;

				case 3:
					ex.core();
					break;

				case 4:
					ex.arms();
					break;

				case 5:
					ex.legs();
					break;

				default:
					break;
				}
				break;
///////////////////////////////////////////////////////////////////////////////////////////////////
			case 4:
//page4 = Medical                  /html dome 
				Medical M = new Medical();
				M.CheckUp();

				break;

//////////////////////////////////////////////////////////////////////////////////////////////////
			case 5:
// page 5 = Recipes               // html done 
				Recipes r1 = new Recipes();
				r1.food_chart();
				break;
///////////////////////////////////////////////////////////////////////////////////////////////////
			case 6:
// page 6  = About us                  // html done 		
				AboutUs ab = new AboutUs();
				ab.contactUs();
				break;
///////////////////////////////////////////////////////////////////////////////////////////////////
			case 7:
//page7 = logout                // html done 

				LogOUT lg = new LogOUT();
				lg.Rate();
				lg.comment();
				System.out.println("Are Your Sure You Want To Logout");
				System.out.println("        YES  /  NO ");
				String lo = br.readLine();
				switch (lo) {
				case "YES":
					lg.yes();
					i++;
					break;
				case "NO":
					lg.no();
					break;

				default:
					break;
				}

				break;
//////////////////////////////////////////////////////////////////////////////////////////////////		
			default:
				break;
			} // switch end here
			System.out.println("------------------------------------------------------------------------");
		} // while loop end here
	}
}

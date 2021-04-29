package PROJECT;

import java.util.Scanner;

public class Exercises {
	Scanner sc = new Scanner(System.in);

	public void chest() {
		System.out.println("CHEST");
		System.out.println(" 1. Beginners");
		System.out.println(" 2. Intermediate");
		System.out.println(" 3. Advanced");
		System.out.println("Enter a value ");
		int level1 = sc.nextInt();
		switch (level1) {
		case 1:
			System.out.println("Beginners Level");
			System.out.println("Here are some exercies for You ");
			System.out.println("Exercise                         Reps * Sets        Muscles involved ");
			System.out.println("* Decline Push-Ups                 10 *3                 Upper");
			System.out.println("* Med Ball Push-Ups (Normal)       10 *3                 Inner");
			System.out.println("* Incline Push-Ups                 10 *3                 Lower");
			break;
		case 2:
			System.out.println("Intermediate Level");
			System.out.println("Here are some exercies for You ");
			System.out.println("Exercise                         Reps * Sets        Muscles involved ");
			System.out.println("* Low Cable Crossover              15 * 3                 Upper");
			System.out.println("* Mid Cable Crossover              15 * 3                 Inner");
			System.out.println("* High Cable Crossover             15 * 3                 Lower");
			break;
		case 3:
			System.out.println("Advanced Level");
			System.out.println("Here are some exercies for You ");
			System.out.println("Exercise                         Reps * Sets        Muscles involved ");
			System.out.println("* Incline Bench Press              20 * 3                 Upper");
			System.out.println("* Flat Bench Press                 20 * 3                 Inner");
			System.out.println("* Decline Bench Press              20 * 3                 Lower");
			break;
		default:
			break;
		}
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////
	public void back() {
		System.out.println("BACK");
		System.out.println(" 1. Beginners");
		System.out.println(" 2. Intermediate");
		System.out.println(" 3. Advanced");
		System.out.println("Enter a value ");
		int level1 = sc.nextInt();
		switch (level1) {
		case 1:
			System.out.println("Beginners Level");
			System.out.println("Here are some exercies for You ");
			System.out.println("Exercise                         Reps * Sets        Muscles involved ");
			System.out.println("* Lateral Raises                   10 * 3                 Deltoids");
			System.out.println("* Heel Taps                        10 * 3                 Lats");
			System.out.println("* Chin Ups                         10 * 3                 Obliques");
			break;
		case 2:
			System.out.println("Intermediate Level");
			System.out.println("Here are some exercies for You ");
			System.out.println("Exercise                         Reps * Sets        Muscles involved ");
			System.out.println("* T-Push-Ups                       15 * 3                 Deltoids");
			System.out.println("* Side planks                      15 * 3                 Lats");
			System.out.println("* Deadlifts                        15 * 3                 Overall Back");
			break;
		case 3:
			System.out.println("Advanced Level");
			System.out.println("Here are some exercies for You ");
			System.out.println("Exercise                         Reps * Sets        Muscles involved ");
			System.out.println("* Arnold Press                     20 * 3                 Deltoids");
			System.out.println("* Lat Pull Down                    20 * 3                 Lats");
			System.out.println("* Bent Over Row                    20 * 3                 Overall Back");
			break;
		default:
			break;
		}
	}

////////////////////////////////////////////////////////////////////////////////////////////////////
	public void core() {
		System.out.println("CORE(ABS)");
		System.out.println(" 1. Beginners");
		System.out.println(" 2. Intermediate");
		System.out.println(" 3. Advanced");
		System.out.println("Enter a value ");
		int level1 = sc.nextInt();
		switch (level1) {
		case 1:
			System.out.println("Beginners Level");
			System.out.println("Here are some exercies for You ");
			System.out.println("Exercise                         Reps * Sets        Muscles involved ");
			System.out.println("* Crunches                         15 * 3                Upper");
			System.out.println("* Hanging Knee raises              10 * 3                Lower");
			System.out.println("* Plank                        45secs * 3                Obliques");

			break;
		case 2:
			System.out.println("Intermediate Level");
			System.out.println("Here are some exercies for You ");
			System.out.println("Exercise                         Reps * Sets        Muscles involved ");
			System.out.println("* V-sit                            10 * 3                Upper");
			System.out.println("* Hanging Knee raises twist        10 * 3                Lower");
			System.out.println("* Bicycle crunches                 15 * 3                Obliques");
			break;
		case 3:
			System.out.println("Advanced Level");
			System.out.println("Here are some exercies for You ");
			System.out.println("Exercise                         Reps * Sets        Muscles involved  ");
			System.out.println("* Verticle leg crunches            15 * 3                Upper");
			System.out.println("* Garhammer Raises                 15 * 3                Lower");
			System.out.println("* Weighed Russian twists           15 * 3                Obliques");
			break;
		default:
			break;
		}
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////
	public void arms() {
		System.out.println("ARMS(BICEP & TRICEP)");
		System.out.println(" 1. Beginners");
		System.out.println(" 2. Intermediate");
		System.out.println(" 3. Advanced");
		System.out.println("Enter a value ");
		int level1 = sc.nextInt();
		switch (level1) {
		case 1:
			System.out.println("Beginners Level");
			System.out.println("Here are some exercies for You ");
			System.out.println("Exercise                         Reps * Sets        Muscles involved  ");
			System.out.println("* Bicep Curls                      10 * 3                Bicep");
			System.out.println("* Diamond Push-Ups                 10 * 3                Tricep");
			System.out.println("* Barbell Palms Up wrist curls     10 * 3                Wrist & forearm");
			break;
		case 2:
			System.out.println("Intermediate Level");
			System.out.println("Here are some exercies for You ");
			System.out.println("Exercise                         Reps * Sets        Muscles involved  ");
			System.out.println("* Concentration Curls              15 * 3                Bicep");
			System.out.println("* Tricep Dips                      15 * 3                Tricep");
			System.out.println("* Barbell Palms Down wrist curls   15 * 3                Wrist & forearm");
			break;
		case 3:
			System.out.println("Advanced Level");
			System.out.println("Here are some exercies for You ");
			System.out.println("Exercise                         Reps * Sets        Muscles involved  ");
			System.out.println("* Reverse Curl Straight bar        25 * 3                Bicep");
			System.out.println("* Close Grip Bench Press           25 * 3                Tricep");
			break;
		default:
			break;
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////
	public void legs() {
		System.out.println("LEGS");
		System.out.println(" 1. Beginners");
		System.out.println(" 2. Intermediate");
		System.out.println(" 3. Advanced");
		System.out.println("Enter a value ");
		int level1 = sc.nextInt();
		switch (level1) {
		case 1:
			System.out.println("Beginners Level");
			System.out.println("Here are some exercies for You ");
			System.out.println("Exercise                         Reps * Sets        Muscles involved  ");
			System.out.println("* Squats                           10 * 3                Overall (Quad + Hamstrings + glutes)");
			System.out.println("* Side Leg Raises                  10 * 3                Abductor");
			System.out.println("* Donkey Kick                      10 * 3                Hamstrings & Glutes");
			break;
		case 2:
			System.out.println("Intermediate Level");
			System.out.println("Here are some exercies for You ");
			System.out.println("Exercise                         Reps * Sets        Muscles involved  ");
			System.out.println("* Jump / Weighed Squa              15 * 3                Overall (Quad + Hamstrings + glutes)");
			System.out.println("* Side / Low Lunge                 15 * 3                Abductor");
			System.out.println("* Glute Bridge                     15 * 3                Hamstrings & Glutes");
			break;
		case 3:
			System.out.println("Advanced Level");
			System.out.println("Here are some exercies for You ");
			System.out.println("Exercise                         Reps * Sets        Muscles involved  ");
			System.out.println("* Pistol Squats                    20 * 3                Overall (Quad + Hamstrings + glutes)");
			System.out.println("* Fire Hydrants                    20 * 3                Abductor");
			System.out.println("* Stiff Leg Deadlift               20 * 3                Hamstrings & Glutes");
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
		////////////
		case 2:
			ex.back();
			break;
		////////////////
		case 3:
			ex.core();
			break;
		////////////////
		case 4:
			ex.arms();
			break;
		////////////////
		case 5:
			ex.legs();
			break;
		///////////

		default:
			break;
		}
	}
}

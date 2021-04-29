package PROJECT;

import java.util.Scanner;

public class Recipes {

	public void food_chart() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Recipes for what you want\n1. Gain Weight\n2. Lose Weight\n3. Shakes");
		int select = sc.nextInt();

		switch (select) {
		case 1:
			System.out.println("These are some recipes which will help you to gain the weight");
			System.out.println();
			System.out.println("1. Yogurt and fruit\n---------------------------------------------------------------------------------------------------------"
					+"\n             Combine 1–2 cups of yogurt with fresh or dried fruit. You can also add nuts, seeds, honey, granola, dark chocolate, or coconut flakes."
					+"\n              Chocolate peanut butter pudding: Mix 1–2 cups of yogurt with 100 percent cocoa powder, peanut or any nut butter, and a sweetener such as stevia, honey, or sugar.");
			System.out.println("******************************************************************************************************************************");
			System.out.println("******************************************************************************************************************************");
			System.out.println();
			System.out.println("2. Egg White Frittata\n-------------------------------------------------------------------------------------------------------"
					+"\n             frittata is: made by blending eggs with cream and then gently cooking it until it sets! Think for a moment about crème brûlée."
					+"\n              It's a mixture of eggs and cream baked in a dish with straight sides.");
			System.out.println("******************************************************************************************************************************");
			System.out.println("******************************************************************************************************************************");
			System.out.println();
			  System.out.println("3. Smoked Salmon Toasts\n----------------------------------"         
					+"\n             1. 2 slices of bread"
					+"\n             2. 1 garlic clove"
					+"\n             3. 3 tablespoons cream cheese"
					+"\n             4. 1/2 teaspoon lemon juice"
					+"\n             5. 1/2 teaspoon salt and fresh cracked pepper"
					+"\n             6. 1 tablespoon chopped scallion"
					+"\n             7. 1 teaspoon black sesame seeds");
			System.out.println("******************************************************************************************************************************");
			System.out.println("******************************************************************************************************************************");
			System.out.println();
			System.out.println("4. High Protein French Toast\n------------------------------------------------------------------------------------------------"
					+ "\n            1. 6 Slices high-protein bread like PB28 Bread" 
					+ "\n            2. 6 tablespoons egg whites"
					+ "\n            3. 2 Whole eggs" 
					+ "\n            4. ½ cup dairy-free milk" 
					+ "\n            5. 1 tablespoon vanilla extract"
					+ "\n            6. 2 tablespoons maple syrup" 
					+ "\n            7. 1 teaspoon cinnamon" 
					+ "\n            8. 1 teaspoon ginger"
					+ "\n            9. 3 tablespoons almond butter powder or peanut butter powder");
			System.out.println("******************************************************************************************************************************");
			System.out.println("******************************************************************************************************************************");
			System.out.println();
			System.out.println("5. Protein Chicken and Waffles\n----------------------------------------------------------------------------------------------"
					+ "\n            1. 1 cup protein pancake mix" 
					+ "\n            2. 12 oz boneless, skinless chicken breast (raw)"
					+ "\n            3. ½ cup low fat milk" 
					+ "\n            4. 1-2 tbs hot sauce" 
					+ "\n            5. 1 cup high protein Special K cereal"
					+ "\n            6. 4½ tbs yellow cornmeal" 
					+ "\n            7. 1 tbs paprika" 
					+ "\n            8. Salt & pepper, to taste"
					+ "\n            9. Toppings" 
					+ "\n           10. Syrup, Butter, Powdered Sugar, optional");
			System.out.println("******************************************************************************************************************************");
			System.out.println("******************************************************************************************************************************");
			System.out.println();
			System.out.println("6. Chocolate Peanut Butter Oatmea\n-------------------------------------------------------------------------------------------"
					+ "\n            1. 2 cups old fashioned oats" 
					+ "\n            2. 2 cups milk 2% reduced fat" 
					+ "\n            3. 2 cups water"
					+ "\n            4. 3 tablespoons cocoa powder" 
					+ "\n            5. 1 teaspoon vanilla" 
					+ "\n            6. 1 teaspoon cinnamon"
					+ "\n            7. ½ teaspoon salt" 
					+ "\n            8. ¼ cup creamy natural peanut butter"
					+ "\n            9. slices banana for topping");
			System.out.println("******************************************************************************************************************************");
			System.out.println("******************************************************************************************************************************");
			System.out.println();
			System.out.println("7. Pesto Egg SandwichPesto Egg Sandwich\n-------------------------------------------------------------------------------------"
					+ "\n            1. 1 whole-wheat English muffin, split" 
					+ "\n            2. 1 large egg" 
					+ "\n            3. 1 tablespoon milk"
					+ "\n            4. Salt and pepper" 
					+ "\n            5. 2 tablespoons shredded sharp Cheddar"
					+ "\n            6. 1 ½ teaspoons prepared pesto");
			System.out.println("******************************************************************************************************************************");
			System.out.println("******************************************************************************************************************************");
			System.out.println();
			System.out.println("8. Mix milk with a starter\n--------------------------------------------------------------------------------------------------"
					+ "\n            Use 2-3 tablespoons of yogurt for every 8 cups of milk. Pour a little of the warm milk into your starter and mix until it's well dissolved."
					+ "\n             (Buy a small 8 oz cup of plain greek yogurt and use this as your starter.) Pour this mixture into your warm milk and mix once again.");
			System.out.println("******************************************************************************************************************************");
			System.out.println("******************************************************************************************************************************");
			System.out.println();
			System.out.println("9. Breakfast Casserole\n------------------------------------------------------------------------------------------------------"
					+ "\n            1. 1 pound Italian sausage (I prefer hot, but mild or sweet will also work)"
					+ "\n            2. 1 medium white onion, peeled and diced" 
					+ "\n            3. 3 cloves garlic, minced"
					+ "\n            4. 1 red bell pepper, cored and diced (or 1 jar of roasted red peppers, drained and diced)"
					+ "\n            5. 6 eggs" 
					+ "\n            6. 1/3 cup milk" 
					+ "\n            7. 1 (20 ounce) bag frozen diced hash browns, thawed"
					+ "\n            8. 2 cups shredded sharp cheddar cheese" 
					+ "\n            9. 1/4 teaspoon freshly-ground black pepper"
					+ "\n           10. optional topping: thinly sliced green onions");
			System.out.println("******************************************************************************************************************************");
			System.out.println("******************************************************************************************************************************");
			System.out.println();
			break;
		case 2:
			System.out.println("These are some recipes which will help you to lose the weight");
			System.out.println();
			System.out.println("1. How do you cook leafy greens?\n--------------------------------------------------------------------------------------------"
					+ "\n            Stir Fry: Sturdy greens like kale, Swiss chard or collards are great substitutes for bok choy or gai lan in stir fries."
					+ "\n            Pasta: Dark greens cook up well with pasta. Add them to your tomato sauce or sauté them in olive oil and serve with a sharp cheese."
					+ "\n            Soup: Kale and potato soup is a comforting dish on a cool night.");
			System.out.println("==============================================================================================================================");
			System.out.println("==============================================================================================================================");
			System.out.println();
			System.out.println("2. How is salmon prepared?\n--------------------------------------------------------------------------------------------------"
					+ "\n            1. Preheat the oven to 450 degrees F."
					+ "\n            2. Season salmon with salt and pepper. Place salmon, skin side down, on a non-stick baking sheet or in a non-stick pan with an oven-proof handle."
					+ "\n                Bake until salmon is cooked through, about 12 to 15 minutes. Serve with the Toasted Almond Parsley Salad and squash, if desired.");
			System.out.println("==============================================================================================================================");
			System.out.println("==============================================================================================================================");
			System.out.println();
			System.out.println("3. How do you make cruciferous vegetables?\n----------------------------------------------------------------------------------"
					+ "\n            Roast Your Cruciferous Vegetables!"
					+ "\n             To roast, just wash and cut your vegetables into bite-sized pieces, drizzle with olive or avocado oil, and add a pinch of salt and pepper."
					+ "\n              Simply pop them on a baking sheet in single layer and roast at 425°F for 15-20 minutes or until tender and lightly brown. Delicious!");
			System.out.println("==============================================================================================================================");
			System.out.println("==============================================================================================================================");
			System.out.println();
			System.out.println("4. How do you make lean beef?\n-----------------------------------------------------------------------------------------------"
					+ "\n            1. Because the meat has less fat, it could use a little cooking oil for frying or grilling."
					+ "\n            2. Sear the beef over a high heat on a grill or stovetop skillet to seal in its juices, then proceed with a lower temperature to finish grilling, frying, or roasting."
					+ "\n            3. Cuts like steaks are less forgiving.");
			System.out.println("==============================================================================================================================");
			System.out.println("==============================================================================================================================");
			System.out.println();
			System.out.println("5. How do you boil potatoes step by step?\n-----------------------------------------------------------------------------------"
					+ "\n            Season with a teaspoon of salt per pound of potatoes. Bring water to a boil over high heat,"
					+ "\n             then reduce heat to medium and cook at rapid simmer until potatoes are easily pierced with a paring knife,"
					+ "\n              about 10 minutes for chopped potatoes and 20 minutes for whole potatoes. Drain potatoes in a colander.");
			System.out.println("==============================================================================================================================");
			System.out.println("==============================================================================================================================");
			System.out.println();
			System.out.println("6. How do you cook beans and legumes?\n---------------------------------------------------------------------------------------"
					+ "\n            Stove-top – put legumes in a pot and cover them with at least 2 inches of water. Bring to a boil and remove any foam that forms."
					+ "\n             Reduce heat to a bare simmer and cook until tender (the cooking time will vary depending on the legume).");
			System.out.println("==============================================================================================================================");
			System.out.println("==============================================================================================================================");
			System.out.println();
			System.out.println("7. How do you eat canned tuna?\n----------------------------------------------------------------------------------------------"
					+ "\n            1. Swap tuna into your favorite salmon or crab cake recipe."
					+ "\n            2. Mix tuna into vegetable- or potato-based soup or into stew instead of chicken."
					+ "\n            3. If you're sticking with a simple salad on the run, swap mayo for Greek yogurt, and mix in some Dijon mustard."
					+ "\n            4. Try using cottage cheese in place of mayo or Greek yogurt.");
			System.out.println("==============================================================================================================================");
			System.out.println("==============================================================================================================================");
			System.out.println();
			break;

		case 3:
			System.out.println("These are some Shake and Soups recipes which will help you to Maintain the weight");
			System.out.println();
			System.out.println("1. Chocolate banana nut shake\n-----------------------------------------------------------------------------------------------"
					+ "\n            Combine 1 banana, 1 scoop of chocolate whey protein, and 1 tablespoon (15 mL) of peanut or another nut butter. ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			System.out.println("2. Vanilla berry shake\n------------------------------------------------------------------------------------------------------"
					+ "\n            Combine 1 cup (237 mL) of fresh or frozen mixed berries, ice, 1 cup (237 mL) of high protein, full fat Greek yogurt, and 1 scoop of vanilla whey protein.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			System.out.println("3. Chocolate hazelnut shake\n-------------------------------------------------------------------------------------------------"
					+ "\n            Combine 15 ounces (444 mL) of chocolate milk with 1 scoop of chocolate whey protein, 1 tablespoon(15 mL) of hazelnut butter, and 1 avocado.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			System.out.println("4. Caramel apple shake\n------------------------------------------------------------------------------------------------------"
					+ "\n            Combine 1 sliced apple, 1 cup (237 mL) of full fat Greek yogurt, 1 scoop of caramel- or vanilla-flavored whey protein, and 1 tablespoon (15 mL) of sugar-free caramel sauce or flavoring.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			System.out.println("5. Vanilla blueberry shake\n--------------------------------------------------------------------------------------------------"
					+ "\n            Combine 1 cup (237 mL) of fresh or frozen blueberries, 1 scoop of vanilla whey protein, 1 cup (237 mL) of vanilla Greek yogurt, and sweetener if needed.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			System.out.println("6. Preparation of Carrot Soup\n-----------------------------------------------------------------------------------------------"
					+ "\n            Take a pan and firstly add oil and curry powder to it. Then stir it for not more than 2 minutes and add the carrots and onion."
					+ "\n             Now cook all of it for 10 minutes and then add it to the vegetable broth and keep it aside for another 10 minutes. Now your carrot soup is ready to be served."
					+ "\n              This is considered to be one of the best soups for weight loss.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			System.out.println("7. Preparation of Corn Soup\n-------------------------------------------------------------------------------------------------"
					+ "\n            Firstly heat the oil and then add the corn and cook it for 1 minute. Then add herbs and vegetables and stir until it softens."
					+ "\n             Add 2 cups of water to the vegetables corn and stir well. Let it cook for 5 minutes until the soup turns thick."
					+ "\n              Then add the lemon juice and mix it well. Your corn soup is ready to be served.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			System.out.println("8. Preparation of Creamy Cucumber Soup\n--------------------------------------------------------------------------------------"
					+ "\n            Firstly heat the oil and then add garlic and onion and cook until it turns tender. Then add the lemon juice and let it cook for 1 minute."
					+ "\n             Once this is done, add cucumber, vegetables, salt and pepper and cook it on medium heat until you see the cucumber turns soft."
					+ "\n              Then transfer the soup into a blender and add herbs to it. Now blend it till it becomes creamy and once this is done, add to a bowl and add the yoghurt to it."
					+ "\n                Now your healthy creamy cucumber soup is ready to be served.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			break;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Recipes r1 = new Recipes();
		r1.food_chart();
		
		}

}

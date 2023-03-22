package Operations;

import food.db;
import food.foods;

public class Logics implements Operations {

	db obj =new db();
	
	@Override
	public void addtocart(foods f) {
		// TODO Auto-generated method stub
		
		obj.items.add(f);
		
		
	}

	@Override
	public foods removetocart(int k) {
		// TODO Auto-generated method stub
		
		return obj.items.remove(k);
		
	}
	

	@Override
	public void Generatebill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menushow() {
		// TODO Auto-generated method stub
		System.out.println("\n \n -----------------Welcome to Abhishek Resturant--------------- \n \n");
		System.out.println("\n Select the the Type of Food you Want \n");
		System.out.println("1. Veg");
		System.out.println("2. Non-Veg");
		System.out.println("3. Drink");
		System.out.println("4. Breakfast");
		System.out.println("5. Cart");
		System.out.println("6. Remove From Cart");
		System.out.println("7. Genetate bill");
		System.out.println("8. Exit the Resto CLI");
		
		
		
	}

	@Override
	public void menuveg() {
		
		System.out.println("\n ------------------ Showing Menu for veg Food -----------------\n");
		
		System.out.println("1. Mashroom paneer        500");
		System.out.println("2. Pani puri              70");
		System.out.println("3. Allo dum               499");
		System.out.println("4. MAshroom khadai        877");
		System.out.println("5. Panner Muglai korma    500");
		System.out.println("6. Roti                   20");
		
		
	}

	@Override
	public void menunonveg() {
		// TODO Auto-generated method stub
System.out.println("\n ------------------ Showing Menu for non-veg Food -----------------\n");
		
		System.out.println("1. Chicken tandori        245");
		System.out.println("2. Chicke 65              356");
		System.out.println("3. Roti                   20");
		System.out.println("4. Mutton Biryani         788");
		System.out.println("5. Mutton handi           999");
		

}

	@Override
	public void brakfast() {
		// TODO Auto-generated method stub
System.out.println("\n ------------------ Showing Menu Breakfast -----------------\n");
		
		System.out.println("1. Ghati Missal       245");
		System.out.println("2. Omlete bread       356");
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
System.out.println("\n ------------------ Showing Menu Drink -----------------\n");
		
		System.out.println("1. Mohito          245");
		System.out.println("2. Lassi           80");
		System.out.println("3. coco Cola       40");
		
	}
	
	
	
	
}

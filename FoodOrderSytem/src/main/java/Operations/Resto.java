package Operations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import food.*;

public class Resto {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Logics l = new Logics();
		
		db d = new db();
		String choice ="";
		
		int opt;
	
		while(!choice.equalsIgnoreCase("N"))
		{
			l.menushow();
			opt = sc.nextInt();
			
			
			switch(opt)
			{
			case 1 :
			    l.menuveg();
			   
			    int veg = sc.nextInt();
			    
			    switch(veg)
			    {
			    case 1:
			    	l.addtocart(MenuItems.menuitm.get(0));
			    	
			    	System.out.print("Product added " );
			    	break;
			    	
			    case 2:
			    	l.addtocart(MenuItems.menuitm.get(1));
			    	System.out.print("Product added ");
			    	break;


			    case 3:
			    	l.addtocart(MenuItems.menuitm.get(4));
			    	System.out.print("Product added ");
			    	break;
			    	
			    case 4:
			    	l.addtocart(MenuItems.menuitm.get(6));
			    	System.out.print("Product added ");
			    	break;
			    	
			    case 5:
			    	l.addtocart(MenuItems.menuitm.get(8));
			    	System.out.print("Product added ");
			    	break;
			    	
			    	
			    case 6:
			    	l.addtocart(MenuItems.menuitm.get(9));
			    	System.out.print("Product added " );
			    	break;
			    }
			    
			    break;
			    
			    default :
			    	System.out.println("----------------Worng choice----------------");
			    	
			    	break;
			case 2 :
				l.menunonveg();
				int nonveg = sc.nextInt();
				
				switch(nonveg)
				{
				case 1 :
					l.addtocart(MenuItems.menuitm.get(5));
					break;
					
				case 2:
					l.addtocart(MenuItems.menuitm.get(7));
					break;
					
				case 3 :
					l.addtocart(MenuItems.menuitm.get(9));
					break;
					
				case 4 :
					l.addtocart(MenuItems.menuitm.get(13));
					break;
					
				case 5 :
					l.addtocart(MenuItems.menuitm.get(14));
					break;
				
				}
				break;
				
				
		    case 3 :
				l.drink();
				int drink = sc.nextInt();
				switch(drink)
				{
				case 1 :
					
					l.addtocart(MenuItems.menuitm.get(10));
					
					break;
				case 2 :
					l.addtocart(MenuItems.menuitm.get(11));
					break;
					
				case 3 :
					l.addtocart(MenuItems.menuitm.get(12));
					break;
				}
				break;
			
			case 4 :
				l.brakfast();
				int brakfast = sc.nextInt();
				switch(brakfast)
				{
				case 1:
					l.addtocart(MenuItems.menuitm.get(2));
				break;
				
			     case 2:
				  l.addtocart(MenuItems.menuitm.get(3));
			       break;
				}
				
				
			case 5 :
				System.out.println("\n ---------- Cart --------- \n"); 
				foods.displayData(db.items);
				break;
				
		    case 6 :
		    	System.out.println("\n ---------- Remove to cart --------- \n");
		    	
		    	System.out.println("\n------------------ Select product to reov from cart --------------\n");
		    	foods.displayData(db.items);
		    	int key = sc.nextInt();
				foods drf = l.removetocart(key);
				
				
				System.out.println("Prodeuct is deleted");
				break;
		    case 7 :
		    	foods.generatebill(db.items);  
		    	
		    	List<foods> i= db.items.stream().filter((n)-> n.getPrice() > 0).collect(Collectors.toList());
		    	Integer s = i.stream().map(x -> x.getPrice()).reduce(0,(a,b) -> a+b);
		    	System.out.println("  -----------------------------------------------  ");
		    	System.out.println("              TOTAL                ₹"+s+"     ");
		    	System.out.println("  -----------------------------------------------  ");
		    	break;
		    	
		    	
		    	
             case 8:
            	System.out.println("\n ---------- You Exit the Application ----------\n");
	            System.exit(0);	
				break;
			}
			

			
			
			
		}
		
		
			
	}

}

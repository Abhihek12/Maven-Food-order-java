package food;

import java.util.ArrayList;

public class foods {

	private String fname;
	private int price;
	private String category;
	private String type;

	public foods(String fnm, int pr, String cat, String ty) {

		fname = fnm;
		price = pr;
		category = cat;
		type = ty;

	}

	public foods() {
		// TODO Auto-generated constructor stub
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	   public static void displayData(ArrayList<foods> list)
	   { 
		 int index=0;
	     for(foods dis: list )
	     { 
	       System.out.println((index++)+":\n "+ "dish nmae: " +dis.fname); 
	       System.out.println("price: " +dis.price); 
	       System.out.println("category: " +dis.category); 
	       System.out.println("type: " +dis.type + "\n"); 
	     } 
	    }
	   
	   public static void generatebill(ArrayList<foods> list)
	   { 
		   
		   System.out.println("\n     --------- Thank You For Visiting Abhishek Resto --------   \n");
		   
		   System.out.println("\n                       --------- Bill --------   \n");
		   for(foods dis: list )
		     { 
		       System.out.println("\n              "+dis.fname + "       "  +dis.price+"   \n"); 
		      
		     } 
		   
	   }

}

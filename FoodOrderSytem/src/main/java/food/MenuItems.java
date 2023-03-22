package food;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuItems {

	public static ArrayList<foods> menuitm;

	
	
		static foods fd  ;
		
	      static {
	    	  menuitm = new ArrayList<foods>();
		
		menuitm.add(new foods("MAshroom paneer",500,"main corse","veg"));
		menuitm.add(new foods("Pani puri unlimited",646,"Starter","veg"));
		menuitm.add(new foods("Ghati missal",654,"mainmenu","breakfast"));
		menuitm.add(new foods("Omlet bread",465,"mainmenu","breakfast"));
		menuitm.add(new foods("Aloo dum",499,"mainmenu","veg"));
		menuitm.add(new foods("Chicken Tandoori",245,"mainmenu","nonveg"));
		menuitm.add(new foods("Mashroom Kadi",877,"mainmenu","veg"));
		menuitm.add(new foods("Chicken 65",356,"mainmenu","nonveg"));
		menuitm.add(new foods("Panner Muglai korma",1599,"mainmenu","veg"));
		menuitm.add(new foods("Roti",20,"mainmenu","veg"));
		menuitm.add(new foods("Mohito",499,"Bevrages","drink"));
		menuitm.add(new foods("Lassi",150,"Bevrages","drink"));
		menuitm.add(new foods("cocacola",70,"Bevrages","drink"));
		menuitm.add(new foods("Mutton biryani",788,"mainmenu","nonveg"));
		menuitm.add(new foods("Mutton handi",999,"mainmenu","nonveg"));
		
		
		
		
	}
}

	



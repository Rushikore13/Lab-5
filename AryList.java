package A;

import java.util.ArrayList;

public class AryList {

	public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	list.add(13);
	list.add(12);
	list.add(24);
	list.add(11);
	list.add(9);
	list.add(78);
	list.add(77);
	list.add(5);
	
	System.out.println("The Array list is: "+list);
	list.forEach(
 		   (n)->
 		   {
 			 if (n%2!=0) {
 				 System.out.println("Oddnumbers are: "+n);
 			 } 
 		   }
 		   
 		   );
	
	}

}

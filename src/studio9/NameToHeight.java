package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//keys are strings: team members name 
	     //values are doubles/ints depending on how you rep height
	    Map<String, Integer> heightMap = new HashMap<>(); 
	    //Integer versus int: Integer is an object type. object rep of int
	    //while int is a var/primitive type
	    //primitative tyoes are not accepted as a value or key
	    
	   //put: associate a value with a key
	    //get: get a value associated with a spefific key
	    
	    heightMap.put("Person1", 62); 
	    heightMap.put("Person2", 53); 
	    
	String name = ""; 

	while(!name.equals("quit")) { //comparing strings which are objects
		//therefore use .equals
		//if you enter a value not in the map, it will give null back     
	   System.out.println("Please enter a name: "); 
	   // String name = in.nextLine(); 
	   name = in.next(); 
	   //int height = heightMap.get(name); 
	   Integer height = heightMap.get(name); 
	   
	   if (height == null) { 
		   System.out.println("Who is that?"); 
	   }
	   else {
		   System.out.println(name + " is " + height + " inches tall"); 
	   }
	  
	   }
	System.out.println("All done!"); 
	}
	}


	


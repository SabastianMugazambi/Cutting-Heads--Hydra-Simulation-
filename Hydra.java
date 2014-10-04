// By Sabastian Mugazambi 
//Using the ArrayBag class and aproximating the time taken by algorythm to ruun. 
import java.io.*;
import java.util.Scanner;
import java.lang.String;

public class Hydra {

//Running the main function
public static void main(String[] args){

		//Craeting a bag object to be my bag with strings and making it very big. 
	    BagInterface<String> b = new ArrayBag<String>(200000);

	    	//Printing out the starting string
			System.out.println("Starting Hydra with HYDRA");

			//adding the word to the first word to the bag
			b.add("HYDRA");

		//Looping through untill the bag size is 0.
		while (b.getCurrentSize() != 0){

			  //removing a string  and substringing it to get what to add.
		      String x = b.remove();
		      System.out.println("Chopping head " +x);
		      String y = x.substring(1);

		      //looping through and adding twice the substring.
		      if (x.length()!=1){
		      		b.add(y);
		      		b.add(y);
		        }
        } 

	
	System.out.println("The Hydra is Slain!");
	}
}
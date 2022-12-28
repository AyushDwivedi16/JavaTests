package com.nagarro.java.assn;
import java.lang.String;
public class String_Assignment {
	public static void main(String[] args) {
		 String str = "A quick brown fox jumps over the lazy dog ";     
			
		    System.out.println(str);
		    
			int index=str.indexOf('d');  
			System.out.println("Index location of d is :"+index);
			
			System.out.println(str.substring(15, 22));
			
			String sUpper=str.toUpperCase();  
			System.out.println(sUpper);
			
			int last_index1=str.lastIndexOf('u');
			System.out.println("Last index location of u is :"+last_index1);
			
			str=str.concat("in the night.");
			System.out.println(str);
	    }

}

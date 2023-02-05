package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		
		
		// creating object of ArrayList class  
		ArrayList<String> list = new ArrayList<String>();
		
		// adding elements to the ArrayList   
		list.add("Volkswagen");   
		list.add("Toyota");   
		list.add("Porsche");   
		list.add("Ferrari");   
		list.add("Mercedes-Benz");   
		list.add("Audi");   
		list.add("Rolls-Royce");  
		list.add("BMW");  
		
		   
		System.out.println(list);   
		/*
		 * // Sorting ArrayList in ascending Order Collections.sort(list); // printing
		 * the sorted ArrayList System.out.println("After Sorting: "+ list);
		 */
		
	ArrayList<String> list1 = new ArrayList<String>();
		
		// adding elements to the ArrayList   
		list1.add("Volkswagen");   
		list1.add("Toyota");   
		list1.add("Porsche");   
		list1.add("Ferrari");   
		list1.add("Mercedes-Benz");   
		list1.add("Audi");   
		list1.add("Rolls-Royce");  
		list1.add("BMW"); 
		System.out.println(list.equals(list1));

	}

}

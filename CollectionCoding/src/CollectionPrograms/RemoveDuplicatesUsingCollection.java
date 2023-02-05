package CollectionPrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingCollection {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(
				Arrays.asList("mango", "apple", "banana", "chicko", "orange", "orange", "banana", "apple"));
		System.out.println("Before Removving Duplicates:" + list);

		//ArrayList -> Set
		Set<String> reqSet = new LinkedHashSet<String>(list);
		System.out.println(reqSet);
		
		//Set -> ArrayList
		ArrayList<String> withoutduplicates = new ArrayList<String>(reqSet);
		System.out.println(withoutduplicates);

		
		//for 
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		System.out.println(l1);
		Set<Integer> s1 = new LinkedHashSet<Integer>(l1);
		System.out.println(s1);

	}

}

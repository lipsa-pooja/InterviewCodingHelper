package practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(1);
		al.add(4);
		al.add(4);
		al.add(2);
		System.out.println(al);
		LinkedHashSet<Integer> s=new LinkedHashSet<Integer>(al);
		System.out.println(s);
	}

}

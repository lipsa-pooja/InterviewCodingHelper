
package CollectionPrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;

//1. 
//input = {1,9,4,1,2,8,3,2,0,3}
//output= {1,2,3}------------->Duplicate integer

//2. 
//output = 1,9,4,2,8,3,0--------->unique integer
public class test123 {
	
	public static void main(String[] args) {
	int[]	arr = {1,9,4,1,2,8,3,2,0,3,1,3,2};
	ArrayList<Integer> al=new ArrayList<Integer>();
	LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		for(int i:arr)
		{
			al.add(i);
			lh.add(i);
		}
		System.out.println(lh);
		
		for(Integer i:lh) {
			al.remove(i);
		}
		
		System.out.println(al);
		
	}

}

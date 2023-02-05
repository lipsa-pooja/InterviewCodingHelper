package CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		String[] s= {"mango","banana","orange","chiku"};
		List<String> list=Arrays.asList(s);
		
		System.out.println(list);
		
		ArrayList<String> al2=new ArrayList<String>(list);
		System.out.println(al2);
		

		

	}

}

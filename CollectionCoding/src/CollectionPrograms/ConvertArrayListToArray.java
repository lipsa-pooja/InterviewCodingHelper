package CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		String[] s= {"mango","banana","orange","chiku"};
		List<String> list=Arrays.asList(s);
		ArrayList<String> al2=new ArrayList<String>(list);
		System.out.println(al2);
		
		
	}

}

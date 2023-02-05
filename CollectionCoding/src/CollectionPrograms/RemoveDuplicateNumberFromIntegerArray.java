package CollectionPrograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateNumberFromIntegerArray {

	// convert intArry to set
	public static void main(String[] args) {
		int[] intarray = { 1, 5, 7, 1, 4, 7, 4 };

		System.out.println(removeDuplicate(intarray));

	}

	public static Set<Integer> removeDuplicate(int[] array) {

		Set<Integer> s = new LinkedHashSet<>();
		for (int i : array) {
			s.add(i);

		}

		return s;
	}

}

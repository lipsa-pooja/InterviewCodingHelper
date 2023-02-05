package practice;

import java.util.HashMap;

public class PrintRequiredCharacterInString {

	public static void main(String[] args) {
		String str = "aaabbcdeffffgggh";

		getRequiredCharacter(str, 'c');
	}

	public static void getRequiredCharacter(String str, Character ch) {

		char[] chars1 = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (Character ch1 : chars1) {
			if (hm.containsKey(ch1)) {
				hm.put(ch1, hm.get(ch1) + 1);

			} else {
				hm.put(ch1, 1);
			}
		}
		System.out.println(ch);
		System.out.println(hm);
		System.out.println(hm.get('c'));
		System.out.println(hm.get(ch));

	}

}

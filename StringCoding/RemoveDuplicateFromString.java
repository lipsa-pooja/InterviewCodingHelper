package practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {
public static void main(String[] args) {
	String str="afdfsgafgafhdgadgafhgfa";
char[] chars=str.toCharArray();


//convert character to List
ArrayList<Character> al=new ArrayList<Character>();
for(char ch:chars)
{
	al.add(ch);
}
System.out.println(al);
LinkedHashSet<Character> s=new LinkedHashSet<Character>(al);
System.out.println(s);

}
}

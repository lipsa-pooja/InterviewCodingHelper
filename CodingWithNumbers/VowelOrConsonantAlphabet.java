
public class VowelOrConsonantAlphabet {

	public static void main(String[] args) {
		
		//1st way: if condition statement
		char ch='t';
		//vowel alphabet =a,e,i,o,u
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" is vowel alphabet");
		}
		else
		{
			System.out.println(ch+" is consonant alphabet");
		}

	
	
	
	//2nd way:switch case
		char ch1='a';
	switch(ch1)
	{
	case 'a':;
	case 'e':;
	case 'i':;
	case 'o':;
	case 'u':;
	System.out.println(ch1+" is vowel");
	break;
	
	default: 
		break;
		
	}
}
}

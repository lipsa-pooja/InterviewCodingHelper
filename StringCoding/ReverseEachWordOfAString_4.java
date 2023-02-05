package string_programs;

public class ReverseEachWordOfAString_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java code";

		//input="java code"
		//output="avaj edoc"
		
		 String revstr="";
		
		//split() method return type is string array string[]
		String[] words=str.split(" ");//["java","code"]
		
	
		//This for loop traverse the word in a string
		for(int i=0;i<=words.length-1;i++)
		{
			String word=words[i];
			String revword="";
			//This for loop helps in Reversing the character in a word
			for(int j=word.length()-1;j>=0;j-- )
				//initialization;condition;increment/decrement
			{
				revword=revword+word.charAt(j);
				
			}
			System.out.println("Before Word reve: "+ revstr);
			revstr=revstr+revword +" ";
			System.out.println("After word reversed: "+ revstr);
			
		}
		System.out.print(revstr.trim());
			

	}

}

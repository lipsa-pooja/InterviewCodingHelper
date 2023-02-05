package string_programs;

public class ReverseTheSentenceWord_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i am in love";
		String revstr="";
		//input="i am in love"
		//output="love in am i"
		String[] words=str.split(" ");//["i","am","in","love"];
		for(int i=words.length-1;i>=0;i--)
		{
			//System.out.print(words[i]);
			revstr=revstr+words[i]+" ";
			
		}
		System.out.print(revstr.trim());

	}
}


package string_programs;

public class ConvertStringToAnInteger_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="-123";//here 123 is string
		//string str="123.456" //numberformat exception
		//string str="-123";  //here it returns -123 as an integer value
		
		
		//Approach1-1:
		//here Parseint() method convert string in to integer
	    //it will throw the numberformat exception if the given string is not an integer
		
		System.out.println("integer value is:"+ Integer.parseInt(str));
		
		//Approach-2:
		System.out.println("integer value is:"+Integer.valueOf(str));
			
		

	}

}

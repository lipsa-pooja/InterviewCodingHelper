package JavaBasicPrograms;

public class PallindromeNumber {

	 public static void main(String args[]){  
		  int r,sum=0,temp;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;  //454  
		  while(n>0){  //1.454>0  //2.45>0  //3.4>0
		   r=n%10;  //getting remainder  //1.454%10=4(last-digit) //2.45%10=5  //3.4%10=4
		   sum=(sum*10)+r; //1.sum=0+(0*10)+4=4  //2.sum=4*10+5=45 //3.sum=45*10+4=454
		   n=n/10;  //1.454/10=45  //2.45/10=4  //3.4/10=0
		  }    
		  if(temp==sum) //1.4 //2.45  //3.sum=454
		   System.out.println( temp+" is a palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		} 

}

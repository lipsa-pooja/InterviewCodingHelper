package JavaBasicPrograms;

public class ArmstrongNumberGeneric {

	public static void main(String[] args) {
		int num = 1634, number, temp, digit = 0;
		double total = 0;
		
		temp = num;
		while(temp > 0) { //1. 370>0  //2. 37>0 //3. 3>0 //4. fail
			temp = temp/10; //1. 370/10=37 //2. 37/10=3 //3. 3/10=0
			digit = digit +1; //1. digit=1 //2. digit=2 //digit=3
		}

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            //temp= get the last digitnumber
            //total= total + to the power of (lastdigitnumber/temp)
            total = (total + Math.pow(temp, digit));
            number=number/10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");

	}

}

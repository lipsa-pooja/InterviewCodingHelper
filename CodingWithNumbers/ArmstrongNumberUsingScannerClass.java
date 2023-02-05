package JavaBasicPrograms;

import java.util.Scanner;

public class ArmstrongNumberUsingScannerClass {


    public static void main(String[] args) {

        int num, number, temp, total = 0;
        System.out.println("Ënter 3 Digit Number");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number=number/10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }

}

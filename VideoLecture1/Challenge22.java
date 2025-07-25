//Create a program that shows bitwise OR of two numbers

import java.util.Scanner;

public class Challenge22 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Welcome to the Bitwise OR of two numbers");
        System.out.print("Enter the first number: ");
        int num1=input.nextInt();
        System.out.print("Enter the second number: ");
        int num2=input.nextInt();

        int result =num1 | num2;
        System.out.println("The result of bitwise or is: "+result);

    }
}

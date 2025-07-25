//Create a program that shows bitwise XOR of two numbers.


import java.util.Scanner;
public class Challenge23 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);

        System.out.println("Welcome to the bitwise XOR ");

        System.out.print("Enter the first value: ");
        int num1=input.nextInt();
        System.out.print("Enter the second value: ");
        int num2=input.nextInt();

        int result = num1 ^ num2;
        System.out.println("The Bitwise XOR is: "+result);
    }
}

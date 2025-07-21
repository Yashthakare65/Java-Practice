//9.Create a program to calculate product of 
//two floating points numbers.


import java.util.Scanner;

public class Challenge9 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("Welcome to Floating values product calculator");

        System.out.print("Enter the First Floating value:- ");
        double num1=input.nextDouble();

        System.out.print("Enter the Second Floating value:- ");
        double num2=input.nextDouble();

        System.out.println("The product of two Floating value is "+(num1*num2));
    }
    
}

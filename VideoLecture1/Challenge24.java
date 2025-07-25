//Create a program that shows bitwise compliment of a number.


import java.util.Scanner;

public class Challenge24 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Welcome to the bitwise compliment");
        System.out.print("Enter the number: ");
        int num=input.nextInt();

        int result = ~num;
        System.out.println("The bitwise compliment is: "+result);
    }
}

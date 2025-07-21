//7.Create a program to swap two numbers.


import java.util.Scanner;

public class Challenge7{
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("Welcome to Number Swaper");
        System.out.print("Enter the First number:- ");
        int num1=input.nextInt();
        System.out.print("Enter the Second number:- ");
        int num2=input.nextInt();
        System.out.println();

        System.out.println("Before swap:-");
        System.out.println("First="+num1+" and Second="+num2+"\n");
        int temp;

        //Swap logic
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swap:-");
        System.out.println("First="+num1+" and Second="+num2);


    }
}
//6.Create a program to add two numbers.


import java.util.Scanner;
public class Challenge6 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number:- ");
        int num1=sc.nextInt();

        System.out.print("Enter the Second Number:- ");
        int num2=sc.nextInt();

        System.out.println("The Sum of "+num1+" and " +num2+" is = "+(num1+num2));

    }
}

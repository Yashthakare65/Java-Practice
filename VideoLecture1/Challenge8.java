//8.Create a program that takes a two numbers and shows result
// of all arithematic operators.


import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args){
        System.out.println("Welcome to Calculator");

        Scanner input=new Scanner(System.in);

        System.out.print("Enter the First Number:- ");
        int num1=input.nextInt();

        System.out.print("Enter the Second Number:- ");
        int num2=input.nextInt();

        System.out.println();

        System.out.println("The addition of "+num1+" and the "+num2+" is "+(num1+num2));
        System.out.println("The subtraction of "+num1+" and the "+num2+" is "+(num1-num2));
        System.out.println("The multiplication of "+num1+" and the "+num2+" is "+(num1*num2));
        System.out.println("The division of "+num1+" and the "+num2+" is "+(num1/num2));
        System.out.println("The modulo of "+num1+" and the "+num2+" is "+(num1%num2));
    }
}

//Create a program that shows bitwise AND of two numbers.



import java.util.Scanner;

public class Challenge21 {
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       
       System.out.println("Welcome to bitwise and(&) of two numbers");
       System.out.print("Enter the first number: ");
       int num1=input.nextInt();
       System.out.print("Enter the second numbe: ");
       int num2=input.nextInt();

       int result= num1 & num2;
        System.out.println("The Bitwise AND of both number is: "+result);
    }
}

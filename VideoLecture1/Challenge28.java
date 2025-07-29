//Develop a program that prints the multiplication table for a given number
//here we implement a function for this.

import java.util.Scanner;
public class Challenge28{
    public static void main(String[] args){
         Scanner input=new Scanner(System.in);

         System.out.println("Welcome,here you get multiplication table");
         System.out.print("Enter the number which table you want to see: ");
         int value=input.nextInt();
        multitable(value);
    }
    public static void multitable(int value){
        int num=value;
        int i=1;
        while(i<=10){
            System.out.println(num+" X "+i+ " = "+num*i);
            i++;
        }
    }
}
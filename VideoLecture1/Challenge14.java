//14.Create a program to convert Fahrenheit to Celsius
//C=(f-32)x5/9


import java.util.Scanner;
public class Challenge14 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Welcome to the F to C Converter");

        System.out.print("Enter the value of the Fahrenheit= ");
        float fah=input.nextFloat();

        float celsius=(fah-32)*5/9;

        System.out.println("The Fahrenheit which is "+fah+" is equal to the "+celsius+" Celsius.");
    }
    
}

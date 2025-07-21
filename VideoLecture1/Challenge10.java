//10.Create a program to calculate perimeter of a rectangle.
//Perimeter of the rectangle ABCD=A+B+C+D       

import java.util.Scanner;

public class Challenge10 {
    public static void main (String[] args){

        Scanner input=new Scanner (System.in);

        System.out.println("Welcome to the Rectangle Perimeter Calculator");

        System.out.print("Enter the value of side A:- ");
        float s1=input.nextFloat();
        System.out.print("Enter the value of side B:- ");
        float s2=input.nextFloat();
        System.out.print("Enter the value of side C:- ");
        float s3=input.nextFloat();
        System.out.print("Enter the value of side D:- ");
        float s4=input.nextFloat();

        System.out.println();

       double peri=s1+s2+s3+s4;

       System.out.println("The perimeter of the rectangle = "+peri);

    }
    
}

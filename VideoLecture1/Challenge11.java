//11.Create a program to calculate the area of a triangle
//Area of triangle=1/2*B*H

import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Welcome to Area of traingle Calculator\n");

        System.out.print("Enter the Base of the triangle:- ");
        float base=input.nextFloat();

        System.out.print("Enter the Height of the triangle:- ");
        float height=input.nextFloat();

        double Area=0.5*base*height;

        System.out.println("The Area of triangle= "+Area);

    }
    
}

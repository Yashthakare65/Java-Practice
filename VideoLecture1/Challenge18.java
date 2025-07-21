//Create a program that determines if a given year is leap year

import java.util.Scanner;

public class Challenge18 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("Wellcome");
        System.out.println("This code tell's you the leap year...");

        System.out.print("Enter the year= ");
        int year=input.nextInt();

        if(year%400==0 || (year%4==0 && year%100!=0)){ 
            System.out.println("This is a leap year");
        } else{
            System.out.println("This is not a leap year");
        }

    }
}

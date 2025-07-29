//Create a program that sum all odd numbers from 1 to a specified number N
//here we implement function


import java.util.Scanner;

public class Challenge29 {
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the odd sum");
        System.out.print("Enter the number upto you want the sum of odd number: ");
        int num=input.nextInt();
        int oddvalue =oddsum(num);
        System.out.println("The sum of all odd number upto "+num+" is "+oddvalue);

    }
    public static int oddsum(int num){
        int i=1;
        int oddvalue=0;
        while(i<=num){
           if(i % 2 != 0){
            oddvalue += i;
           } 
           i++;
        }
        return oddvalue;
    }
}

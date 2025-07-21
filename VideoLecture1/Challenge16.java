//Create a program that determines if a number is odd or even. 


import java.util.Scanner;

public class Challenge16 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("WELLCOME");
        System.out.println("This code tells you the number is odd or even");
        System.out.print("Enter any number= ");
        Float num=input.nextFloat();

        if(num%2==0){
            System.out.println("your number is even");
        }else{
            System.out.println("your number is odd");
        }

    }
    
}

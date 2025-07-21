//15.Create program that determines if a number is 
//postive ,negative or zero.


import java.util.Scanner;

public class Challenge15 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("WELCOME SIR/MADAM!!!");
        System.out.println("We tell you which type of number you entered(+,-,N)");
        System.out.print("Enter any Number= ");
        Float num=input.nextFloat();

        if(num>0){
            System.out.println("Your number is positive");
        }
        if(num<0){
            System.out.println("Your number is negative");
        }
        if(num==0){
            System.out.println("Your number is zero");
        }

        // if (num > 0) {
        //     System.out.println("Your number is positive");
        // } else if (num == 0) {
        //     System.out.println("Your number is zero");
        // } else {
        //     System.out.println("Your number is negative");
        // }
        
        
    }
    
}

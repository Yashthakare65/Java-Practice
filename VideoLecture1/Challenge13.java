//13.Create a program to calaculate Compound interest
//compound interest=P(1+R/100)T


import java.util.Scanner;

public class Challenge13 {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);

        System.out.println("Welcome to Compound interest calculator");

        System.out.print("Enter the value of the Principal= ");
        float principal=input.nextFloat();
        System.out.print("Enter the value of the rate= ");
        float rate=input.nextFloat();
        System.out.print("Enter the value of the Time period= ");
        float time=input.nextFloat();

        double CompoundInterest =principal* Math.pow((1+rate/100),time);

        System.out.println("The compound interest is = "+CompoundInterest);

    }
}

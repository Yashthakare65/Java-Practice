//12.Create a program to calculate simple interest
//simple interset = (PxTxR)/100


import java.util.Scanner;
public class Challenge12 {
    public static void main(String[] args){
       
        Scanner input=new Scanner(System.in);

        System.out.println("Welcome to simple interest calculator");

        System.out.print("Enter the value of principal= ");
        float principal=input.nextFloat();
        System.out.print("Enter the value of the Rate of Interest= ");
        float rate=input.nextFloat();
        System.out.print("Enter the value of the Time period= ");
        float time=input.nextFloat();


       double simpleinterest=(principal*rate*time)/100;

       System.out.println("The Simple Interest is "+simpleinterest);

    }
}

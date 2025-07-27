//Create a program that shows the use of left shift operator.

import java.util.Scanner;

public class Challenge25 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Welcome to the left shift");
        System.out.print("Enter the shift value: ");
        int shiftno=input.nextInt();
        System.out.print("Enter the value which you want to shift: ");
        int num=input.nextInt();

        int result = num << shiftno;
        System.out.println("If the given value is shift by "+shiftno+" the we get the "+result+" as a result.");
        
    }
}

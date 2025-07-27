//Create a program that shows use of right shift operator.

import java.util.Scanner;

public class Challenge26 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        System.out.println("Welcome to the right shift");
        System.out.print("Enter the value of Shift: ");
        int shiftno=input.nextInt();
        System.out.print("Enter the value which you want to shift: ");
        int value=input.nextInt();

        int result=value >> shiftno;
        System.out.println("when we shift the number by "+shiftno+" then we get result as "+result);
    }
}

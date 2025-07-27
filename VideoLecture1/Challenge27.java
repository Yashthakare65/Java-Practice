//write a program to check if a given number is even or odd 
//using bitwise operators.

// Every integer in binary ends with either a 0 or 1.
// - If the least significant bit (LSB) is 0, the number is even.
// - If it's 1, the number is odd.


import java.util.Scanner;
public class Challenge27 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Welcome to the even odd checker");
        System.out.print("Enter the value: ");
        int num=input.nextInt();

        if((num & 1) == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
    
}

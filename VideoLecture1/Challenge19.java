//Create a program that calculates grades based on marks.

import java.util.Scanner;
public class Challenge19 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("WELLCOME");
        System.out.println("This tell's your grade");

        System.out.print("Enter your marks= ");
        float marks=input.nextFloat();

        if(marks>=90){
            System.out.println("you got- A GRADE");
        }else if(marks>=75){
            System.out.println("you got- B GRADE");
        }else if(marks>=60){
            System.out.println("you got- C GRADE");
        }else if(marks>=30){
            System.out.println("you got- C GRADE");
        }else{
            System.out.println("FAIL!!!");
        }
    }
}

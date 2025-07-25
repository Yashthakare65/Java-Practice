//create a program that categorize a persion into different age groups
//child>below13,teen>below20,adult>below60,senior>above60

import java.util.Scanner;

public class Challenge20{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Welcome");
        System.out.print("please enter your age here: ");
        int age=input.nextInt();

        if(age>0){
            if(age<=13){
                System.out.println("You came in the child category");
            }else if(age<=20){
                System.out.println("You came in the teen category");
            }else if(age<=60){
                System.out.println("You came in adult category");
            }else{
                System.out.println("You came in senior category");
            }
        }else{
            System.out.println("Enter the valid age");
        }
    }
}
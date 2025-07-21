// 5.Create a program to input name of the person and
// respond with "Welcome NAME to KG Coding"


import java.util.Scanner;
public class Challenge5 {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Your Name:- ");
    String name=input.nextLine();
    System.out.println("Welcome "+name+" To KG Coding");
    }
}

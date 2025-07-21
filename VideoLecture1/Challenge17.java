//17.Create a program that determines the greatest of the three numbers.


import java.util.Scanner;
public class Challenge17 {
    public static void main(String[] args){

    Scanner input=new Scanner(System.in);

    System.out.println("WELLCOME");

    System.out.println("These code tell's you greatest of three");
    System.out.print("Enter The First Number= ");
    float num1=input.nextFloat();
    System.out.print("Enter The second Number= ");
    float num2=input.nextFloat();
    System.out.print("Enter the Third Value= ");
    float num3=input.nextFloat();

    if(num1>num2 && num1>num3){
        System.out.println("The First number "+num1+" is greater than "+num2+" & "+num3);
    }else if(num2>num3){
        System.out.println("The Second number "+num2+" is greater than "+num1+" & "+num3);
    }else if(num3>num1 && num3>num2){
        System.out.println("The Third number "+num3+" is grater than "+num1+" & "+num2);
    }else{
        System.out.println("All given values are equal...");
    }

    }
}

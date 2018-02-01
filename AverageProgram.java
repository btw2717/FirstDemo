import java.util.Scanner;
public class AverageProgram{

public static void main(String[]args){

Scanner keyboard=new Scanner(System.in);
System.out.println("This program calculates the average of 3 numbers.");

System.out.println("Enter a number.");

int num1=keyboard.nextInt();
System.out.println("Enter a number.");
int num2=keyboard.nextInt();
System.out.println("Enter a number.");
int num3=keyboard.nextInt();

double  average = ((double)(num1+num2+num3));
 average = average/3;
  System.out.println("The average is"+average);
 
//Make code to find average
//This is a test change to the program to push to your repository from Brady Wiser, to see what happens.



}

}

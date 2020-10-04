//*08.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.*//

import java.util.Scanner;
class SI{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the principal amount");
  int p=sc.nextInt();
  System.out.println("Enter the rate of interest");
  float r=sc.nextFloat();
  System.out.println("Enter the time period");
  float t=sc.nextFloat();
  float sim=(p*r*t)/100;
  System.out.println("Simple Interest is "+sim);
  }
 }
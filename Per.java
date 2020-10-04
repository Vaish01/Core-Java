//*07.	Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. *//
//*Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.*//
import java.util.Scanner;
class Per{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the value of m1 subject");
 float m1=sc.nextFloat();
 System.out.println("Enter the value of m2 subject");
 float m2=sc.nextFloat();
 System.out.println("Enter the value of m3 subject");
 float m3=sc.nextFloat();
 System.out.println("Enter the value of m4 subject");
 float m4=sc.nextFloat();
 System.out.println("Enter the value of m5 subject");
 float m5=sc.nextFloat();
 float per=((m1+m2+m3+m4+m5)/500)*100;
 System.out.println("percentage marks ="+" "+per+" "+"%");
 }
}
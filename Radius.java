//*06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.*//
import java.util.Scanner;
class Radius{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter value of radius");
	 float radius=sc.nextFloat();
	 final float pi=3.14f;
	 float area=pi * radius *radius;
	 float cir=2*pi*radius;
	 System.out.println("Area is"+" "+area);
	 System.out.println("Circumference is"+" "+cir);
	 }
	}
	 
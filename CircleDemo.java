//Q34. Create a class Circle that has two data members, one to store the radius and another to store area and three methods first init() method to input radius from user,// 
//second calculateArea() method to calculate area of circle and third display() method to display values of radius and area. Create class CircleDemo ( main class) that creates //
//the Circle object and calls init(), calculateArea() and display() methods.//

import java.util.Scanner;
class Circle{
     private float rad;
	 private float area;
	 final  float pi = 3.14f;
	 void init(){
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the value of radius");
	   float rad=sc.nextFloat();
	   this.rad=rad;
	   }
	 float calculateArea(){
	    area = pi*rad;
	
		return area;
	 }
	  void display(){
	     System.out.println("Radius= "+rad+"Area= "+area);
		}
		
	}
	
class CircleDemo{
      public static void main(String args[]){
	     Circle c=new Circle();
		  c.init();
		  c.calculateArea();
		  c.display();
		  }
	}
	    
	   
	  
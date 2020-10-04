//*Q33. Write a program to demonstrate functionalities of this keyword in java.*//

class Employee{
  private int empId;
  private String empName;
   void set(int empId,String empName){
      this.empId=empId;
      this.empName=empName;
     }
   void show(){
      System.out.println(empId+" "+empName);
    }
}
class EmpDemo{
   public static void main(String args[]){
      Employee e =new Employee();
	  e.set(101,"ram");
	  e.show();
	  }
}

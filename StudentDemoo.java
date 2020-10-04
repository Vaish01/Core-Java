//Q32. Modify the above program (no. 30) to count the no of Student objects created.//
//[ In this program static variable is required ]//


class Student{
   private int rNo;
   private String Name;
   private static int count;
   void setData(int roll,String name,int c){
        rNo=roll;
		Name=name;
		count=c;
	}
	void showData(){
	    System.out.println(rNo+" "+Name+" "+count);
	}
}
class StudentDemoo{
   public static void main(String args[]){
        Student s =new Student();
		s.setData(112,"Vaishnavi",1);
		s.showData();
		Student s1=new Student();
		s1.setData(101,"ram",2);
		s1.showData();
		s.showData();
		}
	}
		
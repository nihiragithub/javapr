import java.util.Scanner;
class Student
{
      String name;
      int roll;
      int marks[];
      float per;
      void input()
      {    
           int i;
           Scanner scan=new Scanner(System.in);
           System.out.println("enter the name");
           name=scan.nextLine();
           System.out.println("enter the roll");
           roll=scan.nextInt();
	   System.out.println("enter the marks");
           marks=new int[5];
           for(i=0;i<5;i++)
           {
                marks[i]=scan.nextInt();
           }
      }
      void calPercent()
      {
           //System.out.println("calPercent method is called");
            int i,total=0;
            for(i=0;i<5;i++)
            {
                  total=total+marks[i];
            }
            per=(float)(total/500.0)*100;
            per=(total/500.0f)*100;
      }
      void display()
      {
            System.out.println(name);
            System.out.println(roll);
           // System.out.println(marks);
	    System.out.println(per);
      }
      public static void main(String args[])
      {
            Student sobj1=new Student();
            sobj1.input();
            sobj1.calPercent();
            sobj1.display();
      }
}
            

      
           

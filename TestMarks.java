import java.util.Scanner;
class MarkList
{
     String sub1,sub2,sub3;
     float m1,m2,m3,avg;
     MarkList()
     {
         sub1="Physics";
         sub2="Chemistry";
         sub3="Biology";
         m1=85;
         m2=78;
         m3=92;
         System.out.println("SUB1="+sub1+"  "+"MARKS="+m1);
         System.out.println("SUB2="+sub2+"  "+"MARKS="+m2);
         System.out.println("SUB3="+sub3+"  "+"MARKS="+m3);
     }
     float average()
     {
         avg=(float)((m1+m2+m3)/3.0);
         return avg;
     
     }
}
class Student 
{
    String name;
    int roll;
    MarkList marks;
    void inputDetails()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the name of student");
        name=scan.nextLine();
        System.out.println("enter the roll of student");
        roll=scan.nextInt();
       
      
    }
    void outputDetails()
    {
        System.out.println("details of the student:"); 
        System.out.println("NAME :"+name);
        System.out.println("ROLL :"+roll);
        marks=new MarkList();
        System.out.println("AVERAGE :"+marks.average());
    }
}
class TestMarks
{
    public static void main(String args[])
    {
         Student s1=new Student();
         s1.inputDetails();
         s1.outputDetails();
    }
}



     
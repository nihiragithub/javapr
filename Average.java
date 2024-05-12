import java.util.Scanner;
class Average
{
      byte a,b,c;
      float avg;
      void input()
      {    
           Scanner scan=new Scanner(System.in);
           System.out.println("enter the first number");
           a=scan.nextByte();
           System.out.println("enter the second number");
           b=scan.nextByte();
	   System.out.println("enter the third number");
           c=scan.nextByte();
      }
      void calAvg()
      {
           avg=(float)((a+b+c)/3.0);
           System.out.println("the average of the three numbers is ="+avg);
      }
      public static void main(String args[])
      {
            Average aobj1=new Average();
            aobj1.input();
            aobj1.calAvg();
      }
}
           
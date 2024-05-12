import java.util.Scanner;
import java.lang.Math;
class Compound
{
      double principal,rate,maturityamt;
      int t;
      void input()
      {    
           
           Scanner scan=new Scanner(System.in);
           System.out.println("enter the principal amount");
           principal=scan.nextDouble();
           System.out.println("enter the rate of interest");
           rate=scan.nextDouble();
           System.out.println("enter the time");
           t=scan.nextInt();
           
      }
      void calcompound()
      {
           maturityamt=principal*Math.pow((1+(rate/100)),t)*t;
      }
      void display()
      {
            
            System.out.println("maturity amount calculated is="+maturityamt);
      }
       public static void main(String args[])
      {
            Compound cobj1=new Compound();
            cobj1.input();
            cobj1.calcompound();
            cobj1.display();
      }
}
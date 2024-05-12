import java.util.Scanner;
class Price
{
      float salepr,dis,finalpr;
      void input()
      {    
           
           Scanner scan=new Scanner(System.in);
           System.out.println("enter the saleing price");
           salepr=scan.nextFloat();
           System.out.println("enter the discount given");
           dis=scan.nextFloat();
      }
      void calFinalpr()
      {
           finalpr=(float)salepr-(salepr*(dis/100));
      }
      void display()
      {
            System.out.println("final price calculated is="+finalpr);
      }
      public static void main(String args[])
      {
            Price pobj1=new Price();
            pobj1.input();
            pobj1. calFinalpr();
            pobj1.display();
      }
}
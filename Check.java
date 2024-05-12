import java.util.Scanner;
class Check
{
    float n;
    void input()
    {
           Scanner scan=new Scanner(System.in);
           System.out.println("enter the number to check");
           n=scan.nextFloat();
    }
    void checkPos()
    {
          if(n>=0.0)
             System.out.println("the number is positive");
          else
             System.out.println("the number is negative"); 
    }
    void checkWhole()
    {
          
          if((n-(int)n)==0)
             System.out.println("the number is a whole number");   
          else
             System.out.println("the number is a floating number"); 
    }
    public static void main(String args[])
    {
           Check cobj1=new Check();
            cobj1.input();
            cobj1.checkPos();
            cobj1.checkWhole();
    }
}
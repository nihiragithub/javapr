import java.util.Scanner;
class IllegalTriangleException extends Exception
{
     String msg;
     IllegalTriangleException()
     {
         msg="IllegalTriangleException";
     }
     IllegalTriangleException(String msg)
     {
         this.msg=msg;
     }
}
class Triangle
{
     int s1,s2,s3;
     Triangle(int s1,int s2,int s3)
     {
         this.s1=s1;
         this.s2=s2;
         this.s3=s3;
         try{
         if((s1+s2)<s3||(s1+s2)==s3)
         {
             IllegalTriangleException ite =new IllegalTriangleException("IllegalTriangleException");
             throw ite;
         }
         else if((s2+s3)<s1||(s2+s3)==s1) 
         {
              IllegalTriangleException ite1 =new IllegalTriangleException("IllegalTriangleException"); 
              throw ite1;
         }
         else if((s1+s3)<s2||(s1+s3)==s2) 
         {
             IllegalTriangleException ite2 =new IllegalTriangleException("IllegalTriangleException"); 
             throw ite2;
         }
         else
         {
             System.out.println("triangle adheres the rule");
         }
       }
       catch( IllegalTriangleException ite){
          System.out.println(ite);
       }
    }
}
class TestTriExp
{
    public static void main(String args[])
    {
         int s1,s2,s3;
         Scanner scan=new Scanner(System .in);
         System.out.println("enter the side 1");
         s1=scan.nextInt();
         System.out.println("enter the side 2");
         s2=scan.nextInt();
         System.out.println("enter the side 3");
         s3=scan.nextInt();
         Triangle tri = new Triangle(s1,s2,s3);
    }
}
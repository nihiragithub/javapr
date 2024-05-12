  import java.util.Scanner;
class PrimePerf
{
      int l,u,i,j,sum,flag;
      void input()
	{
           Scanner scan=new Scanner(System.in);
           System.out.println("enter the lower limit of the range ");
           l=scan.nextInt();
           System.out.println("enter the upper limit of the range");
           u=scan.nextInt();
      }
      void findPrime()
      {
           System.out.println("the prime numbers are=");
           for(i=l;i<=u;i++)
           {
                if(i==1||i==0)
                   continue;
                flag=1;
                for (j = 2; j <= i / 2; ++j) 
                {
                     if (i % j == 0) 
                     {
                         flag = 0;
                         break;
                     }
                }
                 if (flag == 1)
                    System.out.println(+i);
           }
      }
      void perfectnum()
      {
           System.out.println("perfect numbers are=");
           for(i=l;i<=u;i++)
           {
                sum=0;
                for(j=1;j<i;j++)
                {
                      if(i % j==0)
                      {
                         sum=sum+j;
                      }
                }
                if(sum==i)
                {
                       System.out.println(+i);
                }
            }
       }
       public static void main(String args[])
	{
            PrimePerf p1obj1=new PrimePerf();
            p1obj1.input();
            p1obj1.perfectnum();
            p1obj1.findPrime();
      
	}
}

      
   

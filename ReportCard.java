import java.util.Scanner;
class ReportCard
{
      int tm[],pm[];
      String name,sub[];
      int rno,i,total;
      float p;
      void input()
      {
           Scanner scan=new Scanner(System.in);
           System.out.println("enter the name of student ");
           name=scan.nextLine();
          System.out.println("enter the roll no of the student ");
           rno=scan.nextInt();
           System.out.println("enter the name of subjects");
           sub=new String[5];
           sub[i]=scan.nextLine();
           for(i=0;i<5;i++)
           {
                sub[i]=scan.nextLine();
           }
           System.out.println("enter the marks of theory subjects" );
           tm=new int[5];
           for(i=0;i<5;i++)
           {
                tm[i]=scan.nextInt();
           }
           System.out.println("enter the marks of practical subjects" );
           pm=new int[5];
           for(i=0;i<5;i++)
           {
                pm[i]=scan.nextInt();
           }
           
      }
     void grade()
      {
            for(i=0;i<5;i++)
            {
                total=total+tm[i]+pm[i];
               // p=(float)(total/500.0)*100;
            }
            System.out.println("total marks="+total);
            p=(float)(total/500.0)*100;
            System.out.println("percentage:"+p);
            if(p<33)
               System.out.println("fail");
           else if(p>=33 && p<48)
               System.out.println("third division");
           else if(p>=48 && p<59)
                System.out.println("second division");
           else if(p>=60)
                System.out.println("first division ");
           else if(p>=75)
                System.out.println("distinction ");
          
      }
      void display()
      {
          System.out.println("name : "+name);
          System.out.println("roll no: "+rno);
          System.out.println("SUBJECTS----MARKS(theory)----MARKS(practical)");
          for(i=0;i<5;i++)
          {
              System.out.println(sub[i]+"----"+tm[i]+"----"+pm[i]);
               
          }
           System.out.println("maximum marks=500");
           //System.out.println("total marks="+total);
      }
                                                  
      public static void main(String args[])
      {
            ReportCard robj1=new ReportCard();
            robj1.input();
            robj1.display();
            robj1.grade();
      
      }
}
      
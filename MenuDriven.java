import java.util.Scanner;
class MenuDriven
{
       int arr[][]=new int[3][3];
       int temp[][]=new int[1][1];
       int sumRow,sumCol,mr,mc,i,j,pc,pr;
       void input()
       {
           Scanner scan=new Scanner(System.in);
           System.out.println("enter the elements of the matrix");
           for(i=0;i<3;i++)
           {
                for(j=0;j<3;j++)
                {

                     arr[i][j]=scan.nextInt();
                }
           }
           for(int i = 0; i < 3; i++)
            {       
               for(int j = 0; j < 3; j++)
               {    
                    System.out.print(arr[i][j]+"\t");
               }
               System.out.println();
            }
           
       }
       void addition()
       {
           for(int i = 0; i < 3; i++)
           {    
              sumRow = 0;    
              for(int j = 0; j < 3; j++)
              {    
                 sumRow = sumRow + arr[i][j];    
              }
              System.out.println("Sum of a row: " + sumRow);  
           }      
           for(int i = 0; i < 3; i++)
           {    
              sumCol = 0;    
              for(int j = 0; j < 3; j++)
              {    
                 sumCol = sumCol + arr[j][i];    
              }  
              System.out.println("Sum of a column: " + sumCol);      
           }
       }
       void subtraction()
       {
           for(int i = 0; i < 3; i++)
           {    
              mr = 0;    
              for(int j = 0; j < 3; j++)
              {    
                 mr = mr- arr[i][j];    
              }
              System.out.println("difference of a row: " + mr); 
           }      
           for(int i = 0; i < 3; i++)
           {    
              mc = 0;    
              for(int j = 0; j < 3; j++)
              {    
                 mc= mc- arr[j][i];    
              } 
             System.out.println("difference of a column: " + mc);       
           }
        }
        void multiplication()
        {
           for(int i = 0; i < 3; i++)
           {    
              pr = 1;    
              for(int j = 0; j < 3; j++)
              {    
                 pr = pr * arr[i][j];    
              }
              System.out.println("product of a row: " + pr);   
           }       
           for(int i = 0; i < 3; i++)
           {    
              pc = 1;    
              for(int j = 0; j < 3; j++)
              {    
                 pc = pc *arr[j][i];    
              }  
              System.out.println("product of a column: " +pc);      
           }
        }
        void transpose()
        {
            temp[0][0]=arr[0][1];
            arr[0][1]=arr[1][0];
            arr[1][0]= temp[0][0];
            temp[0][0]=arr[0][2];
            arr[0][2]=arr[2][0];
            arr[2][0]=temp[0][0];
            temp[0][0]=arr[1][2];
            arr[1][2]=arr[2][1];
            arr[2][1]=temp[0][0];
           
            System.out.println("the transpose of the matrix=");
            for(int i = 0; i < 3; i++)
            {       
               for(int j = 0; j < 3; j++)
               {    
                    System.out.print(arr[i][j]+"\t");
               }
               System.out.println();
            }
         }
        public static void main(String args[])
       {  
          Scanner scan=new Scanner(System.in); 
          int ch;
          MenuDriven mobj1=new MenuDriven();
          mobj1.input();
          do
          {
            System.out.println("menu:");
            System.out.println("1.addition\n2.subtraction\n3.multiplication\n4.transposition");
            System.out.println("enter your choice");
            ch=scan.nextInt();
            switch(ch)
            {
                   case 1: 
                           mobj1.addition();
                           break;
                   case 2: 
                           mobj1.subtraction();
                           break;
                   case 3: 
                           mobj1.multiplication();
                           break;
                   case 4: 
                           mobj1.transpose();
                           break;
            }
          }while(ch>=1&&ch<=4);  
        }
}
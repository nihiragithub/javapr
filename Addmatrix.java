import java.util.Scanner;
class Addmatrix
{
       int arr[][]=new int[3][4];
       int sumRow,sumCol,i,j,sr,sc;
       void input()
       {
           Scanner scan=new Scanner(System.in);
           System.out.println("enter the elements of the matrix");
           for(i=0;i<3;i++)
           {
                for(j=0;j<4;j++)
                {

                     arr[i][j]=scan.nextInt();
                }
           }
       }
       void addition()
       {
           for(int i = 0; i < 3; i++)
           {    
              sumRow = 0;    
              for(int j = 0; j < 4; j++)
              {    
                 sumRow = sumRow + arr[i][j];
                       
              }
              System.out.println("Sum of a row: " + sumRow);   
           }     
           for(int i = 0; i < 4; i++)
           {    
              sumCol = 0;    
              for(int j = 0; j < 3; j++)
              {    
                 sumCol = sumCol + arr[j][i];   
              }
              System.out.println("Sum of a column: " + sumCol);         
           }
           for(i=0;i<3;i++)
           {
                 sr=sr+sumRow;
           }
           System.out.println("Sum of all the rows in matrix: " + sr); 
           for(j=0;j<4;j++)
           {
                 sc=sc+sumCol;
           }
           System.out.println("Sum of all the coloumns in matrix: " + sc); 
       }
           
       public static void main(String args[])
       {
            Addmatrix a1obj1=new Addmatrix();
            a1obj1.input();
            a1obj1.addition();
      
       }  
}  
        
       
import java.util.Scanner;
class Diagonal
{
       int arr[][]=new int[3][3];
       int i,j;
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
       }
       void findDiagonal()
       {
           for(i=0;i<3;i++)
           {
                for(j=0;j<3;j++)
                {
                    if((arr[i][j]==arr[0][0])||(arr[i][j]==arr[1][1])||(arr[i][j]==arr[2][2]))
                    {
                        System.out.println("diagonal element= "+arr[i][j]);
                    }
                      
                }
           }
        }
       public static void main(String args[])
       {
            Diagonal d1obj1=new Diagonal();
            d1obj1.input();
            d1obj1.findDiagonal();
      
       }  
}
                   
import java.util.Scanner;
interface Shape
{
     float PI=3.14f;
     void draw();
     void calArea();
}
class Rectangle implements Shape
{
     float  l,b;
     Rectangle()
     {
         l=b=10.0f;
     }
     Rectangle(float l,float b)
     {
          this.l=l;
          this.b=b;
     }
     public void draw()
     {
          System.out.println("Rectangle drawn using l and b");
     }
     public void calArea()
     {
          System.out.println("Area="+(l*b));
     }
}
class Circle implements Shape
{
     float r;
     Circle()
     {
         r=1.0f;
     }
     Circle(float r)
     {
         this.r=r;
     }
      public void draw()
     {
          System.out.println("Circle drawn using r");
     }
     public void calArea()
     {
          float area=PI*r*r;
          System.out.println("Area="+area);
     }
}
class TestShape
{
      public static void main(String[] args) 
      {
           Shape ref;
          ref=new Rectangle (10,12);
          ref.draw();
          ref.calArea();
          
          Circle c1=new Circle(7.0f);
          ref=c1;
          ref.draw();
          ref.calArea();
         
      }
}
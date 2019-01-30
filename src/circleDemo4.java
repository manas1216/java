import java.util.*;
class Circle
{
	double area,radius,circum,r;
	void area()
	{area=3.14*radius*radius;
	}
	void circumference()
	{ circum=2*3.14*radius;}
	void display()
	{System.out.println("Area is :"+area);
     System.out.println("Circumference is:"+circum);}
     Circle()
     {radius=1;}
     Circle(double radius)
{ this.radius=radius;}}
class circleDemo4
{public static void main(String args[])
{ Scanner s1 = new Scanner(System.in);
  Circle c1 = new Circle();
 c1.area();
 c1.circumference();
 c1.display();
 int r =s1.nextInt();
 Circle c2 = new Circle(r);
 c2.area();
 c2.circumference();
 c2.display();
}}
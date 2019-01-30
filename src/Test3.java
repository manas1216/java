import java.util.*;
interface GeometricObject
{
	double getPerimeter();
	double getArea();
}
interface Resizable
{
	public double resize(int percent);
}
class Circle implements GeometricObject
{
	double radius=1.0;
	public Circle(double radius)
	{
	this.radius=radius;
	}
	public double getPerimeter(double radius)
	{
	double Perimeter=2*3.14*radius;
	return Perimeter;
	}
	public double getArea(double radius)
	{
	double Area=3.14*radius*radius;
	return Area;
	}
}
class ResizableCirle extends Circle implements Resizable
{
Scanner s1=new Scanner(System.in);
public ResizableCirle(double radius)
{
	super(radius);}
}
	public double resize(int percent)
	{
     System.out.println("Enter the percent to be resized");
     int a=s1.nextInt();
     double radius1=radius-(radius*a)/100;
     System.out.println("The new radius="+radius1);
     return radius1;
	}
}
class Test3
{
	public static void main(String args[])
	{
	Circle c1=new Circle();
	ResizableCircle c2=new ResizableCircle();
	System.out.println("The perimeter is"+c1.getPerimeter(1.0));
	System.out.println("The area is"+c1.getArea(1.0));
	c2.resize(1.0);
	}
}


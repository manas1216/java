class circle {
	private double radius;
	double area;
	public void setRadius()
	{ radius=5;}
	public void getRadius()
	{System.out.println(radius);}
	public void findarea()
	{area=3.14*radius*radius;
	}
	public void displayarea()
	{System.out.print("Area of circle is:"+area);}
}
class circledemo6
{public static void main(String args[])
{ circle c=new circle();
c.setRadius();
c.getRadius();
c.findarea();
c.displayarea();}}
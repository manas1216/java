class CircleStatic {
	private double radius;
	private static int numberofobjects=0;
	public void setradius(double a)
	{radius=a;
	numberofobjects++;}
	public double getradius()
	{return radius;}
	public static int getnumberofobjects()
	{return numberofobjects;}
	public void findarea()
	{double area;
	area=3.14*radius*radius;
	}}
	public class TestCircleStatic {
	public static void main(String args[]){
	CircleStatic c1 =new CircleStatic();
	System.out.print("circle1 information");
	c1.setradius(5);
	System.out.print("circle1 radius:"+c1.getradius());
	System.out.println("the number of objects:"+
	CircleStatic.getnumberofobjects());
	CircleStatic c2 = new CircleStatic();
	c1.findarea();
	c2.setradius(9);
	System.out.print("circle2 radius:"+c2.getradius());
	System.out.println("the number of objects:"+
	CircleStatic.getnumberofobjects());
	c2.findarea();



	
	}
}
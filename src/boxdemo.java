import java.util.*;
class box 
{
	double width,w;
	double height,h;
	double depth,d;

	void setdim()
	{
		w=width;
		h=height;
		d=depth;
	}
	double volume()
	{
		return w*h*d;
	}
}
class boxdemo
{
	public static void main(String args[])
	{
		double vol;
		Scanner Input=new Scanner(System.in);
		box b1=new box();
		box b2=new box();
		b1.width=Input.nextInt();
		b1.height=Input.nextInt();
		b1.depth=Input.nextInt();
		b1.setdim();
		vol=b1.volume();
		System.out.print("Volume is:" +vol);
	}
}
	

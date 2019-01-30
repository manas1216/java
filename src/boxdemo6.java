
class box 
{
	double width,w;
	double height,h;
	double depth,d;

	box(double w,double h,double d)
	{
		this.width=w;
		this.height=h;
		this.depth=d;
	}
	double volume()
	{
		return width*height*depth;
	}
}
class boxdemo6
{
	public static void main(String args[])
	{
		double vol;
		box box3=new box(12,34,67);
		vol=box3.volume();
		System.out.println(vol);

	}
}
	

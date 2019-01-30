class Box
{ double width,w;
double height,h;
double depth,d;
Box(double width,double h,double d)
{ this.width=width;
this.height =h;
this.depth=d;}
double volume()
{return width*height*depth;}
}
class BoxDemo2
{ public static void main(String args[])
{double vol;
Box b1= new Box(3,6,9);
vol=b1.volume();
System.out.println("volume is"+vol);
}}
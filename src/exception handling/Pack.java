class Pack
{
public void display()
{
	System.out.print("Message is displayed");
}	
}
class Pack
{
	public static void main(String[]args)
	{
	Pack p1=new Pack();
	p1=null;
	try
	{
	p1.display();
	}catch(NullPointerException e){System.out.println(e);}
	}
}

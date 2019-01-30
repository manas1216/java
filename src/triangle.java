import java.util.*;

public class triangle
{
public static void main(String args[])
{ int r, i, k, number=1, j;
  Scanner s1 = new Scanner(System.in);		
  System.out.print("Enter Number of Rows : ");
  r = s1.nextInt();		
  for(i=0;i<r;i++)
  {
    for(k=r; k>i; k--)
{
	System.out.print(" ");
			}
     number = 1;
  for(j=0;j<=i;j++)
{
  System.out.print(number+ " ");
  number = number * (i - j) / (j + 1);
	}
System.out.println();
		}
	}
}
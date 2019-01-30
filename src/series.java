'import java.util.*;
class series
{ 
public static int fact(int index)
    {
        int f = 1, i;
        for(i = 1; i <= index; i ++)
        {
        f = f*i;
        }
        return f;
    }
public static void main(String args[])
    {
        Scanner s1 = new Scanner(System.in);
        int i , num, x;
        double frac, sum=0;
        System.out.println("Enter the number of terms");
        num = s1.nextInt();
        num=num-1;
        System.out.println("Enter the value of x");
        x = s1.nextInt();
        for(i = 1; i <= num; i ++)
        {
        frac = Math.pow(x, i)/fact(i);
        sum = sum + frac;
        }
        sum=sum+1;
        System.out.println("The sum is "+sum);
    }
}
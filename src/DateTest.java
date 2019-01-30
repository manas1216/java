import java.util.*;
public class DateTest {
	public static void main(String args[]){
	Date display = new Date(0,0,0);
	Scanner s1=new Scanner(System.in);
	int month,day,year;
	System.out.print("Enter Month:");
	month = s1.nextInt();
	display.setmonth(month);
	System.out.println();
	System.out.print("Enter Day:");
	day =s1.nextInt();
	display.setday(day);
	System.out.println();
	System.out.print("Enter Year:");
	year=s1.nextInt();
	display.setyear(year);
	System.out.println();
	display.displayDate();
	}
}
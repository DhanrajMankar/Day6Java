package Day6Java;
import java.util.*;
public class StopWatch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		long start,end;
		double tim;
		
		System.out.println("To start the stopwatch enter any char");
		char s=sc.next().charAt(0);
		start=System.currentTimeMillis();
		
		System.out.println("To start the stopwatch enter any char ");
		char m=sc.next().charAt(0);
		end=System.currentTimeMillis();
		
		tim=(end-start)/1000.0;
		System.out.println("The total time measure is = "+tim+" sec");

	}

}

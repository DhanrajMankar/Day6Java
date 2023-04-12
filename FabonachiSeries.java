package Day6Java;
import java.util.*;
public class FabonachiSeries {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the for which you want series");
		int a= s.nextInt();
	    int sum=0;
		for(int i=0;i<=a;i++)
		{
			sum=sum+i;
			System.out.println(i+" = "+sum);
		}

	}

}

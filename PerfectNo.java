package Day6Java;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the no");
		int a= s.nextInt();
		int b=a/2;
		int j=0,sum=0;
		
		
		for(int i=1;i<=b;i++)
		{
			if (a%i==0) 
			{
				sum=sum+i;
				
			}
		}
		if(sum==a)
		{
			System.out.println("Enter the no is perefect no");
			System.out.print("The no Are");
			for(int i=1;i<=b;i++)
			{
				if (a%i==0) 
				{
		
					System.out.print(" "+i);
					
				}
			}
		}
		else
		{
			System.out.println("Enter the no is NOT a perefect no");
		}
	}

}

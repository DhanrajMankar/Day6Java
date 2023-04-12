package Day6Java;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String args[])
	{ 
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no");
		  int i,b=0,c=0;      
		  int n=s.nextInt();  
		  b=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=b;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     c=1;      
		     break;      
		    }      
		   }      
		   if(c==0)  { System.out.println(n+" is prime number"); }  
		  }  
		}    

}

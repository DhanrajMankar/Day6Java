package Day6Java;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args)   
 {  
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no");
		
	    int a=s.nextInt();
	    int b = 0; 
	    
	    System.out.println("Using for loop");
	    
	    for( ;a != 0; a=a/10)   
	    {  
	    int remainder = a % 10;  
	    b = b * 10 + remainder;  
	    }  
	    System.out.println("The reverse of the given number is: " + b);  
	    
	    System.out.println("Using While loop");
	    
	    while(a != 0)   
	    {  
	    int remainder = a % 10;  
	    b = b * 10 + remainder;  
	    a = a/10;  
	    }  
	   System.out.println("The reverse of the given number is: " + b); 
	   
 }     

	

}

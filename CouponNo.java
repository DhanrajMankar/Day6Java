package Day6Java;
import java.util.*;
public class CouponNo {
	
		public static void main(String[] args) 
		{
		  
			CouponNo c= new CouponNo();
			c.coupon1();
			c.coupon2();
		}
     public void coupon1() 
       { 
    	 String a="1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			char b[] =a.toCharArray();
			
			System.out.print("Enter the length of Coupon Number you want to generate");
            Scanner s =new Scanner(System.in);
            StringBuffer sb=new StringBuffer();
            int x=s.nextInt();
            
            for (int i=0;i<x;i++)
            {
            	int r =(int) (Math.random()*b.length);
            	sb.append(b[r]);
            }
            String couponCode=sb.toString();
			System.out.println("Coupon Code: "+couponCode);	

       }
     
     public void coupon2() 
     { 
  	 char[] chars="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
			int max=100000000;
			int random=(int) (Math.random()*max);	
			StringBuffer sb=new StringBuffer();
			
			while (random>0)
			{
				sb.append(chars[random % chars.length]);
				random /= chars.length;
			}

			String couponCode=sb.toString();
			System.out.println("Coupon Code: "+couponCode);	
     }	
 
}

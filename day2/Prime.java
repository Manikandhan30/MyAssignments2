package week1.day2;
import java.util.Scanner;
public class Prime {
	
	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter a number  ");
	        int n = sc.nextInt();
	        
	        boolean flag=chkPrime(n);
	        
	        if(flag) 
	            System.out.println(n + " is prime number");
	        
	        else
	            System.out.println(n+ " is a non-prime number");
	        
	    }
	    public static  boolean chkPrime(int n)
	    {
	        if(n==1||n==1)
	        {
	            return false;
	        }
	        else {
	       for(int i=2;i<=n-1;i++)
	       {
	           if(n%i==0)
	               return  false;
	       }
	       return true;
	    }
}
}
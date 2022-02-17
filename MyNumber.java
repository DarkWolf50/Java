import java.util.*;
public class MyNumber  
	{
	    private int n;
	    MyNumber()
	    {
	        n=0;
	    }
	    MyNumber(int n)
	    {
	        this.n=n;
	    }
	    boolean isNegative()
	    {
	        if(n<0)
	           return true;
	        else
	            return false;

	    }
	    boolean isPositive()
	    {
	        if(n>0)
	        return true;
	        else 
	        return false;
	    }
	    boolean isZero()
	    {
	        if(n==0)
	        return true;
	        else
	        return false;
	    }
	    boolean isOdd()
	    {
	        if(n%2!=0)
	        return true;
	        else
	        return false;
	    }
	    boolean isEven()
	    {
	        if(n%2==0)
	        return true;
	        else
	        return false;
	    }

	public static void main(String args[]) 
	{
	int n=Integer.parseInt(args[0]);
	MyNumber ob=new MyNumber(n);
	if(ob.isNegative())
	   System.out.println("Number is Negative");
	if(ob.isPositive())
	    System.out.println("Number is POsitive");
	if(ob.isZero())
	     System.out.println("Number Is 0");
	if(ob.isEven())
	System.out.println("Number is Even");
	if(ob.isOdd())
	System.out.println("Number is ODD");
	}

	}

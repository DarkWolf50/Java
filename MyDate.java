import java.util.*;
class InvalidDateException extends Exception
{
    
	
	private static final long serialVersionUID = 1L;

	public String toString()
    {
        return "Invalid Date";

    }
}
public class MyDate
{
    int dd,mm,yy;
    void accept()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Day::");
            dd=sc.nextInt();
            System.out.println("Enter Month::");
            mm=sc.nextInt();
            System.out.println("Enter Year::");
            yy=sc.nextInt();
            if(!((dd>=1 && dd<=31) && (mm>=1 && mm<=12) && (yy>=1000 && yy<9999)))
            throw new InvalidDateException();
            disp();

               
        }catch(Exception e)
        {
            System.out.println("Error"+e);

        }
        
    }
    
void disp()
{
    System.out.println("Date:::" +dd+ "/" +mm+"/"+yy);
}
public static void main(String argc[])
{
    MyDate ob=new MyDate();
    ob.accept();
    ob.disp();
}
}
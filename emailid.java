
import java.util.*;
class InvalidLogin extends Exception
{
    public String toString()
    {
        return "Invalid Login Username or Password";
    }
}
public class emailid
{
    public static void main(String args[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the username:");
            String n=sc.next();
            System.out.println("Enter the password:");
            String p=sc.next();
            if(!n.equals(p))
                throw new InvalidLogin();
            System.out.println("Login Successfully");
        }
        catch(Exception e)
        {
            System.out.println("ERROR:"+e);
        }
    }
}
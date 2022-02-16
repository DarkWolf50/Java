
import java.util.*;
class CovidException extends Exception
{
    public String toString()
    {
        return "Patient is Covid Positive and need to Hospitilized";
    }
}
public class patient
{
    String pname;
    int age,olevel,hrct;
    void accept()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Patient Name::");
            pname=sc.next();
            System.out.println("Enter Patient AGE::");
            age=sc.nextInt();
            System.out.println("Enter Oxygen Level::");
            olevel=sc.nextInt();
            System.out.println("Enter HRCT Score::");
            hrct=sc.nextInt();
            if(olevel<=95 && hrct>=10)
            {
                throw new CovidException();
            }
            disp();
        }catch(Exception e)
        {
            System.out.println("Errorrrrr=="+e);
        }
    }
void disp()
{
    System.out.println("Patient Name::"+pname);
    System.out.println("Patient AGE::"+age);
    System.out.println("Oxygen Level::"+olevel);
    System.out.println("HRCT Level::"+hrct);
}
public static void main(String args[])
{
    patient ob=new patient();
    ob.accept();
}

}
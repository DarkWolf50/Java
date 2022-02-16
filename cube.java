import java.util.Scanner;

interface printcubeno
{
	public void printcube(int no);
}
public class cube
{
	public static void main(String arg[])
	{
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		no=sc.nextInt();
		printcubeno p=n->System.out.println("Cube:"+n*n*n);
		p.printcube(no);
		sc.close();
	}

}
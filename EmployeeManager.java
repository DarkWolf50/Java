import java.util.Scanner;
import java.io.*;
class Emp{
	private int id;
	private double salary;
	private String name,dept;
	double total;
	double sal=salary;
	public Emp() {
		id=0;
		salary=0.0;
		name="";
		dept="";
		
	}
	public Emp(int id,double salary,String name, String dept) {
		this.id=id;
		this.salary=salary;
		this.name=name;
		this.dept=dept;
		
	}
	public void accept() throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id of Employee:");
		id=sc.nextInt();
		
		System.out.println("Enter name of Employee:");
		name=sc.next();
		
		System.out.println("Enter salary of Employee:");
		salary=sc.nextDouble();
		
		System.out.println("Enter department of Employee:");
		dept=sc.next();
	}
	public double total() {
		total=total+salary;
		return total;
	}
	public void display() {
		System.out.println("Emp id:"+id);
		System.out.println(" Name:"+name);
		System.out.println(" Salary:"+salary);
		System.out.println("Department:"+dept);
		
	}
}
class Manager extends Emp{
	private double bonus;
	public void accept()  throws IOException  {
		super.accept();
		System.out.println("Enter bonus of employee:");
		Scanner sc=new Scanner(System.in);
		bonus=sc.nextDouble();
		super.total=bonus;
	}
	public void display() {
		super.display();
		System.out.println("Bonus:"+bonus);
		System.out.println("Total Salary:"+total);
	}
}
public class Slip8 {
	public static void main(String[] args) throws  IOException {
		Manager[] m=new Manager[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Employee:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			m[i]=new Manager();
			m[i].accept();
			m[i].total();
			
		}
		for(int i=0;i<n;i++) {
			m[i].display();
			System.out.println("-----------");
		}
		double src=m[0].total;
		int temp=0;
		for(int i=1;i<n;i++) {
			if(src<m[i].total) {
				src=m[i].total;
				temp=i;
			}
		}
		System.out.println("The Employee having the maximum Total salary is:");
		m[temp].display();
	}

}

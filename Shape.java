import java.util.Scanner;
import java.io.*;
abstract class shape{
	abstract  public void calc_area();
	abstract public void calc_volume();
	float pi=3.14f;
}
class Sphere extends shape{
	double r;
	double area;
	double volume;
	public void accept(){
	System.out.println("Enter the radius");
}
	public void calc_area() {
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		area=pi*r*r;
	}
	public void calc_volume() {
		volume=1.3333*pi*r*r*r;
	}
	public void display() {
		calc_area();
		calc_volume();
	System.out.println("The area of sphere is="+area);
	System.out.println("The volume of sphere is="+volume);
	}
}
  class cone extends shape{
	 double h,r,area,volume;
	 float pi=3.14f;
	 public void accept(){
		 System.out.println("Enter the radius and volume");
		 
	 }
	 public void calc_area() {
			Scanner sc=new Scanner(System.in);
			r=sc.nextInt();
			area=pi*r*(r+Math.sqrt(r*r+h*h));
		}
		public void calc_volume() {
			Scanner sc=new Scanner(System.in);
					h=sc.nextInt();
			volume=pi*r*r*h/3;
		}
		public void display() {
			calc_area();
			calc_volume();
		System.out.println("The area of cone is="+area);
		System.out.println("The volume of cone is="+volume);
		}
	 
 }
public class Slip1 {
public static void main(String[] args){
	
	
	Sphere s=new Sphere();
	s.accept();
	s.display();
	
	cone c=new cone();
	c.accept();
	c.display();

	}

}

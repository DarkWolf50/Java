class Student{
	int rollNumber;
	String name;
	float per;
	static int count=0;
	public Student() {
		rollNumber=0;
		name=null;
		per=0.0f;
	}
	public Student(int rollNumber,String name,float per) {
		this.rollNumber=rollNumber;
		this.per=per;
		this.name=name;
		count++; 
	}
	public static void count() {
		System.out.println("Object"+(count)+"Created");
	}
	public void display() {
		System.out.println("Roll Number:"+rollNumber);
		System.out.println("Name:"+name);
		System.out.println("Percentage:"+per);
		System.out.println("-----------------------");
	}
}
public class slip3 {
	public static void main(String[] args) {
		Student s1=new Student(1,"Dnyandip",80.89f);
		Student.count();
		
		Student s2=new Student(2,"Rahul",70.66f);
		Student.count();
		
		Student s3=new Student(1,"Vaibhav",55.30f);
		Student.count();
		
		s1.display();
		s2.display();
		s3.display();
		

	}

}

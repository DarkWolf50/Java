import java.util.*;
public class cricket {
	int runs,innings,notout;
	String name;
	float batavg;
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name:");
		name=sc.next();
		System.out.println("Enter the runs:");
		runs=sc.nextInt();
		System.out.println("Enter the innings:");
		innings=sc.nextInt();
		
		System.out.println("Enter the notout:");
		notout=sc.nextInt();
		batavg=avg(runs,innings,notout);
	
	}
	static float avg(int runs,int innings,int notout) {
		float a=(float)runs/(innings-notout);
		return a;
	}
	static void sortplayer(cricket ob[],int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++) {
				if(ob[i].batavg>ob[j].batavg) {
					cricket t=ob[i];
					ob[i]=ob[j];
					ob[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println("NAME="+ob[i].name);
			System.out.println("RUNS="+ob[i].runs);
			System.out.println("INNINGS="+ob[i].innings);
			System.out.println("BATTING AVERAGE="+ob[i].batavg);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit:");
	int n=sc.nextInt();
	cricket ob[]=new cricket[n];
	for(int i=0;i<n;i++) {
		ob[i]=new cricket();
		ob[i].accept();
	}
	sortplayer(ob,n);
	}
	
	}

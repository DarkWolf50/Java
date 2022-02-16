import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		int [] arr=new int[10];
		Scanner sc=new Scanner(System.in);
for(int i=0;i<10;i++) {
	System.out.println("Enter Array Element:" +i);
	arr[i]=sc.nextInt();
}
System.out.println("Element contained in array in reverse order:");
for(int j=arr.length-1;j>=0;j--) {
	System.out.println(arr[j]);
}
	}

}

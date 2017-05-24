package adv;

import java.util.Scanner;

public class T175 {
	static int []a;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		a=new int [3];
		a[0]=scan.nextInt();
		a[1]=scan.nextInt();
		if(a[1]>a[0]) {
			int temp=a[1];
			a[1]=a[0];
			a[0]=temp;
		}
		a[2]=scan.nextInt();
		scan.close();
		if(a[2]>a[0]) {
			System.out.println(a[2]+" "+a[0]+" "+a[1]);
		}else if(a[2]<a[1]) {
			System.out.println(a[0]+" "+a[1]+" "+a[2]);
		}else {
			System.out.println(a[0]+" "+a[2]+" "+a[1]);
		}
	}
}

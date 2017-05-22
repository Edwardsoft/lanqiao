package y2016.c;
import java.util.*;
public class T4 {
	static int m;
	static int n;
	static int num;
	static int sum;
	static int []yiceng;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		m=scan.nextInt();
		n=scan.nextInt();
		scan.close();
		boolean flag=false;
		for(int i=0;i<m+n;i++) {
			if(i*(1+i)/2==m+n) {
				num=i;
				flag=true;
				break;
			}
		}
		if(!flag) {
			return ;
		}
		yiceng=new int[num];
		yiceng(0,0,0);
		System.out.println(sum);
		
	}
	public static void yiceng(int z,int a,int b) {
		if(z==num) {
			System.out.println(a+" "+b);
			shangceng(1,yiceng,a,b);
		}else {
			if(a+1<=m) {
				yiceng[z]=1;
				yiceng(z+1,a+1,b);
			}
			if(b+1<=n) {
				yiceng[z]=2;

				yiceng(z+1,a,b+1);
			}
		}
	}
	
	public static void shangceng(int z,int []xiaceng,int a,int b) {
		int []now=new int [num-z];
		for(int i=0;i<num-z;i++) {
			if(xiaceng[i]==1&&xiaceng[i+1]==1||xiaceng[i]==2&&xiaceng[i+1]==2) {
				if(a+1<=m) {
					now[i]=1;
					a++;
				}else {
					return ;
				}
			}else {
				if(b+1<=n) {
					now[i]=2;
					b++;
				}else {
					return ;
				}
			}
			shangceng(z+1,now,a,b);
		}
		if(now.length==1) {
			if(a==m&&b==n) {
				sum++;
			}
			return ;
		}
	}
}

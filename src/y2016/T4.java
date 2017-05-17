package y2016;
import java.util.*;
public class T4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		int [][]a=new int [2][n];
		int [][]b=new int [2][n];
		for(int i=0;i<2;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		int [][]d=new int [n][n];
		scan.close();
		int []c=new int[n*n];
		for(int i=0;i<n*n;i++) {
			c[i]=-1;
		}
		d[0][0]=1;
		b[0][0]=1;
		b[1][0]=1;
		c[0]=0;
		int x=0,y=0;
		int sum=0;
		chuqu(a,b,c,d,n,x,y,sum);
	}
	public static void chuqu(int [][]a,int [][]b,int[]c,int [][]d,int n,int x,int y,int sum) {
		c[sum]=x*n+y;
		d[x][y]++;
		b[0][x]++;
		b[1][y]++;
		if(y+1<n&&d[x][y+1]==0&&b[0][x+1]<a[0][x+1]&&b[1][y]<a[1][y]) {
			
		}
		if(x+1<n&&d[x+1][y]==0&&b[0][x]<a[0][x]&&b[1][y+1]<a[1][y+1]) {
			
		}
		if(x-1>=0&&d[x-1][y]==0&&b[0][x]<a[0][x]&&b[1][y-1]<a[1][y-1]) {
			
		}
		if(y-1>=0&&d[x][y-1]==0&&b[0][x-1]<a[0][x-1]&&b[1][y]<a[1][y]) {
			
		}
		if(a[][])
		sum++;
	}
}

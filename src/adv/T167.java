import java.util.*;
public class T167 {
	static int n;
	static int m;
	static int []g;
	static int []v;
	static double [][]a;
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		a=new double [2][n];
		g=new int [n];
		v=new int [n];
		for(int i=0;i<n;i++) {
			g[i]=scan.nextInt();
			v[i]=scan.nextInt();
			a[0][i]=v[i]*1.0/g[i];
			a[1][i]=i;
			for(int j=0;j<=i;j++) {
				if(a[0][i]<a[0][j]) {
					for(int k=i;k>j;k--) {
						a[0][k]=a[0][k-1];
						a[1][k]=a[1][k-1];
					}
					a[0][j]=v[i]*1.0/g[i];
					a[1][j]=i;
				}
			}
		}
		scan.close();
		double result=0;
		for(int i=n-1;i>=0;i--) {
			if(m>=g[(int)a[1][i]]) {
				m-=g[(int)a[1][i]];
				result+=v[(int)a[1][i]];
			}else {
				result+=a[0][i]*m;
				break;
			}
		}
		System.out.println(String.format("%.1f",result));
	}
}

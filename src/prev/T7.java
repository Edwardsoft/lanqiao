package prev;

import java.util.*;



//目前只有六十分   运行超时
public class T7 {
	static int n;
	static int []datas;
	static int [][]dp;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		datas=new int [n+1];
		for(int i=1;i<n+1;i++) {
			datas[i]=scan.nextInt();
		}
		scan.close();
		dp=new int[n+1][n+1];
		for(int i=1;i<n+1;i++) {
			dp[i][i]=1;
		}
		int sum=n;
		for(int i=1;i<n;i++) {
			for(int j=i+1;j<n+1;j++) {
				if(isLianXu(i, j)) {
					sum++;
				}
			}
		}
		System.out.println(sum);
 	}
	public static boolean isLianXu(int x,int y) {
		int []temp=new int [y-x+1];
		for(int i=0;i<y-x+1;i++) {
			temp[i]=datas[i+x];
		}
 		Arrays.sort(temp);
		for(int i=1;i<temp.length;i++) {
			if(temp[i]!=temp[i-1]+1) {
				return false;
			}
		}
		return true;
	}
}

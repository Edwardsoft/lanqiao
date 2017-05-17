package y2015.java;
import java.util.*;
public class T6 {
	static int n;
	static int m;
	static int[][] floor;
	static int sum;
	public static void main(String[] args) {      //暂未解出
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		scan.close();
		floor=new int [n][m];
		baifang(0,0);
	}
	public static void baifang(int x,int y) {
		if(floor[x][y]==0) {
			
			//第一种形状第一种摆法
			if(x+1<n&&y+1<m&&floor[x+1][y]==0&&floor[x+1][y+1]==0) {
				floor[x+1][y]=1;
				floor[x+1][y+1]=1;
				if(y<m-1) {
					baifang(x,y+1);
				}else if(y>0) {
					baifang(x,y-1);
				}else if(x<n-1) {
					baifang(x+1,y);
				}else if(x>0) {
					baifang(x-1,y);
				}
				floor[x+1][y]=0;
				floor[x+1][y+1]=0;
			}
			if(x-1>0&&y+1<m&&floor[x-1][y]==0&&floor[x][y+1]==0) {
				floor[x-1][y]=1;
				floor[x][y+1]=1;
				if(y<m-1) {
					baifang(x,y+1);
				}else if(y>0) {
					baifang(x,y-1);
				}else if(x<n-1) {
					baifang(x+1,y);
				}else if(x>0) {
					baifang(x-1,y);
				}
				floor[x-1][y]=0;
				floor[x][y+1]=0;
			}
			if(x-1>0&&y-1>0&&floor[x-1][y]==0&&floor[x-1][y-1]==0) {
				floor[x-1][y]=1;
				floor[x-1][y-1]=1;
				if(y<m-1) {
					baifang(x,y+1);
				}else if(y>0) {
					baifang(x,y-1);
				}else if(x<n-1) {
					baifang(x+1,y);
				}else if(x>0) {
					baifang(x-1,y);
				}
				floor[x-1][y]=0;
				floor[x-1][y-1]=0;
			}
			
			
			//第一种形状第二种摆法
			if(x+1<n&&y+1<m&&floor[x+1][y]==0&&floor[x][y+1]==0) {
				floor[x+1][y]=1;
				floor[x][y+1]=1;
				if(y<m-1) {
					baifang(x,y+1);
				}else if(y>0) {
					baifang(x,y-1);
				}else if(x<n-1) {
					baifang(x+1,y);
				}else if(x>0) {
					baifang(x-1,y);
				}
				floor[x+1][y]=0;
				floor[x][y+1]=0;
			}
			
			if(x-1>0&&y+1<m&&floor[x-1][y]==0&&floor[x-1][y+1]==0) {
				floor[x-1][y]=1;
				floor[x-1][y+1]=1;
				if(y<m-1) {
					baifang(x,y+1);
				}else if(y>0) {
					baifang(x,y-1);
				}else if(x<n-1) {
					baifang(x+1,y);
				}else if(x>0) {
					baifang(x-1,y);
				}
				floor[x-1][y]=0;
				floor[x-1][y+1]=0;
			}
			if(x+1<n&&y-1>0&&floor[x+1][y]==0&&floor[x+1][y-1]==0) {
				floor[x+1][y]=1;
				floor[x+1][y-1]=1;
				if(y<m-1) {
					baifang(x,y+1);
				}else if(y>0) {
					baifang(x,y-1);
				}else if(x<n-1) {
					baifang(x+1,y);
				}else if(x>0) {
					baifang(x-1,y);
				}
				floor[x+1][y]=0;
				floor[x+1][y-1]=0;
			}
			
			
			
		}
	}
}

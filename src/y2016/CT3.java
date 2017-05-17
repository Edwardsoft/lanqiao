package y2016;

import java.util.Scanner;

public class CT3 {
	static int m=0;
	static int n=0;
	static int sum=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		m=scan.nextInt();
		n=scan.nextInt();
		scan.close();
		int num=0;
		for(int i=1;i<=m+n;i++) {
			if(i+i*i==2*(m+n)){
				num=i;
				break;
			}
		}
		int [][]x=new int [num][2*num-1];

		
//		for(int i=0;i<=min;i++) {
//			
//			for(int j=1;j<=num-i;j++) {
//				int now=1;
//				for(int k=num-i;k>j;k--) {
//					now=now*k;
//				}
//				
//				int chu=1;
//				for(int k=j;k>0;k--) {
//					chu=chu*k;
//				}
//				sum=sum+now/chu;
//			}
//			jisuan(x,1);
//		}
		
		diedai(x,0,0,0);
		System.out.println(sum);
	}
	public static void jisuan(int [][]x,int now,int num1,int num2) {
		int num11=num1;
		int num21=num2;
		if(now<x.length) {
			for(int i=1;i<x[0].length-1;i++) {
				if(x[now-1][i-1]==2&&x[now-1][i+1]==2||x[now-1][i-1]==1&&x[now-1][i+1]==1) {
					x[now][i]=1;
					num11++;
					if(num11>m) {
						return ;
					}
				}else if(x[now-1][i-1]==1&&x[now-1][i+1]==2||x[now-1][i-1]==2&&x[now-1][i+1]==1) {
					x[now][i]=2;
					num21++;
					if(num21>n) {
						return;
					}
				}
			}
			jisuan(x,now+1,num11,num21);
		}else if(now==x.length){
			
			if(num11==m&&num21==n) {
				sum++;
				for(int i=x.length-1;i>=0;i--) {
					for(int j=0;j<x[0].length;j++) {
						System.out.print(x[i][j]);
					}
					System.out.println();
				}
			}
			System.out.println("==========");
		}
	}
	public static void diedai(int [][]x,int now,int a,int b) {
		if(now<x[0].length) {
			x[0][now]=1;
			if(a<=m) {
				diedai(x,now+2,a+1,b);
			}
			x[0][now]=2;
			if(b<=n) {
				diedai(x,now+2,a,b+1);
			}
			b--;
		}else {
			jisuan(x,1,a,b);
			return ;
		}
	}
}

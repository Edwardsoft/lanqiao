package adv;


import java.util.Scanner;

public class T123 {
	/*
	问题描述
	　　生成n个∈[a,b]的随机整数，输出它们的和为x的概率。
	输入格式
	　　一行输入四个整数依次为n，a，b，x，用空格分隔。
	输出格式
	　　输出一行包含一个小数位和为x的概率，小数点后保留四位小数
	样例输入
	2 1 3 4
	样例输出
	0.3333
	数据规模和约定
	　　对于50%的数据，n≤5.
	　　对于100%的数据，n≤100,b≤100.
	*/
	static int n,a,b,x;
	static double [][]d;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		a=scan.nextInt();
		b=scan.nextInt();
		x=scan.nextInt();
		scan.close();
		d=new double [105][10005];
		if(b*n<x) {
			System.out.printf("%.4f",0.0);
			return;
		}
		for(int i = a; i <= b; i++) d[1][i] = 1.0 / (double)(b - a + 1);
	    for(int i = 2; i <= n; i++) {
	        for(int j = a; j <= b; j++) {
				for(int k = 1; k <= x; k++) {
					if(k>=j) {
						d[i][k] += d[i - 1][k - j] / (double)(b - a + 1);
					}
				}
	        }
	    }
	    System.out.printf("%.4f", d[n][x]);
	}

}

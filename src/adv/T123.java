package adv;

import java.util.ArrayList;
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
	static ArrayList<ArrayList<Integer>> d;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		a=scan.nextInt();
		b=scan.nextInt();
		x=scan.nextInt();
		d=new ArrayList<>();
		ArrayList<Integer> c=new ArrayList<>();
		for(int i=0;i<n;i++) {
			c.add(a);
		}
		d.add(c);
		for(int k=1;k<x-n*a+1;k++) {
			System.out.println("in");
			for(int i=0;i<d.size();i++) {
				for(int j=0;j<d.get(i).size();j++) {
					ArrayList<Integer> temp=new ArrayList<>();
					temp=(ArrayList<Integer>)d.get(i).clone();
					temp.set(j, temp.get(j)+1);
					d.add(temp);
				}
			}
		}
		for(int i=0;i<d.size();i++) {
			for(int j=0;j<d.get(i).size();j++) {
				System.out.print(d.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
	}

}

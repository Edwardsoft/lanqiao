package adv;

import java.util.ArrayList;
import java.util.Scanner;

public class T123 {
	/*
	��������
	��������n����[a,b]�����������������ǵĺ�Ϊx�ĸ��ʡ�
	�����ʽ
	����һ�������ĸ���������Ϊn��a��b��x���ÿո�ָ���
	�����ʽ
	�������һ�а���һ��С��λ��Ϊx�ĸ��ʣ�С���������λС��
	��������
	2 1 3 4
	�������
	0.3333
	���ݹ�ģ��Լ��
	��������50%�����ݣ�n��5.
	��������100%�����ݣ�n��100,b��100.
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

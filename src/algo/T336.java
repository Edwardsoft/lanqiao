package algo;

import java.util.Scanner;

public class T336 {
	static String s;
	static char [] data;
	static int []d;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		s=scan.nextLine();
		scan.close();
		data=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			data[i]=s.charAt(i);
		}
		d=new int [s.length()];
		if(data[0]=='A'&&data[s.length()-1]=='B') {
			d[0]=2;
		}
		for(int i=1;i<s.length()-1;i++) {
			if(data[i]=='B'&&data[i+1]=='A') {
				
			}
		}
		
	}
}

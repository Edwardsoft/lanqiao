package adv;

import java.util.Scanner;

public class T150 {
	static String s;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		s=scan.nextLine();
		scan.close();
		for(int i=1;i<=s.length();i++) {
			if(s.length()%i==0) {
				String s1=s.substring(0,i);
				boolean flag=true;
				for(int j=i;j<=s.length()-i;j+=i) {
					if(!s.substring(j,j+i).equals(s1)) {
						flag=false;
						break;
					}
				}
				if(flag) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
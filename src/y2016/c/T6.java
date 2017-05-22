package y2016.c;
import java.util.*;
public class T6 {
	static int n;
	static int m;
	static int [][]datas;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		scan.nextLine();
		datas=new int [n][m];
		for(int i=0;i<n;i++) {
			String s=scan.nextLine();
			for(int j=0;j<m;j++) {
				char c=s.charAt(j);
				if(c=='E') {
					datas[i][j]=1;
				}
			}
		}
		
	}
}

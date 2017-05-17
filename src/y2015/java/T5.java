package y2015.java;
import java.util.*;
public class T5 {
	static String [][]data;
	static int n;
	static int m;
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		scan.nextLine();
		data=new String[n][m];
		for(int i=0;i<n;i++) {
			String []s=scan.nextLine().split(" ");
			for(int j=0;j<m;j++) {
				data[i][j]=s[j];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				data[i][j]=control(i, j)+"";
				for(int k=0;k<n;k++) {
					for(int h=0;h<m;h++) {
						System.out.print(data[k][h]+" ");
					}
					System.out.println("");
				}
				System.out.println();
			}
		}
		
	}
	
	public static double sum(String s) {
		double result=0;
		s=s.substring(4,s.length()-1);
		String []s1=s.split(":");
		String []s2=s1[0].split(",");
		int beginX=Integer.parseInt(s2[0])-1;
		int beginY=Integer.parseInt(s2[1])-1;
		s2=s1[1].split(",");
		int endX=Integer.parseInt(s2[0])-1;
		int endY=Integer.parseInt(s2[1])-1;
		for(int i=beginX;i<=endX;i++) {
			for(int j=beginY;j<=endY;j++) {
				double d=control(i, j);
				result+=d;
				data[i][j]=d+"";
				
			}
		}
		return result;
	}
	
	public static double avg(String s) {
		double result=0;
		s=s.substring(4,s.length()-1);
		String []s1=s.split(":");
		String []s2=s1[0].split(",");
		int beginX=Integer.parseInt(s2[0])-1;
		int beginY=Integer.parseInt(s2[1])-1;
		s2=s1[1].split(",");
		int endX=Integer.parseInt(s2[0])-1;
		int endY=Integer.parseInt(s2[1])-1;
		int sum=0;
		for(int i=beginX;i<=endX;i++) {
			for(int j=beginY;j<=endY;j++) {
				double d=control(i, j);
				result+=d;
				sum++;
				data[i][j]=d+"";
			}
		}
		result=result/sum*1.0;
		return result;
	}
	
	public static double std(String s) {
		double result=0;
		s=s.substring(4,s.length()-1);
		String []s1=s.split(":");
		String []s2=s1[0].split(",");
		int beginX=Integer.parseInt(s2[0])-1;
		int beginY=Integer.parseInt(s2[1])-1;
		s2=s1[1].split(",");
		int endX=Integer.parseInt(s2[0])-1;
		int endY=Integer.parseInt(s2[1])-1;
		double avg=avg("AVG("+s+")");
		int sum=0;
		for(int i=beginX;i<=endX;i++) {
			for(int j=beginY;j<=endY;j++) {
				double d=control(i, j);
				data[i][j]=d+"";
				result+=(d-avg)*(d-avg);
				sum++;
			}
		}
		result=result/sum*1.0;
		return result;
	}
	public static double control(int x,int y) {
		if(data[x][y].matches("SUM.*")) {
			return  sum(data[x][y]);
		}else if(data[x][y].matches("AVG.*")) {
			return avg(data[x][y]);
		}else if(data[x][y].matches("STD.*")) {
			return std(data[x][y]);
		}else {
			return Double.parseDouble(data[x][y]);
		}
	}
	
}

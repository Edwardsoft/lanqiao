package y2015.java;
import java.util.*;
public class T4 {
	static char[][] map;
	static int N;
	static int[] A;
	static int[] B;
	static int min;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		N=scan.nextInt();
		A=new int [2];
		B=new int [2];
		map=new char[N][N];
		min=N*N;
		scan.nextLine();
		for(int i=0;i<N;i++) {
			String s=scan.nextLine();
			String []s1=s.split(" ");
			for(int j=0;j<s1.length;j++) {
				map[i][j]=s1[j].charAt(0);
				if(map[i][j]=='A') {
					A[0]=i;
					A[1]=j;
				}else if(map[i][j]=='B') {
					B[0]=i;
					A[1]=j;
				}
			}
		}
		yidong(A[0],A[1],0);
		System.out.println(min);
		
	}
	public static void yidong(int x,int y,int num) {
		char now=map[x][y];
		if(now=='+') {
			
			if(x>0&&(map[x-1][y]=='-'||map[x-1][y]=='B')) {
				map[x][y]='_';
				yidong(x-1,y,num+1);
				map[x][y]=now;
			}
			if(x<N-1&&(map[x+1][y]=='-'||map[x+1][y]=='B')) {
				map[x][y]='_';
				yidong(x+1,y,num+1);
				map[x][y]=now;
			}
			if(y>0&&(map[x][y-1]=='-'||map[x][y-1]=='B')) {
				map[x][y]='_';
				yidong(x,y-1,num+1);
				map[x][y]=now;
			}
			if(y<N-1&&(map[x][y+1]=='-'||map[x][y+1]=='B')) {
				map[x][y]='_';
				yidong(x,y+1,num+1);
				map[x][y]=now;
			}
			
		}else if(now=='-') {
			
			if(x>0&&(map[x-1][y]=='+'||map[x-1][y]=='B')) {
				map[x][y]='_';
				yidong(x-1,y,num+1);
				map[x][y]=now;
			}
			if(x<N-1&&(map[x+1][y]=='+'||map[x+1][y]=='B')) {
				map[x][y]='_';
				yidong(x+1,y,num+1);
				map[x][y]=now;
			}
			if(y>0&&(map[x][y-1]=='+'||map[x][y-1]=='B')) {
				map[x][y]='_';
				yidong(x,y-1,num+1);
				map[x][y]=now;
			}
			
			if(y<N-1&&(map[x][y+1]=='+'||map[x][y+1]=='B')) {
				map[x][y]='_';
				yidong(x,y+1,num+1);
				map[x][y]=now;
			}
			
		}else if(now=='A') {
			if(x>0) {
				map[x][y]='_';
				yidong(x-1,y,num+1);
				map[x][y]=now;
			}
			if(x<N-1) {
				map[x][y]='_';
				yidong(x+1,y,num+1);
				map[x][y]=now;
			}
			if(y>0) {
				map[x][y]='_';
				yidong(x,y-1,num+1);
				map[x][y]=now;
			}
			if(y<N-1) {
				map[x][y]='_';
				yidong(x,y+1,num+1);
				map[x][y]=now;
			}
			
		}else if(now=='B') {
			if(num<min) {
				min=num;
			}
			return ;
		}
	}
}

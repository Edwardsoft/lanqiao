package y2016.java;
import java.util.*;
public class T4 {
	static int N;
	static int [][]num;  //总共经过的次数
	static int [][]numnow;   //现在经过的次数
	static int [][]map;  //记录是否走过
	static int [] route;  //路线
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		N=scan.nextInt();
		num=new int [2][N];
		for(int i=0;i<2;i++) {
			for(int j=0;j<N;j++) {
				num[i][j]=scan.nextInt();
			}
		}
		scan.close();
		numnow=new int [2][N];
		map=new int [N][N];
		route=new int [N*N];
		xingzou(0,0,0);
	}	
	public static void xingzou(int x,int y,int now) {
		route[now]=4*x+y;
		map[x][y]=1;
		numnow[0][y]++;
		numnow[1][x]++;
		if(x==N-1&&y==N-1) {
			boolean flag=true;
			for(int i=0;i<2;i++) {
				for(int j=0;j<N;j++) {
					if(numnow[i][j]!=num[i][j]) {
						flag=false;
						break;
					}
				}
			}
			if(flag) {
				for(int i=0;i<=now-1;i++) {
					System.out.print(route[i]+" ");
				}
				System.out.println(route[now]);
			}
		}else {
			if(y<N-1&&numnow[0][y+1]<num[0][y+1]&&numnow[1][x]<num[1][x]&&map[x][y+1]==0) {
				xingzou(x,y+1,now+1);
			}

			if(x<N-1&&numnow[1][x+1]<num[1][x+1]&&numnow[0][y]<num[0][y]&&map[x+1][y]==0) {
				xingzou(x+1,y,now+1);
			}


			if(y>0&&numnow[0][y-1]<num[0][y-1]&&numnow[1][x]<num[1][x]&&map[x][y-1]==0) {
				xingzou(x,y-1,now+1);
			}

			if(x>0&&numnow[1][x-1]<num[1][x-1]&&numnow[0][y]<num[0][y]&&map[x-1][y]==0) {
				xingzou(x-1,y,now+1);
			}

		}
		route[now]=0;
		map[x][y]=0;
		numnow[0][y]--;
		numnow[1][x]--;
	}
}

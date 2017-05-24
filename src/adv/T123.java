package adv;

<<<<<<< HEAD

=======
import java.util.ArrayList;
>>>>>>> origin/master
import java.util.Scanner;

public class T123 {
	/*
<<<<<<< HEAD
	é—®é¢˜æè¿°
	ã€€ã€€ç”Ÿæˆnä¸ªâˆˆ[a,b]çš„éšæœºæ•´æ•°ï¼Œè¾“å‡ºå®ƒä»¬çš„å’Œä¸ºxçš„æ¦‚çŽ‡ã€‚
	è¾“å…¥æ ¼å¼
	ã€€ã€€ä¸€è¡Œè¾“å…¥å››ä¸ªæ•´æ•°ä¾æ¬¡ä¸ºnï¼Œaï¼Œbï¼Œxï¼Œç”¨ç©ºæ ¼åˆ†éš”ã€‚
	è¾“å‡ºæ ¼å¼
	ã€€ã€€è¾“å‡ºä¸€è¡ŒåŒ…å«ä¸€ä¸ªå°æ•°ä½å’Œä¸ºxçš„æ¦‚çŽ‡ï¼Œå°æ•°ç‚¹åŽä¿ç•™å››ä½å°æ•°
	æ ·ä¾‹è¾“å…¥
	2 1 3 4
	æ ·ä¾‹è¾“å‡º
	0.3333
	æ•°æ®è§„æ¨¡å’Œçº¦å®š
	ã€€ã€€å¯¹äºŽ50%çš„æ•°æ®ï¼Œnâ‰¤5.
	ã€€ã€€å¯¹äºŽ100%çš„æ•°æ®ï¼Œnâ‰¤100,bâ‰¤100.
	*/
	static int n,a,b,x;
	static double [][]d;
=======
	ÎÊÌâÃèÊö
	¡¡¡¡Éú³Én¸ö¡Ê[a,b]µÄËæ»úÕûÊý£¬Êä³öËüÃÇµÄºÍÎªxµÄ¸ÅÂÊ¡£
	ÊäÈë¸ñÊ½
	¡¡¡¡Ò»ÐÐÊäÈëËÄ¸öÕûÊýÒÀ´ÎÎªn£¬a£¬b£¬x£¬ÓÃ¿Õ¸ñ·Ö¸ô¡£
	Êä³ö¸ñÊ½
	¡¡¡¡Êä³öÒ»ÐÐ°üº¬Ò»¸öÐ¡ÊýÎ»ºÍÎªxµÄ¸ÅÂÊ£¬Ð¡Êýµãºó±£ÁôËÄÎ»Ð¡Êý
	ÑùÀýÊäÈë
	2 1 3 4
	ÑùÀýÊä³ö
	0.3333
	Êý¾Ý¹æÄ£ºÍÔ¼¶¨
	¡¡¡¡¶ÔÓÚ50%µÄÊý¾Ý£¬n¡Ü5.
	¡¡¡¡¶ÔÓÚ100%µÄÊý¾Ý£¬n¡Ü100,b¡Ü100.
	*/
	static int n,a,b,x;
	static ArrayList<ArrayList<Integer>> d;
>>>>>>> origin/master
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		a=scan.nextInt();
		b=scan.nextInt();
		x=scan.nextInt();
<<<<<<< HEAD
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
=======
		d=new ArrayList<>();
		ArrayList<Integer> c=new ArrayList<>();
		for(int i=0;i<n;i++) {
			c.add(a);
		}
		d.add(c);
		int i=0;
		for(int k=1;k<x-n*a+1;k++) {
			System.out.println("in");
			for(int j=0;j<d.get(i).size();j++) {
				ArrayList<Integer> temp=new ArrayList<>();
				temp=(ArrayList<Integer>)d.get(i).clone();
				temp.set(j, temp.get(j)+1);
				d.add(temp);
			}
			i++;
		}
		for(i=0;i<d.size();i++) {
			for(int j=0;j<d.get(i).size();j++) {
				System.out.print(d.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
>>>>>>> origin/master
	}

}

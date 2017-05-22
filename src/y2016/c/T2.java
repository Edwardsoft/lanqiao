package y2016.c;

public class T2 {
	static int sum;
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			int []a=new int [10];
			jisuan(i,0);
		}
	}
	public static void jisuan(int num,int now) {
		
		if(now+1<num) {
			for(int i=0;i<10;i++) {
				
			}
			jisuan(num,now+1);
		}
		
		if(now+2<num) {
			jisuan(num,now+2);
		}
	
	}
}


package y2016.c;

public class T1 {
	public static void main(String[] args) {
		int result=0;
		for(int i=1;;i++) {
			if((1+i*127)%97==0) {
				result=i+(1+i*127)/97;
				break;
			}
		}
		System.out.println(result);
	}
}

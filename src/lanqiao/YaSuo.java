package lanqiao;

import java.util.Scanner;

public class YaSuo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		String text=scan.nextLine();
		String [] texts=text.split(" ");
		int [] result= new int[texts.length];
		for(int i=0;i<texts.length;i++) {
			int sum=0;
			boolean isSeem=false;
			for(int j=i-1;j>=0;j--) {
				if(!texts[i].equals(texts[j])) {
					sum++;
				}else {
					isSeem=true;
				}
			}
			if(isSeem) {
				result[i]=Integer.parseInt(texts[i]);
			}else {
				result[i]=-Integer.parseInt(texts[i]);
			}
		}
		for(int i=0;i<result.length;i++) {
			System.out.print(" "+result[i]);
		}
	}
}

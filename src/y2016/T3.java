package y2016;

public class T3 {
	static void f(int[] ta, int[] da, int k, int ho, int bu, int sc)
	{
		if(ho<0 || bu<0 || sc<0) return;
		if(k==ta.length){
			if(ho>0 || bu>0 || sc>0) return;
			for(int i=0; i<da.length; i++){
				for(int j=0; j<da[i]; j++) 
					System.out.print(ta[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<=bu; i++){
			da[k] = i;
			f(ta, da, k+1,ho-da[k]/Math.max(da[k], 1), bu-i, sc-ta[k]*i);   // Ìî¿ÕÎ»ÖÃ
		}
		
		da[k] = 0;
	}
	
	public static void main(String[] args)
	{
		int[] ta = {1,2,3,5,10,20,25,50};
		int[] da = new int[8];
		f(ta, da, 0, 3, 6, 96);
	}
}

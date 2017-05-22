package y2016.c;
import java.util.Scanner;

public class T5 {

	public static int all_sum=0;
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int [][]points=new int[n][2];
		int max_x=Integer.MIN_VALUE,max_y=Integer.MIN_VALUE;
		int min_x=Integer.MAX_VALUE,min_y=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			points[i][0]=scanner.nextInt();
			points[i][1]=scanner.nextInt();
			if(points[i][0]>max_x)max_x=points[i][0];
			if(points[i][0]<min_x)min_x=points[i][0];
			if(points[i][1]>max_y)max_y=points[i][1];
			if(points[i][1]<min_y)min_y=points[i][1];
		}
		for(int i=min_x;i<max_x;i++){
			for(int j=min_y;j<max_y;j++){
				if(judge_point_is_in(points, i, j)&&judge_point_is_in(points, i+1, j)&&judge_point_is_in(points, i, j+1)&&judge_point_is_in(points, i+1, j+1)){
					all_sum++;
				}
			}
		}
		System.out.println(all_sum);
		
	}
	
	public static boolean judge_point_is_in(int [][]points,int x,int y){
		boolean result=false;
		int i=0,j=points.length-1;
		for(;i<points.length;i++){
			if(Math.min(points[i][1], points[j][1])<y&&Math.max(points[i][1], points[j][1])>=y){
				double temp=(double)points[i][0]+(double)(((double)(y-points[i][1])/(double)(points[i][1]-points[j][1]))*((double)(points[i][0]-points[j][0])));
				if(temp<x){
					result=!result;
				}
			}
			j=i;
		}
		return result;
	}
	

}
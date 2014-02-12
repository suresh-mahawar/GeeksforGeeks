package geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountBits {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(countSetBits(n));
	}
	//public static int count=0;
	public static int countSetBits(int n){
		int count=1;
		if(n==0) return 0;
		else{
			int position = msbPosition(n)-1;
			int m = 1<<position;
			count = 1+position*(m/2);
			n = n - m;
			return countSetBits(n)+count+n;
		}
	}
	public static int msbPosition(int n){
		int position = 0;
		if(n==0 || n==1) return 1;
		while(n>0){
			n = n>>1;
			position++;
		}
		return position;
	}
}

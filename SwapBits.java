package geeksforgeeks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SwapBits {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int p1 = Integer.parseInt(br.readLine());
		int p2 = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		System.out.println(SwapBitsBruteForce(x,p1,p2,n));	
		System.out.println(SwapBitsWithXor(x,p1,p2,n));	
	}
	public static int SwapBitsBruteForce(int x,int p1, int p2, int n){
		while(n>0){
			boolean b1 = (x&(1<<p1))> 0;
			boolean b2 = (x&(1<<p2))> 0;
		
			if(b1 ^ b2){	
				x = b1 ? x^(1<<p1) : x|(1<<p1);
				x = b2 ? x^(1<<p2) : x|(1<<p2);
			}
			p1++;p1%=Integer.SIZE;
			p2++;p2%=Integer.SIZE;
			n--;
		}
		return x;
	}
	public static int SwapBitsWithXor(int x, int p1,int p2,int n){
			int set1 = x>>p1 & ((1<<n)-1);
			int set2 = x>>p2 & ((1<<n)-1);
			int xor = set1 ^ set2;
			xor = (xor<<p1 | xor<<p2);
			return x^xor;
	}
}

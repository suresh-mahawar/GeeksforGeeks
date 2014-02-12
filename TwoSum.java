package geeksforgeeks;
import java.io.*;
import java.util.*;

public class TwoSum {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int input[] = new int[N];
		String in[] = new String[N];
		in = br.readLine().split(" ");
		for(int i = 0 ; i<N ; i++){
			input[i] =  Integer.parseInt(in[i]);
		}
		int sum = Integer.parseInt(br.readLine());
		//twoSumSort(input,N,sum);
		twoSumHashMap(input,N,sum);
	}
	
	public static void twoSumSort(int input[],int N,int sum){
		Arrays.sort(input);
		int i = 0;
		int j = N-1;
		while(i<j){
			if((input[i]+input[j])==sum){
				System.out.println(input[i]+" "+input[j]);
				i++;
				j--;
			}else if((input[i]+input[j])>sum){
				j--;
			}else{
				i++;
			}
		}
	}
	public static void twoSumHashMap(int input[],int N,int sum){
		int hash[] = new int[2147483647];
		Arrays.fill(hash, 0);
		for(int i = 0; i<N ;  i++){
			int temp = sum - input[i];
			if(temp>=0 && hash[temp]==1){
				System.out.println(temp+" "+input[i]);
			}
			hash[input[i]]=1;
		}
	}
}

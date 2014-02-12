package geeksforgeeks;
import java.io.*;
public class MaxSumNoAdjacent {
	 public static void main(String[] args) throws IOException{

		   int input[] = {3,2,7,20};

		   int sumUpto[]  = new int[4];

		   sumUpto[0] = input[0];

		   sumUpto[1] = Math.max(input[0],sumUpto[0]);

		   for(int i = 2 ;  i<4 ; i++){

		     sumUpto[i] = Math.max(input[i],Math.max(input[i]+sumUpto[i-2],sumUpto[i-1]));

		   }

		   System.out.println(sumUpto[3]);

		 }
}

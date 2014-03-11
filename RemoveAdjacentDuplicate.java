package geeksforgeeks;
import java.io.*;
import java.util.*;

public class RemoveAdjacentDuplicate {
	public static void main(String[] args)throws IOException{
		String word = "aaaaaaa";
		char letters[] = word.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0 ; i<letters.length ; i++){
			if(stack.isEmpty()){
				stack.push(letters[i]);
			}
			else if(stack.peek()==letters[i]){
				stack.pop();
			}else{
				stack.push(letters[i]);
			}
		}
		System.out.println(stack);
	}
	
}

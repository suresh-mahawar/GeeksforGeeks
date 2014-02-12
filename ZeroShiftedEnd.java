package geeksforgeeks;
/* package whatever; // don't place package name! */


/* Name of the class has to be "Main" only if the class is public. */
class ZeroShiftedEnd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {1,0,2,20,9,0,2,4,5,0,5};
		shiftZeroEnd(arr);        
	}
 	public static void shiftZeroEnd(int arr[]){
		int toBeShifted = 0;
 		for(  int i =0 ; i< arr.length; i++){
			if(arr[i] == 0){
			 	continue;
			}			
			arr[toBeShifted]=arr[i];
			toBeShifted++;
		}
        for(int i = toBeShifted ; i < arr.length ; i++){ arr[i]=0;}
for(int i = 0 ; i < arr.length ; i++){ System.out.println(arr[i]);}
	}
}
/******************************************************************************

    Q. Largest element in the array 
        5
        1 2 3 4 5
        5

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		int maxi = Integer.MIN_VALUE;
		
		for(int i =0; i < arr.length; i++){
		    arr[i] = sc.nextInt();
		    maxi = Math.max(maxi, arr[i]);
		}
		
		System.out.println("Max val = "+maxi);
		
		
	}
}

/*
    5
    1 2 3 45 4
    45

*/
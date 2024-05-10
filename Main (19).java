/******************************************************************************

    Left Rotate the Array by One
    Input:
     N = 5, array[] = {1,2,3,4,5}
    Output:
     2,3,4,5,1
    Explanation:
     
    Since all the elements in array will be shifted 
    toward left by one so ‘2’ will now become the 
    first index and and ‘1’ which was present at 
    first index will be shifted at last.

*******************************************************************************/
import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < arr.length; i++){
		    arr[i] = sc.nextInt();
		}
		
		int temp = arr[0];
		for(int i = 1; i < arr.length; i++){
		    arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
		
		for(int x: arr){
		    System.out.print(x+" ");
		}
		
	}
}

/*

    5
    1 2 3 4 5
    2 3 4 5 1

*/

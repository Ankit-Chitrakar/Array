/******************************************************************************

    Rotate array by K elements
    Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
    Output: 6 7 1 2 3 4 5
    Explanation: array is rotated to right by 2 position .
    
    Example 2:
    Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
    Output: 9 10 11 3 7 8
    Explanation: Array is rotated to right by 3 position.

*******************************************************************************/
import java.util.*;
public class Main
{
    
    static void leftRotate(int arr[]){
        int temp = arr[0];
		for(int i = 1; i < arr.length; i++){
		    arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
    }
    
    static void rightRotate(int arr[]){
        int temp = arr[arr.length-1];
		for(int i = arr.length-1; i >= 1; i--){
		    arr[i] = arr[i-1];
		}
		arr[0] = temp;
    }
    
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < arr.length; i++){
		    arr[i] = sc.nextInt();
		}
		
	    int k = sc.nextInt();
	    sc.nextLine();
	    String direction = sc.nextLine();
	    direction = direction.toLowerCase();
	    
	    for(int i = 0; i < k; i++){
	        if(direction.equals("right")){
	            rightRotate(arr);
	        }
	        else if(direction.equals("left")){
	            leftRotate(arr);
	        }
	        
	    }
		
		for(int x: arr){
		    System.out.print(x+" ");
		}
		
	}
}

/*

   6
   1 2 3 4 5 6
   2 
   left
   3 4 5 6 1 2
   

*/

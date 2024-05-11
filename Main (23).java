/******************************************************************************
    
    Find the missing number in an array
    Input Format:
     N = 5, array[] = {1,2,4,5}
    Result:
     3
    Explanation: 
    In the given array, number 3 is missing. So, 3 is the answer.
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
	    
	    int flag = 0;
	    for(int i = 0; i < arr.length; i++){
	        if(arr[i]+1 != arr[i+1]){
	            flag = arr[i]+1;
	            break;
	        }
	    }
	    if(flag == 0){
	        System.out.println("ok");
	    }
		else{
		    System.out.println(flag);
		}
	}
}

/*

    5
    1 2 4 5 6
    3
    
*/

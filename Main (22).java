/******************************************************************************
    
    Linear Search
    Input: arr[]= 1 2 3 4 5, num = 3
    Output: 2
    Explanation: 3 is present in the 2nd index


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
		
		int key = sc.nextInt();
		int flag = 0;
		
		for(int i = 0; i < arr.length; i++){
		    if(arr[i] == key){
		        flag = i;
		        break;
		    }
		}
		if(flag == 0){
		    System.out.println("-1");
		}
		else{
		    System.out.println(flag);
		}
		
		
	}
}

/*

    5
    1 2 3 4 5
    4
    3
    
    5
    1 2 3 4 5
    6
    -1
*/

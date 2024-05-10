/******************************************************************************

    Check The array is sorted or not
    5
    1 2 3 4 5 
    yes
    6
    4 5 8 2 3 1
    no

*******************************************************************************/
import java.util.*;
public class Main
{
    static boolean isSorted(int []arr){
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < arr.length; i++){
		    arr[i] = sc.nextInt();
		}
		
		if(isSorted(arr)== true){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
	}
}

/*

    5
    1 2 3 4 5
    yes
    6
    4 5 7 3 2 9
    no

*/

/******************************************************************************

    Q. Second Largest, Second smallest element in the array 
        5
        1 2 3 4 5
        4 2

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i =0; i < arr.length; i++){
		    arr[i] = sc.nextInt();
		}
		
// 		int maxi = arr[0];
// 		int mini = arr[0];
		
// 		for(int i = 0; i < arr.length; i++){
// 		    maxi = Math.max(maxi, arr[i]);
// 		    mini = Math.min(mini, arr[i]);
// 		}
		
// 		int smaxi = Integer.MIN_VALUE;
// 		int smini = Integer.MAX_VALUE;
		
// 		for(int i = 0; i < arr.length; i++){
// 		    if(arr[i] > smaxi && arr[i] != maxi){
// 		        smaxi = arr[i];
// 		    }
// 		    if(arr[i] < smini && arr[i] != mini){
// 		        smini = arr[i];
// 		    }
// 		}
		
// 		System.out.println(smaxi+" , "+smini);

        int maxi = Integer.MIN_VALUE;
        int smaxi = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxi){
                smaxi = maxi;
                maxi = arr[i];
            }
            else if(arr[i] > smaxi && arr[i] < maxi){
                smaxi = arr[i];
            }
        }
        
        int mini = Integer.MAX_VALUE;
        int smini = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < mini){
                smini = mini;
                mini = arr[i];
            }
            else if(arr[i] < smini && arr[i] > mini){
                smini = arr[i];
            }
        }
		
		System.out.println(smaxi+" , "+smini);
		
	}
}

/*
    5
    1 2 3 45 4
    4, 2

*/
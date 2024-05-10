/******************************************************************************

    Remove Duplicates from array
    7
    1 2 1 3 2 1 1
    [1 2 3] length 3 
    

*******************************************************************************/
import java.util.*;
public class Main
{
    
    static int removeDuplicateBrute(int arr[]){
        HashSet<Integer> st = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++){
            st.add(arr[i]);
        }
        
        // st --> 1 2 3 
        // arr --> 1 2 1 3 2 1 1
        
        int j = 0;
        
        for(int x: st){
            arr[j++] = x;
        }
        
        return st.size();
    }
    
    static void removeDuplicatesOptimal(int arr[]){
        int i = 0;
        int j = i+1;
        
        while( j != arr.length){
            if(arr[i] == arr[j]){
                j++;
            }
            else if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        
        for(int k = 0; k < i+1; k++){
            System.out.print(arr[k]+" ");
        }
       
    }
   
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < arr.length; i++){
		    arr[i] = sc.nextInt();
		}
		
		System.out.println(removeDuplicateBrute(arr));
		
		// works for only sorted array the two pointer approach
		Arrays.sort(arr);

		removeDuplicatesOptimal(arr);
		
	}
}

/*

    7
    1 2 1 3 2 1 5
    1 2 3 5 ==> Array
    4       ==> Array Size

*/

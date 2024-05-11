/******************************************************************************
    
    Move all Zeros to the end of the array
    Input:
     1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
    Output:
     1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
    Explanation:
     All the zeros are moved to the end and non-negative integers are moved to front by maintaining order


*******************************************************************************/
import java.util.*;
public class Main
{
    
    static void moveAllZeroEnd(int arr[]){
        int i = 0;
        int j = -1;
        
        while(i != arr.length){
            if(arr[i] == 0){
                j = i;
                break;
            }
            i++;
        }
        
        if(j == -1){
            System.out.println("No zeros inside");
            return;
        }
        else{
            for(i = j+1; i < arr.length; i++){
                if(arr[i] != 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                    j++;
                }
            }
            
            for(int x: arr){
                System.out.print(x+" ");
            }
            
        }
        
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < arr.length; i++){
		    arr[i] = sc.nextInt();
		}
		
		moveAllZeroEnd(arr);
		
	}
}

/*

    8
    1 0 2 3 0 4 0 1
    1 2 3 4 1 0 0 0
*/

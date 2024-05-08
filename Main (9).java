/******************************************************************************
   Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]

Output: 1 2

Explanation: The element having the highest frequency is '1', and the frequency is 3. 
The elements with the lowest frequencies are '2', '3', and '4'. Since we need to pick the smallest element,
we pick '2'. Hence we return [1, 2].

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
	    
	    HashMap<Integer, Integer> mpp = new HashMap<>();
	    
	    for(int i = 0; i < arr.length; i++){
	        if(mpp.containsKey(arr[i]) == true){
	            mpp.put(arr[i], mpp.get(arr[i])+1);
	        }
	        else{
	            mpp.put(arr[i], 1);
	        }
	    }
	    
	    int highest = Integer.MIN_VALUE;
	    int lowest = Integer.MAX_VALUE;
	    for(int x: mpp.keySet()){
	        highest = Math.max(mpp.get(x), highest);
	        lowest = Math.min(mpp.get(x), lowest);
	    }
	    
	    int maxFreq = Integer.MIN_VALUE;
	    int minFreq = Integer.MAX_VALUE;
	    
	    for(Map.Entry<Integer, Integer> it: mpp.entrySet()){
	       
	        if(highest == lowest){
	           minFreq = Math.min(it.getKey(), minFreq);
	           maxFreq = minFreq;
	        }
	        else{
	            if(it.getValue() == highest){
	                maxFreq = Math.min(maxFreq, it.getKey());
	            }
	            
	            if(it.getValue() == lowest){
	                minFreq = Math.min(minFreq, it.getKey());
	            }
	        }
	       
	       if(it.getValue() > highest){
	           
	       }

	        
	    }
	    
	    System.out.println(maxFreq+", "+minFreq);
	}
}
/*
    Output
    6
    1 2 3 1 1 4
    1 2
    6
    10 10 10 3 3 3 
    3 3
*/

/******************************************************************************
    (Hashing using HashMap ==> Numbers)
    Q. give array size 
    take input 
    give how many querys are there
    count frequencys of that numbers

*******************************************************************************/


import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    int n = sc.nextInt(); 
	    int arr[] = new int[n];
	    for(int i = 0; i< n; i++){
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
	    
	    for(int x: mpp.keySet()){
	        System.out.println(x+" : "+ mpp.get(x));
	    }
	    
	    
	   
	}
}
/*
    Output
    5
    1 2 1 3 2 
    1 : 2
    2 : 2
    3 : 1
*/

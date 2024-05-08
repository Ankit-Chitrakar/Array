/******************************************************************************
    (Hashing Basics)
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
		
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		}
		
// 		int hash[maxSize+1]

        int hash[] = new int[13];
        
        Arrays.fill(hash, 0);
        
        for(int i = 0; i < n; i++){
            hash[arr[i]] += 1;
        }
		
	    int querys = sc.nextInt();
	    
	    while(querys != 0){
	        int num = sc.nextInt();
	        System.out.println(hash[num]);
	        querys--;
	    }
		
	}
}
/*
    Output
    5
    1 2 1 3 2
    5
    1 4 2 3 12
    2 
    0
    2
    1
    0
*/

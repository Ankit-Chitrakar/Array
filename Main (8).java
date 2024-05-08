/******************************************************************************
    (Hashing using HashMap ==> Character)
    Q. give array size 
    take input 
    give how many querys are there
    count frequencys of that characters

*******************************************************************************/


import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    String str = sc.nextLine();
	    
	    HashMap<Character, Integer> mpp = new HashMap<>();
	    
	    for(int i = 0; i < str.length(); i++){
	        if(mpp.containsKey(str.charAt(i)) == true){
	            mpp.put(str.charAt(i), mpp.get(str.charAt(i))+1);
	        }
	        else{
	            mpp.put(str.charAt(i), 1);
	        }
	    }
	    
	    for(char ch : mpp.keySet()){
	        System.out.println(ch+" : "+mpp.get(ch));
	    }
	    
	   
	}
}
/*
    Output
    abcdadbf
    a : 2
    b : 2
    c : 1
    d : 2
    f : 1
*/

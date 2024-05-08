/******************************************************************************
    (Hashing Basics ==> Characters)
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
		
	    int n = sc.nextInt(); //5
	    sc.nextLine();
	    String str = sc.nextLine(); //abacd
	    str = str.toLowerCase();
	    
	    int hash[] = new int[26];
	    Arrays.fill(hash, 0);
	    
	    for(int i = 0; i < n; i++){
	        hash[str.charAt(i) - 'a'] += 1;
	    }
	    
		int q= sc.nextInt();
		while(q != 0){
		    char ch = sc.next().charAt(0);
		    
		    System.out.println(hash[ch - 'a']);
		    q--;
		}
	}
}
/*
    Output
    6
    abacbd
    5
    a b f g d
    2 
    0
    0
    0
    1
*/

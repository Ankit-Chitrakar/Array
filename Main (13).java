/******************************************************************************

    ArrayList
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
// 		int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        
        
        // add
        
        list.add("Chitrakar");
        list.add("Ankit");
        
        System.out.println(list);  // [Chitrakar, Ankit]
		
		list.add(1, "Tiasa");
		list.add(3, "Chitrakar");
		
		System.out.println(list); // [Chitrakar, Tiasa, Ankit, Chitrakar]


		// ArrayList to Array
		
		String arr[] = new String[list.size()];
		
		for(int i = 0; i < arr.length; i++){
		    arr[i] = list.get(i);
		}
		
		for(int i = 0; i < arr.length; i++){
		    System.out.print(arr[i]+" ");    // Chitrakar, Tiasa, Ankit, Chitrakar
		}
		
		System.out.println("");
		
		
		// Array to ArrayList
		
		String arr1[] = {"I", "Love", "You"};
		
		Collections.addAll(list, arr1);   
		
		System.out.println(list);    // [Chitrakar, Tiasa, Ankit, Chitrakar, I, Love, You]
		
		
		
		
		// delete
		
		list.remove("Chitrakar"); // delete first instance of this 
		list.remove(1);  // delete index 1
		
		System.out.println(list);  // [Tiasa, Chitrakar]
		
		
		// traverse
		
		for(int i = 0; i < list.size(); i++){
		    System.out.print(list.get(i)+" ");    // Tiasa Chitrakar
		}
		
		
		// modify
		
		list.set(1, "Ash");
		System.out.println(list);  // [Tiasa, Ash]
		
		
		// sort
		
		Collections.sort(list);  
		
		System.out.println(list);  // [Ash, Tiasa]
		
		// modify through iteration
		
		for(int i = 0; i < list.size(); i++){
		    if(list.contains("Ash")){
		        list.set(i, "Chitra Kar");
		    }
		}
		
		System.out.println(list);   // [Chitra Kar, Tiasa]
		
		// remove all
		
		list.clear();
		System.out.println(list);  // []
		
		// check list has no element or not
		
		if(list.isEmpty() == true){
		    System.out.println("Yes");    // Yes
		}
		else{
		    System.out.println("No");
		}
		
		
	}
}

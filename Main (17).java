/******************************************************************************

    HashMap
    
    // key value pair
*******************************************************************************/
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);

	  HashMap<Character, Integer> mpp = new HashMap<>();
	  
	  int n = sc.nextInt();     // 7
	  
	  char arr[] = new char[n];
	  
	  for(int i = 0; i < arr.length; i++){
	      arr[i] = sc.next().charAt(0);    // a a b b c d e
	  }
	  
	  mpp.put('z', 26);
	  
	  for(int i = 0; i < arr.length; i++){
	      if(mpp.containsKey(arr[i])){
	          mpp.put(arr[i], mpp.get(arr[i])+1);
	      }
	      else{
	          mpp.put(arr[i], 1);
	      }
	  }
	  
	  for(char x: mpp.keySet()){
	      System.out.println(x+" : "+mpp.get(x));  // a : 2  b : 2  c : 1  d : 1  e : 1
	  }
	  
	  // remove
	  mpp.remove('z');   // remove onlu takes key
	  
	  System.out.println("************EntrySet*******************");
	  
	  for(HashMap.Entry<Character, Integer>it : mpp.entrySet()){
	      System.out.println(it.getKey()+" : "+it.getValue());
	  }
	  
	  
	  
	  
	  
  }
}

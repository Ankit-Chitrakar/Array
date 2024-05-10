/******************************************************************************

    Set
    
    // TreeSet   // element sorted ascending order
*******************************************************************************/
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);

	  TreeSet < Integer > st = new TreeSet <> ();

	  st.add (1);
	  st.add (2);
	  st.add (1);
	  st.add (3);
	  st.add (0);
	  st.add (1);
	  st.add (5);
	  st.add (2);
	  st.add (0);

	  System.out.println (st);	  // [0, 1, 2, 3, 5]
	  
	  int arr[] = {4, 6, 5, 9, 11, 13, 14,};
	  
	  ArrayList<Integer> list = new ArrayList<>();
	  
	  for(int i : arr){
	      list.add(i);
	  }
	  
	  st.addAll(list);
	  System.out.println (st);	// [0, 1, 2, 3, 4, 5, 6, 9, 11, 13, 14]
	  
	  
    // All other methods are same as HashSet
	
  }
}

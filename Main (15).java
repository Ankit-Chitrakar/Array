/******************************************************************************

    Set
    
    // HashSet    // element storing not sorted order
*******************************************************************************/
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);

	  HashSet < Integer > st = new HashSet <> ();

	  st.add (1);
	  st.add (2);
	  st.add (1);
	  st.add (3);
	  st.add (0);
	  st.add (1);
	  st.add (5);
	  st.add (2);
	  st.add (0);

	  System.out.println (st);	// [0, 1, 2, 3, 5]

	// Array to ArrayList

	// Array to ArrayList

	int arr[] = { 15, 16, 15, 18, 16 };

	ArrayList < Integer > list = new ArrayList <> ();


    for (int i:arr){
    	list.add (i);
    }

	System.out.println (list);	// [15, 16, 15, 18, 16]

	st.addAll (list);

	// added list to Set (not sorted)

	System.out.println (st);	// [0, 16, 1, 2, 18, 3, 5, 15]

	// If we want sort this set first convert it into list then sort to print output

	// list = new ArrayList<>(st);

	// Collections.sort(list);

	//     System.out.println(list);   // [0, 1, 2. 3, 5, 15, 16, 18]


	//     // remove elements 

	//     st.remove(0);   // give element not index

	//     System.out.println(st);

	st.removeAll (list);		// remove allthe list item present in the set 

	System.out.println (st);	// [0, 1, 2, 3, 5]

	// union --> add 2 list and uniquly store set this is union
	// intersection  --> retainAll() common from 2 sets


    System.out.println("UNION & INTERSECTION");

	HashSet < Integer > st1 = new HashSet <> ();

	st1.add (3);
	st1.add (5);
	st1.add (7);

	System.out.println (st1);


	HashSet < Integer > st2 = new HashSet <> ();

	st2.add (13);
	st2.add (3);
	st2.add (17);
	

	System.out.println (st2);
	
// 	union
    
    HashSet<Integer> union = new HashSet<>(st1);
    
    union.addAll(st2);
    
    System.out.println(union);    // [17, 3, 5, 7, 13]
    
    // intersection
    
    HashSet<Integer> intersection = new HashSet<>(st1);
    
    intersection.retainAll(st2);
    
    System.out.println(intersection);   // [3]
     


    // Contains
    
    if(st1. contains(3)){
        System.out.println("Yes");    // yes
    }
    else{
        System.out.println("No");
    }

    if(intersection.containsAll(st1)){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");   // no
    }

    union.clear();
    
    if(union.isEmpty()){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
    
    System.out.println(union);  // []

  }
}

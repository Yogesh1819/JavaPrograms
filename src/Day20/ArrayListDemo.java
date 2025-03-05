package Day20;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList list=new ArrayList();
		
		// Adding Data Into The Array List
		list.add(100);
		list.add(10.5);
		list.add("Yogesh");
		list.add('A');
		list.add(true);
		list.add(null);
		
		// Print The Array
		System.out.println(list);
		
		// Print The Size Of An Array
		System.out.println(list.size());
		
		// Insert Element in the ArrayList
		list.add(3, 1000);
		
		// Modify Element in the ArrayList
		list.set(2, "Tejinkar");
		
	    // Access Specific Element From ArrayList
		System.out.println(list.get(4));
		
		
		// Reading ALL Element From The List
		/*for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		*/
		
		// Reading Data Using Enhance For Loop
		
		for(Object X:list)
		{
			System.out.println(X);
		}
		

	}

}

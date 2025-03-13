package Day20;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {

	public static void main(String[] args) {
	
		
		HashSet obj= new HashSet();
		
		obj.add(100);
		obj.add("Yogesh");
		obj.add('A');
		obj.add(10.5);
		obj.add(100);
		obj.add(null);
		
		// Print HashSet Data
		System.out.println(obj);
		
		//Removing the element from list
		obj.remove(100);
		System.out.println(obj);
		
	//	obj.clear();
	//	System.out.println(obj);
		
		for(Object X:obj)
		{
			System.out.println(X);
		}

		
		Iterator ab =obj.iterator();
		
		while(ab.hasNext())
		{
			System.out.println(ab.next());
		}
	}

}

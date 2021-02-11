package BasicJava;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String names[] = {"zakariya","mohamed","riyana","malik","mohamed","liban"};
		//loop within a loop o(nxn) o n square worst solution because of time complexity imagine 100's of values would be too much 
		for(int i = 0; i<names.length;i++) {
			for(int j = i+1; j<names.length;j++) {
				
				if(names[i].equals(names[j])) {
					System.out.println("duplicate name is::"+names[i]);
				}
			}
		}
		
		System.out.println("*********************");
		
		//HashSet :: java collections :: it stores unique values: time complexity is O(n) (O n square) because im only using 1 for loop
		Set<String> store = new HashSet<String>();
		for(String name : names) {
			if(store.add(name) == false) {
				System.out.println("duplicate name is::"+name);
			}
		}
		
		
		
		
		
		
		
	}

}

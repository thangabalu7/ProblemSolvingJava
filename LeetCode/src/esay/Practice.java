package esay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		ArrayList lst = new ArrayList();
		ArrayList lst2 = new ArrayList();
		ArrayList lst3 = new ArrayList();
		
		lst.add("ADDER");
		lst.add("SUBRACTER");
		
		
		lst2.add(1);
		lst2.add(2);
		
		lst3.add(4);
		lst3.add(5);
		
		
		System.out.println(lst);
		
		String [] str = {"hello", "hai","bye"};
		
		List as=Arrays.asList(str);
		System.out.println(as);
	}
}

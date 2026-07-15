import java.util.*;

public class CollectionsEx {

	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<>();
		a.add("ram");
		a.add(12);
		a.add(12);
		a.add(3.2);
		System.out.println(a);
		
		a.set(1, 78);
		a.add(1,99);
		System.out.println(a);
//		System.out.println(b);
		
		ArrayList<Object> c=new ArrayList<>();
		c.add(a);
		c.add("rahul");
		c.add(23);
		a.add(1.2);
		System.out.println(c);
	}

}
//WAP to remove duplicates from an ArrayList.
//WAP to sort an ArrayList<String> in ascending and descending order.
//WAP to reverse elements of an ArrayList.
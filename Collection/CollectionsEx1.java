import java.util.*;



public class CollectionsEx1 {

	public static void main(String[] args) {
		HashSet<Object> a=new HashSet<>();
//		ArrayList a=new ArrayList();
		System.out.println(a);
		a.add("ram");
		a.add(3.2);
		a.add(3.2);
		a.add(10);
		System.out.println(a);
//		System.out.println(a.get(0));
		for(Object o:a) {
			System.out.println(o);
		}
	}

}
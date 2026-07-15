import java.util.*;

public class CollectionsEx4 {

	public static void main(String[] args) {
		HashSet<Object> a=new HashSet<>();
//		ArrayList a=new ArrayList();
		a.add(10);
		a.add("Ram");
		a.add(10);
		a.add(7.2);
		a.add(12);
		a.add(5);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		for(Object o:a) {
			System.out.println(o);
//			a.remove(o); //can not remove inside for-each loop Exception occurred: ConcurrentModificationException
		}
		Iterator<Object> i=a.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			System.out.println(o);
			i.remove();
//			a.add(o);
		}
		
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}

}
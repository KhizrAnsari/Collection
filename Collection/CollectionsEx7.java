import java.util.*;

public class CollectionsEx7 {

	public static void main(String[] args) {
//		ArrayList a=new ArrayList();
		Vector<Object> a=new Vector<>();
		a.add(10);
		a.add("Ram");
		a.add(7.2);
		a.add(5);
		a.add(12);
		a.add(14);
		a.add(10);
//		Iterator i=a.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
////			i.remove();
//		}
		
		Enumeration<Object> e=a.elements();
			while(e.hasMoreElements()) {
				System.out.println(e.nextElement());
		}
		System.out.println(a);
	}

}
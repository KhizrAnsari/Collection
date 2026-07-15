import java.util.*;

public class Collections8_2 {

	public static void main(String[] args) {
		Queue<Object> a=new LinkedList<>();
//		Queue a=new ArrayDeque();
//		Queue a=new PriorityQueue();
		
		a.add(10);
		a.add("Ram");
		a.add(7.2);
		a.add(90);
		a.add(10);
		a.add(5);

		System.out.println(a);
		System.out.println(a.poll());
		System.out.println(a);
		
		Iterator<Object> i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(Object f:a) {
			System.out.println(f);
		}
	}

}
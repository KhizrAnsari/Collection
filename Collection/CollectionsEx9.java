import java.util.*;

public class CollectionsEx9 {

	public static void main(String[] args) {
		HashMap a=new HashMap();
		a.put("abc",10);//(key,value)->(k,v)
		a.put("xyz","Ram");
		a.put(1,7.2);
		a.put("tuv",10);
		a.put("xyz","pqr");
		a.put("ghi",12);
		a.put(2,5);
		System.out.println(a);
		System.out.println(a.get("xyz"));
		
		//Access all buckets/entries
		Set s=a.entrySet();
		
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(Object o:s) {
			System.out.println(o);
		}
		
		//Access all keys
		Set s2=a.keySet();
		Iterator i2=s2.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		//Access all values
		Set s3=a.keySet();
		Iterator i3=s3.iterator();
		while(i3.hasNext()) {
			System.out.println(a.get(i3.next()));
		}
	}

}
package javapractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Collectionstudy {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Velocity");
		al.add("May-21");
		al.add(null);
		al.add(null);
		al.add("Velocity");
		al.add(21);
		al.add(20);
		al.add('A');
		System.out.println(al);
		
//		System.out.println(al.size());
//		
//		System.out.println(al.indexOf('A'));
//		
//		System.out.println(al.lastIndexOf("Velocity"));
		al.set(2, 'A');
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains(20));
		System.out.println(al.get(5));
		al.add(2, "Prashant");
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		
		
		Iterator it=al.iterator();
	
	}

}

package JavaProject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Arraylst {

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		int[] x= {10,20,30,40,50}; // Array
		int[] y= new int [5]; //Array
		y[0]=10;
		y[1]=40;
		y[2]=50;
		y[3]=60;
		y[4]=70;
		
		System.out.println(x[2]);
		System.out.println(y[2]);
		
		
		/*ArrayList<Integer> al= new ArrayList<>(); // ArrayList
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println("ArrayList--"+al.get(2));*/
		
		List<Integer> al= new ArrayList<>(); // ArrayList
		al.add(10);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println("ArrayList--"+al.get(5));
		System.out.println("Before"+al);
		al.add(5,999);
		System.out.println("After"+al);
		al.remove(4);
		System.out.println("Aft Removing"+al);
		System.out.println();
		
		List<Integer> ll= new LinkedList<>();  // LinkedList
		ll.add(10);
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		System.out.println("LinkedList--"+ll.get(4));
		System.out.println("Before"+ll);
		ll.add(5,999);
		System.out.println("After"+ll);
		ll.remove(1);
		System.out.println("Aft Removing"+ll);
		System.out.println();
		
		
		Set<Integer> hs= new  HashSet<>();// HashSet
		hs.add(60);
		hs.add(50);
		hs.add(50);
		hs.add(40);
		hs.add(30);
		hs.add(20);
		hs.add(10);
		System.out.println("HashSet--"+hs);
		System.out.println();
		
		Set<Integer> lhs= new LinkedHashSet<>();// HashSet
		lhs.add(60);
		lhs.add(50);
		lhs.add(50);
		lhs.add(40);
		lhs.add(30);
		lhs.add(20);
		lhs.add(10);
		System.out.println("LinkedHashSet--"+lhs);
		System.out.println();
		
		
		Set<Integer> ts= new TreeSet<>();// HashSet
		ts.add(60);
		ts.add(50);
		ts.add(50);
		ts.add(40);
		ts.add(30);
		ts.add(20);
		ts.add(10);
		System.out.println("TreeSet--"+ts);
		
		
		
       
	}

}

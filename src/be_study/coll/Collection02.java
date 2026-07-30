package be_study.coll;

import java.util.HashSet;
import java.util.Set;

public class Collection02 {

	public static void main(String[] args) {
		
		// Set
		// 중복허용X
		
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("D");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("A");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		
		System.out.println(set1.size());
		System.out.println(set1.isEmpty());
		System.out.println(set1.contains("C"));
		
		for(String s : set1)
			System.out.print(s + " ");
		System.out.println();
		
		
	}

}

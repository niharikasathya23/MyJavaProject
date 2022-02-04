package com.rakuten.trainings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortStringNatural();
		sortListUserDefn();
		sortStrArrayWithComparator();

	}
// we can even write our own comparator func her its written to sort based on len of str
	private static void sortStrArrayWithComparator() {
		// TODO Auto-generated method stub
		String[] strings= {"this","is","an","array","of","strings"};
		System.out.println(Arrays.asList(strings));
		Arrays.sort(strings, new StrLenComparator());

		//can write like this also-Anonymous inner class
//		Arrays.sort(strings,new Comparators<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.length()-o2.length();
//			}
//		});
		
		System.out.println(Arrays.asList(strings));
		
	}
	//goto to chemicalelements and add implements comparator and override a campareto func

	private static void sortListUserDefn() {
		// TODO Auto-generated method stub
		List<ChemicalElement> l=new ArrayList<>();
		l.add(new ChemicalElement(1,"H","Hydrogen"));
		l.add(new ChemicalElement(8,"O","Oxygen"));
		l.add(new ChemicalElement(7,"N","Nitrogen"));
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		
	}

	private static void sortStringNatural() {
		String[] strings= {"this","is","an","array","of","strings"};
		System.out.println(Arrays.asList(strings));
		Arrays.sort(strings);
		System.out.println(Arrays.asList(strings));//arrays,asList is used because it has meaningfully overriden to string and prints properly
	}

}

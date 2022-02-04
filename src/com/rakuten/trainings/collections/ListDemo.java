package com.rakuten.trainings.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void myAlgo(List l) {
		l.get(123);
		l.add(0,"anyvalue");
		
		Iterator it=l.iterator();
		
		while(it.hasNext());
		{
			System.out.println(it.hasNext());
		}
		//for(Object o:l) {
		//	System.out.println(o);
	//	}
		//int size=l.size();
		
		//for(int i=0;i<size;i++) {
		//	System.out.println(l.get(i));
		//}
	}
		public static void removeSmallWords(List<String> words) {
//			for(String aWord: words) {
//				if(aWord.length()<4) {
//					words.remove(aWord);
//				}
//			}
			System.out.println("before removal"+words.size());
			Iterator<String> it= words.iterator();
			while(it.hasNext()) {
				String aWord=it.next();
				if(aWord.length()<4) {
					it.remove();
				}
			
			}
			System.out.println("after removal"+words.size());
			 
		}
		
		
		
	
	public static void main(String[] args) {
		String[] strings= {"These","are","some","list","of","words"};
		List<String> slist=Arrays.asList(strings);
		List<String> l=new LinkedList<>(slist);
		removeSmallWords(l);
		}  
	}
	
	


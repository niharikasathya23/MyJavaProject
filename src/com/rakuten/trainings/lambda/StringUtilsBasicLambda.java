package com.rakuten.trainings.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class StringUtilsBasicLambda {

	public int eChecker(String s1,String s2) {
		
		if(s1.contains("e")&& !s2.contains("e)")) {
			return -1;
		}else if(s2.contains("e")&& !s1.contains("e")) {
			return 1;
		}
		return 0;
		
	
}
	public static <T> T betterEntry(T obj1,T obj2,TwoElementInterface<T> decider) {
		if(decider.isFirstBetterThanSecond(obj1, obj2)) {
			return obj1;
		}else {
			return obj2;
		}
	}
	
	public static String betterString(String s1,String s2,TwoStringPredicate decider) {
		if(decider.isFirstBetterThanSecond(s1, s2)) {
			return s1;
		}else {
			return s2;
		}
	}
	public static String allMatches(List<String> words, Predicate<String> matchFunction) {
		for(String possibleMatch:words) {
			if(matchFunction.test(possibleMatch)) {
				return(possibleMatch);
			}
		}
		return(null);
	}

	public static void main(String[] args) {
		
		String[] strings= {"these","are","some","arrays","of","strings"};
		System.out.println(Arrays.asList(strings));
		Arrays.sort(strings,(s1,s2)->s1.length()-s2.length());
		System.out.println(Arrays.asList(strings));
		//reverse
		Arrays.sort(strings,(s1,s2)->s2.length()-s1.length());
		System.out.println(Arrays.asList(strings));
		//sort on 1st alphabet
		Arrays.sort(strings,(s1,s2)->s1.charAt(0)-s2.charAt(0));
		System.out.println(Arrays.asList(strings));
		
//		Arrays.sort(strings,(s1,s2)->{
//			if(s1.contains("e")&& !s2.contains("e)")) {
//				return -1;
//			}else if(s2.contains("e")&& !s1.contains("e")) {
//				return 1;
//			}
//			return 0;
//			
//		});
//		System.out.println(Arrays.asList(strings));
		StringUtilsBasicLambda obj=new StringUtilsBasicLambda();
		Arrays.sort(strings, obj::eChecker);
		System.out.println(Arrays.asList(strings));
		
		String better=betterString("hi","Hello",(x,y)->x.length()>y.length());
		System.out.println(better);
		
		String betters=betterEntry("hi","Hello",(x,y)->x.length()>y.length());
		System.out.println(betters);
		
		 List<String> words=Arrays.asList("hi","my","name","is","Niharika");
		 
		 Stream.of(words).forEach((s)->System.out.println(s));
		 Stream.of(words).forEach(System.out::println);
		 
		String shortWords=StringUtilsBasicLambda.allMatches(words,s->s.length()>4);
		System.out.println(Arrays.asList(shortWords));
		String wordsWithS=StringUtilsBasicLambda.allMatches(words,s->s.contains("n"));
		System.out.println(Arrays.asList(wordsWithS));
		String evenWordLen=StringUtilsBasicLambda.allMatches(words,s->(s.length()%2)==0);
		System.out.println(Arrays.asList(evenWordLen));
	

	

}
}


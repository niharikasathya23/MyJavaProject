package com.rakuten.trainings.lambda;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateExample {
	
	public static <T,R>  List<R> TransformList(List<T> words, Function<T,R> matchFunction) {
		List<R> filteredlist=new ArrayList<R>();
			for(T x:words) {
		
			R t=matchFunction.apply(x);
			filteredlist.add(t);
			
		}
		return filteredlist;
	}
	

	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("Hi","hello","no");
		
		//using predicates and functions
		List<String> excited=TransformList(words,s->s+"!");
		System.out.println(excited);
		List<String> uppercase=TransformList(words,String::toUpperCase);
		System.out.println(uppercase);
		List<Integer> shortString=TransformList(words,String::length);
		System.out.println(shortString);
		
		//using streams-maps
		List<String> exciteds= words.stream().map(s->s+"!").collect(Collectors.toList());
		System.out.println(exciteds);
		List<String> upped = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upped);
		
		//using streams-filter
		List<String> lens=words.stream().filter(s->s.length()>2).collect(Collectors.toList());
		System.out.println(lens);
		List<String> wordsWithS=words.stream().filter(s->s.contains("n")).collect(Collectors.toList());
		System.out.println(wordsWithS);
		List<String> evenWordLen=words.stream().filter(s->(s.length()%2)==0).collect(Collectors.toList());
		System.out.println(evenWordLen);
		
		
		
		
		
	}

}

package com.rakuten.trainings.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.DoubleStream;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
		Object result1=letters.stream().reduce((s1, s2)->s1.toUpperCase()+s2.toUpperCase());
		System.out.println(result1);
		String result2 = letters.stream().map(String::toUpperCase).reduce("", String::concat);
		System.out.println(result2);
		Object result3=letters.stream().reduce((s1, s2)->s1.toUpperCase()+","+s2.toUpperCase());
		System.out.println(result3);
		
		String[] strArray = {
                "My",
                "name",
                "is",
                "Niharika",
                
        };
 
       //string concatenation using lambda
        Optional<String> resultLEx = Arrays
                .stream(strArray)
                .reduce((str1, str2) -> str1 + " " + str2);
 
        // print result if present
        resultLEx.ifPresent(System.out::println);
 
 
        //  Stream.reduce() - string concatenation using method ref
        Optional<String> resultMRef = Arrays
                .stream(strArray)
                .reduce(String::concat);
 
        // print result, if present
        resultMRef.ifPresent(System.out::println);
 
 
        //  upper case and string concat
        Arrays
        .stream(strArray)
        .reduce((str1, str2) -> str1.toUpperCase() + " " + str2.toUpperCase())
        .ifPresent(System.out::println); 
 
 
        // String concatenation with pipe | separator
        Arrays
        .stream(strArray)
        .reduce((str1, str2) -> str1 + "|" + str2)
        .ifPresent(System.out::println);
        
       double[] resultdob= new Random().doubles().limit(22).toArray();
        System.out.println(Arrays.toString(resultdob));
        //double sumOfSquare = DoubleStream.of(resultdob).map(Math::sqrt).sum();
        double sumOfSquares = DoubleStream.of(resultdob).parallel().map(Math::sqrt).sum();
        //System.out.println((sumOfSquare));
        System.out.println((sumOfSquares));

	}

}

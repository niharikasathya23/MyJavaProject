package com.rakuten.trainings.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> words=new LinkedHashSet<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("enter unique word or quit");
			String input=sc.nextLine();
			if(input.equalsIgnoreCase("quit")){
				break;
			}
			if(!words.add(input)) {
				System.out.println("thats a duplicate");
			}
		}
	
		System.out.println("----------all unique words are-----");
		for(String s:words) {
			System.out.println(s);
		}

	}

}

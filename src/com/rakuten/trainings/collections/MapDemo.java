package com.rakuten.trainings.collections;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		simpleMapOps();
		//opsOnMapOfUserDefnKey();

	}

//	private static void opsOnMapOfUserDefnKey() {
//		// TODO Auto-generated method stub
//		Map<ChemicalElement,Double> earth=new HashMap<>();
//		ChemicalElement h=new ChemicalElement(1, "H","Hydrogen");
//		ChemicalElement o=new ChemicalElement(8, "O","Oxygen");
//		ChemicalElement n=new ChemicalElement(7, "n","Nitrogen");
//		earth.put(h,1.0);
//	    earth.put(o,21.0);
//		earth.put(n,78.0);
//		
//		
//		Scanner sc=new Scanner(System.in);
//		while(true) {
//			System.out.println("enter atomic num or quit");
//			String input=sc.nextLine();
//			if(input.equalsIgnoreCase("quit")) {
//				break;
//			}
//			int atnum=Integer.parseInt(input);
//			ChemicalElement unknown=new ChemicalElement(atnum, "", "");
//			if(earth.containsKey(unknown)) {
//				System.out.println("% of the element in atmosphere with atomic number "+input+ " is "+earth.get(unknown));
//				
//			}
//			else {
//				System.out.println("No element with atomic num "+input); 
//			}
//			
//			
//			}
//			
//		}
//		
//		
//	

	private static void simpleMapOps() {
		// TODO Auto-generated method stub
		//Map<String,String> map=new HashMap<>(); iteration order is different
		Map<String,String> map=new LinkedHashMap<>();
		map.put("E1", "Niharika");
		map.put("E2", "Kruthi");
		map.put("E3", "Neha");
		map.put("E4", "Nishitha");
		map.put("E5", "Sahana");
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("enter employee id or quit");
			String input=sc.nextLine();
			if(input.equalsIgnoreCase("quit")) {
				break;
			}
			if(map.containsKey(input)) {
				System.out.println("Name of emp with id "+input+" is "+map.get(input));
				
			}
			else {
				System.out.println("No emp with id"+input); 
			}
			
			System.out.println("List of all employees abd mappings");
			
			Set<String> keys =map.keySet();
			for(String akey:keys) {
				System.out.println(akey+"----->"+map.get(akey));
				 
			}
			
		}
		
	}

}

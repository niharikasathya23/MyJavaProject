package com.rakuten.trainings.collections;

import java.nio.charset.CharsetEncoder;

import javax.print.attribute.standard.MediaSize.Other;

public class ChemicalElement implements Comparable<ChemicalElement> {
	private int atnum;
	private String symbol;
	private String name;
	
	private static boolean[] alkaliMetals= new boolean[130];
	 
	static {
		alkaliMetals[3]=true;
		alkaliMetals[11]=true;
		alkaliMetals[19]=true;
		alkaliMetals[37]=true;
		alkaliMetals[55]=true;
		alkaliMetals[87]=true;
		
	}
	public ChemicalElement(int atnum,String symbol,String name) {
		super();
		this.atnum=atnum;
		this.symbol=symbol;
		this.name=name;
		
	}
	
	public boolean isAlkaliMetal() {
		return alkaliMetals[atnum];
		
	}
	
	public boolean isTransitionMethod() {
		return(atnum>=21 && atnum<=31)||(atnum>=39 && atnum<=48)||(atnum>=72 && atnum<=80)||(atnum>=104 && atnum<=112);
		
	}
	public boolean isMetal() {
		switch(atnum){
		case 13:
		case 49:
		case 50:
		case 81:
		case 83:
		case 113:
		case 114:
		case 115:
		case 116:
			return true;
		default:
			return false;
		}
	}
	public int getAtNum() {
		return atnum;
		
	}
	public String getSymbol() {
		return symbol;
		
	}
	public String getName() {
		return name;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + atnum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChemicalElement other = (ChemicalElement) obj;
		if (atnum != other.atnum)
			return false;
		return true;
	}
	@Override
	public int compareTo(ChemicalElement o) {
		// TODO Auto-generated method stub
		if(this.atnum>o.atnum) {
			return 1;
		}
		else if(o.atnum>this.atnum) {
			return -1;
			
		}return 0;
	}

	@Override
	public String toString() {
		return "ChemicalElement [atnum=" + atnum + ", symbol=" + symbol + ", name=" + name + "]";
	}
	
	
	
	
}

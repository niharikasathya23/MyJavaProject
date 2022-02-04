
public class ChemicalElement {
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
	

}

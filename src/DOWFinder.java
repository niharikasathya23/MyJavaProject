
public class DOWFinder {
	public String findDOW(int day, int month,int year) {
		int num=(year-1990)*365;
		num+=(year-1990)/4;
		switch(month) {
		case 12:
			num+=30;
		case 11:
			num+=31;
		case 10:
			num+=30;
		case 9:
			num+=31;
		case 8:
			num+=31;
		case 7:
			num+=30;
		case 6:
			num+=31;
		case 5:
			num+=30;
		case 4:
			num+=31;
		case 3:
			num+=28;
		case 2:
			num+=30;
			
		}
		num+=day;
		if(year%4==0 && month<=2) {
			num--;
		}
		int dowind=num%7;
		String[] dows= {"sun","mon","tue","wed","thur","fri","sat"};
		return dows[dowind];
		
		}
		public static void main(String[] args) {
			DOWFinder finder=new DOWFinder();
			String dow=finder.findDOW(27, 1, 2022);
			System.out.println(dow);
		
	}

}

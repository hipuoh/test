
public class ex2 {
	public static String ex2(int num) {
		String result;
		
		if(num >=90 && num <= 100) 
			result="A";
		else if(num >=80 && num <= 100)
			result="B";
		else if(num >=70 && num <= 100)
			result="C";
		else if(num >=0 && num <= 100) 
			result="F";
		else
			result="오류";
		return result;
	}
}

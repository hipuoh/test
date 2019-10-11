
public class ex1 {

	public static String ex1(int num) {
		String result = null;
		
		if(num >= 90 && num <= 100) {
			result="A";
		}
		else if(num >= 80) {
			result="B";
		}
		else if(num >= 70) {
			result ="C";
		}
		else {
			result="F";
		}
		
		return result;
	}
}

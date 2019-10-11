import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ex2Test {

	ex2 ex;
	int[] num = {-1,0,1,69,70,71,79,80,81,89,90,91,99,100,101};
	String[] result= {"오류","F","F","F","C","C","C","B","B","B","A","A","A","A","오류"};
	@Before
	public void init() {
		ex = new ex2();
	}
	@Test
	public void test() {
		String jumsu;
		for(int i=0; i<num.length; i++) {
			
			jumsu = ex.ex2(num[i]);
			assertEquals(jumsu, result[i]);
		}
	}
}

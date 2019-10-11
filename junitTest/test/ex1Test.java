import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ex1Test {
	ex1 ex;
	int[] num = {55,76,87,94};
	String[] result = {"F","C","B","A"};
	@Before
	public void init() {
		ex = new ex1();
	}
	@Test
	public void testEx() {
		String jumsu;
		for(int i=0; i<num.length; i++) {
			jumsu = ex.ex1(num[i]);
			assertEquals(jumsu, result[i]);
		}
	}
}

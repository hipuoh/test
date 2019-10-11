package AgeTax;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AgeTaxTest {
	private AgeTax at;
	int[] age= {16,65,30,64,15,66,99,1};
	int[] earnings= {19999,15000,20000,99000,1000,10000,21000,30000};
	boolean[] child= {true,false,true,false,true,false,true,false};
	@Before
	public void setup() {
		at = new AgeTax();
	}


	@Test
	public void test() {
		for(int i=0; i<age.length; i++) {
			at.setAge(age[i]);
			at.setChild(child[i]);
			at.setEarnings(earnings[i]);
			at.taxCal();
			System.out.println(at);
		}
	}
}

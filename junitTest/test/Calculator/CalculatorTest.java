package Calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/* 
 * 1. @BeforeClass(해당 테스트 클래스가  실행되기 이전의 수행할 코드를 구현)
 * 2. @Before(테스트 작성전에 수행할 코드 구현)
 * 3. @Test(테스트 코드 구현)
 * 		ㄴ assertXXX 메소드를 지용하여 테스트로직 구현
 * 4. @After(테스트 종료전에 수행할 코드 구현)
 * 5. @AfterClass(해당 테스트 클래스가 실행된 이후에 수행할 코드를 구현) 
 */
public class CalculatorTest {
	//private Calculator cal = new Calculator();
	private Calculator cal;
	@Before
	public void setup() {
		System.out.println("@Before.....");
		cal = new Calculator();
	}
	@Test
	public void test() {
		//Calculator cal = new Calculator();
		int result = cal.add(2, 3);
		assertEquals(6, result);
		
		System.out.println(result);
	}
	@Test
	public void subTest() {
		//Calculator cal = new Calculator();
		assertEquals(5, cal.sub(10, 5));
	}
	@Test
	public void mulTest() {
		
	}
	@Test
	public void divideTest() {
		//Calculator cal = new Calculator();
		int result = cal.div(9, 3);
		assertEquals(4, result);
	}
	@After
	public void tearDown() {
		System.out.println("@After....");
		
	}

}

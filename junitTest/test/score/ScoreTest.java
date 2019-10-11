package score;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ScoreTest {

	private Score ScoreTest;
	int[] jumsu = {-1,0,1,59,69,70,79,80,81,89,90,91,99,100,101};
	String[] result = {"F학점","F학점","F학점","F학점","F학점","F학점","D학점","C학점","B학점","A학점","A학점","Error"};
	@Before
	public void setup() {
		ScoreTest = new Score();
	}
	@Test
	public void Test() {
		for(int i=0; i<jumsu.length; i++) {
			if(jumsu[i]>100 || jumsu[i]<0) {
				ScoreTest.setNum(jumsu[i]);
				assertEquals(result[11], ScoreTest.ScoreResult());
				System.out.println("입력값 : " + jumsu[i] + ", 기대값 : " + result[11]+ ", 결과값 : " + ScoreTest.ScoreResult() );
			}
			else {
				ScoreTest.setNum(jumsu[i]);
				assertEquals(result[((jumsu[i])/10)], ScoreTest.ScoreResult());
				System.out.println("입력값 : " + jumsu[i] + ", 기대값 : " + result[jumsu[i]/10]+ ", 결과값 : " + ScoreTest.ScoreResult() );
			}
			//System.out.println(ScoreTest);
		}
	}

}

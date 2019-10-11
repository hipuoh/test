package score;

public class Score {
	int num;
	String result;
	public String getResult() {
		return result;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Score [num=" + num + ", result=" + result + "]";
	}
	public String ScoreResult() {
		if(num < 0 || num > 100) {
			result = "Error";
		}
		else {
			switch (num/10 ) {
			case 10:
			case 9:
				result = "A학점";
				break;
			case 8:
				result="B학점";
				break;
			case 7:
				result="C학점";
				break;
			case 6:
				result="D학점";
				break;
			default:
				result="F학점";
				break;
			}
		}
		return result;
	}
	
}

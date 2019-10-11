package AgeTax;

public class AgeTax {
	int age;
	boolean child;
	int earnings;
	int tax;
	public void setAge(int age) {
		this.age = age;
	}
	public void setChild(boolean child) {
		this.child = child;
	}
	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}
	@Override
	public String toString() {
		return "AgeTax [age=" + age + ", child=" + child + ", earnings=" + earnings + ", tax =" + tax +"]";
	}
	
	public int taxCal() {
		if(child) {
			if(age < 16 || age > 65 ) {
				tax = earnings;
			}
			else {
				if(earnings > 20000) {
					//50% 세금 + 10감세
					tax = (int) ((earnings*0.5)-((earnings*0.5)*0.1));
				}
				else {
					//20%세금 + 10 감세
					tax = (int) ((earnings *0.2)-((earnings*0.2)*0.1));
				}
			}
		}
		else {
			if(age < 16 || age > 65 ) {
				tax = earnings;
			}
			else {
				if(earnings > 20000) {
					//50% 세금 
					tax = (int) (earnings *0.5);
				}
				else {
					//20%세금
					tax = (int) (earnings /0.2);
				}
			}
			
		}
		return tax; 
	}
}


public class Test {
	public void doIT(int i, Person p) {
		i = 5;
		p.number =8;
		
		
	}
	public static void main (String args) {
		int x =0;
		Person p = new Person();
		new Test().doIT(x, p);
		System.out.println(x+" "+p.number);
	}

}

package pb;

public class Fraction {
	private int n;
	private int d;
	public Fraction(int x, int y) {
		n = x;
		d = y;
	}
	public void show() {
		System.out.println(((double) n / (double) d) + "です");
	}
}

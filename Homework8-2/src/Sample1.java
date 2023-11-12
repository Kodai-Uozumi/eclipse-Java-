abstract class Book{
	protected String title;
	public Book(String t) {
		title = t;
	}
	abstract void show();
}
class Magazine extends Book{
	private int no;
	public Magazine(String t, int n) {
		super(t);
		no = n;
	}
	public void show() {
		System.out.println("題目「" + title + "」 第" + no + "号");
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Book[] a = {
				new Magazine("Java Magazine", 20),
				new Magazine("Java Magazine", 21),
				new Magazine("Java Magazine", 22)
		};
		for(int i = 0; i < a.length; i++)
			a[i].show();
	}
}

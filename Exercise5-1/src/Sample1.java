class Tenbin{
	private int left;
	private int right;
	Tenbin(){
		left = 0;
		right = 0;
	}
	Tenbin(int l, int r){
		left = l;
		right = r;
	}
	void left(int w) {
		left += w;
	}
	void right(int w) {
		right += w;
	}
	void show() {
		if(left > right)
			System.out.println("左の皿が重い");
		else
			if(left == right)
				System.out.println("釣り合っている");
			else
				System.out.println("右の皿が重い");
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Tenbin a = new Tenbin();
		a.right(5);
		a.show();
		Tenbin b = new Tenbin(0, 5);
		b.left(5);
		b.show();
	}
}

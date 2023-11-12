interface iSet{
	void add(int x);
	boolean contains(int x);
}
class IntSet implements iSet{
	private int[] m;
	private int n;
	public IntSet() {
		m = new int[10];
		n = 0;
	}
	public void add(int x) {
		if(contains(x) == false) {
			m[n++] = x;
		}
	}
	public boolean contains(int x) {
		for(int i=0; i<n; i++) {
			if(x == m[i]) {
				return true;
			}
		}
		return false;
	}
}
public class Sample1 {
	public static void main(String[] args) {
		IntSet s = new IntSet();
		s.add(1);
		s.add(2);
		s.add(3);
		for(int i=0; i<5; i++) {
			if(s.contains(i) == true) {
				System.out.println(i + "は集合に含まれます");
			}else {
				System.out.println(i + "は集合に含まれません");
			}
		}
	}
}

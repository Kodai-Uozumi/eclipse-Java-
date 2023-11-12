package pa;

public class String {
	private char[] moji;
	public String(char[] m) {
		moji = m;
	}
	public void show() {
		for(int i = 0; i < moji.length; i++)
			System.out.print(moji[i]);
		System.out.println("");
	}
}

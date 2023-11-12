import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Seireki{
	private int year;
	public Seireki(int y) {
		year = y;
	}
	public int get() {
		return year;
	}
	public void show() {
		System.out.println("西暦" + get() + "年です");
	}
}
class Wareki extends Seireki{
	public Wareki(int y) {
		super(y);
	}
	public void show() {
		if(get() > 2018) {
			System.out.println("令和" + (get() - 2018) + "年です");
		}else {
			System.out.println("平成" + (get() - 1988) + "年です");
		}
	}
}
public class Sample1 {
	public static void main(String[] args) throws IOException{
		System.out.println("西暦で年を入力してください(2001～2020年)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int y = Integer.parseInt(str);
		Seireki s = new Seireki(y);
		Wareki w = new Wareki(y);
		s.show();
		w.show();
	}
}

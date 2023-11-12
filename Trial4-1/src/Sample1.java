import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyTime{
	int hour;
	int min;
	void set(int h, int m) {
		hour = h;
		min = m;
	}
	void show() {
		System.out.println(hour + "時" + min + "分です");
	}
}
public class Sample1 {

	public static void main(String[] args) throws IOException{
		MyTime t = new MyTime();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("何時ですか?");
		String str = br.readLine();
		int h = Integer.parseInt(str);
		System.out.println("何分ですか?");
		str = br.readLine();
		int m = Integer.parseInt(str);
		t.set(h, m);
		t.show();

	}

}

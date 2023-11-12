import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyTimeException extends Exception{
}
class MyTime{
	private int hour;
	private int min;
	public void set(int h, int m) throws MyTimeException{
		if(h <= 23 && h >= 0 || m <= 59 || m >= 0) {
			hour = h;
			min = m;
		}else {
			MyTimeException e = new MyTimeException();
			throw e;
		}
	}
	public void show() {
		System.out.println(hour + "時" + min + "分です");
	}
}
public class Sample1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("何時か入力してください");
		String str1 = br.readLine();
		int h = Integer.parseInt(str1);
		System.out.println("何分か入力してください");
		String str2 = br.readLine();
		int m = Integer.parseInt(str2);
		MyTime t = new MyTime();
		try {
			t.set(h, m);
		}catch(MyTimeException e) {
			System.out.println("時刻として不適切です");
		}
	}
}

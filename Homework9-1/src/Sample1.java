import java.io.BufferedReader;
import java.io.InputStreamReader;

class MyDateException extends Exception{
}
class MyDate{
	int month;
	int day;
	MyDate(int m, int d) throws MyDateException{
		if((m < 1) || (m > 12) || (d < 1) || (d > 31))
			throw new MyDateException();
		month = m;
	    day = d;
	}
	void show() {
		System.out.println(month + "月" + day + "日です");
	}
}
public class Sample1 {
	public static void main(String[] args) throws Exception{
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("何月か入力してください");
			int m = Integer.parseInt(br.readLine());
			System.out.println("何日か入力してください");
			int d = Integer.parseInt(br.readLine());
			MyDate h = new MyDate(m, d);
			h.show();
		}catch(MyDateException e) {
			System.out.println("日付として不適切です");
		}
	}
}

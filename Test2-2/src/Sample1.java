//1925050081
import java.io.BufferedReader;
import java.io.InputStreamReader;

class DateException extends Exception{
}
class Date{
	private int month;
	private int day;
	Date(int m, int d) throws DateException{
		if(m >= 1 && m <= 12) {
			month = m;
			if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
				if(d >= 1 && d <= 31)
					day = d;
				else
					throw new DateException();
			else if(m == 2)
				if(d >= 1 && d <= 28)
					day = d;
				else
					throw new DateException();
			else
				if(d >= 1 && d <= 30)
					day = d;
				else
					throw new DateException();
		}
		else
			throw new DateException();
	}
	void show() {
		System.out.println(month + "月" + day + "日です");
	}
}
public class Sample1 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("何月ですか?");
			int m = Integer.parseInt(br.readLine());
			System.out.println("何日ですか?");
			int d = Integer.parseInt(br.readLine());
			Date date = new Date(m, d);
			date.show();
		}catch(Exception e) {
			System.out.println(e +"です");
		}
	}
}

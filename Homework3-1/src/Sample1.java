import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1 {
	public static void main(String[] args) throws IOException{
		System.out.println("あなたの誕生日を教えてください");
		System.out.print("月:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int m = Integer.parseInt(str);
		System.out.print("日:");
		str = br.readLine();
		int d = Integer.parseInt(str);
		System.out.println("あなたの誕生日は" + m + "月" + d + "日ですね");
	}
}

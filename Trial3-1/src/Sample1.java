import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1 {

	public static void main(String[] args) throws IOException{
		System.out.println("整数を入力してください.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str);
		if(a % 2 == 0)
			System.out.println("偶数");
		else
			System.out.println("奇数");
	}
}

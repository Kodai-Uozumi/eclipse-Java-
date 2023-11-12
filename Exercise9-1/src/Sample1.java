import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample1 {
	public static void main(String[] args) {
		System.out.println("整数を2つ入力してください。");
		int a = 0, b = 0;
		boolean flag = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				a = Integer.parseInt(br.readLine());
				b = Integer.parseInt(br.readLine());
				flag = true;
				}catch(Exception e) {
					System.out.println("もう一度最初から入力してください。");
				}
			}while(!flag);
		System.out.println("2つの数の合計は" + (a + b) + "です。");
	}
}
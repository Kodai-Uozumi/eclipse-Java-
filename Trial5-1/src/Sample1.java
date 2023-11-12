import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class WaterCharge{
	private int base;
	private int rate;
	public WaterCharge(int b, int r) {
		base = b;
		rate = r;
	}
	public int calculate(int w) {
		return base + w * rate;
	}
}
public class Sample1 {
	public static void main(String[] args) throws IOException{
		System.out.println("基本料金[円]を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		int b = Integer.parseInt(str1);
		System.out.println("1m³あたりの料金[円]を入力してください");
		String str2 = br.readLine();
		int r = Integer.parseInt(str2);
		WaterCharge c = new WaterCharge(b, r);
		for(int w = 0; w <= 100; w += 10)
			System.out.println("使用量" + w + "m³に対する料金は" + c.calculate(w) + "円です");
	}
}

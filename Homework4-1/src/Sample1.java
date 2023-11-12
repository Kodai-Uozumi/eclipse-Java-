import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Baggage{
	int length;
	int width;
	int height;
	void set(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
	boolean check() {
		return length + width + height <= 115;
	}
}
public class Sample1 {
	public static void main(String[] args) throws IOException{
		Baggage b = new Baggage();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("手荷物の縦[cm]を入力してください");
		int l = Integer.parseInt(br.readLine());
		System.out.println("手荷物の幅[cm]を入力してください");
		int w = Integer.parseInt(br.readLine());
		System.out.println("手荷物の高さ[cm]を入力してください");
		int h = Integer.parseInt(br.readLine());
		b.set(l, w, h);
		if(b.check())
			System.out.println("機内持ち込みできます");
		else
			System.out.println("機内持ち込みできません");
	}
}

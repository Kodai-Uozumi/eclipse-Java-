import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyComplex{
	int re;
	int im;
	void set(int r, int i) {
		re = r;
		im = i;
	}
	void show() {
		if(re == 0 && im == 0)
			System.out.println("0");
		else {
			if(re != 0) {
				System.out.print(re);
				if(im > 0)
					System.out.print("+");
			}
			if(im != 0)
				System.out.print(im + "i");
			System.out.println("");
		}
	}
}
public class Sample1 {
	public static void main(String[] args) throws IOException{
		MyComplex c = new MyComplex();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("複素数の実数部の整数を入力してください");
		int r = Integer.parseInt(br.readLine());
		System.out.println("複素数の虚数部の整数を入力してください");
		int i = Integer.parseInt(br.readLine());
		c.set(r, i);
		c.show();
	}
}

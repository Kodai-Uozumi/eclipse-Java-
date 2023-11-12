import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1 {
	public static void main(String[] args) throws IOException{
		System.out.println("単語を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String rev = new StringBuffer(str).reverse().toString();
		if(str.equals(rev))
			System.out.println(str + "は回文です");
		else
			System.out.println(str + "は回文でありません");
	}
}

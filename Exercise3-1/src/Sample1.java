import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1 {
	public static void main(String[] args) throws IOException{
		System.out.println("整数を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int i = Integer.parseInt(str);
		for(int j=1; j<=i; j++)
			if(i % j == 0)
				System.out.println(i + "÷" + j + "=" + (i / j));
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1 {
	public static void main(String[] args) throws IOException{
		int[] a = new int[5];
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<a.length; i++) {
			String str = br.readLine();
			a[i] = Integer.parseInt(str);
			sum += a[i];
		}
		System.out.println("合計:" + sum);
		System.out.println("平均:" + (sum / a.length));
	}
}

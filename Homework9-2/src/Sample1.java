import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Dengonban{
	static String filename = "dengonfile.txt";
	void read()  {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String str = br.readLine();
			System.out.println(str);
			br.close();
		} catch (IOException e) {
			System.out.println("メッセージはありません。");
		}
	}
	void write() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("メッセージを入力してください。");
		String str = br.readLine();
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
		pw.println(str);
		pw.close();
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Dengonban d = new Dengonban();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("メッセージを読む:1, 書く:2");
			int c = Integer.parseInt(br.readLine());
			switch(c) {
			case 1: d.read(); break;
			case 2: d.write(); break;
			}
		}catch(IOException e) {
			System.out.println("入出力エラーです。");
		}
	}
}

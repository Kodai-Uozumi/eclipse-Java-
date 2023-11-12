import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Countdown extends Thread{
	private int count;
	Countdown(int c){
		count = c;
	}
	public void run() {
		for(int i=count; i>=0; i--) {
			try {
				System.out.println("残り:" + i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
		}
	}
}
public class Sample1 {
	public static void main(String[] args) throws IOException{
		System.out.println("カウント数を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Countdown c = new Countdown(n);
		c.start();
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Bathtub{
	private int water;
	private double temp;
	public Bathtub(int w, int t) {
		water = w;
		temp = t;
	}
	public void add(int w, int t) {
		temp = ((water * temp) + (w * t)) / (water + w);
		water += w;
	}
	public int getWater() {
		return water;
	}
	public double getTemp() {
		return temp;
	}
}
public class Sample1 {
	public static void main(String[] args) throws IOException{
		Bathtub b = new Bathtub(10, 50);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("追加する湯の量[L]を入力してください(0で終了)");
			int w = Integer.parseInt(br.readLine());
			if(w == 0)
				break;
			System.out.println("追加する湯の温度[℃]を入力してください");
			int t = Integer.parseInt(br.readLine());
			b.add(w, t);
			System.out.println("浴槽の湯の量は" + b.getWater() + "L、温度は" + b.getTemp() + "℃です");
		}
	}
}
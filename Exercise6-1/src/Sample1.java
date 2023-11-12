import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Ringo{
	private int weight;
	public Ringo(int w) {
		weight = w;
	}
	public int getWeight() {
		return weight;
	}
	public String getSize() {
		if(weight < 320)
			return "S";
		if(weight < 360)
			return "M";
		if(weight < 430)
			return "L";
		return "LL";
	}
}
public class Sample1 {
	public static void main(String[] args) throws IOException{
		System.out.println("りんごの重さ[g]を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int w = Integer.parseInt(br.readLine());
		Ringo r = new Ringo(w);
		System.out.println(r.getWeight() + "gのりんごのサイズは" + r.getSize() + "です");
	}
}

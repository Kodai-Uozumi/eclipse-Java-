//1925050081
class Tunnel{
	private String name;
	private int length;
	Tunnel(String n, int l){
		name = n;
		length = l;
	}
	void showName() {
		System.out.println(name);
	}
	void showInfo() {
		System.out.println("長さ" + length + "m");
	}
}
class SeaTunnel extends Tunnel{
	int depth;
	SeaTunnel(String n, int l, int d){
		super(n, l);
		depth = d;
	}
	void showInfo() {
		super.showInfo();
		System.out.println("深さ" + depth + "m");
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Tunnel[] t = {
				new Tunnel("宇部トンネル", 446),
				new SeaTunnel("青函トンネル", 53850, 240),
				new SeaTunnel("関門トンネル", 3461, 56)
		};
		for(int i=0; i < t.length; i++) {
			t[i].showName();
			t[i].showInfo();
		}
	}
}

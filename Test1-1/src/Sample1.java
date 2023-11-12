//1925050081
class Kuruma{
	private int weight;
	Kuruma(int w){
		weight = w;
	}
	private String getType() {
		if(weight < 3.5)
			return "普通";
		if(weight < 11)
			return "中型";
		return "大型";
	}
	void show() {
		System.out.println("重さ" + weight + "tの自動車は" + getType());
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Kuruma[] k = new Kuruma[15];
		for(int i=0; i < k.length; i++) {
			k[i] = new Kuruma(i + 1);
			k[i].show();
		}
	}
}

class Star{
	private String name;
	public Star(String n){
		name = n;
	}
	public String getName() {
		return name;
	}
	void show() {
		System.out.println("恒星:" + name);
	}
}
class Planet extends Star{
	private int index;
	private String planet_name;
	public Planet(Star s, int i, String p) {
		super(s.getName());
		index = i;
		planet_name = p;
	}
	public void show() {
		System.out.println(getName() + "の" + index + "番目の惑星:" + planet_name);
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Star sun = new Star("太陽");
		Star[] s = {
				sun,
				new Planet(sun, 1, "水星"),
				new Planet(sun, 2, "金星"),
				new Planet(sun, 3, "地球")
		};
		for(int i=0; i<s.length; i++)
			s[i].show();
	}
}

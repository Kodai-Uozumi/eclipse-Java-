abstract class Body{
	abstract double calVolume();
}
class Sphere extends Body{
	private int radius;
	public Sphere(int r) {
		radius = r;
	}
	public int getRadius() {
		return radius;
	}
	public double calVolume() {
		return 4 * Math.PI * radius * radius * radius /3;
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Sphere[] s = {
				new Sphere(10),
				new Sphere(20),
				new Sphere(30),
				new Sphere(40),
				new Sphere(50)
		};
		for(int i=0; i<s.length; i++)
			System.out.println("半径"+ s[i].getRadius() + "の球体の体積は" + s[i].calVolume());
	}
}

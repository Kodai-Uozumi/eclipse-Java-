//1925050081
interface iBody{
	double calVolume();
}
class Cube implements iBody{
	private double length;
	Cube(double l){
		length = l;
	}
	public double calVolume() {
		return length * length * length;
	}
	double getLength() {
		return length;
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Cube[] c = {
				new Cube(10),
				new Cube(20),
				new Cube(30),
				new Cube(40),
				new Cube(50)
		};
		for(int i=0; i < c.length; i++)
			System.out.println("一辺の長さ" + c[i].getLength() + "の立方体の体積は" + c[i].calVolume());
	}
}

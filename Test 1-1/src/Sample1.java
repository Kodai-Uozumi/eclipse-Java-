//1925050081
class Product{
	private String name;
	private int price;
	Product(String n, int p){
		name = n;
		price = p;
	}
	public String toString() {
		return name + ":" + price + "円";
	}
}
class PC extends Product{
	private String os;
	PC(String n, int p, String o){
		super(n, p);
		os = o;
	}
	public String toString() {
		return super.toString() + ", " + os;
	}
}
class Printer extends Product{
	private String size;
	Printer(String n, int p, String s){
		super(n, p);
		size = s;
	}
	public String toString() {
		return super.toString() + ", " + size;
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Product[] p = {
				new PC("Surface", 200000, "Windows"),
				new Printer("MFC8520", 50000, "A4"),
				new PC("MacBook", 250000, "macOS")
		};
		for(int i = 0; i < p.length; i++)
			System.out.println(p[i].toString());
	}
}

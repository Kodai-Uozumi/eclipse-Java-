class Ticket{
	private String from;
	private String to;
	public Ticket(String f, String t) {
		from = f;
		to = t;
	}
	public void show() {
		System.out.println("航空券:出発地:" + from + ",目的地:" + to);
	}
}
class Freeplan extends Ticket{
	private String hotel;
	public Freeplan(String f, String t, String h) {
		super(f, t);
		hotel = h;
	}
	public void show() {
		System.out.println("フリープラン:");
		super.show();
		System.out.println("ホテル:" + hotel);
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Ticket[] t = {
				new Freeplan("東京", "沖縄", "琉球ホテル"),
				new Ticket("大阪", "北海道"),
				new Freeplan("宇部", "東京", "帝国ホテル")
		};
		for(int i=0; i<t.length; i++)
			t[i].show();
	}
}

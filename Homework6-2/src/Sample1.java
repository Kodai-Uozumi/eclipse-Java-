class Apartment{
	private String[] names;
	public Apartment(int n) {
		names = new String[n];
	}
	public void movein(int i, String name) {
		names[i - 1] = name;
	}
	public void leave(int i) {
		names[i - 1] = null;
	}
	public void show() {
		for(int i=0; i<names.length; i++)
			if(names[i] == null)
				System.out.println((i + 1) + "号室:" + "空き");
			else
				System.out.println((i + 1) + "号室:" + names[i] + "さん");
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Apartment a = new Apartment(6);
		a.movein(1, "一の瀬");
		a.movein(4, "四谷");
		a.movein(5, "五代");
		a.movein(6, "六本木");
		a.show();
		a.leave(5);
		a.show();
	}
}

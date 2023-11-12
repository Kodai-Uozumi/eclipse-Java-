class Score{
	private int point;
	static private int max = 0;
	static private int min = 100;
	public Score(int p){
		point = p;
		if(max < point) {
			max = point;
		}
		if(min > point) {
			min = point;
		}
	}
	static public int getMax() {
		return max;
	}
	static public int getMin() {
		return min;
	}
}
public class Sample1 {
	public static void main(String[] args) {
		new Score(70);
		new Score(80);
		new Score(55);
		new Score(90);
		new Score(85);
		System.out.println("グループの最高点は" + Score.getMax() + "点です");
		System.out.println("グループの最低点は" + Score.getMin() + "点です");
	}
}

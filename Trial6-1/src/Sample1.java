class Point{
	private int x;
	private int y;
	public Point(int u, int v) {
		x = u;
		y = v;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
class Line{
	private Point a;
	private Point b;
	public Line(Point p1, Point p2) {
		a = p1;
		b = p2;
	}
	public double length() {
		return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Point a = new Point(-2, -2);
		Point b = new Point(4, 6);
		Line l = new Line(a, b);
		System.out.println("線分の長さは" + l.length() + "です");
	}
}

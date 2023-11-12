import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample1 extends Frame{
	public static void main(String[] args) {
		Sample1 sm = new Sample1();
	}
	public Sample1() {
		super("Homework12-1");
		addWindowListener(new SampleWindowListener());
		setSize(400, 400);
		setVisible(true);
	}
	double x(double r, int t) {
		return r * Math.sin(Math.toRadians(t));
	}
	double y(double r, int t) {
		return r * Math.cos(Math.toRadians(t));
	}
	public void paint(Graphics g) {
		for(int t = 0; t <= 360; t += 360/9)
			g.drawLine(
					(int) (200 + x(100, t)),
					(int) (200 + y(100, t)),
					(int) (200 + x(100, (t + 360/9))),
					(int) (200 + y(100, (t + 360/9))));
	}
	class SampleWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}

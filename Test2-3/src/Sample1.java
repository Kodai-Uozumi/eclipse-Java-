//1925050081
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample1 extends Frame{
	int x = 10;
	int y = 10;
	public static void main(String[] args) {
		new Sample1();
	}
	public Sample1() {
		super("Test2-3");
		addWindowListener(new SampleWindowListener());
		addMouseListener(new SampleMouseListener());
		setSize(400, 400);
		setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawLine(0, 200, 400, 200);
		g.drawLine(200, 0, 200, 400);
		g.drawString("-100", 100, 200);
		g.drawString("100", 300, 200);
		g.drawString("100", 200, 100);
		g.drawString("-100", 200, 300);
		for(int i = -200; i < 200; i++)
			g.drawLine(i + 200, -i + 200 - (y / x), (i + 1) + 200, -(i + 1) + 200 -(y / x));
	}
	class SampleWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	class SampleMouseListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			repaint();
		}
	}
}

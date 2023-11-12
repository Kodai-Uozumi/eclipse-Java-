import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample6 extends Frame{
	int x = 10;
	int y = 10;
	int count = 0;
	public static void main(String[] args) {
		Sample6 sm = new Sample6();
	}
	public Sample6() {
		super("サンプル");
		addWindowListener(new SampleWindowListener());
		addMouseListener(new SampleMouseAdapter());
		setSize(250, 200);
		setVisible(true);
	}
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		if((count % 2) == 0)
			g.drawRect(x, y, 10, 10);
		else
			g.fillOval(x, y, 10, 10);
		count++;
	}
	class SampleWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	class SampleMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			repaint();
		}
	}
}

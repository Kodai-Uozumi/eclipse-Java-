import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample1 extends Frame{
	public static void main(String[] args) {
		new Sample1();
	}
	public Sample1() {
		super("Exercise12-1");
		addWindowListener(new SampleWindowListener());
		setSize(300, 300);
		setVisible(true);
	}
	public void paint(Graphics g) {
		String[] day = {"日", "月", "火", "水", "木", "金", "土"};
		for(int i = 0; i < 7; i++) {
			g.setColor(Color.black);
			g.drawRect((i * 25) + 25, 75, 25, 25);
			switch(i) {
			case 0:
				g.setColor(Color.red);
				break;
			case 6:
				g.setColor(Color.blue);
				break;
			}
			g.drawString(day[i], i * 25 + 5 + 25, 20 + 75);
		}
		g.setColor(Color.black);
		for(int j = 1; j <= 31; j++) {
			int k = j + 4;
			g.setColor(Color.black);
			g.drawRect((k % 7) * 25 + 25, ((k / 7) + 1) * 25 + 75, 25, 25);
			if(k % 7 == 0)
				g.setColor(Color.red);
			if((j == 1) || (j == 11))
				g.setColor(Color.red);
			if(k % 7 == 6)
				g.setColor(Color.blue);
			g.drawString(String.valueOf(j), (k % 7) * 25 + 5 + 25, ((k / 7) + 2) * 25 - 5 + 75);
		}
	}
	class SampleWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}

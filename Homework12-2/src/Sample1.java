import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample1 extends Frame{
	public static void main(String[] args) {
		new Sample1();
	}
	public Sample1() {
		super("Homework12-2");
		addWindowListener(new SampleWindowListener());
		setSize(600, 400);
		setVisible(true);
	}
	public void paint(Graphics g) {
		String[] n = {"Dialog", "DialogInput", "Monospaced", "Serif", "SansSerif"};
		for(int i = 0; i < n.length; i++) {
			g.drawRect(25, 75 + (50 * i), 250, 50);
			g.drawRect(275, 75 + (50 * i), 250, 50);
			g.setFont(new Font(n[0], Font.PLAIN, 32));
			g.drawString(n[i], 25, 115 + (50 * i));
			g.setFont(new Font(n[i], Font.PLAIN, 32));
			g.drawString("ようこそJavaへ", 275, 115 + (50 * i));
		}
	}
	class SampleWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
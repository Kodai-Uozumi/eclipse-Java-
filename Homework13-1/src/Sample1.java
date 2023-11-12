import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample1 extends Frame{
	Button inc_btn, dec_btn;
	int index = 1;
	public static void main(String[] args) {
		new Sample1();
	}
	public Sample1() {
		super("Homework13-1");
		addWindowListener(new SampleWindowListener());
		setSize(400, 400);
		setVisible(true);
		setLayout(new FlowLayout());
		inc_btn = new Button("+1");
		dec_btn = new Button("-1");
		add(inc_btn);
		add(dec_btn);
		inc_btn.addActionListener(new IncActionListener());
		dec_btn.addActionListener(new DecActionListener());
	}
	private int f(int x) {
		return (int)(Math.pow(0.1 * x, index));
	}
	public void paint(Graphics g) {
		g.drawLine(0, 200, 400, 200);
		g.drawLine(200, 0, 200, 400);
		g.drawString("-100", 100, 200);
		g.drawString("100", 300, 200);
		g.drawString("100", 200, 100);
		g.drawString("-100", 200, 300);
		g.setColor(Color.red);
		for(int x = -200; x < 200; x++)
			g.drawLine(x + 200, -f(x) + 200, (x + 1) + 200, -f(x + 1) + 200);
	}
	class SampleWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	class IncActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			index++;
			repaint();
		}
	}
	class DecActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(index > 1)
				index--;
			repaint();
		}
	}
}

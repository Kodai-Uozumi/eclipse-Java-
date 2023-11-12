import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample1 extends Frame{
	int x = 100;
	int y = 100;
	Color c = Color.red;
	Button bt;
	public static void main(String[] args) {
		new Sample1();
	}
	public Sample1() {
		super("Exercise13-1");
		setLayout(new FlowLayout());
		bt = new Button("Change Color");
		add(bt);
		addWindowListener(new SampleWindowListener());
		addMouseListener(new SampleMouseListener());
		bt.addActionListener(new SampleActionListener());
		setSize(400, 400);
		setVisible(true);
	}
	public void paint(Graphics g) {
		g.setColor(c);
		if(c == Color.black)
			g.drawOval(x, y, 20, 20);
		else
			g.fillOval(x, y, 20, 20);
	}
	class SampleWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	class SampleActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(c == Color.black)
				c = Color.red;
			else
				c = Color.black;
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

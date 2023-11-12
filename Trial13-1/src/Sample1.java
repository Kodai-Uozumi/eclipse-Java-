import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample1 extends Frame{
	Button bt;
	int count = 0;
	public static void main(String[] args) {
		Sample1 sm = new Sample1();
	}
	public Sample1() {
		super("Trial13-1");
		setLayout(new FlowLayout());
		bt = new Button(String.valueOf(count));
		add(bt);
		bt.addActionListener(new SampleActionListener());
		addWindowListener(new SampleWindowListener());
		setSize(250, 200);
		setVisible(true);
	}
	class SampleActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			count++;
			bt.setLabel(String.valueOf(count));
		}
	}
	class SampleWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}

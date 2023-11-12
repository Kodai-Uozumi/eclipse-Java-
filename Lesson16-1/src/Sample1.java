import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Sample1 extends Frame{
	public static void main(String[] args) {
		Sample1 sm = new Sample1();
	}
	public Sample1() {
		super("サンプル");
		addWindowListener(new SampleWindowListener());
		setSize(250, 200);
		setVisible(true);
	}
	class SampleWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}

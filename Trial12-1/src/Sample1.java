import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1 extends Frame{
	int index;
	public static void main(String[] args) throws IOException{
		new Sample1();
	}
	public Sample1() {
		super("Trial12-1");
		System.out.println("べき指数を1以上の整数で入力してください");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			index = Integer.parseInt(br.readLine());
		}catch(IOException e) {}
		addWindowListener(new SampleWindowListener());
		setSize(400, 400);
		setVisible(true);
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
		for(int x = -200; x < 200; x++)
			g.drawLine(x + 200, -f(x) + 200, (x + 1) + 200, -f(x + 1) + 200);
	}
	class SampleWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}

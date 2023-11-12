import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample1 extends Frame{
	Button[] bt = new Button[5];
	private int bomb_pos = 0;
	public static void main(String[] args) {
		Sample1 sm = new Sample1();
	}
	public Sample1() {
		super("Homework13-2");
		setLayout(new FlowLayout());
		ActionListener a1 = new SampleActionListener();
		for(int i = 0; i < bt.length; i++) {
			bt[i] = new Button("　");
			add(bt[i]);
			bt[i].addActionListener(a1);
		}
		bomb_pos = (int)(Math.random() * 5);
		addWindowListener(new SampleWindowListener());
		setSize(300, 300);
		setVisible(true);
	}
	class SampleActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int i = 0;
			for(i = 0; i < bt.length; i++)
				if(e.getSource() == bt[i])
					break;
			if(i == bomb_pos) {
				bt[i].setLabel("爆");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e1) {}
				System.exit(0);
			}else
				bt[i].setLabel("OK");
			if((i - 1 == bomb_pos) && (i != 0))
				bt[i - 1].setLabel("1");
			if((i + 1 == bomb_pos) && (i != bt.length + 1))
				bt[i + 1].setLabel("1");
			int opened = 0;
			for(int j = 0; j < bt.length; j++)
				if(!bt[j].getLabel().equals("　"))
					opened++;
			if(opened == bt.length) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e1) {}
				System.exit(0);
			}
		}
	}
	class SampleWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
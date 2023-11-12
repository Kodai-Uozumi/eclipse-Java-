class Countup implements Runnable{
	private int count;
	Countup(int c){
		count = c;
	}
	public void run() {
		for(int i = 0; i < count; i++) {
			System.out.println("現在:" + i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Countup c1 = new Countup(10);
		new Thread(c1).start();
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {}
		Countup c2 = new Countup(5);
		new Thread(c2).start();
	}
}

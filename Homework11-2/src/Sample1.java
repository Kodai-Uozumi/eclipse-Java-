class Soko{
	private int num;
	void put() {
		num++;
	}
	boolean get() {
		if(num == 1)
			return false;
		num--;
		return true;
	}
	void show() {
		System.out.println("倉庫内の商品数は" + num + "個です");
	}
}
class Producer extends Thread{
	Soko soko;
	Producer(Soko s){
		soko = s;
	}
	public void run() {
		for(int i = 0; i < 10; i++) {
			soko.put();
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {}
		}
	}
}
class Consumer extends Thread{
	Soko soko;
	Consumer(Soko s){
		soko = s;
	}
	public void run() {
		for(int i = 0; i < 10;) {
			if(soko.get())
				i++;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Soko s = new Soko();
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		for(int i = 0; i < 30; i++) {
			s.show();
			if(i == 5)
				p.start();
			if(i == 15)
				c.start();
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
	}
}

class Prime{
	static boolean isPrime(int n) {
		for(int i = 2; i <= n / 2; i++)
			if(n % i == 0)
				return false;
		return true;
	}
}
class Primes extends Prime implements Runnable{
	int from;
	int to;
	Primes(int f, int t){
		from = f;
		to = t;
	}
	public void run() {
		for(int i = from; i < to; i++)
			if(Prime.isPrime(i))
				System.out.print(i + "\t");
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Primes[] p = {
				new Primes(100000000, 100001000),
				new Primes(100001000, 100002000),
				new Primes(100002000, 100003000),
				new Primes(100003000, 100004000),
				new Primes(100004000, 100005000)
		};
		for(int i = 0; i < p.length; i++) {
			Thread th = new Thread(p[i]);
			th.start();
		}
	}
}

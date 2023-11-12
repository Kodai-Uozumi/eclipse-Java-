class Account{
	int balance;
	void deposit(int y) {
		balance +=  y;
	}
	void withdraw(int y) {
		balance -= y;
	}
	void show() {
		System.out.println("残高は" + balance + "円です");
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Account a = new Account();
		a.deposit(15000);
		a.show();
		a.withdraw(8000);
		a.show();
		a.deposit(4000);
		a.show();
	}
}

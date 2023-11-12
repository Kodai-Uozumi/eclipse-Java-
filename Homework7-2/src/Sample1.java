import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Warrior{
	protected String name;
	protected int hp;
	protected int str;
	public Warrior(String n, int h, int s) {
		name = n;
		hp = h;
		str = s;
	}
	public int doOffence() {
		return (int) (Math.random() * str);
	}
	public void doDefence(int d) {
		hp -= d;
		if(hp < 0)
			hp = 0;
	}
	public boolean isAlive() {
		return hp > 0;
	}
	public void show() {
		System.out.println(name + " HP:" + hp);
	}
}
class Hero extends Warrior{
	int itl;
	public void doHealing() {
		hp += (int) (Math.random() * itl);
	}
	public Hero(String n, int h, int s, int i) {
		super(n, h, s);
		itl = i;
	}
}
public class Sample1 {
	public static void main(String[] args) throws IOException{
		Hero me = new Hero("勇者", 100, 15, 25);
		Warrior enemy = new Warrior("魔王", 100, 20);
		while(me.isAlive() && enemy.isAlive()) {
			me.show();
			enemy.show();
			System.out.println("どうする?攻撃:1, 回復:2");
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int c = Integer.parseInt(br.readLine());
		    if(c == 1)
		    	enemy.doDefence(me.doOffence());
		    else
		    	me.doHealing();
		    me.doDefence(enemy.doOffence());
		}
		me.show();
		enemy.show();
	}
}

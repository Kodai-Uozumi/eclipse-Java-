interface iSet{
	void add(char x);
	boolean contains(char x);
}
class CharSet implements iSet{
	private StringBuffer s;
	public CharSet(){
		s = new StringBuffer();
	}
	public void add(char c) {
		if(contains(c) == false) {
			s.append(c);
		}
	}
	public boolean contains(char c) {
		if(s.toString().indexOf(c) != -1)
			return true;
		else
			return false;
	}
}
public class Sample1 {
	public static void main(String[] args) {
		char[] iroha = {'い','ろ','は','に','ほ','へ','と'};
		char[] aiueo = {'あ','い','う','え','お'};
		CharSet s = new CharSet();
		for(int i=0; i<iroha.length; i++)
			s.add(iroha[i]);
		for(int j=0; j < aiueo.length; j++)
			if(s.contains(aiueo[j]))
				System.out.println("「" + aiueo[j] + "」は集合に含まれます");
			else
				System.out.println("「" + aiueo[j] + "」は集合に含まれません");
	}
}

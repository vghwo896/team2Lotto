public class Main {
	public static void main(String[] args) {	
		LottoManager m = new LottoManager();
		m.gen.SelectNumber(m.getValue(1), 5, 45, 6, 12, 15, 44);
		System.out.println(m.getValue(1));
	}
}

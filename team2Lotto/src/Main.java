import java.util.Random;

public class Main {
	public static void main(String[] args) {	
		// 선택해서 로또를 뽑는 것 출력
		LottoManager m = new LottoManager();
//		m.gen.SelectNumber(m.getValue(1), 5, 45, 6, 12, 15, 44);
		System.out.println(m.getValue(1));

	
		

		m.winNumberGen();
		m.gen.RandomGen(m.getValue(2));

	}
}

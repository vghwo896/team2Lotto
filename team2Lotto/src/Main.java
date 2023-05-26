import java.util.Random;

public class Main {
	public static void main(String[] args) {	
		// 선택해서 로또를 뽑는 것 출력
		LottoManager m = new LottoManager();
		m.gen.SelectNumber(m.getValue(1), 5, 45, 6, 12, 15, 44);
		System.out.println(m.getValue(1));
//		int [] arr = new int[]{0,0,0,0,0,0};
//		int r =0;
////		for (int j = 0; j < arr.length; j++) {
////			int i = new Random().nextInt(45)+1;
////			if(arr.indexOf(i)<0) {
////			arr[j]= i;
////			System.out.println(arr[j]);
////			}
////			r = i;
////		}
	}
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LottoManager {
	private Map<Integer, Lotto> lottoMap;
	private int[] winNumber;
	
	public LottoManager() {
		lottoMap = new HashMap<>();
		lottoMap.put(1, new Lotto());
	}

	// 당첨 번호 7자리를 랜덤 값으로 입력을 받아 winNumber에 넣어준다
	public void winNumberGen() {
		winNumber = new int[7];
		Random random = new Random();
		for (int i = 0; i < winNumber.length; i++) {
			winNumber[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (winNumber[j] == winNumber[i]&&winNumber[i]==0) {
					winNumber[i] = random.nextInt(45) + 1;
				}
			}
		}
		Arrays.sort(winNumber);

		for (int i = 0; i < winNumber.length; i++) {
			System.out.println(winNumber[i]);
		}
	}
	public Lotto getValue(int i) {
		return lottoMap.get(i);
	}
	public void ViewLotto() {

	}

	public static void main(String[] args) {
		LottoManager m = new LottoManager();

		m.winNumberGen();
	}
}
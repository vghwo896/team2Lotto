import java.util.Map;
import java.util.Random;

public class LottoManager {
	private Map<Integer, Lotto> lottoMap;
	private int[] winNumber;

	public LottoManager() {
		lottoMap.put(1, new Lotto());
	}

	

	public void winNumberGen() {
		winNumber = new int[7];
		Random random = new Random();
		for (int i = 0; i < winNumber.length; i++) {
			winNumber[i] = 
		}
	}

	public void ViewLotto() {

	}

}

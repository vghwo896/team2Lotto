import java.util.Arrays;
import java.util.Random;

public class GenNumber{

  
	
	// 로또 매니저에 정보를 가져오기 위해서 로또 매니저 초기화
	
	public GenNumber() {
		
	}
	
	//맵의 getKey 메서드를 통해서 해당 value 의 로또를 랜덤으로 초기화 하는 메서드.
	public int RandomGen(Lotto lotto){
		Random random = new Random();
		int count = 0;
		for (int i = 0; i < lotto.getNum().length; i++) {
			lotto.getNum()[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto.getNum()[j] == lotto.getNum()[i]) {
					lotto.getNum()[i] = random.nextInt(45) + 1;
//					count++;
//					break;
				}
			}
			count++;
		}
		Arrays.sort(lotto.getNum());
		System.out.println(lotto.toString());
		System.out.println(count);
        return count;
    }

    public void SelectNumber(){
    }

    public void Retouch(){
    }
    
    
}

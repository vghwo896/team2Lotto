import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GenNumber{

	List<Integer> list;
	
	// 로또 매니저에 정보를 가져오기 위해서 로또 매니저 초기화
	
	public GenNumber() {
		list= new ArrayList<>();
	}
	
	
	public List<Integer> getList() {
		return list;
	}


	public void setList(List<Integer> list) {
		this.list = list;
	}


	//맵의 getKey 메서드를 통해서 해당 value 의 로또를 랜덤으로 초기화 하는 메서드.
	public int RandomGen(Lotto lotto){
		Random random = new Random();
		int count = 0;
		for (int i = 0; i < lotto.getNum().length; i++) {
			lotto.getNum()[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (!(lotto.getNum()[j] == lotto.getNum()[i])) {
					lotto.getNum()[i] = random.nextInt(45) + 1;
				}
			}
			count++;
		}
		Arrays.sort(lotto.getNum());
		System.out.println(lotto.toString());
		System.out.println(count);
        return count;
    }
	
	// 클릭 액션
    public void SelectNumber(int i){
    	if(list.size()<6) {
    	getList().add(i); 	
    	}
    }
    
    //선택 확정 버튼에 들어갈 액션.
    
    public int Confirmed(List<Integer> list,Lotto lotto) {
    	list= getList();
    	Random random = new Random();
    	int count = 0;
    	for(int i = 0 ; i<list.size(); i++) {
    	lotto.getNum()[i] = list.get(i);
    	}
    	
    	for (int i = 0; i < lotto.getNum().length; i++) {
			if(lotto.getNum()[i] == 0) {
			lotto.getNum()[i] = (int)random.nextInt(45) + 1;
			
			for (int j = 0; j < i; j++) {
					if ( lotto.getNum()[i] == lotto.getNum()[j]) {
						lotto.getNum()[i] = (int)random.nextInt(45) + 1;
					}
				}
			}
			count++;	
		}
    	System.out.println(lotto.toString());
    	return count;
    }
    	
    

    public void Retouch(){
    	
    }
    
    
public static void main(String[] args) {
	GenNumber gen=new GenNumber();
	gen.SelectNumber(5);
	gen.SelectNumber(7);
	
	gen.Confirmed(gen.SelectNumber(10), new Lotto());
	
}
    
    
}



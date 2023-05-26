import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GenNumber {

	List<Integer> list;

	// 로또 매니저에 정보를 가져오기 위해서 로또 매니저 초기화

	public GenNumber() {
		list = new ArrayList<>();
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	// 맵의 getKey 메서드를 통해서 해당 value 의 로또를 랜덤으로 초기화 하는 메서드.
	public int RandomGen(Lotto lotto) {
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
	public void SelectNumber(int i) {
		if (list.size() < 6) {
			getList().add(i);
		}
	}

	// 선택 확정 버튼에 들어갈 액션.

	public int Confirmed(List<Integer> list, Lotto lotto) {
		list = getList();
		Random random = new Random();
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			lotto.getNum()[i] = list.get(i);
		}

		for (int i = 0; i < lotto.getNum().length; i++) {
			if (lotto.getNum()[i] == 0) {
				lotto.getNum()[i] = (int) random.nextInt(45) + 1;

				for (int j = 0; j < i; j++) {
					if (lotto.getNum()[i] == lotto.getNum()[j]) {
						lotto.getNum()[i] = (int) random.nextInt(45) + 1;
					}
				}
			}
			count++;
		}
		System.out.println(lotto.toString());
		return count;
	}

	public void Retouch() {
	}

	public static void main(String[] args) {
		GenNumber gen = new GenNumber();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.println("1. 번호 선택(수동)    2. 자동");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("수동 선택\n번호 입력");
				int num = scan.nextInt();
				for (int j = 0; j < gen.list.size(); j++) {
					if(gen.list.contains(num)) {
						System.out.println("true");
						gen.SelectNumber(num);
					}else {
						System.out.println("다시입력");
					}
				}
				break;
			case 2:
				gen.Confirmed(gen.list, new Lotto());
				break;
			case 3:
				
			default:
				break;
			}
			
		}
	}

}

package LottoGui;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JSplitPane;

class ImageFrame extends JFrame {
	private JPanel panel;
	private JLabel lbl;
	int count;
	boolean condition = false; // false가 클릭 해제 상태
	ImageIcon ball = new ImageIcon("번호(미선택).png");
	ImageIcon selectedball = new ImageIcon("번호(선택).png");

	public ImageFrame() {
		JPanel pnl = new JPanel();
		JPanel pnl2 = new JPanel();

		JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

		JLabel[] lbl = new JLabel[45]; // 버튼

		for (int i = 0; i < 45; i++) {
			lbl[i] = new JLabel(ball);// 버튼 초기화
			lbl[i].setVisible(true);// 보이게
			lbl[i].setBorder(BorderFactory.createEmptyBorder());
			pnl.add(lbl[i]);// 프레임에 버튼 추가

			lbl[i].addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트

				@Override
				public void mouseClicked(MouseEvent e) {
					JLabel oooo = (JLabel) e.getSource();

					if (count<7 && condition == false) {
						// System.out.println("클릭 시");
						oooo.setIcon(selectedball);
						condition = true;
						count++;
					}
//							System.out.println("선택된거 클릭 시");
					else {
						oooo.setIcon(ball);
						condition = false;
					}

				}

			});

		}
		add(pnl);

		setSize(1024, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}
}

public class LottoBall {
	public static void main(String[] args) {
		new ImageFrame();

	}
}

//	SpringLayout springLayout = new SpringLayout();
//imageFrame.getContentPane().setLayout(springLayout); 

// 화면 2분할
// Jpanel + 버튼 (46개) => 동그라미, 위에 숫자 출력, 클릭시 백그라운드 색깔 변경
// 확정시 배열로 정보값 전송, 초기화
// 오른쪽에 저장(이건 기능쪽에서 가져갈 것), 최대 6장
// 스크롤 ㄱㄱ
// html 당겨오는법 되면..생각해볼게 
//뿅

package LottoGui;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SpringLayout;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;

import java.awt.Color;

class ImageFrame extends JFrame {
	private JPanel panel;
	private JLabel label;
	private JButton button;
	boolean condition = false; //false가 클릭 해제 상태
	
	
	public ImageFrame() {
		JPanel pnl = new JPanel();
		JPanel pnl2 = new JPanel();
	

		JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		label = new JLabel();
		ImageIcon ball = new ImageIcon("번호(미선택).png");
		ImageIcon selectedball = new ImageIcon("번호(선택).png");

		label.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent s) {
//				System.out.println("클릭 시");
				label.setIcon(selectedball);
				condition = true;}
			
			public void mouseReleased(MouseEvent r) {
//				System.out.println("선택된거 클릭 시");
				label.setIcon(ball);
				condition = false;
				}
		
		});
		
		
		
		
			

		label.setIcon(ball);
		pnl.add(label);
		add(pnl);

		setSize(1024, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class LottoBall {
	public static void main(String[] args) {
		ImageFrame imageFrame = new ImageFrame();
		SpringLayout springLayout = new SpringLayout();
		imageFrame.getContentPane().setLayout(springLayout);
	}
}
// 화면 2분할
// Jpanel + 버튼 (46개) => 동그라미, 위에 숫자 출력, 클릭시 백그라운드 색깔 변경
// 확정시 배열로 정보값 전송, 초기화
// 오른쪽에 저장(이건 기능쪽에서 가져갈 것), 최대 6장
// 스크롤 ㄱㄱ
// html 당겨오는법 되면..생각해볼게 
//뿅

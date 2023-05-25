import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.SpringLayout;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;

import java.awt.Color;

class ImageFrame extends JFrame {
	public ImageFrame() {
		JPanel pnl = new JPanel();
		add(pnl);

		JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

		setSize(800, 600);
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

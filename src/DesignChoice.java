import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

public class DesignChoice {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesignChoice window = new DesignChoice();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DesignChoice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel design = new JPanel();
		frame.getContentPane().add(design, BorderLayout.CENTER);
		design.setLayout(null);
		
		JLabel cakeFlavor = new JLabel("케이크 맛 선택하기");
		cakeFlavor.setBounds(88, 69, 234, 15);
		design.add(cakeFlavor);
		

		
		Choice flavorChoice = new Choice();
		flavorChoice.setBounds(127, 108, 310, 21);
		String setting = "맛을 선택해주세요";
		flavorChoice.add(setting);
		flavorChoice.add("과일 생크림 (제누아즈 + 생크림 + 생과일)");
		flavorChoice.add("초콜릿 퍼지 케이크 (크림치즈)");
		flavorChoice.add("초롤릿 퍼지 케이크 (가나슈)");
		flavorChoice.add("더블베리 케이크 (크림치즈)");
		flavorChoice.add("말차 파운드 케이크 (크림치즈)");
		flavorChoice.add("말차파운드 케이크 (말차크림)");
		flavorChoice.add("얼그레이 케이크 (크림치즈)");
		flavorChoice.add("쑥 케이크 (쌀 케이크)");
		design.add(flavorChoice);
		
		JLabel cakeDesign = new JLabel("케이크 디자인 선택하기 ( 디자인 (1호/2호/3호 가격) )");
		cakeDesign.setBounds(88, 189, 310, 15);
		design.add(cakeDesign);
		
		Choice designChoice = new Choice();
		designChoice.setBounds(127, 236, 343, 21);
		String setting2 = "디자인을 선택해주세요";
		designChoice.add(setting2);
		designChoice.add("A. Palette 팔레트 (56000원/67000원/92000원)");
		designChoice.add("B. Flower Garden 플라워 가든 (56000원/67000원/92000원)");
		designChoice.add("C. Birth Flower 탄생화 (56000원/67000원/92000원)");
		designChoice.add("D. Wedding 웨딩 (56000원/67000원/92000원)");
		designChoice.add("E. Pattern 패턴 (56000원/67000원/92000원)");
		designChoice.add("F. Glow 글로우 (56000원/67000원/92000원)");
		designChoice.add("G. Universe 유니버스 (56000원/67000원/92000원)");
		designChoice.add("H. Forest 포레스트 (56000원/67000원/92000원)");
		designChoice.add("I. Sea 바다 (56000원/67000원/92000원)");
		designChoice.add("J. Painting 페인팅 (67000원/78000원/100000원)");
		designChoice.add("K. Bespoke 비스포크 (67000원/78000원/100000원)");
		
		design.add(designChoice);
		
		JLabel cakeSize = new JLabel("케이크 사이즈 선택하기");
		cakeSize.setBounds(88, 308, 198, 15);
		design.add(cakeSize);
		
		JRadioButton size1 = new JRadioButton("1호 (지름 16cm) 2 ~ 4명");
		size1.setBounds(117, 360, 258, 23);
		design.add(size1);
		
		JRadioButton size2 = new JRadioButton("2호 (지름 18cm) 4 ~ 8명");
		size2.setBounds(117, 405, 258, 23);
		design.add(size2);
		
		JRadioButton size3 = new JRadioButton("3호 (지름 22cm) 8 ~ 10명");
		size3.setBounds(117, 448, 258, 23);
		design.add(size3);
		
		ButtonGroup size = new ButtonGroup();
		size.add(size1);
		size.add(size2);
		size.add(size3);

		JLabel cakeLettering = new JLabel("레터링 추가하실 분은 원하는 문구를 작성해주세요.");
		cakeLettering.setBounds(88, 520, 310, 15);
		design.add(cakeLettering);
		
		JTextPane txtLettering = new JTextPane();
		txtLettering.setBounds(141, 570, 235, 21);
		design.add(txtLettering);
		
		JButton next3 = new JButton("다음으로");
		next3.setBounds(429, 664, 107, 48);
		next3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(flavorChoice.equals(setting) && designChoice.equals(setting2)) {
					JOptionPane.showMessageDialog(null, "맛/디자인을 선택해주세요");
				}else {
					design.setVisible(false);
				}
			}

		});
		design.add(next3);
		
		JButton return3 = new JButton("이전으로");
		return3.setBounds(54, 664, 107, 48);
		next3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					design.setVisible(false);
			}

		});
		design.add(return3);
		
	}
}

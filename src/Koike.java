import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Koike {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtId;
	private JTextField txtPwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Koike window = new Koike();
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
	public Koike() {
		Frame();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void Frame() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		WelcomePanel();
	}

	private void WelcomePanel() {

		JPanel welcomePanel = new JPanel();
		frame.getContentPane().add(welcomePanel, BorderLayout.CENTER);
		welcomePanel.setLayout(null);

		JLabel title = new JLabel("Koike");
		title.setFont(new Font("Constantia", Font.BOLD, 50));
		title.setBounds(228, 52, 146, 102);
		welcomePanel.add(title);

		JLabel title2 = new JLabel("gift shop");
		title2.setFont(new Font("Palatino Linotype", Font.ITALIC, 16));
		title2.setBounds(313, 119, 109, 15);
		welcomePanel.add(title2);

		JButton joinBtn = new JButton("주문하기");
		joinBtn.setFont(new Font("Dialog", Font.BOLD, 14));
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcomePanel.setVisible(false);

				NoticePanel();
			}
		});
		joinBtn.setBounds(184, 190, 238, 58);
		welcomePanel.add(joinBtn);
		txtName = new JTextField();
		txtName.setFont(new Font("Dialog", Font.BOLD, 14));
		txtName.setBounds(267, 295, 171, 35);
		welcomePanel.add(txtName);
		txtName.setColumns(10);

		txtPhone = new JTextField();
		txtPhone.setFont(new Font("Dialog", Font.BOLD, 14));
		txtPhone.setBounds(267, 340, 171, 35);
		welcomePanel.add(txtPhone);
		txtPhone.setColumns(10);

		JLabel name = new JLabel("주문자 성함 : ");
		name.setBounds(156, 305, 99, 15);
		welcomePanel.add(name);

		JLabel phone = new JLabel("주문자 전화번호 : ");
		phone.setBounds(139, 350, 116, 15);
		welcomePanel.add(phone);

		JLabel pwd2 = new JLabel("'-'없이 입력");
		pwd2.setBounds(450, 340, 71, 35);
		welcomePanel.add(pwd2);

		JButton orderBtn = new JButton("주문 확인하기");
		orderBtn.setFont(new Font("Dialog", Font.BOLD, 14));
		orderBtn.setBounds(184, 385, 238, 41);
		orderBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println(txtName.getText());
				System.out.println(txtPhone.getText());

				if (txtName.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "성함을 입력하세요");
				} else {
					MemberDAO dao = new MemberDAO();
					ArrayList<MemberVo> list = dao.list(txtName.getText());

					if (list.size() == 0) {
						JOptionPane.showMessageDialog(null, "주문자 정보가 잘못되었습니다.");

					} else {
						JOptionPane.showMessageDialog(null, "주문자 정보가 확인되었습니다");
						welcomePanel.setVisible(false);
						OrderCakePanel();
					}
				}
			}
		});
		welcomePanel.add(orderBtn);

		txtId = new JTextField();
		txtId.setFont(new Font("Dialog", Font.BOLD, 14));
		txtId.setColumns(10);
		txtId.setBounds(267, 488, 171, 35);
		welcomePanel.add(txtId);

		txtPwd = new JPasswordField();
		txtPwd.setFont(new Font("Dialog", Font.BOLD, 14));
		txtPwd.setColumns(10);
		txtPwd.setBounds(267, 533, 171, 35);
		welcomePanel.add(txtPwd);

		JLabel exception = new JLabel("관리자이신가요?");
		exception.setBounds(187, 443, 109, 35);
		welcomePanel.add(exception);

		JLabel id = new JLabel("ID : ");
		id.setBounds(161, 498, 71, 15);
		welcomePanel.add(id);

		JLabel pwd = new JLabel("Password : ");
		pwd.setBounds(139, 543, 99, 15);
		welcomePanel.add(pwd);

		JButton logBtn = new JButton("로그인");
		logBtn.setBounds(188, 589, 234, 41);
		logBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println(txtId.getText());
				System.out.println(txtPwd.getText());

				if (txtId.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디을 입력하세요");
				} else {
					OwnerDAO dao = new OwnerDAO();
					ArrayList<OwnerVo> list = dao.list(txtId.getText());

					if (list.size() == 0) {
						JOptionPane.showMessageDialog(null, "관리자 정보가 잘못되었습니다.");

					} else {
						JOptionPane.showMessageDialog(null, "관리자 정보가 확인되었습니다");
						welcomePanel.setVisible(false);
						
						OwnerPanel();
					}
				}
			}
		});
		welcomePanel.add(logBtn);

	}
	
	private void OrderCakePanel() {
		JPanel orderCakePanel = new JPanel();
		frame.getContentPane().add(orderCakePanel, BorderLayout.CENTER);
		orderCakePanel.setLayout(null);
		
		JLabel ordererName = new JLabel("ㅇㅇㅇ"+ " 님의 주문 현황");
		ordererName.setFont(new Font("굴림", Font.PLAIN, 18));
		ordererName.setBounds(201, 174, 189, 84);
		orderCakePanel.add(ordererName);
		
		JLabel label = new JLabel("Koike");
		label.setFont(new Font("Constantia", Font.BOLD, 50));
		label.setBounds(215, 62, 146, 102);
		orderCakePanel.add(label);
		
		JLabel label_1 = new JLabel("gift shop");
		label_1.setFont(new Font("Palatino Linotype", Font.ITALIC, 16));
		label_1.setBounds(300, 129, 109, 15);
		orderCakePanel.add(label_1);
		
		JButton return4 = new JButton("돌아가기");
		return4.setBounds(235, 660, 107, 48);
		return4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				orderCakePanel.setVisible(false);
				WelcomePanel();
			}
			
		});
		orderCakePanel.add(return4);

	}
	
	private void OwnerPanel() {
		JPanel ownerPanel = new JPanel();
		frame.getContentPane().add(ownerPanel, BorderLayout.CENTER);
		ownerPanel.setLayout(null);
		
		JLabel label = new JLabel("Koike");
		label.setFont(new Font("Constantia", Font.BOLD, 50));
		label.setBounds(223, 61, 146, 102);
		ownerPanel.add(label);
		
		JLabel label_1 = new JLabel("gift shop");
		label_1.setFont(new Font("Palatino Linotype", Font.ITALIC, 16));
		label_1.setBounds(308, 128, 109, 15);
		ownerPanel.add(label_1);
		
		JLabel ownerName = new JLabel("ㅇㅇㅇ"+ " 님의 Koike 주문 현황 ");
		ownerName.setFont(new Font("굴림", Font.PLAIN, 18));
		ownerName.setBounds(190, 209, 251, 62);
		ownerPanel.add(ownerName);
		
		JButton return5 = new JButton("돌아가기");
		return5.setBounds(239, 645, 107, 48);
		return5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ownerPanel.setVisible(false);
				WelcomePanel();
			}
			
		});
		ownerPanel.add(return5);

	}

	private void NoticePanel() {
		frame.setLocationRelativeTo(null);
		frame.setBounds(100, 100, 600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel noticePanel = new JPanel();
		frame.getContentPane().add(noticePanel, BorderLayout.CENTER);
		noticePanel.setLayout(null);

		JLabel label = new JLabel("Koike");
		label.setFont(new Font("Constantia", Font.BOLD, 30));
		label.setBounds(12, 10, 97, 59);
		noticePanel.add(label);

		JLabel label_1 = new JLabel("gift shop");
		label_1.setFont(new Font("Palatino Linotype", Font.ITALIC, 10));
		label_1.setBounds(64, 53, 97, 15);
		noticePanel.add(label_1);

		JLabel noticeTitle = new JLabel("주문 시 주의사항");
		noticeTitle.setBounds(221, 107, 97, 43);
		noticePanel.add(noticeTitle);

		JLabel txtnotice = new JLabel("예약 규정 & 환불 규정");
		txtnotice.setBounds(140, 327, 267, 198);
		noticePanel.add(txtnotice);

		JRadioButton okBtn = new JRadioButton("예, 확인함.");
		okBtn.setBounds(409, 638, 121, 23);
		noticePanel.add(okBtn);

		JRadioButton noBtn = new JRadioButton("아니요, 확인 안 함.");
		noBtn.setBounds(224, 638, 150, 23);
		noticePanel.add(noBtn);

		ButtonGroup okno = new ButtonGroup();
		okno.add(noBtn);
		okno.add(okBtn);

		JButton next1 = new JButton("다음으로");
		next1.setBounds(442, 685, 107, 48);
		next1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (okBtn.isSelected() == true) {
					noticePanel.setVisible(false);
					
					OrderInfoPanel();
				} else {
					JOptionPane.showMessageDialog(null, "다시 확인해주세요");
				}
			}

		});
		noticePanel.add(next1);

		JButton return1 = new JButton("이전으로");
		return1.setBounds(29, 685, 107, 48);
		return1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				noticePanel.setVisible(false);
				WelcomePanel();
			}
		});
		noticePanel.add(return1);

	}
	
	private void OrderInfoPanel() {
		JPanel orderInfo = new JPanel();
		orderInfo.setBounds(100, 100, 600, 800);
		frame.getContentPane().add(orderInfo, BorderLayout.CENTER);
		orderInfo.setLayout(null);
		
		JLabel label = new JLabel("Koike");
		label.setFont(new Font("Constantia", Font.BOLD, 50));
		label.setBounds(219, 54, 146, 102);
		orderInfo.add(label);
		
		JLabel label_1 = new JLabel("gift shop");
		label_1.setFont(new Font("Palatino Linotype", Font.ITALIC, 16));
		label_1.setBounds(302, 123, 109, 15);
		orderInfo.add(label_1);

		JLabel name = new JLabel("주문자 성함 : ");
		name.setBounds(94, 215, 105, 15);
		orderInfo.add(name);

		txtName = new JTextField();
		txtName.setBounds(211, 202, 107, 41);
		orderInfo.add(txtName);
		txtName.setColumns(10);

		JLabel phone = new JLabel("주문자 전화번호 : ");
		phone.setBounds(76, 298, 136, 15);
		orderInfo.add(phone);

		JTextField txtPhone = new JTextField();
		txtPhone.setBounds(211, 285, 187, 41);
		orderInfo.add(txtPhone);
		txtPhone.setColumns(10);

		JLabel phone2 = new JLabel("'-' 없이 입력");
		phone2.setBounds(431, 298, 107, 15);
		orderInfo.add(phone2);

		JLabel pickUpDateChoice = new JLabel("픽업 날짜&시간 선택하기");
		pickUpDateChoice.setBounds(114, 405, 155, 15);
		orderInfo.add(pickUpDateChoice);

		JLabel monthLabel = new JLabel("월");
		monthLabel.setBounds(242, 467, 27, 15);
		orderInfo.add(monthLabel);
		Choice monthChoice = new Choice();
		monthChoice.setBounds(168, 467, 68, 21);
		int[] month = new int[12];
		for (int i = 0; i < month.length; i++) {
			month[i] = (i + 1);
			monthChoice.add(Integer.toString(month[i]));
		}
		orderInfo.add(monthChoice);

		JLabel dateLabel = new JLabel("일");
		dateLabel.setBounds(371, 467, 27, 15);
		orderInfo.add(dateLabel);
		Choice dateChoice = new Choice();
		dateChoice.setBounds(297, 467, 68, 21);
		int[] date = new int[31];
		for (int i = 0; i < date.length; i++) {
			date[i] = (i + 1);
			dateChoice.add(Integer.toString(date[i]));
		}
		orderInfo.add(dateChoice);
		
		JLabel timeLabel = new JLabel("평일:pm02 ~ pm09 (공휴일, 토,일 12시 오픈)");
		timeLabel.setBounds(160, 540, 308, 15);
		orderInfo.add(timeLabel);

		JButton next2 = new JButton("다음으로");
		next2.setBounds(431, 666, 107, 48);
		next2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				orderInfo.setVisible(false);
			}

		});
		orderInfo.add(next2);

		JButton return2 = new JButton("이전으로");
		return2.setBounds(42, 666, 107, 48);
		return2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				orderInfo.setVisible(false);
			}

		});
		orderInfo.add(return2);

	}
}

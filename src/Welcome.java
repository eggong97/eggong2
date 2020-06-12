import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Welcome {

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
					Welcome window = new Welcome();
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
	public Welcome() {
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

		JButton orderBtn = new JButton("예약확인하기");
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
						JOptionPane.showMessageDialog(null, "주문자 정보가 확인되었습니다.");
						welcomePanel.setVisible(false);

					} else {
						JOptionPane.showMessageDialog(null, "주문자 정보가 잘못 입력되었습니다.");

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

		txtPwd = new JTextField();
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
		welcomePanel.add(logBtn);

	}

}

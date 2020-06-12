import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;

public class OrdererInfo {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrdererInfo window = new OrdererInfo();
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
	public OrdererInfo() {
		Frame();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void Frame() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		OrderInfoPanel();
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

		txtPhone = new JTextField();
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

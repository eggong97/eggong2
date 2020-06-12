import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Notice {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notice window = new Notice();
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
	public Notice() {
		Frame();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void Frame() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NoticePanel();
	}
	
	private void NoticePanel() {
		frame = new JFrame();
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
				if(noBtn.isSelected() == true) {
					JOptionPane.showMessageDialog(null, "다시 확인해주세요");
				}else {
					noticePanel.setVisible(false);
				}
			}
			
		});
		noticePanel.add(next1);

		JButton return1 = new JButton("이전으로");
		return1.setBounds(29, 685, 107, 48);
		noticePanel.add(return1);

	}

}

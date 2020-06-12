import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Owner {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Owner window = new Owner();
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
	public Owner() {
		Frame();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void Frame() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		OwnerPanel();
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
			}
			
		});
		ownerPanel.add(return5);

	}
}

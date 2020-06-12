import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OrderCake {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderCake window = new OrderCake();
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
	public OrderCake() {
		Frame();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void Frame() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		OrderCakePanel();
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
			}
			
		});
		orderCakePanel.add(return4);

	}

}

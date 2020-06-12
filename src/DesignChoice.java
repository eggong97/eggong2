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
		
		JLabel cakeFlavor = new JLabel("����ũ �� �����ϱ�");
		cakeFlavor.setBounds(88, 69, 234, 15);
		design.add(cakeFlavor);
		

		
		Choice flavorChoice = new Choice();
		flavorChoice.setBounds(127, 108, 310, 21);
		String setting = "���� �������ּ���";
		flavorChoice.add(setting);
		flavorChoice.add("���� ��ũ�� (�������� + ��ũ�� + ������)");
		flavorChoice.add("���ݸ� ���� ����ũ (ũ��ġ��)");
		flavorChoice.add("�ʷѸ� ���� ����ũ (������)");
		flavorChoice.add("������ ����ũ (ũ��ġ��)");
		flavorChoice.add("���� �Ŀ�� ����ũ (ũ��ġ��)");
		flavorChoice.add("�����Ŀ�� ����ũ (����ũ��)");
		flavorChoice.add("��׷��� ����ũ (ũ��ġ��)");
		flavorChoice.add("�� ����ũ (�� ����ũ)");
		design.add(flavorChoice);
		
		JLabel cakeDesign = new JLabel("����ũ ������ �����ϱ� ( ������ (1ȣ/2ȣ/3ȣ ����) )");
		cakeDesign.setBounds(88, 189, 310, 15);
		design.add(cakeDesign);
		
		Choice designChoice = new Choice();
		designChoice.setBounds(127, 236, 343, 21);
		String setting2 = "�������� �������ּ���";
		designChoice.add(setting2);
		designChoice.add("A. Palette �ȷ�Ʈ (56000��/67000��/92000��)");
		designChoice.add("B. Flower Garden �ö�� ���� (56000��/67000��/92000��)");
		designChoice.add("C. Birth Flower ź��ȭ (56000��/67000��/92000��)");
		designChoice.add("D. Wedding ���� (56000��/67000��/92000��)");
		designChoice.add("E. Pattern ���� (56000��/67000��/92000��)");
		designChoice.add("F. Glow �۷ο� (56000��/67000��/92000��)");
		designChoice.add("G. Universe ���Ϲ��� (56000��/67000��/92000��)");
		designChoice.add("H. Forest ������Ʈ (56000��/67000��/92000��)");
		designChoice.add("I. Sea �ٴ� (56000��/67000��/92000��)");
		designChoice.add("J. Painting ������ (67000��/78000��/100000��)");
		designChoice.add("K. Bespoke ����ũ (67000��/78000��/100000��)");
		
		design.add(designChoice);
		
		JLabel cakeSize = new JLabel("����ũ ������ �����ϱ�");
		cakeSize.setBounds(88, 308, 198, 15);
		design.add(cakeSize);
		
		JRadioButton size1 = new JRadioButton("1ȣ (���� 16cm) 2 ~ 4��");
		size1.setBounds(117, 360, 258, 23);
		design.add(size1);
		
		JRadioButton size2 = new JRadioButton("2ȣ (���� 18cm) 4 ~ 8��");
		size2.setBounds(117, 405, 258, 23);
		design.add(size2);
		
		JRadioButton size3 = new JRadioButton("3ȣ (���� 22cm) 8 ~ 10��");
		size3.setBounds(117, 448, 258, 23);
		design.add(size3);
		
		ButtonGroup size = new ButtonGroup();
		size.add(size1);
		size.add(size2);
		size.add(size3);

		JLabel cakeLettering = new JLabel("���͸� �߰��Ͻ� ���� ���ϴ� ������ �ۼ����ּ���.");
		cakeLettering.setBounds(88, 520, 310, 15);
		design.add(cakeLettering);
		
		JTextPane txtLettering = new JTextPane();
		txtLettering.setBounds(141, 570, 235, 21);
		design.add(txtLettering);
		
		JButton next3 = new JButton("��������");
		next3.setBounds(429, 664, 107, 48);
		next3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(flavorChoice.equals(setting) && designChoice.equals(setting2)) {
					JOptionPane.showMessageDialog(null, "��/�������� �������ּ���");
				}else {
					design.setVisible(false);
				}
			}

		});
		design.add(next3);
		
		JButton return3 = new JButton("��������");
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

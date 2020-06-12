import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	public Login() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel id = new JLabel("ID : ");
		JLabel pwd = new JLabel("Password : ");
		JTextField txtid = new JTextField(10);
		JPasswordField txtpwd = new JPasswordField(10);
		JButton logBtn = new JButton("Login");
		
		panel.add(id);
		panel.add(txtid);
		panel.add(pwd);
		panel.add(txtpwd);
		panel.add(logBtn);
		
		frame.add(panel);
		
		frame.setTitle("LOGIN");
		frame.setVisible(true);
		frame.setSize(500, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Login();
	}
}

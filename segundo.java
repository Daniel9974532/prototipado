import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;

public class segundo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					segundo frame = new segundo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public segundo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(54, 48, 215, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("uno :");
		lblNewLabel.setBackground(new Color(0, 255, 128));
		lblNewLabel.setBounds(54, 101, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Dos :");
		lblNewLabel_1.setBounds(54, 159, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("Traspasa 1");
		btnNewButton.setBounds(42, 205, 107, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		btnNewButton_1 = new JButton("Traspasa 2");
		btnNewButton_1.setBounds(169, 205, 100, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnNewButton) {
			lblNewLabel.setText(textField.getText());
		}else if (e.getSource()==btnNewButton_1) {
			lblNewLabel_1.setText(textField.getText());
		}
		
	}
}

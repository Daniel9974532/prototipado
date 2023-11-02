import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class cuarto extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cuarto frame = new cuarto();
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
	public cuarto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Nombre :");
		lblNewLabel.setBounds(28, 53, 60, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(87, 50, 236, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Ciudad :");
		lblNewLabel_1.setBounds(28, 107, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(87, 104, 236, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(28, 151, 295, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		btnNewButton_1 = new JButton("Activar ");
		btnNewButton_1.setBounds(58, 195, 114, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		
		btnNewButton_2 = new JButton("Desactivar");
		btnNewButton_2.setBounds(182, 195, 114, 23);
		contentPane.add(btnNewButton_2);
		
		lblNewLabel_2 = new JLabel("*");
		lblNewLabel_2.setBounds(28, 247, 295, 14);
		contentPane.add(lblNewLabel_2);
		btnNewButton_2.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnNewButton) {
			lblNewLabel_2.setText(textField.getText()+" "+textField_1.getText());
		}else if (e.getSource()==btnNewButton_1) {
			textField.setEnabled(true);
			textField_1.setEnabled(true);
		}else if (e.getSource()==btnNewButton_2) {
			textField.setEnabled(false);
			textField_1.setEnabled(false);
		}
		
	}
}

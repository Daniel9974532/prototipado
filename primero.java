import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class primero extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					primero frame = new primero();
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
	public primero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Nombre ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(125, 11, 122, 37);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Ciudad  ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(125, 78, 127, 29);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("Ocultar Nombre");
		btnNewButton.setBounds(24, 165, 138, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);

		
		btnNewButton_1 = new JButton("Visualizar Nombre");
		btnNewButton_1.setBounds(185, 165, 148, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);

		
		btnNewButton_2 = new JButton("Ocultar Ciudad");
		btnNewButton_2.setBounds(24, 204, 138, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);

		
		btnNewButton_3 = new JButton("Visualizar Ciudad");
		btnNewButton_3.setBounds(185, 204, 148, 23);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.addActionListener(this);

	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnNewButton) {
			System.out.println("nombre oculto");			
			lblNewLabel.setVisible(false);
		}else if (e.getSource()==btnNewButton_1) {
			System.out.println("muestra Nombre");
			lblNewLabel.setVisible(true);
		}else if (e.getSource()==btnNewButton_2) {
			System.out.println("ciudad oculta");
			lblNewLabel_1.setVisible(false);

		}else if (e.getSource()==btnNewButton_3) {
			System.out.println("muestra Ciudad");
			lblNewLabel_1.setVisible(true);

		}
		
	}
}

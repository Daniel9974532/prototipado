import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;

public class quinto extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiPal1;
	private JLabel etiPal2;
	private JLabel etiPal13;
	private JLabel etiPal4;
	private JLabel etiOcultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quinto frame = new quinto();
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
	public quinto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiPal1 = new JLabel("hola");
		etiPal1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiPal1.setBounds(35, 33, 44, 36);
		contentPane.add(etiPal1);
		
		etiPal2 = new JLabel("como");
		etiPal2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiPal2.setBackground(new Color(0, 0, 255));
		etiPal2.setBounds(129, 33, 61, 36);
		contentPane.add(etiPal2);
		
		etiPal13 = new JLabel("esta");
		etiPal13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiPal13.setBounds(218, 33, 77, 36);
		contentPane.add(etiPal13);
		
		etiPal4 = new JLabel(":) <3");
		etiPal4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiPal4.setBounds(305, 33, 68, 36);
		contentPane.add(etiPal4);
		
		etiOcultar = new JLabel("OCULTAR");
		etiOcultar.setBackground(new Color(128, 255, 255));
		etiOcultar.setForeground(new Color(255, 0, 0));
		etiOcultar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		etiOcultar.setBounds(134, 142, 161, 49);
		etiOcultar.addMouseListener(this);
		contentPane.add(etiOcultar);
	}


	
	public void mouseEntered(MouseEvent e) {
		if (e.getSource()==etiOcultar) {
			etiPal1.setVisible(false);
			etiPal2.setVisible(false);
			etiPal13.setVisible(false);
			etiPal4.setVisible(false);
		}
		
	}

	
	public void mouseExited(MouseEvent e) {
		if (e.getSource()==etiOcultar) {
			etiPal1.setVisible(true);
			etiPal2.setVisible(true);
			etiPal13.setVisible(true);
			etiPal4.setVisible(true);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

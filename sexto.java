import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class sexto extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnEsquina;
	private JButton btnCentro;
	private JButton btnAgrandar;
	private JButton btnAchicar;
	private JLabel etiNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sexto frame = new sexto();
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
	public sexto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiNombre = new JLabel("Daniel");
		etiNombre.setFont(new Font("Tahoma", Font.PLAIN, 35));
		etiNombre.setBounds(149, 0, 168, 113);
		contentPane.add(etiNombre);
		
		btnEsquina = new JButton("Esquina");
		btnEsquina.setBounds(28, 135, 131, 34);
		btnEsquina.addMouseListener(this);
		contentPane.add(btnEsquina);
		
		btnCentro = new JButton("Centro");
		btnCentro.setBounds(229, 135, 131, 34);
		btnCentro.addMouseListener(this);
		contentPane.add(btnCentro);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setBounds(28, 190, 131, 34);
		btnAgrandar.addMouseListener(this);
		contentPane.add(btnAgrandar);
		
		btnAchicar = new JButton("Achicar");
		btnAchicar.setBounds(229, 196, 131, 34);
		btnAchicar.addMouseListener(this);
		contentPane.add(btnAchicar);
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

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource()==btnEsquina) {
			etiNombre.setLocation(329,0);
		}else if (e.getSource()==btnCentro) {
			etiNombre.setLocation(148,90);
		}else if (e.getSource()==btnAgrandar) {
			etiNombre.setSize(100, 80);
		}else if (e.getSource()==btnAchicar) {
			etiNombre.setSize(100, 10);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource()==btnEsquina) {
			etiNombre.setLocation(171,11);
		}else if (e.getSource()==btnCentro) {
			etiNombre.setLocation(171,11);
		}else if (e.getSource()==btnAgrandar) {
			etiNombre.setSize(100, 35);
		}else if (e.getSource()==btnAchicar) {
			etiNombre.setSize(100, 35);
		}
		
	}

}

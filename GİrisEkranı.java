import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GÝrisEkraný extends JFrame {

	private final JPanel contentPane;
	private final JPasswordField pwdHgchg;
	private final JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					GÝrisEkraný frame = new GÝrisEkraný();
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
	public GÝrisEkraný() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		pwdHgchg = new JPasswordField();
		pwdHgchg.setBounds(103, 134, 235, 25);
		contentPane.add(pwdHgchg);

		JLabel lblGirisEkran = new JLabel("Giri\u015F Ekran\u0131");
		lblGirisEkran.setBounds(162, 43, 107, 31);
		contentPane.add(lblGirisEkran);

		JButton btnGiri = new JButton("Giri\u015F");
		btnGiri.setBounds(242, 167, 97, 25);
		contentPane.add(btnGiri);

		JButton btnifremiUnuttum = new JButton("\u015Eifremi unuttum");
		btnifremiUnuttum.setBounds(103, 167, 127, 25);
		contentPane.add(btnifremiUnuttum);

		textField = new JTextField();
		textField.setBounds(103, 87, 235, 28);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}

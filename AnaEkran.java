import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class AnaEkran extends JFrame {

	private final JPanel contentPane;
	private final JTable Tablo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JList myList = new JList();
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				try {
					AnaEkran frame = new AnaEkran();
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
	public AnaEkran() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JButton btnYeniKayt = new JButton("Yeni Kayýt");
		btnYeniKayt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				yenikayit.YeniKayit1 a = new yenikayit.YeniKayit1();
				a.setVisible(true);

			}
		});
		menuBar.add(btnYeniKayt);

		JButton btnMesajlar = new JButton("Mesajlar");
		menuBar.add(btnMesajlar);

		JButton btnablonlar = new JButton("Sablonlar");
		menuBar.add(btnablonlar);

		JButton btnAyarlar = new JButton("Ayarlar");
		menuBar.add(btnAyarlar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		String[] headings = { "from", "address", "subject", "size" };
		Object[][] data = { { "", "", "", new Integer(123) },
				{ "", "", "", new Integer(123) },
				{ "", "", "", new Integer(123) },
				{ "", "", "", new Integer(123) },
				{ "", "", "", new Integer(123) } };

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 13, 321, 200);
		contentPane.add(scrollPane_1);

		Tablo = new JTable();
		scrollPane_1.setViewportView(Tablo);
		Tablo.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "from", "address", "subject", "size" }));

		JButton Detay = new JButton("Detay");
		Detay.setBounds(335, 13, 97, 25);
		contentPane.add(Detay);

		JButton Muayene = new JButton("Muayene");
		Muayene.setBounds(335, 51, 97, 25);
		contentPane.add(Muayene);

		JButton Yenile = new JButton("Yenile");
		Yenile.setBounds(335, 89, 97, 25);
		contentPane.add(Yenile);
	}
}

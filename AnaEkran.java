import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class AnaEkran extends JFrame {

	private final JPanel contentPane;
	private final JTable Tablo;
	private final JTextField textField;

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
		setBounds(100, 100, 701, 492);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JButton btnYeniKayt = new JButton("Yeni Kayýt");
		btnYeniKayt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				yenikayit.yenikayit_1 a = new yenikayit.yenikayit_1();
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
		String[] headings = { "from", "address", "subject", "size" };
		Object[][] data = { { "", "", "", new Integer(123) },
				{ "", "", "", new Integer(123) },
				{ "", "", "", new Integer(123) },
				{ "", "", "", new Integer(123) },
				{ "", "", "", new Integer(123) } };
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 559, 97, 0 };
		gbl_contentPane.rowHeights = new int[] { 25, 39, 212, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.gridheight = 3;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 268, 243, 0 };
		gbl_panel.rowHeights = new int[] { 65, 230, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.SOUTH;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);

		JButton btnBul = new JButton("Bul");
		GridBagConstraints gbc_btnBul = new GridBagConstraints();
		gbc_btnBul.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnBul.insets = new Insets(0, 0, 5, 0);
		gbc_btnBul.gridx = 2;
		gbc_btnBul.gridy = 0;
		panel.add(btnBul, gbc_btnBul);

		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridwidth = 2;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 1;
		panel.add(scrollPane_1, gbc_scrollPane_1);

		Tablo = new JTable();
		scrollPane_1.setViewportView(Tablo);
		Tablo.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null }, }, new String[] { "Ad",
				"Soyad", "Tel", "Kay\u0131t Tarihi", "Kilo", "Bildirimler" }));

		JButton Detay = new JButton("Detay");
		GridBagConstraints gbc_Detay = new GridBagConstraints();
		gbc_Detay.anchor = GridBagConstraints.NORTH;
		gbc_Detay.fill = GridBagConstraints.HORIZONTAL;
		gbc_Detay.insets = new Insets(0, 0, 5, 0);
		gbc_Detay.gridx = 1;
		gbc_Detay.gridy = 0;
		contentPane.add(Detay, gbc_Detay);

		JButton Muayene = new JButton("Muayene");
		GridBagConstraints gbc_Muayene = new GridBagConstraints();
		gbc_Muayene.anchor = GridBagConstraints.NORTH;
		gbc_Muayene.fill = GridBagConstraints.HORIZONTAL;
		gbc_Muayene.insets = new Insets(0, 0, 5, 0);
		gbc_Muayene.gridx = 1;
		gbc_Muayene.gridy = 1;
		contentPane.add(Muayene, gbc_Muayene);

		JButton Yenile = new JButton("Yenile");
		GridBagConstraints gbc_Yenile = new GridBagConstraints();
		gbc_Yenile.fill = GridBagConstraints.HORIZONTAL;
		gbc_Yenile.gridx = 1;
		gbc_Yenile.gridy = 2;
		contentPane.add(Yenile, gbc_Yenile);
	}
}

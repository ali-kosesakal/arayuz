package yenikayit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class yenikayit_2 extends JFrame {

	private final JPanel contentPane;
	private final JTextField textField;
	private final JTextField textField_1;
	private final JTextField textField_2;
	private final JTextField textField_3;
	private final JTextField textField_4;
	private final JTextField textField_5;
	private final JTextField textField_6;
	private final JTextField textField_7;
	private final JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					yenikayit_2 frame = new yenikayit_2();
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
	public yenikayit_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JTabbedPane kisiselbilgiTpane = new JTabbedPane(SwingConstants.TOP);
		kisiselbilgiTpane.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		contentPane.add(kisiselbilgiTpane, BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		kisiselbilgiTpane.addTab("New tab", null, panel_1, null);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0, 0, 100, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 57, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0,
				Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JLabel lblAd = new JLabel("Ad :");
		GridBagConstraints gbc_lblAd = new GridBagConstraints();
		gbc_lblAd.anchor = GridBagConstraints.WEST;
		gbc_lblAd.insets = new Insets(0, 0, 5, 5);
		gbc_lblAd.gridx = 0;
		gbc_lblAd.gridy = 0;
		panel_1.add(lblAd, gbc_lblAd);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);

		JLabel lblSoyad = new JLabel("Soyad :");
		GridBagConstraints gbc_lblSoyad = new GridBagConstraints();
		gbc_lblSoyad.anchor = GridBagConstraints.WEST;
		gbc_lblSoyad.insets = new Insets(0, 0, 5, 5);
		gbc_lblSoyad.gridx = 0;
		gbc_lblSoyad.gridy = 1;
		panel_1.add(lblSoyad, gbc_lblSoyad);

		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 1;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		JLabel lblTc = new JLabel("T.c. :");
		GridBagConstraints gbc_lblTc = new GridBagConstraints();
		gbc_lblTc.anchor = GridBagConstraints.WEST;
		gbc_lblTc.insets = new Insets(0, 0, 5, 5);
		gbc_lblTc.gridx = 0;
		gbc_lblTc.gridy = 2;
		panel_1.add(lblTc, gbc_lblTc);

		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 2;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JLabel lblDoumTarihi = new JLabel("Do\u011Fum Tarihi :");
		GridBagConstraints gbc_lblDoumTarihi = new GridBagConstraints();
		gbc_lblDoumTarihi.anchor = GridBagConstraints.WEST;
		gbc_lblDoumTarihi.insets = new Insets(0, 0, 5, 5);
		gbc_lblDoumTarihi.gridx = 0;
		gbc_lblDoumTarihi.gridy = 3;
		panel_1.add(lblDoumTarihi, gbc_lblDoumTarihi);

		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 3;
		panel_1.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		JLabel lblAdres = new JLabel("Adres :");
		GridBagConstraints gbc_lblAdres = new GridBagConstraints();
		gbc_lblAdres.anchor = GridBagConstraints.WEST;
		gbc_lblAdres.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdres.gridx = 0;
		gbc_lblAdres.gridy = 4;
		panel_1.add(lblAdres, gbc_lblAdres);

		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.BOTH;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 4;
		panel_1.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);

		JLabel lblTelefon = new JLabel("Telefon :");
		GridBagConstraints gbc_lblTelefon = new GridBagConstraints();
		gbc_lblTelefon.anchor = GridBagConstraints.WEST;
		gbc_lblTelefon.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefon.gridx = 0;
		gbc_lblTelefon.gridy = 5;
		panel_1.add(lblTelefon, gbc_lblTelefon);

		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 5;
		panel_1.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);

		JLabel lblMailAdresi = new JLabel("Mail Adresi :");
		GridBagConstraints gbc_lblMailAdresi = new GridBagConstraints();
		gbc_lblMailAdresi.anchor = GridBagConstraints.WEST;
		gbc_lblMailAdresi.insets = new Insets(0, 0, 5, 5);
		gbc_lblMailAdresi.gridx = 0;
		gbc_lblMailAdresi.gridy = 6;
		panel_1.add(lblMailAdresi, gbc_lblMailAdresi);

		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 2;
		gbc_textField_6.gridy = 6;
		panel_1.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);

		JLabel lblKullancAd = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		GridBagConstraints gbc_lblKullancAd = new GridBagConstraints();
		gbc_lblKullancAd.anchor = GridBagConstraints.WEST;
		gbc_lblKullancAd.insets = new Insets(0, 0, 5, 5);
		gbc_lblKullancAd.gridx = 0;
		gbc_lblKullancAd.gridy = 7;
		panel_1.add(lblKullancAd, gbc_lblKullancAd);

		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 2;
		gbc_textField_7.gridy = 7;
		panel_1.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);

		JLabel lblifre = new JLabel("\u015Eifre :");
		GridBagConstraints gbc_lblifre = new GridBagConstraints();
		gbc_lblifre.anchor = GridBagConstraints.WEST;
		gbc_lblifre.insets = new Insets(0, 0, 0, 5);
		gbc_lblifre.gridx = 0;
		gbc_lblifre.gridy = 8;
		panel_1.add(lblifre, gbc_lblifre);

		textField_8 = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 0, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 2;
		gbc_textField_8.gridy = 8;
		panel_1.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);

		JPanel panel_2 = new JPanel();
		kisiselbilgiTpane.addTab("New tab", null, panel_2, null);

		JPanel panel_3 = new JPanel();
		kisiselbilgiTpane.addTab("New tab", null, panel_3, null);
	}

}

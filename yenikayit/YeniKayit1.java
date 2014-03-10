package yenikayit;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.eclipse.wb.swing.FocusTraversalOnArray;

public class YeniKayit1 extends JFrame {

	private final JPanel contentPane;
	private final JTextField textAd;
	private final JTextField textSoyad;
	private final JTextField textTc;
	private final JTextField textField;
	private final JTextField textField_1;
	private final JTextField textField_2;
	private final JTextField textField_3;
	private final JTextField textField_4;
	private final JPasswordField textsifre;
	private final JTextField texthastalýk;
	private final JTextField textField_5;
	private final JTextField textKilo;
	private final JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					YeniKayit1 frame = new YeniKayit1();
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
	public YeniKayit1() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 641, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JPanel panelSyf3 = new JPanel();
		panelSyf3.setBounds(0, 0, 611, 452);
		contentPane.add(panelSyf3);
		panelSyf3.setVisible(false);
		panelSyf3.setLayout(null);

		JButton btnSon = new JButton("Son");
		btnSon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSon.setBounds(514, 427, 97, 25);
		panelSyf3.add(btnSon);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 56, 416, 166);
		panelSyf3.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		scrollPane.setVisible(true);
		table.setModel(new DefaultTableModel(new Object[][] {
				{ "1", "sadf", "asdf", "123" },
				{ "2", "sdafsdaf", "sadf", "123123" },
				{ "3", "sadfsad", null, "1231" },
				{ "4", "sdafsadf", "sadf", "2312312" },
				{ "5", "sfasdf", "sadf", "312" },
				{ "6", "sadf", "safsdaf", "3123" },
				{ "7", "dfsadf", "sa", "1123" }, { null, null, null, null },
				{ null, null, null, null }, }, new String[] { "No",
				"Besin Ad\u0131", "Besin Miktar\u0131",
				"Kalori miktar\u0131 (cal)" }));

		JComboBox cbOgunler = new JComboBox();
		cbOgunler.setBounds(22, 18, 202, 25);
		panelSyf3.add(cbOgunler);

		JButton btnOgunEkle = new JButton("\u00D6\u011F\u00FCn Ekle");
		btnOgunEkle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				yenikayit.OgunEkle b = new yenikayit.OgunEkle();
				b.setVisible(true);
			}
		});
		btnOgunEkle.setBounds(341, 18, 97, 25);
		panelSyf3.add(btnOgunEkle);

		JButton btnDuzenle = new JButton("D\u00FCzenle");
		btnDuzenle.setBounds(450, 60, 97, 25);
		panelSyf3.add(btnDuzenle);
		table.getColumnModel().getColumn(0).setPreferredWidth(48);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(97);
		table.getColumnModel().getColumn(3).setPreferredWidth(121);

		final JPanel panel2 = new JPanel();
		panel2.setBounds(0, 0, 611, 452);
		panel2.setVisible(false);
		contentPane.add(panel2);
		panel2.setLayout(null);

		JButton btnIleri_2 = new JButton("\u0130leri");
		btnIleri_2.setBounds(514, 427, 97, 25);
		panel2.add(btnIleri_2);

		texthastalýk = new JTextField();
		texthastalýk.setBounds(183, 13, 116, 22);
		panel2.add(texthastalýk);
		texthastalýk.setColumns(10);

		JLabel lblKronikRahatsizlik = new JLabel(
				"Kronik Rahats\u0131zl\u0131k:");
		lblKronikRahatsizlik.setBounds(12, 19, 137, 16);
		panel2.add(lblKronikRahatsizlik);

		textField_5 = new JTextField();
		textField_5.setBounds(183, 48, 116, 22);
		panel2.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblBoy = new JLabel("Boy:");
		lblBoy.setBounds(12, 54, 56, 16);
		panel2.add(lblBoy);

		textKilo = new JTextField();
		textKilo.setBounds(183, 83, 116, 22);
		panel2.add(textKilo);
		textKilo.setColumns(10);

		JLabel lblKilo = new JLabel("Kilo:");
		lblKilo.setBounds(12, 89, 56, 16);
		panel2.add(lblKilo);

		final JPanel panelSyf1 = new JPanel();
		panelSyf1.setBounds(0, 0, 611, 452);
		panelSyf1.setVisible(true);
		contentPane.add(panelSyf1);
		panelSyf1.setLayout(null);

		JButton btnIleri_1 = new JButton("\u0130leri");
		btnIleri_1.setBounds(502, 414, 97, 25);
		panelSyf1.add(btnIleri_1);

		textAd = new JTextField();
		textAd.setBounds(176, 13, 208, 22);
		panelSyf1.add(textAd);
		textAd.setColumns(10);

		JLabel lblAd = new JLabel("Ad:");
		lblAd.setBounds(12, 16, 56, 16);
		panelSyf1.add(lblAd);

		textSoyad = new JTextField();
		textSoyad.setBounds(176, 48, 208, 22);
		panelSyf1.add(textSoyad);
		textSoyad.setColumns(10);

		JLabel lblSoyad = new JLabel("Soyad:");
		lblSoyad.setBounds(12, 51, 66, 16);
		panelSyf1.add(lblSoyad);

		textTc = new JTextField();
		textTc.setBounds(176, 83, 208, 22);
		panelSyf1.add(textTc);
		textTc.setColumns(10);

		JLabel lblTc = new JLabel("T.C.:");
		lblTc.setBounds(12, 89, 56, 16);
		panelSyf1.add(lblTc);

		textField = new JTextField();
		textField.setBounds(176, 118, 208, 22);
		panelSyf1.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(176, 153, 208, 22);
		panelSyf1.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(176, 188, 208, 22);
		panelSyf1.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(176, 223, 208, 22);
		panelSyf1.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblDTarihi = new JLabel("D. Tarihi:");
		lblDTarihi.setBounds(12, 121, 56, 16);
		panelSyf1.add(lblDTarihi);

		JLabel lblTelefon = new JLabel("Telefon:");
		lblTelefon.setBounds(12, 159, 56, 16);
		panelSyf1.add(lblTelefon);

		JLabel lblAdres = new JLabel("Adres :");
		lblAdres.setBounds(12, 194, 56, 16);
		panelSyf1.add(lblAdres);

		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(12, 229, 56, 16);
		panelSyf1.add(lblEmail);

		textField_4 = new JTextField();
		textField_4.setBounds(176, 258, 208, 22);
		panelSyf1.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblKullaniciAdi = new JLabel("Kullan\u0131c\u0131 Ad\u0131:");
		lblKullaniciAdi.setBounds(12, 264, 132, 16);
		panelSyf1.add(lblKullaniciAdi);

		JLabel lblSifre = new JLabel("\u015Eifre:");
		lblSifre.setBounds(12, 299, 56, 16);
		panelSyf1.add(lblSifre);
		btnIleri_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				panel2.setVisible(false);
				panelSyf3.setVisible(true);

			}
		});
		btnIleri_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				panelSyf1.setVisible(false);
				panel2.setVisible(true);

			}
		});

		textsifre = new JPasswordField();
		textsifre.setBounds(176, 293, 208, 22);
		panelSyf1.add(textsifre);
		setFocusTraversalPolicy(new FocusTraversalOnArray(
				new Component[] { contentPane }));

	}
}

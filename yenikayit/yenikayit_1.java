package yenikayit;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class yenikayit_1 extends JFrame {

	protected static Object panel;
	private final JPanel contentPane;
	private final JTable ogunTablo;
	private final JTextField bul_besinTxt;
	private final JTextField o_adiTxt;
	private final JTable table;
	private final JTextField boyTxt;
	private final JTextField kiloTxt;
	private final JTextField yasTxt;
	private final JTextField y_oraniTxt;
	private final JTextField k_hastalikTxt;

	private final JTextField adTxt;
	private final JTextField soyadTxt;
	private final JTextField tcTxt;
	private final JTextField d_tarihiTxt;
	private final JTextField adresTxt;
	private final JTextField telefonTxt;
	private final JTextField mailTxt;
	private final JTextField k_adiTxt;
	private final JTextField sifreTxt;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					yenikayit_1 frame = new yenikayit_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public yenikayit_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// *************3. PANEL BAÞLANGIÇ******************
		// gbc.weightx = gbc.weighty = 1.0;
		final JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 13, 657, 441);
		contentPane.add(panel_3);
		panel_3.setVisible(false);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 190, 115, 143, 203, 0 };
		gbl_panel_3.rowHeights = new int[] { 0, 125, 0, 0, 187, 34, 0 };
		gbl_panel_3.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		bul_besinTxt = new JTextField();
		GridBagConstraints gbc_bul_besinTxt = new GridBagConstraints();
		gbc_bul_besinTxt.insets = new Insets(0, 0, 5, 5);
		gbc_bul_besinTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_bul_besinTxt.gridx = 0;
		gbc_bul_besinTxt.gridy = 0;
		panel_3.add(bul_besinTxt, gbc_bul_besinTxt);
		bul_besinTxt.setColumns(10);

		JButton listeleBtn = new JButton("listele");
		GridBagConstraints gbc_listeleBtn = new GridBagConstraints();
		gbc_listeleBtn.insets = new Insets(0, 0, 5, 5);
		gbc_listeleBtn.gridx = 1;
		gbc_listeleBtn.gridy = 0;
		panel_3.add(listeleBtn, gbc_listeleBtn);

		JLabel o_adiLbl = new JLabel(
				"\u00D6\u011F\u00FCn Ad\u0131n\u0131 Giriniz :");
		GridBagConstraints gbc_o_adiLbl = new GridBagConstraints();
		gbc_o_adiLbl.insets = new Insets(0, 0, 5, 5);
		gbc_o_adiLbl.anchor = GridBagConstraints.WEST;
		gbc_o_adiLbl.gridx = 2;
		gbc_o_adiLbl.gridy = 0;
		panel_3.add(o_adiLbl, gbc_o_adiLbl);

		o_adiTxt = new JTextField();
		GridBagConstraints gbc_o_adiTxt = new GridBagConstraints();
		gbc_o_adiTxt.insets = new Insets(0, 0, 5, 0);
		gbc_o_adiTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_o_adiTxt.gridx = 3;
		gbc_o_adiTxt.gridy = 0;
		panel_3.add(o_adiTxt, gbc_o_adiTxt);
		o_adiTxt.setColumns(10);

		JList besinList = new JList();
		GridBagConstraints gbc_besinList = new GridBagConstraints();
		gbc_besinList.gridwidth = 2;
		gbc_besinList.insets = new Insets(0, 0, 5, 5);
		gbc_besinList.fill = GridBagConstraints.BOTH;
		gbc_besinList.gridx = 0;
		gbc_besinList.gridy = 1;
		panel_3.add(besinList, gbc_besinList);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 1;
		panel_3.add(scrollPane, gbc_scrollPane);

		ogunTablo = new JTable();
		ogunTablo.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null }, }, new String[] {
				"besin ad\u0131", "besn miktar\u0131",
				"kalori miktar\u0131 (cal)" }));
		ogunTablo.getColumnModel().getColumn(0).setPreferredWidth(111);
		ogunTablo.getColumnModel().getColumn(1).setPreferredWidth(92);
		ogunTablo.getColumnModel().getColumn(2).setPreferredWidth(117);
		scrollPane.setViewportView(ogunTablo);

		JButton sablondanEkleBtn = new JButton("\u015Eablondan Ekle");
		GridBagConstraints gbc_sablondanEkleBtn = new GridBagConstraints();
		gbc_sablondanEkleBtn.anchor = GridBagConstraints.WEST;
		gbc_sablondanEkleBtn.insets = new Insets(0, 0, 5, 5);
		gbc_sablondanEkleBtn.gridx = 0;
		gbc_sablondanEkleBtn.gridy = 2;
		panel_3.add(sablondanEkleBtn, gbc_sablondanEkleBtn);

		JButton secBtn = new JButton("se\u00E7");
		GridBagConstraints gbc_secBtn = new GridBagConstraints();
		gbc_secBtn.anchor = GridBagConstraints.EAST;
		gbc_secBtn.insets = new Insets(0, 0, 5, 5);
		gbc_secBtn.gridx = 1;
		gbc_secBtn.gridy = 2;
		panel_3.add(secBtn, gbc_secBtn);

		JComboBox ogunlerCbox = new JComboBox();
		GridBagConstraints gbc_ogunlerCbox = new GridBagConstraints();
		gbc_ogunlerCbox.insets = new Insets(0, 0, 5, 5);
		gbc_ogunlerCbox.fill = GridBagConstraints.HORIZONTAL;
		gbc_ogunlerCbox.gridx = 0;
		gbc_ogunlerCbox.gridy = 3;
		panel_3.add(ogunlerCbox, gbc_ogunlerCbox);

		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridwidth = 3;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 4;
		panel_3.add(scrollPane_1, gbc_scrollPane_1);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null }, }, new String[] {
				"Besin Ad\u0131", "Besin Miktar\u0131",
				"Kalro Miktar\u0131(cal)" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(101);
		table.getColumnModel().getColumn(1).setPreferredWidth(106);
		table.getColumnModel().getColumn(2).setPreferredWidth(110);
		scrollPane_1.setViewportView(table);

		JButton o_tablosuDüzenleBtn = new JButton("D\u00FCzenle");
		GridBagConstraints gbc_o_tablosuDüzenleBtn = new GridBagConstraints();
		gbc_o_tablosuDüzenleBtn.insets = new Insets(0, 0, 0, 5);
		gbc_o_tablosuDüzenleBtn.gridx = 1;
		gbc_o_tablosuDüzenleBtn.gridy = 5;
		panel_3.add(o_tablosuDüzenleBtn, gbc_o_tablosuDüzenleBtn);

		JButton sonBtn = new JButton("Son");
		GridBagConstraints gbc_sonBtn = new GridBagConstraints();
		gbc_sonBtn.anchor = GridBagConstraints.EAST;
		gbc_sonBtn.gridx = 3;
		gbc_sonBtn.gridy = 5;
		panel_3.add(sonBtn, gbc_sonBtn);

		// ******************3. PANEL BÝTÝÞ*********************

		// ******************2.PANEL BAÞLANGIÇ******************

		final JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 13, 657, 441);
		contentPane.add(panel_2);
		panel_2.setVisible(false);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 110, 0, 350, 51, 114, 0 };
		gbl_panel_2.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		JLabel lblBoy = new JLabel("Boy :");
		GridBagConstraints gbc_lblBoy = new GridBagConstraints();
		gbc_lblBoy.anchor = GridBagConstraints.WEST;
		gbc_lblBoy.insets = new Insets(0, 0, 5, 5);
		gbc_lblBoy.gridx = 0;
		gbc_lblBoy.gridy = 1;
		panel_2.add(lblBoy, gbc_lblBoy);

		boyTxt = new JTextField();
		GridBagConstraints gbc_boyTxt = new GridBagConstraints();
		gbc_boyTxt.insets = new Insets(0, 0, 5, 5);
		gbc_boyTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_boyTxt.gridx = 2;
		gbc_boyTxt.gridy = 1;
		panel_2.add(boyTxt, gbc_boyTxt);
		boyTxt.setColumns(10);

		JLabel lblcm = new JLabel("(cm)");
		GridBagConstraints gbc_lblcm = new GridBagConstraints();
		gbc_lblcm.insets = new Insets(0, 0, 5, 5);
		gbc_lblcm.gridx = 3;
		gbc_lblcm.gridy = 1;
		panel_2.add(lblcm, gbc_lblcm);

		JLabel lblKilo = new JLabel("Kilo :");
		GridBagConstraints gbc_lblKilo = new GridBagConstraints();
		gbc_lblKilo.anchor = GridBagConstraints.WEST;
		gbc_lblKilo.insets = new Insets(0, 0, 5, 5);
		gbc_lblKilo.gridx = 0;
		gbc_lblKilo.gridy = 2;
		panel_2.add(lblKilo, gbc_lblKilo);

		kiloTxt = new JTextField();
		GridBagConstraints gbc_kiloTxt = new GridBagConstraints();
		gbc_kiloTxt.insets = new Insets(0, 0, 5, 5);
		gbc_kiloTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_kiloTxt.gridx = 2;
		gbc_kiloTxt.gridy = 2;
		panel_2.add(kiloTxt, gbc_kiloTxt);
		kiloTxt.setColumns(10);

		JLabel lblkg = new JLabel("(kg)");
		GridBagConstraints gbc_lblkg = new GridBagConstraints();
		gbc_lblkg.insets = new Insets(0, 0, 5, 5);
		gbc_lblkg.gridx = 3;
		gbc_lblkg.gridy = 2;
		panel_2.add(lblkg, gbc_lblkg);

		JLabel lblYa = new JLabel("Ya\u015F :");
		GridBagConstraints gbc_lblYa = new GridBagConstraints();
		gbc_lblYa.anchor = GridBagConstraints.WEST;
		gbc_lblYa.insets = new Insets(0, 0, 5, 5);
		gbc_lblYa.gridx = 0;
		gbc_lblYa.gridy = 3;
		panel_2.add(lblYa, gbc_lblYa);

		yasTxt = new JTextField();
		GridBagConstraints gbc_yasTxt = new GridBagConstraints();
		gbc_yasTxt.insets = new Insets(0, 0, 5, 5);
		gbc_yasTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_yasTxt.gridx = 2;
		gbc_yasTxt.gridy = 3;
		panel_2.add(yasTxt, gbc_yasTxt);
		yasTxt.setColumns(10);

		JLabel lblYaOran = new JLabel("Ya\u011F Oran\u0131 :");
		GridBagConstraints gbc_lblYaOran = new GridBagConstraints();
		gbc_lblYaOran.anchor = GridBagConstraints.WEST;
		gbc_lblYaOran.insets = new Insets(0, 0, 5, 5);
		gbc_lblYaOran.gridx = 0;
		gbc_lblYaOran.gridy = 4;
		panel_2.add(lblYaOran, gbc_lblYaOran);

		y_oraniTxt = new JTextField();
		GridBagConstraints gbc_y_oraniTxt = new GridBagConstraints();
		gbc_y_oraniTxt.insets = new Insets(0, 0, 5, 5);
		gbc_y_oraniTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_y_oraniTxt.gridx = 2;
		gbc_y_oraniTxt.gridy = 4;
		panel_2.add(y_oraniTxt, gbc_y_oraniTxt);
		y_oraniTxt.setColumns(10);

		JLabel lblKronikHastalk = new JLabel("Kronik Hastal\u0131k :");
		GridBagConstraints gbc_lblKronikHastalk = new GridBagConstraints();
		gbc_lblKronikHastalk.anchor = GridBagConstraints.WEST;
		gbc_lblKronikHastalk.insets = new Insets(0, 0, 5, 5);
		gbc_lblKronikHastalk.gridx = 0;
		gbc_lblKronikHastalk.gridy = 5;
		panel_2.add(lblKronikHastalk, gbc_lblKronikHastalk);

		k_hastalikTxt = new JTextField();
		GridBagConstraints gbc_k_hastalikTxt = new GridBagConstraints();
		gbc_k_hastalikTxt.insets = new Insets(0, 0, 5, 5);
		gbc_k_hastalikTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_k_hastalikTxt.gridx = 2;
		gbc_k_hastalikTxt.gridy = 5;
		panel_2.add(k_hastalikTxt, gbc_k_hastalikTxt);
		k_hastalikTxt.setColumns(10);

		JButton ileri_2Btn = new JButton("\u0130leri");
		ileri_2Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel_3.setVisible(true);
			}
		});
		GridBagConstraints gbc_ileri_2Btn = new GridBagConstraints();
		gbc_ileri_2Btn.gridx = 4;
		gbc_ileri_2Btn.gridy = 14;
		panel_2.add(ileri_2Btn, gbc_ileri_2Btn);

		// ****************2. PANEL BÝTÝÞ ***********************

		// **************1. PANEL BAÞLANGIÇ*********************

		final JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 671, 457);
		panel_1.setVisible(true);
		contentPane.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0, 439, 92, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0, 76, 0, 0, 0, 0, 0,
				0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JLabel lblAd = new JLabel("Ad:");
		GridBagConstraints gbc_lblAd = new GridBagConstraints();
		gbc_lblAd.anchor = GridBagConstraints.WEST;
		gbc_lblAd.insets = new Insets(0, 0, 5, 5);
		gbc_lblAd.gridx = 0;
		gbc_lblAd.gridy = 1;
		panel_1.add(lblAd, gbc_lblAd);

		adTxt = new JTextField();
		GridBagConstraints gbc_adTxt = new GridBagConstraints();
		gbc_adTxt.insets = new Insets(0, 0, 5, 5);
		gbc_adTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_adTxt.gridx = 2;
		gbc_adTxt.gridy = 1;
		panel_1.add(adTxt, gbc_adTxt);
		adTxt.setColumns(10);

		JLabel lblSoyad = new JLabel("Soyad:");
		GridBagConstraints gbc_lblSoyad = new GridBagConstraints();
		gbc_lblSoyad.anchor = GridBagConstraints.WEST;
		gbc_lblSoyad.insets = new Insets(0, 0, 5, 5);
		gbc_lblSoyad.gridx = 0;
		gbc_lblSoyad.gridy = 2;
		panel_1.add(lblSoyad, gbc_lblSoyad);

		soyadTxt = new JTextField();
		GridBagConstraints gbc_soyadTxt = new GridBagConstraints();
		gbc_soyadTxt.insets = new Insets(0, 0, 5, 5);
		gbc_soyadTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_soyadTxt.gridx = 2;
		gbc_soyadTxt.gridy = 2;
		panel_1.add(soyadTxt, gbc_soyadTxt);
		soyadTxt.setColumns(10);

		JLabel lblNewLabel = new JLabel("T.c. :");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 3;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);

		tcTxt = new JTextField();
		GridBagConstraints gbc_tcTxt = new GridBagConstraints();
		gbc_tcTxt.insets = new Insets(0, 0, 5, 5);
		gbc_tcTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_tcTxt.gridx = 2;
		gbc_tcTxt.gridy = 3;
		panel_1.add(tcTxt, gbc_tcTxt);
		tcTxt.setColumns(10);

		JLabel lblDoumTarihi = new JLabel("Do\u011Fum Tarihi :");
		GridBagConstraints gbc_lblDoumTarihi = new GridBagConstraints();
		gbc_lblDoumTarihi.anchor = GridBagConstraints.WEST;
		gbc_lblDoumTarihi.insets = new Insets(0, 0, 5, 5);
		gbc_lblDoumTarihi.gridx = 0;
		gbc_lblDoumTarihi.gridy = 4;
		panel_1.add(lblDoumTarihi, gbc_lblDoumTarihi);

		d_tarihiTxt = new JTextField();
		GridBagConstraints gbc_d_tarihiTxt = new GridBagConstraints();
		gbc_d_tarihiTxt.insets = new Insets(0, 0, 5, 5);
		gbc_d_tarihiTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_d_tarihiTxt.gridx = 2;
		gbc_d_tarihiTxt.gridy = 4;
		panel_1.add(d_tarihiTxt, gbc_d_tarihiTxt);
		d_tarihiTxt.setColumns(10);

		JLabel lblAdres = new JLabel("Adres :");
		GridBagConstraints gbc_lblAdres = new GridBagConstraints();
		gbc_lblAdres.anchor = GridBagConstraints.WEST;
		gbc_lblAdres.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdres.gridx = 0;
		gbc_lblAdres.gridy = 5;
		panel_1.add(lblAdres, gbc_lblAdres);

		adresTxt = new JTextField();
		GridBagConstraints gbc_adresTxt = new GridBagConstraints();
		gbc_adresTxt.insets = new Insets(0, 0, 5, 5);
		gbc_adresTxt.fill = GridBagConstraints.BOTH;
		gbc_adresTxt.gridx = 2;
		gbc_adresTxt.gridy = 5;
		panel_1.add(adresTxt, gbc_adresTxt);
		adresTxt.setColumns(10);

		JLabel lblTelefon = new JLabel("Telefon");
		GridBagConstraints gbc_lblTelefon = new GridBagConstraints();
		gbc_lblTelefon.anchor = GridBagConstraints.WEST;
		gbc_lblTelefon.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefon.gridx = 0;
		gbc_lblTelefon.gridy = 6;
		panel_1.add(lblTelefon, gbc_lblTelefon);

		telefonTxt = new JTextField();
		GridBagConstraints gbc_telefonTxt = new GridBagConstraints();
		gbc_telefonTxt.insets = new Insets(0, 0, 5, 5);
		gbc_telefonTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_telefonTxt.gridx = 2;
		gbc_telefonTxt.gridy = 6;
		panel_1.add(telefonTxt, gbc_telefonTxt);
		telefonTxt.setColumns(10);

		JLabel lblMail = new JLabel("Mail :");
		GridBagConstraints gbc_lblMail = new GridBagConstraints();
		gbc_lblMail.anchor = GridBagConstraints.WEST;
		gbc_lblMail.insets = new Insets(0, 0, 5, 5);
		gbc_lblMail.gridx = 0;
		gbc_lblMail.gridy = 7;
		panel_1.add(lblMail, gbc_lblMail);

		mailTxt = new JTextField();
		GridBagConstraints gbc_mailTxt = new GridBagConstraints();
		gbc_mailTxt.insets = new Insets(0, 0, 5, 5);
		gbc_mailTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_mailTxt.gridx = 2;
		gbc_mailTxt.gridy = 7;
		panel_1.add(mailTxt, gbc_mailTxt);
		mailTxt.setColumns(10);

		JLabel lblKullancAd = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		GridBagConstraints gbc_lblKullancAd = new GridBagConstraints();
		gbc_lblKullancAd.anchor = GridBagConstraints.WEST;
		gbc_lblKullancAd.insets = new Insets(0, 0, 5, 5);
		gbc_lblKullancAd.gridx = 0;
		gbc_lblKullancAd.gridy = 8;
		panel_1.add(lblKullancAd, gbc_lblKullancAd);

		k_adiTxt = new JTextField();
		GridBagConstraints gbc_k_adiTxt = new GridBagConstraints();
		gbc_k_adiTxt.insets = new Insets(0, 0, 5, 5);
		gbc_k_adiTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_k_adiTxt.gridx = 2;
		gbc_k_adiTxt.gridy = 8;
		panel_1.add(k_adiTxt, gbc_k_adiTxt);
		k_adiTxt.setColumns(10);

		JLabel lblifre = new JLabel("\u015Eifre :");
		GridBagConstraints gbc_lblifre = new GridBagConstraints();
		gbc_lblifre.anchor = GridBagConstraints.WEST;
		gbc_lblifre.insets = new Insets(0, 0, 5, 5);
		gbc_lblifre.gridx = 0;
		gbc_lblifre.gridy = 9;
		panel_1.add(lblifre, gbc_lblifre);

		sifreTxt = new JTextField();
		GridBagConstraints gbc_sifreTxt = new GridBagConstraints();
		gbc_sifreTxt.insets = new Insets(0, 0, 5, 5);
		gbc_sifreTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_sifreTxt.gridx = 2;
		gbc_sifreTxt.gridy = 9;
		panel_1.add(sifreTxt, gbc_sifreTxt);
		sifreTxt.setColumns(10);

		JButton btnIleri = new JButton("\u0130leri");
		btnIleri.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panel_1.setVisible(false);
				panel_2.setVisible(true);
			}
		});
		GridBagConstraints gbc_btnIleri = new GridBagConstraints();
		gbc_btnIleri.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnIleri.gridx = 3;
		gbc_btnIleri.gridy = 13;
		panel_1.add(btnIleri, gbc_btnIleri);

	}

}

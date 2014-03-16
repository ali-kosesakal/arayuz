package yenikayit;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class OgunEkle extends JFrame {

	/**
	 * 
	 */

	private final JPanel contentPane;
	private final JTextField textBesinEkle;
	private final JTable tableBsnEkle;
	private final JButton btnKaydet;
	private final JButton btnablonKullan;
	private final JTextField textField;
	private final JLabel lblnAdnGiriniz;
	private final JList list;
	private final JButton btnSe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					OgunEkle frame = new OgunEkle();
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
	public OgunEkle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 383);
		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 30, 137, 0, 65, 55, 85, 109,
				0 };
		gbl_contentPane.rowHeights = new int[] { 19, 33, 30, 42, 0, 25, 87, 0,
				0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0,
				0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0,
				0.0, 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		lblnAdnGiriniz = new JLabel(
				"\u00D6\u011F\u00FCn Ad\u0131n\u0131 giriniz :");
		GridBagConstraints gbc_lblnAdnGiriniz = new GridBagConstraints();
		gbc_lblnAdnGiriniz.gridwidth = 2;
		gbc_lblnAdnGiriniz.insets = new Insets(0, 0, 5, 5);
		gbc_lblnAdnGiriniz.gridx = 1;
		gbc_lblnAdnGiriniz.gridy = 1;
		contentPane.add(lblnAdnGiriniz, gbc_lblnAdnGiriniz);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);

		JButton btnBesinEkle = new JButton("Bul");
		GridBagConstraints gbc_btnBesinEkle = new GridBagConstraints();
		gbc_btnBesinEkle.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBesinEkle.gridwidth = 2;
		gbc_btnBesinEkle.anchor = GridBagConstraints.NORTH;
		gbc_btnBesinEkle.insets = new Insets(0, 0, 5, 5);
		gbc_btnBesinEkle.gridx = 1;
		gbc_btnBesinEkle.gridy = 2;
		contentPane.add(btnBesinEkle, gbc_btnBesinEkle);

		textBesinEkle = new JTextField();
		textBesinEkle.setColumns(10);
		GridBagConstraints gbc_textBesinEkle = new GridBagConstraints();
		gbc_textBesinEkle.gridwidth = 3;
		gbc_textBesinEkle.fill = GridBagConstraints.HORIZONTAL;
		gbc_textBesinEkle.insets = new Insets(0, 0, 5, 5);
		gbc_textBesinEkle.gridx = 3;
		gbc_textBesinEkle.gridy = 2;
		contentPane.add(textBesinEkle, gbc_textBesinEkle);

		JScrollPane scrollPane = new JScrollPane();

		tableBsnEkle = new JTable();
		scrollPane.setViewportView(tableBsnEkle);
		tableBsnEkle.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null }, }, new String[] {
				"Besin Ad\u0131", "Besin Miktar\u0131",
				"Kalori Miktar\u0131 (cal)" }));
		tableBsnEkle.getColumnModel().getColumn(0).setPreferredWidth(104);
		tableBsnEkle.getColumnModel().getColumn(1).setPreferredWidth(100);
		tableBsnEkle.getColumnModel().getColumn(2).setPreferredWidth(132);

		list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridwidth = 5;
		gbc_list.gridheight = 2;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 3;
		contentPane.add(list, gbc_list);

		btnSe = new JButton("Se\u00E7");
		GridBagConstraints gbc_btnSe = new GridBagConstraints();
		gbc_btnSe.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSe.insets = new Insets(0, 0, 5, 0);
		gbc_btnSe.gridx = 6;
		gbc_btnSe.gridy = 4;
		contentPane.add(btnSe, gbc_btnSe);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridwidth = 6;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		contentPane.add(scrollPane, gbc_scrollPane);

		btnablonKullan = new JButton("\u015Eablon Kullan");
		GridBagConstraints gbc_btnablonKullan = new GridBagConstraints();
		gbc_btnablonKullan.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnablonKullan.insets = new Insets(0, 0, 0, 5);
		gbc_btnablonKullan.gridx = 1;
		gbc_btnablonKullan.gridy = 7;
		contentPane.add(btnablonKullan, gbc_btnablonKullan);

		btnKaydet = new JButton("Kaydet");
		GridBagConstraints gbc_btnKaydet = new GridBagConstraints();
		gbc_btnKaydet.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnKaydet.gridx = 6;
		gbc_btnKaydet.gridy = 7;
		contentPane.add(btnKaydet, gbc_btnKaydet);
	}
}

package yenikayit;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
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
		gbl_contentPane.columnWidths = new int[] { 73, 173, 65, 55, 40, 71, 0 };
		gbl_contentPane.rowHeights = new int[] { 35, 25, 59, 115, 25, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

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

		textBesinEkle = new JTextField();
		textBesinEkle.setColumns(10);
		GridBagConstraints gbc_textBesinEkle = new GridBagConstraints();
		gbc_textBesinEkle.fill = GridBagConstraints.HORIZONTAL;
		gbc_textBesinEkle.insets = new Insets(0, 0, 5, 5);
		gbc_textBesinEkle.gridx = 1;
		gbc_textBesinEkle.gridy = 1;
		contentPane.add(textBesinEkle, gbc_textBesinEkle);

		JButton btnBesinEkle = new JButton("Ekle");
		GridBagConstraints gbc_btnBesinEkle = new GridBagConstraints();
		gbc_btnBesinEkle.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnBesinEkle.insets = new Insets(0, 0, 5, 5);
		gbc_btnBesinEkle.gridx = 3;
		gbc_btnBesinEkle.gridy = 1;
		contentPane.add(btnBesinEkle, gbc_btnBesinEkle);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		contentPane.add(scrollPane, gbc_scrollPane);

		btnablonKullan = new JButton("\u015Eablon Kullan");
		GridBagConstraints gbc_btnablonKullan = new GridBagConstraints();
		gbc_btnablonKullan.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnablonKullan.insets = new Insets(0, 0, 0, 5);
		gbc_btnablonKullan.gridx = 1;
		gbc_btnablonKullan.gridy = 4;
		contentPane.add(btnablonKullan, gbc_btnablonKullan);

		btnKaydet = new JButton("Kaydet");
		GridBagConstraints gbc_btnKaydet = new GridBagConstraints();
		gbc_btnKaydet.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnKaydet.gridx = 5;
		gbc_btnKaydet.gridy = 4;
		contentPane.add(btnKaydet, gbc_btnKaydet);
	}
}

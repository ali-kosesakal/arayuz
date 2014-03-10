package yenikayit;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class OgunEkle extends JFrame {

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
		contentPane.setLayout(null);

		textBesinEkle = new JTextField();
		textBesinEkle.setBounds(68, 31, 178, 22);
		contentPane.add(textBesinEkle);
		textBesinEkle.setColumns(10);

		JButton btnBesinEkle = new JButton("Ekle");
		btnBesinEkle.setBounds(306, 30, 97, 25);
		contentPane.add(btnBesinEkle);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 124, 404, 119);
		contentPane.add(scrollPane);

		tableBsnEkle = new JTable();
		scrollPane.setViewportView(tableBsnEkle);
		tableBsnEkle.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "No", "Besin Ad\u0131", "Besin Miktar\u0131",
						"Besin Kalori Miktar\u0131(cal)" }));

		btnKaydet = new JButton("Kaydet");
		btnKaydet.setBounds(375, 256, 97, 25);
		contentPane.add(btnKaydet);

		btnablonKullan = new JButton("\u015Eablon Kullan");
		btnablonKullan.setBounds(68, 256, 125, 25);
		contentPane.add(btnablonKullan);
		tableBsnEkle.getColumnModel().getColumn(0).setPreferredWidth(42);
		tableBsnEkle.getColumnModel().getColumn(1).setPreferredWidth(100);
		tableBsnEkle.getColumnModel().getColumn(2).setPreferredWidth(98);
		tableBsnEkle.getColumnModel().getColumn(3).setPreferredWidth(149);
	}
}

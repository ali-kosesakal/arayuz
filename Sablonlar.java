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

public class Sablonlar extends JFrame {

	private final JPanel contentPane;
	private final JTable table;
	private final JTextField sablonBulTxt_sablonlar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Sablonlar frame = new Sablonlar();
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
	public Sablonlar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 99, 101, 279, 0 };
		gbl_contentPane.rowHeights = new int[] { 25, 25, 166, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);
		// ***************************************************************************************
		JButton sablonEkleBtn_sablonlar = new JButton("\u015Eablon Ekle");
		GridBagConstraints gbc_sablonEkleBtn_sablonlar = new GridBagConstraints();
		gbc_sablonEkleBtn_sablonlar.anchor = GridBagConstraints.NORTHWEST;
		gbc_sablonEkleBtn_sablonlar.insets = new Insets(0, 0, 5, 5);
		gbc_sablonEkleBtn_sablonlar.gridx = 0;
		gbc_sablonEkleBtn_sablonlar.gridy = 0;
		contentPane.add(sablonEkleBtn_sablonlar, gbc_sablonEkleBtn_sablonlar);
		// ***************************************************************************************
		JButton sablonSilTxt_sablonlar = new JButton("\u015Eablonu Sil");
		GridBagConstraints gbc_sablonSilTxt_sablonlar = new GridBagConstraints();
		gbc_sablonSilTxt_sablonlar.anchor = GridBagConstraints.NORTHWEST;
		gbc_sablonSilTxt_sablonlar.insets = new Insets(0, 0, 5, 5);
		gbc_sablonSilTxt_sablonlar.gridx = 1;
		gbc_sablonSilTxt_sablonlar.gridy = 0;
		contentPane.add(sablonSilTxt_sablonlar, gbc_sablonSilTxt_sablonlar);
		// ***************************************************************************************
		JButton sablonGuncelleBtn_sablonlar = new JButton(
				"\u015Eablonu G\u00FCncelle");
		GridBagConstraints gbc_sablonGuncelleBtn_sablonlar = new GridBagConstraints();
		gbc_sablonGuncelleBtn_sablonlar.anchor = GridBagConstraints.NORTHWEST;
		gbc_sablonGuncelleBtn_sablonlar.insets = new Insets(0, 0, 5, 0);
		gbc_sablonGuncelleBtn_sablonlar.gridx = 2;
		gbc_sablonGuncelleBtn_sablonlar.gridy = 0;
		contentPane.add(sablonGuncelleBtn_sablonlar,
				gbc_sablonGuncelleBtn_sablonlar);
		// ***************************************************************************************
		sablonBulTxt_sablonlar = new JTextField();
		GridBagConstraints gbc_sablonBulTxt_sablonlar = new GridBagConstraints();
		gbc_sablonBulTxt_sablonlar.anchor = GridBagConstraints.NORTH;
		gbc_sablonBulTxt_sablonlar.fill = GridBagConstraints.HORIZONTAL;
		gbc_sablonBulTxt_sablonlar.insets = new Insets(0, 0, 5, 5);
		gbc_sablonBulTxt_sablonlar.gridwidth = 2;
		gbc_sablonBulTxt_sablonlar.gridx = 0;
		gbc_sablonBulTxt_sablonlar.gridy = 1;
		contentPane.add(sablonBulTxt_sablonlar, gbc_sablonBulTxt_sablonlar);
		sablonBulTxt_sablonlar.setColumns(10);
		// ***************************************************************************************
		JButton sablonBulBtn_sablonlar = new JButton("Bul");
		GridBagConstraints gbc_sablonBulBtn_sablonlar = new GridBagConstraints();
		gbc_sablonBulBtn_sablonlar.anchor = GridBagConstraints.NORTHWEST;
		gbc_sablonBulBtn_sablonlar.insets = new Insets(0, 0, 5, 0);
		gbc_sablonBulBtn_sablonlar.gridx = 2;
		gbc_sablonBulBtn_sablonlar.gridy = 1;
		contentPane.add(sablonBulBtn_sablonlar, gbc_sablonBulBtn_sablonlar);
		// ***************************************************************************************
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.WEST;
		gbc_panel.fill = GridBagConstraints.VERTICAL;
		gbc_panel.gridwidth = 3;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 2;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 160, 327, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);
		// ***************************************************************************************
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panel.add(scrollPane, gbc_scrollPane);
		// ***************************************************************************************
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, }, new String[] { "Besin Ad\u0131",
				"Besin Miktar\u0131", "Kalori Miktar\u0131" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(141);
		table.getColumnModel().getColumn(1).setPreferredWidth(165);
		table.getColumnModel().getColumn(2).setPreferredWidth(136);
	}
}

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class HastaDetayEkrani extends JFrame {

	private final JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					HastaDetayEkrani frame = new HastaDetayEkrani();
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
	public HastaDetayEkrani() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 128, 128, 199, 0, 138, 0 };
		gbl_contentPane.rowHeights = new int[] { 25, 277, 127, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JButton silBtn_hastaDetay = new JButton("Sil");
		GridBagConstraints gbc_silBtn_hastaDetay = new GridBagConstraints();
		gbc_silBtn_hastaDetay.anchor = GridBagConstraints.NORTH;
		gbc_silBtn_hastaDetay.fill = GridBagConstraints.HORIZONTAL;
		gbc_silBtn_hastaDetay.insets = new Insets(0, 0, 5, 5);
		gbc_silBtn_hastaDetay.gridx = 0;
		gbc_silBtn_hastaDetay.gridy = 0;
		contentPane.add(silBtn_hastaDetay, gbc_silBtn_hastaDetay);

		JButton guncelleBtn_hastaDetay = new JButton("G\u00FCncelle");
		GridBagConstraints gbc_guncelleBtn_hastaDetay = new GridBagConstraints();
		gbc_guncelleBtn_hastaDetay.anchor = GridBagConstraints.NORTH;
		gbc_guncelleBtn_hastaDetay.fill = GridBagConstraints.HORIZONTAL;
		gbc_guncelleBtn_hastaDetay.insets = new Insets(0, 0, 5, 5);
		gbc_guncelleBtn_hastaDetay.gridx = 1;
		gbc_guncelleBtn_hastaDetay.gridy = 0;
		contentPane.add(guncelleBtn_hastaDetay, gbc_guncelleBtn_hastaDetay);

		JButton btnDlistesiniGr = new JButton("D.Listesini g\u00F6r");
		GridBagConstraints gbc_btnDlistesiniGr = new GridBagConstraints();
		gbc_btnDlistesiniGr.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnDlistesiniGr.insets = new Insets(0, 0, 5, 5);
		gbc_btnDlistesiniGr.gridx = 2;
		gbc_btnDlistesiniGr.gridy = 0;
		contentPane.add(btnDlistesiniGr, gbc_btnDlistesiniGr);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridwidth = 3;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 447, 220);
		panel.add(scrollPane);

		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "Ad:", "Soyad:", "Boy:", "Kilo:",
					"Kronik Rahats\u0131zl\u0131k:" };

			@Override
			public int getSize() {
				return values.length;
			}

			@Override
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);

		JTextPane txtpnBuKsmaHasta = new JTextPane();
		txtpnBuKsmaHasta
				.setText("bu k\u0131sma hasta ile ilgili a\u00E7\u0131klamalar muayene tarihleri gibi bilgiler gelecek\r\n");
		GridBagConstraints gbc_txtpnBuKsmaHasta = new GridBagConstraints();
		gbc_txtpnBuKsmaHasta.fill = GridBagConstraints.BOTH;
		gbc_txtpnBuKsmaHasta.insets = new Insets(0, 0, 0, 5);
		gbc_txtpnBuKsmaHasta.gridwidth = 3;
		gbc_txtpnBuKsmaHasta.gridx = 0;
		gbc_txtpnBuKsmaHasta.gridy = 2;
		contentPane.add(txtpnBuKsmaHasta, gbc_txtpnBuKsmaHasta);

		JButton detayBtn_hastaDetay = new JButton("Detay");
		GridBagConstraints gbc_detayBtn_hastaDetay = new GridBagConstraints();
		gbc_detayBtn_hastaDetay.anchor = GridBagConstraints.NORTH;
		gbc_detayBtn_hastaDetay.fill = GridBagConstraints.HORIZONTAL;
		gbc_detayBtn_hastaDetay.gridx = 4;
		gbc_detayBtn_hastaDetay.gridy = 2;
		contentPane.add(detayBtn_hastaDetay, gbc_detayBtn_hastaDetay);
	}
}

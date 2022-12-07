
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Cliente implements ActionListener{

	JFrame frm_cliente_gofasa;
	JTextField text_factura;
	JTable table_cliente;
	JButton btn_buscar,btn_imprimir;
	DefaultTableModel cbz_cliente;
	JScrollPane Scrollpane_cliente;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente window = new Cliente();
					window.frm_cliente_gofasa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frm_cliente_gofasa = new JFrame();
		frm_cliente_gofasa.setTitle("KW Cliente");
		frm_cliente_gofasa.setBounds(100, 100, 447, 300);
		frm_cliente_gofasa.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("N. Factura ");
		lblNewLabel_1.setBounds(63, 63, 70, 14);
		frm_cliente_gofasa.getContentPane().add(lblNewLabel_1);
		
		text_factura = new JTextField();
		text_factura.setBounds(154, 60, 96, 20);
		frm_cliente_gofasa.getContentPane().add(text_factura);
		text_factura.setColumns(10);
		
		btn_buscar = new JButton("Buscar ");
		btn_buscar.setBounds(272, 59, 89, 23);
		frm_cliente_gofasa.getContentPane().add(btn_buscar);
		
		btn_imprimir = new JButton("Imprimir factura");
		btn_imprimir.setBounds(95, 229, 245, 23);
		btn_imprimir.addActionListener(this);
		frm_cliente_gofasa.getContentPane().add(btn_imprimir);
		
		String[] encabezado_cliente ={"N. factura","Nombre","Costo"};
		cbz_cliente= new DefaultTableModel(null,encabezado_cliente);
		Scrollpane_cliente = new JScrollPane();
		Scrollpane_cliente.setBounds(39, 103, 351, 114);
		
		table_cliente = new JTable();
		Scrollpane_cliente.setViewportView(table_cliente);
		frm_cliente_gofasa.getContentPane().add(Scrollpane_cliente);
		table_cliente.setModel(cbz_cliente);
		
		JLabel lblNewLabel = new JLabel("Auto Repuesto  Gofasa ");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel.setBounds(134, 11, 187, 28);
		frm_cliente_gofasa.getContentPane().add(lblNewLabel);
		cbz_cliente.setColumnIdentifiers(encabezado_cliente);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btn_imprimir) {
			int fila =table_cliente.getSelectedRow();
		}
	}
}


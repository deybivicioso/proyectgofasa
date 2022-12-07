

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Cliente {

	JFrame frm_cliente_gofasa;

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
		frm_cliente_gofasa.setBounds(100, 100, 451, 337);
		frm_cliente_gofasa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


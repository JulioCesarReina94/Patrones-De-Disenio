package creacional.factoymethod;

import javax.swing.JOptionPane;

/**
 * Producto Concreto
 * @author Julio Cesar Reina
 *
 */
public class PagoEnLinea implements Pago {

	@Override
	public void realizarPago() {
		System.out.println("Pagando en Linea.");
		JOptionPane.showMessageDialog(null, "Pagando en Linea.");
	}

}

package creacional.factoymethod;

import javax.swing.JOptionPane;

/**
 * Producto Concreto
 * @author Julio Cesar Reina
 *
 */
public class PayPal implements Pago {

	@Override
	public void realizarPago() {
		System.out.println("Pagando con Pay Pal");
		JOptionPane.showMessageDialog(null, "Pagando con Pay Pal.");
		
	}

}

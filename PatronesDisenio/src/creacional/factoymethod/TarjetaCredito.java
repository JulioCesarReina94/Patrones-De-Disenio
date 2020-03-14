package creacional.factoymethod;

import javax.swing.JOptionPane;

/**
 * Producto Concreto
 * @author Julio Cesar Reina
 *
 */
public class TarjetaCredito implements Pago{

	@Override
	public void realizarPago() {
		System.out.println("Pagando con Tarjeta de Credito.");
		JOptionPane.showMessageDialog(null, "Pagando con Tarjeta de Credito.");
		
	}

}

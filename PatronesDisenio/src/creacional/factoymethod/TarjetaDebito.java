package creacional.factoymethod;

import javax.swing.JOptionPane;

/**
 * Producto Concreto
 * @author Julio Cesar Reina
 *
 */
public class TarjetaDebito implements Pago{

	@Override
	public void realizarPago() {
		System.out.println("Pagando con Tarjeta Debito.");
		JOptionPane.showMessageDialog(null, "Pagando con Tarjeta Debito.");
		
	}

}

package creacional.factoymethod;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while(true) {
			String opcion = 
					JOptionPane.showInputDialog("Ingrese el metodo de pago: \n" 
							+ "1. Pago en Linea \n"
							+ "2. PayPal \n"
							+ "3. Tarjeta de Credito \n"
							+ "4. Tarjeta Debito \n"
							+ "5. Salir");
					testFactoryMethod(opcion);
		}
		
	}
	
	public static void testFactoryMethod(String opcion) {
		Pago pago = null;
		switch (opcion) {
		case "1":
			pago = new PagoFactory().pagar(TipoPago.PAGOENLINEA);
			break;
		case "2":
			pago = new PagoFactory().pagar(TipoPago.PAYPAL);
			break;
		case "3":
			pago = new PagoFactory().pagar(TipoPago.TARJETACREDITO);
			break;
		case "4":
			pago = new PagoFactory().pagar(TipoPago.TARJETADEBITO);
			break;
		case "5":
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opcion no valida");
			break;
		}
		if(pago!= null) {
			pago.realizarPago();			
		}
	}

}

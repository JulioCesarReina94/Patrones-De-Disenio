package creacional.factoymethod;
/**
 * Creator segun el patron de diseño
 * @author Usuario
 *
 */
public class PagoFactory {
	
	public static Pago pagar(TipoPago tipoPago) {
		switch (tipoPago) {
		case TARJETACREDITO:
			return new TarjetaCredito();
		case TARJETADEBITO:
			return new TarjetaDebito();
		case PAYPAL:
			return new PayPal();
		case PAGOENLINEA:
			return new PagoEnLinea();
		default:
			return null;
		}
	}

}

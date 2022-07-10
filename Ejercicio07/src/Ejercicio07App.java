
import javax.swing.JOptionPane;

public class Ejercicio07App {

	/*
	 *  Crea una aplicación que nos convierta una cantidad de euros
	 *  introducida por teclado a otra moneda, estas pueden ser dolares,
	 *  yenes o libras. El método tendrá como parámetros, la cantidad de
	 *  euros y la moneda a pasar que sera una cadena, este no devolverá
	 *  ningún valor, mostrara un mensaje indicando el cambio (void);
	 */
	
	/*
	 * El cambio de divisas son:
	 * - 1,01507$ = 1€
	 * - 143.245 JPY = 1€
	 * - 166'386 Pesetas = 1€
	 */
	
	public static void main(String[] args) {
		
		// Imprimimos el resultado.
		JOptionPane.showMessageDialog(null, panelInputs());
		
	}
	
	public static String panelInputs() {
		
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de euros a convertir."));
		String moneda =  JOptionPane.showInputDialog("Moneda a la que quiero convertir (Dolares, Yenes o Pesetas).");

		switch (moneda.toUpperCase()) {
			case "DOLARES":
				return cantidad + "€ a " + moneda + " es: " + euros2Dolares(cantidad) + "$";
		case "YENES": 
				return cantidad + "€ a " + moneda + " es: " + euros2Jpy(cantidad) + " JPY";
			case "PESETAS":
				return cantidad + "€ a " + moneda + " es: " + euros2Pesetas(cantidad) + " Pesetas";
			default:
				return "Has introducido una moneda incorrecta.";
		}
		
	}
	
	public static double euros2Dolares(int cantidad) {
		
		final double DOLAR = 1.01507;
		
		return cantidad * DOLAR;
		
	}
	
	public static double euros2Jpy(int cantidad) {
		
		final double JPY = 138.61;
		
		return cantidad * JPY;
		
	}
	
	public static double euros2Pesetas(int cantidad) {
		
		final double PESETAS = 166.386;
		
		return cantidad * PESETAS;
		
	}
	
}

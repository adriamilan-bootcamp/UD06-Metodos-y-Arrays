
import javax.swing.JOptionPane;

public class Ejercicio06App {
	
	/*
	 * Crea una aplicación que nos cuente el número de cifras de un número entero positivo
	 * (hay que controlarlo) pedido por teclado. Crea un método que realice esta acción, pasando
	 * el número por parámetro, devolverá el número de cifras.
	 */

	public static void main(String[] args) {
		
		// Imprimimos el resultado.
		JOptionPane.showMessageDialog(null, panelInputs());
		
	}
	
	public static String panelInputs() {
		
		// Número para calcular la cantidad de cifras.
		String numero = JOptionPane.showInputDialog("Introduce un número entero positivo");
		
		String message = "";
		if (Integer.parseInt(numero) >= 0) {
			message = "El número de cifras del número -> " + numero + " es " + numeroCifras(numero); // Mensaje satisfactorio
		} else {
			message = "El número introducido es erróneo o es negativo."; // Mensaje erróneo
		}
		
		return message;
	}
	
	public static int numeroCifras(String numero) {
		
		return numero.length(); // Utilizamos el método length para extraer el número de cifras.
		
	}
	
}

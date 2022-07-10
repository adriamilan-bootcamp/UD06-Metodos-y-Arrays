
import javax.swing.JOptionPane;

public class Ejercicio04App {

	/*
	 * Crea una aplicación que nos calcule el factorial de un número
	 * pedido por teclado, lo realizara mediante un método al que le 
	 * pasamos el número como parámetro. Para calcular el factorial,
	 * se multiplica los números anteriores hasta llegar a uno.
	 * 
	 * Por ejemplo, si introducimos un 5, realizara esta operación
	 * 5 * 3 * 2 * 1 = 120
	 */
	
	public static void main(String[] args) {
		
		// Imprimimos el resultado.
		JOptionPane.showMessageDialog(null, panelInputs());
		
	}
	
	public static String panelInputs() {
		
		// Número para calcular el factorial.
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número del cual quieres calcular su factorial."));
		
		// Devolvemos al método main la conclusión para imprimirla.
		return "El factorial de " + numero + " es: " + calcularFactorial(numero);
		
	}
	
	public static long calcularFactorial(int numero) {
		
		long factorial = numero;
		
		for (int i=1; i < numero; i++) {
			factorial *= numero - i; 
		}
		
		return factorial;
		
	}
	
}

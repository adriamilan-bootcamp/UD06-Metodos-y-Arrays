
import java.util.Random;
import javax.swing.JOptionPane;

public class Ejercicio02App {

	/*
	 * Crea una aplicación que nos genere una cantidad de
	 * números enteros aleatorios que nosotros le pasaremos
	 * por teclado. Crea un método donde pasamos como parámetros
	 * entre que números queremos que los genere, podemos pedirlas
	 * por teclado antes de generar los números. Este método devolverá
	 * un número entero aleatorio. Muestra estos números por pantalla.
	 */
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, panelInputs());
		
	}
	
	// Método panelInputs, donde pedimos todos los parámetros necesarios
	public static String panelInputs () {
		
		// Número de números aleatorios
		int vueltas = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantos números quieres."));
		
		// Valor inicial de los números aleatorios
		int numeroInicial = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número inicial."));
		
		// Valor final de los números aleatorios
		int numeroFinal = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número final."));
		
		/*
		 *  Devolvemos el resultado del método numeroRandom dandole como 
		 *  parámetros las variables capturadas en este método.
		 */
		return numeroRandom(vueltas, numeroInicial, numeroFinal);
		
	}
	
	// Método numeroRandom, donde calculamos y devolvemos todos los números aleatorios
	public static String numeroRandom(int vueltas, int numeroInicial, int numeroFinal) {
	
		/*
		 *  Este método devuelve tantos números como la variable "vueltas" contenga entre
		 *  las dos variables que definen un inicio y un final. 
		 */
		
		Random rn = new Random();

		// Bucle for, entrando en las "vueltas"
		String numeros = "Tus números aleatorios -> ";
		for (int i=0; i <= vueltas; i++) {
			numeros += rn.nextInt(numeroFinal - numeroInicial + 1) + numeroInicial + " ";
		}
		
		return numeros; // Devolvemos los números aleatorios creados.
		
	}
	
}

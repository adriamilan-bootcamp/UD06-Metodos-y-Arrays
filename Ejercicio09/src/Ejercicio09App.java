
import java.util.Random;
import javax.swing.JOptionPane;

public class Ejercicio09App {

	/*
	 * Crea una array de números donde le indicamos por teclado
	 * el tamaño del array, rellenaremos el array con números
	 * aleatorios entre 0 y 9. Al final muestra por pantalla el
	 * valor de cada posición y la suma de todos los valores.
	 * 
	 * Tares a realizar: Haz un método para rellenar el array
	 * (que tenga como parámetros los números entre los que
	 * tenga que generar) y otro para mostrar el contenido y la
	 * suma del array.
	 */
	
	// Método main donde se muestra el contenido y la suma de la array
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "" + panelInputs());
		
	}
	
	// Método que pide al usuario el tamaño de la array
	public static String panelInputs() {
		
		int tamanoArray = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array."));
		
		return rellenarArray(tamanoArray);
		
	}
	
	// Método para rellenar el array
	public static String rellenarArray(int tamanoArray) {
		
		Random rn = new Random();
		
		String arrayMessage = "";
		int arrayTotal = 0;
		int[] array = new int[tamanoArray];
		for (int i = 0; i <= tamanoArray - 1; i++) {
			// Asignando un valor aleatorio entre 0 y 9
			array[i] = rn.nextInt(9 - 0) + 0;
			// Sumando todos los valores de la array
			arrayTotal += array[i];
			// Construcción del mensaje
			arrayMessage += "(" + (i + 1) + ") => " + array[i] + " ";
		}
		
		// Añadimos el total al mensaje.
		arrayMessage += "|| Total: " + arrayTotal;
		
		return arrayMessage;
		
	}
	
}

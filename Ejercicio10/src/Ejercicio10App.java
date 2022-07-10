
import java.util.Random;
import javax.swing.JOptionPane;

public class Ejercicio10App {

	/*
	 * Crea un array de números de un tamaño pasado por teclado,
	 * el array contendrá números aleatorios primos entre los
	 * números deseados, por último nos indicar cual es el mayor
	 * de todos.
	 * Haz un método para comprobar que el número aleatorio es
	 * primo, puedes hacer todos los métodos que necesites.
	 */
	
	public static void main(String[] args) {
		
		entradaSalida();
		
	}
	
	public static void entradaSalida() {
		
		int tamanoArray = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array."));
		int numeroInicio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor mínimo"));
		int numeroFinal = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor máximo"));
		
		mostrarResultados(tamanoArray, numeroInicio, numeroFinal);
		
	}

	public static void mostrarResultados(int tamanoArray, int numeroInicio, int numeroFinal) {
		
		int[] array = rellenarArray(tamanoArray, numeroInicio, numeroFinal);
		
		// Construcción del mensaje
		String arrayMessage = "";
		for (int i = 0; i <= tamanoArray - 1; i++) {
			// Construcción del mensaje
			arrayMessage += "(" + (i + 1) + ") => " + array[i] + " ";
		}
		
		System.out.println(arrayMessage);
		System.out.println("El valor más alto de la array es: " + numeroMayor(array));
		
	}
	
	public static int[] rellenarArray(int tamanoArray, int numeroInicio, int numeroFinal) {
		
		int[] array = new int[tamanoArray];
		
		for (int i = 0; i <= tamanoArray - 1; i++) {
			
			// Asignando un valor aleatorio entre 0 y 9
			array[i] = numeroRandomPrimo(numeroInicio, numeroFinal);
		
		}
		
		return array;
		
	}
	
	public static int numeroMayor(int[] array) {
		
		int numeroMayor = 0;
		
		for (int x = 1; x < array.length; x++) {
			
			if (array[x] > numeroMayor) {
			
				numeroMayor = array[x];
			
			}
		
		}
		
		return numeroMayor;
		
	}
	
	public static int numeroRandomPrimo(int numeroInicio, int numeroFinal) {
		
		Random rn = new Random();
		
		int numeroRandomPrimo = 0;
		
		while (true) {
			
			boolean primo = true;
			
			numeroRandomPrimo = rn.nextInt(numeroFinal - numeroInicio) + numeroInicio;

			for (int i = 2; i <= numeroRandomPrimo; i++) {
				
				if (numeroRandomPrimo % i == 0 && numeroRandomPrimo != i) {
					
					primo = false;
					break;
				
				}

			}
			
			if (primo == false) {
				
				continue;
			
			}
			
			return numeroRandomPrimo;
			
		}
			
	}
	
}

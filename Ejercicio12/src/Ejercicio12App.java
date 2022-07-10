
import javax.swing.JOptionPane;

public class Ejercicio12App {

	/*
	 * Crea un array de números de un tamaño pasado por teclado,
	 * el array contendrá números aleatorios entre 1 y 300 y
	 * mostrará aquellos números que acaben en un digito que
	 * nosotros le indiquemos por teclado (debes controlar que
	 * se introduce un número correcto), estos deben guardarse
	 * en un nuevo array.
	 */
	
	/*
	 * Por ejemplo, en un array de 10 posiciones le indicamos
	 * mostrar los números acabados en 5, podría salir 155, 25,
	 * etc.
	 */
	
	public static void main(String[] args) {
		
		InputOutputDialog();
		
	}
	
	public static void InputOutputDialog() {
		
		// Preguntando al usuario el tamaño del array
		int array[] = new int[Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array:"))];
		
		// Llamando al método rellenarArray para rellenar el array con valores aleatorios
		array = rellenarArray(array);
		
		// Mostrar Array Completo
		String arrayMessage = "";
		for (int i = 0; i < array.length; i++) {
			arrayMessage += "(" + i + ") => " + array[i] + " ";
		}
		
		JOptionPane.showMessageDialog(null, arrayMessage);
		
		// Preguntando al usuario un número para usarlo como filtro
		int numeroFiltro = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para usarlo de filtro (Número Final)"));
		
		JOptionPane.showMessageDialog(null, filtarNumeroFinal(array, numeroFiltro));
	
	}
	
	// Método para rellenar el array con valores aleatorios
	public static int[] rellenarArray(int[] array) {
		
		// Declaramos 2 constantes para determinar el mínimo y el máximo de los números aleatorios
		final int min = 1;
		final int max = 300;
		
		// Rellenamos el array con números aleatorios
		for (int i = 0; i < array.length; i++) {
			int random = (int) (Math.random() * ((max - min) +1 )) + min;;
			array[i] = random;
		}
		
		// Devolvemos el array rellenado
		return array;
		
	}
	
	// Método para filtrar por el último número con el número que nos ha pasado el usuario.
	public static String filtarNumeroFinal(int[] array, int arrayFiltro) {
		
		// Declaramos el mensaje que devolveremos
		String arrayMessage = "";
		for (int i = 0; i < array.length; i++) {
			if(array[i]%10 == arrayFiltro) /* Si el último número del indice es igual al que nos ha pasado el usuario */ {
				arrayMessage += "(" + i + ") => " + array[i] + " "; // Añadimos el número al mensaje
			}
		}
		
		// Devolvemos el mensaje
		return arrayMessage;
		
	}
	
}

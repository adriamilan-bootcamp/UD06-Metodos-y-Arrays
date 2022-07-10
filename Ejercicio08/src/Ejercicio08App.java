
import javax.swing.JOptionPane;

public class Ejercicio08App {

	/* 
	 * Crea un array de 10 posiciones de números con valores pedidos
	 * por teclado. Muestra por consola el indice y el valor al que
	 * corresponde. Haz dos métodos, uno para rellenar valores y otro
	 * para mostrar.
	 */
	
	// Método main para mostrar valores
	public static void main(String[] args){
		
		String message = "";
		int[] valores = arrayConstructor();
		for (int i = 0; i <= valores.length - 1; i++) {
			message += "(" + i + ") => " + valores[i] + " ";
		}
		
		// Imprimimos el resultado.
		System.out.println(message);
		
	}
	
	public static int[] arrayConstructor() {
		
		int valores[] = new int[10];
		for(int i = 0; i <= valores.length - 1; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número " + (i + 1) + "/" + valores.length));
		}
		
		return valores;
		
	}
	
}

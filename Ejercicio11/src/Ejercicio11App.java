
import javax.swing.JOptionPane;

public class Ejercicio11App {
	
	/*
	 * Crea dos arrays de números con la dimensión pasada por teclado.
	 * Uno de ellos estará rellenado con números aleatorios y el otro
	 * apuntara al array anterior, reasigna los valores del segundo
	 * array con valores aleatorios.
	 * Después, crea un método que tenga como parámetro, los dos arrays
	 * y devuelva uno nuevo con la multiplicación de la posición 0 del
	 * array1 con el del array2 y así sucesivamente.
	 * 
	 * Por último, muestra el contenido de cada array.
	 */

	public static void main(String[] args) {
	
		InputDialog();
		
	}
	
	public static void InputDialog() {
		
		int tamanoArray = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array."));
		
		arrayConstructor(tamanoArray);
		
	}
	
	public static void arrayConstructor(int tamanoArray) {
		
		int[] array1 = new int[tamanoArray];
		int[] array2 = new int[tamanoArray];
		int[] arrayMultiplicado = new int[tamanoArray];
		
		array1 = rellenarArrayAleatoriamente(array1);
		
		array2 = array1.clone();
		array2 = rellenarArrayAleatoriamente(array2);
	
		arrayMultiplicado = multiplicacionEntreArrays(arrayMultiplicado, array1, array2);
		
		mostrarArray(array1, array2, arrayMultiplicado);
		
	}
	
	public static int[] rellenarArrayAleatoriamente(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			int random = (int)(Math.random() * 100);
			array[i] = random;
		}
		
		return array;
		
	}
	
	public static int[] multiplicacionEntreArrays(int[] arrayMultiplicado, int[] array1, int[] array2) {
		
		for (int i = 0; i < arrayMultiplicado.length; i++) {
			arrayMultiplicado[i] = array1[i] * array2[i];
		}
		
		return arrayMultiplicado;
		
	}
	
	public static void mostrarArray(int[] array1, int[] array2, int[] arrayMultiplicado) {
		
		// Mostar array1
		System.out.println("=> Array1 <=");
		for (int i = 0; i < array1.length; i++) {
			System.out.println("El indice " + i + " tiene el valor " + array1[i]);
		}
		System.out.println("=> Fin Array1 <=");
		
		// Mostar array1
		System.out.println("=> Array2 <=");
		for (int i = 0; i < array2.length; i++) {
			System.out.println("El indice " + i + " tiene el valor " + array2[i]);
		}
		System.out.println("=> Fin Array2 <=");
		
		// Mostar arrayMultiplicado
		System.out.println("=> Array1 * Array2 <=");
		for (int i = 0; i < arrayMultiplicado.length; i++) {
			System.out.println("El indice " + i + " tiene el valor " + arrayMultiplicado[i]);
		}
		System.out.println("=> Fin Array1 * Array2 <=");
	}
	
}

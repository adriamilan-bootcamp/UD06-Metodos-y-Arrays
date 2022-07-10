
import javax.swing.JOptionPane;

public class Ejercicio03App {

	/*
	 * Crea una aplicación que nos pida un número por teclado y con un método 
	 * se lo pasamos por parámetro para que nosindique si es o no un número
	 * primo, debe devolver true si es primo sino false. Un número primo es 
	 * aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es 
	 * primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
	 */
	
	public static void main(String[] args) {
		
		// Imprimimos la conclusión
		JOptionPane.showMessageDialog(null, panelInputs());
		
	}

	// Método panelInputs, donde pedimos el número a comprobar
	public static String panelInputs() {
		
		// Número que queremos comprobar si es primo o no
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número con el que quieres comprobar si es primo o no."));
		
		// Mensaje que imprimiremos al usuario
		String primoMessage = "";
		
		/* 
		 * Analizamos y sacamos una conclusión a traves de lo 
		 * que hemos recivido del método comprobarPrimo.
		 */
		if (comprobarPrimo(numero)) {
			primoMessage = "El número: " + numero + " es primo.";
		} else {
			primoMessage = "El número: " + numero + " no es primo.";
		}
		
		// Devolvemos al método main el mensaje para que lo imprima.
		return primoMessage;
		
	}
	
	public static boolean comprobarPrimo(int numero) {
		
		// Declaramos la variable primo como boolean
		boolean primo = true;
		
		/*
		 * Recoremos todos los numeros desde el 2 hasta 
		 * el número que queremos comporbar.
		 */
		for (int i = 2; i <= numero; i++) {
			/* 
			 * Si el número no da 0 como resto o es el mismo que el 
			 * iterador, cambiaremos la variable a false
			 */
			if (numero % i != 0 && numero == i) {
				primo = false;
			}
		}
		
		// Devolvemos la variable "primo" al método panelInputs
		return primo;
	}
	
}

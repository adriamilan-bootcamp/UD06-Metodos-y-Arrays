
import javax.swing.JOptionPane;

public class Ejercicio05App {
	
	/* 
	 * Crea una aplicación que nos convierta en número en base decimal
	 * a binario. Esto lo realizara un método al que le pasaremos el
	 * numero como parámetro, devolverá un String con el numero convertido
	 * en binario. Para convertir un número decimal a binario, debemos
	 * dividir entre 2 el número y el resultado de esa división se divide
	 * entre 2 de nuevo hasta que no se pueda dividir mas, el resto que
	 * obtengamos de cada división formara el número binario, de bajo a
	 * arriba.
	 */
	
	public static void main(String[] args) {
		
		// Imprimimos el resultado.
		JOptionPane.showMessageDialog(null, panelInputs());
		
	}
	
	public static String panelInputs() {
		
		// Número para calcular el binario.
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número que quieres convertir en binario."));
		
		// Devolvemos al método main la conclusión
		return decimal2Binario(numero);
		
	}
	
	public static String decimal2Binario(int numero) {
		
		String binario = "";
		
		while(numero != 0) {
			
			if (numero%2 == 0) /* Si da como resto 0 */ {
				binario += "0";
			} else {
				binario += "1" /* Si no da como resto 0 */;
			} 
			numero /= 2; // Dividimos entre 2 el numero decimal

		}
		
		return new StringBuilder(binario).reverse().toString();
		
	}
	
}

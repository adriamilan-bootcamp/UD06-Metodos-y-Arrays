
import javax.swing.JOptionPane;

public class Ejercico01App {

	/* 
	 * Crea una aplicación que nos calcule el área de circulo,
	 * cuadrado o triangulo. Pediremos que figura queremos calcular
	 * área y según lo introducido pedirá los valores necesarios para
	 * calcular el área. Crea un método por cada figura para calcular
	 * cada área, este devolverá un número real. Muestra el resultado
	 * por pantalla.
	 */
	
	/*
	 * Aquí te mostramos que necesita cada figura:
	 * - Circulo: (radio^2)*PI
	 * - Triangulo: (base * altura)/2
	 * - Cuadrado: lado * lado
	 */
	
	// Método main, el que inicia nuestro programa
	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null, panelInputs());
		
	}
	
	// Método panelInputs, el que pedirá que figura quiere calcular.
	public static double panelInputs() {
		
		String figura = JOptionPane.showInputDialog("Introduce la figura para calcular el área (Circulo, Triangulo, Cuadrado).");
		
		double resultado = 0;
		
		switch (figura.toUpperCase()) {
			case "CIRCULO":
				resultado = areaCirculo();
				break;
			case "TRIANGULO":
				resultado = areaTriangulo();
				break;
			case "CUADRADO":
				resultado = areaCuadrado();
				break;
			default:
				JOptionPane.showMessageDialog(null, "La figura que has introducido es incorrecta.");
		}
		
		return resultado;
	}
	
	// Método areaCirculo, el que calculara el área de un circulo.
	public static double areaCirculo() {
		
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio de tu circulo."));
		final double PI = 3.1415;
		
		// Circulo: (radio^2)*PI
		return (radio * radio)*PI;
	}
	
	// Método areaTriangulo, el que calculara el área de un triangulo.
	public static double areaTriangulo() {
		
		double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base de tu triangulo."));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura de tu triangulo."));
		
		// Triangulo: (base * altura)/2
		return (base * altura)/2;
		
	}
	
	// Método areaCuadrado, el que calculara el área de un cuadrado.
	public static double areaCuadrado() {
		
		double ladoX = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer lado de cuadrado."));
		double ladoY = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo lado de cuadrado."));
		
		// Cuadrado: lado * lado
		return (ladoX * ladoY);
	
	}
	
}

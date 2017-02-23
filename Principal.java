/*
* @author Cristopher Sebastian Recinos Ramirez
* @author Andrea Maria Cordon Mayen
* @date 22/02/2017
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException{

		Calculadora c = new Calculadora();
		BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
		String linea = br.readLine();

                StackFactory f = new StackFactory();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el numero de la implementacion que desea utilizar: ");
		System.out.println("1. ArrayList");
		System.out.println("2. Vector");
		System.out.println("3. Lista Simple");
		System.out.println("4. Lista Doble");
		System.out.println("5. Lista Circular");
		System.out.println("6. Salir");
		int seleccion = teclado.nextInt();

		switch (seleccion) {
			case 1:
				f.getStack("AL");
				break;
			case 2:
				f.getStack("V");
				break;
			case 3:
				f.getStack("LS");
				break;
			case 4:
				f.getStack("LD");
				break;
			case 5:
				f.getStack("LC");
				break;
			case 6:
				System.out.println("Gracias por utilizar el programa");
<<<<<<< Updated upstream
				System.exit(0); 
=======
				System.exit();
>>>>>>> Stashed changes
				break;
			default:
				System.out.println("No existe el numero que ingreso, por favor ingrese otro: ");
		}

		double a = c.operar(linea);
		System.out.println(a);

	}
}

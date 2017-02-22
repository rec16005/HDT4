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
		double a = c.operar(linea);
		System.out.println(a);
		
	}
}

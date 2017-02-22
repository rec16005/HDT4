import java.util.Scanner;

public class Calculadora implements iCalculadora{
	@Override
	public double suma(double a, double b) {
		double c = a+b;
		return c;
	}

	@Override
	public double resta(double a, double b) {
		double c = a-b;
		return c;
	}

	@Override
	public double multiplicacion(double a, double b) {
		double c = a*b;
		return c;
	}

	@Override
	public double division(double a, double b) {
		double c = a/b;
		
		
		return c;
	}	

	@Override
	public double operar(String n) {
		vector v = new vector ();
		Scanner leer = new Scanner(n);
		
		while (leer.hasNext()) {
			if (leer.hasNextInt()) {
				v.push(leer.nextInt());
			} else {
				int n2 = (int) v.pop();
				int n1 = (int) v.pop();
				String op = leer.next();
				
				if (op.equals("+")) {
					v.push(n1 + n2);
				} else if (op.equals("-")) {
					v.push(n1 - n2);
				} else if (op.equals("*")) {
					v.push(n1 * n2);
				} else {
					v.push(n1 / n2);
				}
				
			}
	}
		double a = (int) v.pop();
		return a;
}
}
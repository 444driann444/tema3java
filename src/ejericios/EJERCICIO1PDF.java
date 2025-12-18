package ejericios;

public class EJERCICIO1PDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	int resulta1 = suma(4,6);
		System.out.println(resulta1);
	int resulta2 = resta(7, 4);
		System.out.println(resulta2);
	int resulta3 = multiplicacion(resulta1, resulta2);
		System.out.println(resulta3);
	int resulta4 = division(4, 2);
		System.out.println(resulta4);
	int resulta5 = Factorial(4);
		System.out.println(resulta5);
	boolean resulta6 = Esprimo(6);
			System.out.println(resulta6);
	boolean resulta7 = Narcisista(371);
		System.out.println(resulta7);
	

	}

	
	public static int suma(int num1, int num2) {
		int resultado;
		resultado = num1 + num2;
		return resultado;
	}

	public static int resta(int num1, int num2) {

		int resultado;
		resultado = num1 - num2;
		return resultado;
	}

	public static int multiplicacion(int num1, int num2) {

		int resultado;
		resultado = num1 * num2;
		return resultado;
	}

	public static int division(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("-1");
		}
		int resultado;
		resultado = num1 / num2;
		return resultado;
	}

	public static int Factorial(int numero) {
		int factorial = 1;
		for (int i = 1; i <= numero; i++) {
			factorial = factorial * i;
			// factorial *= i (esta linea es lo mismo que la de arriba más simplificada)
			System.out.println(factorial);
		}
		return factorial;
	}

	public static boolean Esprimo(int num) {
		int contadordivisores = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				contadordivisores++;
			}
		}
		if (contadordivisores != 2) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean Narcisista(int num) {

		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		double numernar4 = 0;
		int pri1 = num;

		if (num >= 0 && num <= 9) {
			return true;
		} else if (num >= 10 && num <= 99) {
			return false;

		} else if (num >= 100 && num <= 999) {
			c1 = num % 10;
			num = num / 10;

			c2 = num % 10;
			num = num / 10;

			c3 = num % 10;
			num = num / 10;

			numernar4 = Math.pow(c1, 3) + Math.pow(c2, 3) + Math.pow(c3, 3);

			if (pri1 == numernar4) {
				return true;
			} else {
				return false;
			}

		} else if (num >= 1000 && num <= 9999) {

			c1 = num % 10;
			num = num / 10;

			c2 = num % 10;
			num = num / 10;

			c3 = num % 10;
			num = num / 10;

			c4 = num % 10;
			num = num / 10;

			numernar4 = Math.pow(c1, 4) + Math.pow(c2, 4) + Math.pow(c3, 4) + Math.pow(c4, 4);

			if (pri1 == numernar4) {
				return true;
			} else {
				return false;
			}
		}
		return false;

	}

}

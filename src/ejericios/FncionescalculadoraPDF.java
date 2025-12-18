package ejericios;

import java.util.Scanner;

public class FncionescalculadoraPDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1;
		int num2;
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;

		do {
			
		     opcion = mostrarMenu(teclado);
		     if (opcion < 1 || opcion > 4 ) {
					System.out.println("Elige una de las opciones");
				}
			

			switch (opcion) {
			case 1:
				System.out.println("Introduce los valores para suma ");
				num1 = teclado.nextInt();
				num2 = teclado.nextInt();
				int resulta1 = suma(num1, num2);
				System.out.println( "El resultado de " + num1 + " + " + num2 + " = " + resulta1);
				break;

			case 2:
				System.out.println("Introduce los valores para resta ");
				num1 = teclado.nextInt();
				num2 = teclado.nextInt();
				int resulta2 = resta(num1, num2);
				System.out.println("El resultado de " + num1 + " - " + num2 + " = " + resulta2);
				break;

			case 3:
				System.out.println("Introduce los valores para dividir ");
				num1 = teclado.nextInt();
				num2 = teclado.nextInt();
				int resulta4 = division(num1, num2);
				System.out.println("El resultado de " + num1 + " / " + num2 + " = " + resulta4);
				break;

			case 4:
				System.out.println("Introduce los valores para multiplicar ");
				num1 = teclado.nextInt();
				num2 = teclado.nextInt();
				int resulta3 = multiplicacion(num1, num2);
				System.out.println("El resultado de " + num1 + " * " + num2 + " = " + resulta3);
				break;

			case 0:
				System.out.println("Saliendo de calculadora....");
				break;
			}

		} while ( opcion != 0);
		teclado.close();
	}
	
	public static int mostrarMenu  ( Scanner teclado ) {
		System.out.println("-------------");
		System.out.println("MENU");
		System.out.println("-------------");
		System.out.println("1 Suma");
		System.out.println("2 Resta");
		System.out.println("3 Division");
		System.out.println("4 Multiplicacion");
		System.out.println("Salir");
		int opc = teclado.nextInt();
		return opc;
	}
	public static int suma (int num1, int num2) {
		int resultado;
		resultado = num1 + num2;
		return resultado;
	}
	public static int resta (int num1, int num2) {
		
		int resultado;
		resultado = num1 - num2;
		return resultado;
	}
	public static int multiplicacion (int num1, int num2) {
		
		int resultado;
		resultado = num1 * num2;
		return resultado;
	}
	public static int division (int num1, int num2) {
		int resultado;
		resultado = num1 / num2;
		return resultado;
	}
		
	}



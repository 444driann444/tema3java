package ejericios;

import java.util.Scanner;

public class EJERCICIO4PDF {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime un número decimal: ");
		int nDecimal = teclado.nextInt();

		String binario = calcularBinario(nDecimal);
		System.out.println("El número binario es: " + binario);

		String octal = calcularOctal(nDecimal);
		System.out.println("El número octal es: " + octal);
		
		String Hexadecimal = calcularOctal(nDecimal);
		System.out.println("El número hexadecimal es: " + Hexadecimal);
	}

	public static String calcularBinario(int decimal) {
		String numeroBinario = "";
		while (decimal > 0) {
			int cifra = decimal % 2;
			decimal = decimal / 2;
			numeroBinario = cifra + numeroBinario;
		}

		return numeroBinario;
	}

	public static String calcularOctal(int octal) {
		String numeroOctal = "";
		while (octal > 0) {
			int cifra = octal % 8;
			octal = octal / 8;
			numeroOctal = cifra + numeroOctal;
		}

		return numeroOctal;
	}

	public static String calcularHexadecimal(int hexadecimal) {
		
		String numerohexa = "";
		while(hexadecimal > 0) {
			int cifra = hexadecimal % 16;
			hexadecimal = hexadecimal / 16;
			
			switch (cifra) {
			case 1, 2, 3, 4, 5, 6, 7, 8, 9:
				numerohexa = cifra + numerohexa;
				break;
			case 10 :
				numerohexa = "A"+ numerohexa;
				break;
			case 11 :
				numerohexa = "B"+ numerohexa;
				break;
			case 12 :
				numerohexa = "C"+ numerohexa;
				break;
			case 13 :
				numerohexa = "D"+ numerohexa;
				break;
			case 14 :
				numerohexa = "E"+ numerohexa;
				break;
			case 15 :
				numerohexa = "F"+ numerohexa;
				break;

			default:
				return numerohexa;
			}
			
	}
		return numerohexa;
	
	
	}
}

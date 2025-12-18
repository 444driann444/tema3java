package ejericios;

import java.util.Scanner;

public class EJERCICIO2PROFE {

public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un día");
		int dia = teclado.nextInt();
		System.out.println("Introduzca un mes");
		int mes = teclado.nextInt();
		System.out.println("Introduzca un año");
		int anno = teclado.nextInt();
		teclado.close();
		
		boolean fechaCorrecta = comprobrarDediasMesAnio(anno, mes, dia);
		
		if(fechaCorrecta == true) {
			int diaDelAnio = calcularDiaDelAnio(mes, dia, anno);
			System.out.println("Estamos en el dia " + diaDelAnio);
			
		}else {
			System.out.println("La fecha introducida no es válida");
		}
		
	}

	/*La comprobación no se debe de hacer en esta función, en el enunciado te dice que lo hagas en el main*/
	
	public static int calcularDiaDelAnio(int mes, int dia, int anio) {

		int numeroDias = 0;

		for (int i = 1; i < mes; i++) {
			numeroDias = numeroDias + numeroDeDiasMesAnio(anio, i);
		}

		numeroDias = numeroDias + dia;
		return numeroDias;

	}

	/*La comprobación no se debe de hacer en esta función, en el enunciado te dice que lo hagas en el main*/
	public static int calcularDiaDelAnio(int mes, int dia) {
		int numeroDias = 0;

		for (int i = 1; i < mes; i++) {
			numeroDias = numeroDias + numeroDeDiasMes(i);
		}

		numeroDias = numeroDias + dia;
		return numeroDias;

	}

	public static int numeroDeDiasMesAnio(int anio, int mes) {

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			return 31;
		case 2:

			if (anio % 4 == 0) {
				return 29;
			} else {
				return 28;
			}
		case 4, 6, 9, 11:
			return 30;
		default:
			return -1;
		}
	}

	/*Te faltaba por pasar el día para comprobarlo*/
	public static boolean comprobrarDediasMesAnio(int anio, int mes, int dia) {

		if (mes < 1 || mes > 12) {
			return false;
		}

		if (dia < 1 || dia > numeroDeDiasMesAnio(anio, mes)) {
			return false;
		}
		return true;
	}

	public static int numeroDeDiasMes(int mes) {
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			return 31;
		case 2:
			return 28;
		case 4, 6, 9, 11:
			return 30;
		default:
			return -1;
		}
	}

	/*Te faltaba por pasar el día para comprobarlo*/
	public static boolean comprobrarDediasMes(int mes, int dia) {

		if (mes < 1 || mes > 12) {
			return false;
		}

		if (dia < 1 || dia > numeroDeDiasMes(mes)) {
			return false;
		}
		return true;
	}

}


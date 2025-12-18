package ejericios;

import java.util.Scanner;

public class EJERCICIO3PDF {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int annio, mes;
		
		System.out.println("Introduzca al año");
		annio = teclado.nextInt();
		
		System.out.println("Introduzca al mes");
		mes = teclado.nextInt();

		calendario(mes, annio);
		teclado.close();

	}

	public static void calendario(int mes, int anio) {
		String nombreMes = obtenerNombreMes(mes);
		System.out.println(nombreMes + " , " + anio);

		int dias = EJERCICIO2PROFE.numeroDeDiasMesAnio(anio, mes);

		int diaComienzo = diaComienzoMes(mes, anio);
		
		if(diaComienzo == 0) {
			diaComienzo = 7;
		}
		
		int contador = 1;
		
		System.out.println("L\tM\tX\tJ\tV\tS\tD");
		
		for(int i = 1; i < diaComienzo; i++) {
			System.out.print("\t");
			contador++;
		}

		for (int i = 1; i <= dias; i++) {
			System.out.print(i + "\t");
			if (contador % 7 == 0) {
				System.out.println();
			}
			contador++;

		}
	}

	public static String obtenerNombreMes(int mes) {
		switch (mes) {
		case 1:
			return "Enero";
		case 2:
			return "Febrero";
		case 3:
			return "Marzo";
		case 4:
			return "Abril";
		case 5:
			return "Mayo";
		case 6:
			return "Junio";
		case 7:
			return "Julio";
		case 8:
			return "Agosto";
		case 9:
			return "Septiembre";
		case 10:
			return "Octubre";
		case 11:
			return "Noviembre";
		case 12:
			return "Diciembre";
		default:
			return "Inexistente";
		}
	}

	public static int diaComienzoMes(int mes, int anio) {
		switch (mes) {
		case 1, 2:
			return (anio + 31 * (mes - 1) + (anio - 1) / 4 - 3 * ((anio + 99) / 100) / 4) % 7;
		default:
			return (anio + 31 * (mes - 1) - (4 * mes + 23) / 10 + anio / 4 - (3 * (anio / 100 + 1)) / 4) % 7;
		}
	}
}
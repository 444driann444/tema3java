package ejericios;

public class EJERCICIO2PDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dias = calcularDiaDelAnio(2,24,2004);
		System.out.println(dias);
	}

	 public static int calcularDiaDelAnio( int mes, int dia, int anio) {

	 int numeroDias = 0;
	 
	 boolean comprobacion = comprobrarDediasMesAnio(anio,mes);

		if (comprobacion == false) {
			System.out.println("Esta mal la fecha");
			return -1;
		} else {
				for(int i = 1; i < mes; i++) {
						numeroDias = numeroDias + numeroDeDiasMesAnio(anio,i);
				}

					numeroDias = numeroDias + dia;
					return numeroDias; 
		}
	 }

	public static int calcularDiaDelAnio(int mes, int dia) {
		int numeroDias = 0;
		boolean comprobacion = comprobrarDediasMes(dia);

		if (comprobacion == false) {
			System.out.println("Esta mal la fecha");
			return -1;
		} else {

			for (int i = 1; i < mes; i++) {
				numeroDias = numeroDias + numeroDeDiasMes(i);
			}

			numeroDias = numeroDias + dia;
			return numeroDias;
		}

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
	public static boolean comprobrarDediasMesAnio(int anio, int mes) {
		int dia = 0;

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

	public static boolean comprobrarDediasMes(int mes) {
		int dia = 0;

		if (mes < 1 || mes > 12) {
			return false;
		}

		if (dia < 1 || dia > numeroDeDiasMes(mes)) {
			return false;
		}
		return true;
	}

}

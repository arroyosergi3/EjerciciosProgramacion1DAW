package capitulo03.bloque04;

public class ejercicio03_Tablas1Al15 {

	public static void main(String[] args) {
		int num = 1, res, i = 0;
		do {
			do {
				res = num * i;
				System.out.println(num + " x " + i + " = " + res);
				i++;

			} while (i <= 10);
			num++;
			i = 0;
		} while (num <= 15);

	}

}

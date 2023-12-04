package capitulo05.barajaDeCartas;

import java.util.Arrays;

import utils.utils;

public class Baraja {

	private Carta cartas[] = new Carta[52];

	public Baraja() {
		for (int i = 0; i < 13; i++) {
			cartas[i] = new Carta();
			cartas[i].setValor(i + 1);
			cartas[i].setPalo("Picas");
		}
		for (int i = 0; i < 13; i++) {
			cartas[i + 13] = new Carta();
			cartas[i + 13].setValor(i + 1);
			cartas[i + 13].setPalo("Diamantes");
		}
		for (int i = 0; i < 13; i++) {
			cartas[i + 26] = new Carta();
			cartas[i + 26].setValor(i + 1);
			cartas[i + 26].setPalo("Tréboles");
		}
		for (int i = 0; i < 13; i++) {
			cartas[i + 39] = new Carta();
			cartas[i + 39].setValor(i + 1);
			cartas[i + 39].setPalo("Corazones");
		}

		for (int i = 0; i < cartas.length; i++) {
			cartas[i].setId(i);
		}

	}

	public void pasarCartaDeAbajoAArriba() {
		if (cartas.length > 1) {
			Carta aux = cartas[cartas.length - 1];

			for (int i = cartas.length - 2; i >= 0; i--) {
				cartas[i + 1] = cartas[i];
			}

			cartas[0] = aux;
		}
	}

	public void pasarCartaDeArribaAAbajao() {
		Carta left;
		left = cartas[0];

		for (int cambio = 0; cambio < (cartas.length - 1); cambio++) {
			cartas[cambio] = cartas[(cambio + 1)];
		}
		cartas[cartas.length - 1] = left;

	}

	public void mezclar() {
		int indice1, indice2;
		Carta aux;

		for (int i = 0; i < cartas.length; i++) {
			indice1 = utils.obtenerNumeroAzar(0, cartas.length - 1);
			indice2 = utils.obtenerNumeroAzar(0, cartas.length - 1);
			aux = cartas[indice1];
			cartas[indice1] = cartas[indice2];
			cartas[indice2] = aux;
		}
	}

	public void ordenar() {

		boolean hayCambios = true;
		Carta aux;
		do {
			hayCambios = false;
			for (int i = 0; i < (cartas.length - 1); i++) {

				if (cartas[i].getId() > cartas[i + 1].getId()) {
					aux = cartas[i];
					cartas[i] = cartas[i + 1];
					cartas[i + 1] = aux;
					hayCambios = true;
				}

			}

		} while (hayCambios == true);

	}

	public void repartirCartas(Jugador j) {

		mezclar();
		int contador = 0;

//		for (int i = 0; i < contador; i++) {
//			if (cartas[i] != null) {
//				j.getMano()[i] = cartas[i];
//				cartas[i] = null;
//				contador++;
//			}
//
//		}
		
		for (int i = cartas.length - 1; i > -1 && contador < j.getMano().length; i--) {
			if(cartas[i]!= null) {
				j.getMano()[contador] = cartas[i];
				contador ++;
				cartas[i] = null;
			}
		}

	}

	// GETTERS,SETTERS Y TO STRING

	public Carta[] getBaraja() {
		return cartas;
	}

	public void setBaraja(Carta[] baraja) {
		this.cartas = baraja;
	}

	public String toString() {
		return "Baraja [cartas=" + Arrays.toString(cartas) + "]";
	}

}

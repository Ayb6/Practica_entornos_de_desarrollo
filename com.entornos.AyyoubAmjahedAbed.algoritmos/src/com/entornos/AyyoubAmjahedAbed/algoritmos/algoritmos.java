package com.entornos.AyyoubAmjahedAbed.algoritmos;

/**
 * 
 * @author ayyub
 *
 */
public abstract class algoritmos {
	/**
	 * 
	 * Creo el metodo fibonacci
	 * 
	 * @param numero
	 * @return
	 */
	public static int fibonacci(int numero) {
		int siguiente = 1, actual = 0, temporal = 0;
		for (int x = 1; x <= numero; x++) {
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
		}
		return actual;
	}

	/**
	 * 
	 * Creo el metodo factorial
	 * 
	 * @param numero
	 * @return
	 */
	public static int factorial(int numero) {
		if (numero < 0)
			numero = numero * -1;
		if (numero <= 0)
			return 1;
		int factorial = 1;
		while (numero > 1) {
			factorial = factorial * numero;
			numero--;
		}
		return factorial;
	}

	/**
	 * 
	 * Creo el metodo primo
	 * 
	 * @param numero
	 * @return
	 */
	public static boolean esPrimo(int numero) {
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {
			if (numero % x == 0)
				return false;
		}
		return true;
	}
}
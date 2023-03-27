package com.entornos.AyyoubAmjahedAbed.algoritmos;
/**
 * 
 * @author ayyub
 *
 */
public abstract class algoritmos {
	/**
	 * 
	 * 
	 * @param numero
	 * @return
	 */
	public static int fibonacci (int numero) {
		int siguiente = 1, actual = 0, temporal = 0;
		for (int x = 1; x <= numero; x++) {
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
		}
		return actual;
	}
}
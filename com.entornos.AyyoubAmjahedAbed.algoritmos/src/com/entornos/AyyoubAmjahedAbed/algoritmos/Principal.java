package com.entornos.AyyoubAmjahedAbed.algoritmos;

public class Principal {

	public static void main(String[] args) {
		// He creado un array con numeros aleatorios entre 1 y 20 
		int[] numeros = new int[5];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * (20 + 1));
		}
		// Creo otro array y lo relleno con los resultados fibonacci
		int[] resultadoFibonacci = new int[5];
		for (int i = 0; i < numeros.length; i++) {
			resultadoFibonacci[i] = algoritmos.fibonacci(numeros[i]);

		}
		// Creo otro array y lo relleno con los resultados del numero factorial
		int[] resultadoFactorial = new int[5];
		for (int i = 0; i < numeros.length; i++) {
			resultadoFactorial[i] = algoritmos.factorial(numeros[i]);

		}
		// Creo un ultimo array y lo relleno con los resultados del numero primo
		boolean[] resultadoPrimos = new boolean[5];
		for (int i = 0; i < numeros.length; i++) {
			resultadoPrimos[i] = algoritmos.Primo(numeros[i]);
		}
	}

}

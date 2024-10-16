package com.coderhouse.arrayUtil;

public class ArrayUtil {

	public static int obtenerElemento(int[] array, int indice) {
		try {
			return array[indice];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Índice fuera de los límites del array. Índice: " + indice);
			return -1;
		}
	}

}

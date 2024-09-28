package com.coderhouse.relacionales;

public class OperadoresRelacionales {

	public static void main(String[] args) {
		
		//Ejercicio 16
		
		int numero1 = 16;
		int numero2 = 4;
		boolean resultado1 = numero1 > numero2;
		
		if(resultado1 == true) {
			System.out.println("El número " + numero1 + " es mayor que el número " + numero2);
		} else {
			System.out.println("El número " + numero2 + " es mayor que el número " + numero1);
		}
		
		//Ejercicio 17
		
		int numero3 = 16;
		int resultado2 = numero3 % 2;
		
		if (resultado2 == 0) {
			System.out.println("El número " + numero3 + " es un número par.");			
		} else {
			System.out.println("El número " + numero3 + " es un número inpar.");		
		}
		
		//Ejercicio 18
		
		String string1 = "Federico";
		String string2 = "Fiorella";
		boolean resultado3 = string1 == string2;
		
		if(resultado3 == true) {
			System.out.println("El string 1 es igual que el string 2.");
		}else {
			System.out.println("El string 1 es diferente que el string 2.");
		}
		
		//Ejercicio 19
		
		byte notas[] = {10, 6, 4};
		
		for(byte i = 0; i < notas.length; i++) {
			
			if(notas[i] >= 6) {
				System.out.println("El estudiante número " + i + " se encuentra aprobado y su nota es: " + notas[i]);
			} else {
				System.out.println("El estudiante número " + i + " se encuentra desaprobado y su nota es: " + notas[i]);
			}
			
		}
		
		//Ejercicio 20
		
		int numeros[] = {-8, 1, 5, 10, 20};
		
		for (int i = 0; i < numeros.length; i++) {
			
            if (numeros[i] >= 1 && numeros[i] <= 10) {
                System.out.println("El número " + numeros[i] + " se encuentra entre 1 y 10.");
            } else {
                System.out.println("El número " + numeros[i] + " no se encuentra entre 1 y 10.");
            }
        }
		
	}

}

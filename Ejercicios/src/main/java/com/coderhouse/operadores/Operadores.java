package com.coderhouse.operadores;

public class Operadores {

	public static void main(String[] args) {
		
		//Ejercicio 10
		
		int numero1 = 1000;
		int numero2 = 12;
		int resultado = numero1 + numero2;
		
		System.out.println("El resultado de la suma es: " + resultado);
		
		//Ejercicio 11
		
		double numero3 = 1505458065;
		double numero4 = 785641035;
		double resultado2 = numero3 - numero4;
		
		System.out.println("El resultado de la resta es: " + resultado2);
		
		//Ejercicio 12
		
		int numero5 = 20;
		int numero6 = 8;
		int resultado3 = numero5 * numero6;
		
		System.out.println("El resultado de la multiplicación es: " + resultado3);
		
		//Ejercicio 14 y 15
		
		float numero7 = 80f;
		float numero8 = 6f;
		float resultado4 = numero7 / numero8;
		float residuo = numero7 % numero8;
		
		if(numero8 == 0) {
			System.out.println("La operación no se puede realizar porque el divisor es 0.");
		} else {
			System.out.println("El resultado de la división es " + resultado4 + " y el residuo es " + residuo);
		}
	}

}

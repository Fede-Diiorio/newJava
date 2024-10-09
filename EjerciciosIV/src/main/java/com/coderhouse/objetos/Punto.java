package com.coderhouse.objetos;

public class Punto {

	//Atributos
	private int x;
	private int y;
	
	//Get y Set
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//Métodos
	public void mostrarPunto() {
		System.out.println("X: " + getX());
		System.out.println("Y: " + getY());
	}
}

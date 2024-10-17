package com.coderhouse.operadores;

import com.coderhouse.interfaces.OperableInterface;

public class Suma implements OperableInterface {

	@Override
	public double operar(double numero1, double numero2) {
		return numero1 + numero2;

	}

}

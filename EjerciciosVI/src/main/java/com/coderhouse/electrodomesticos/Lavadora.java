package com.coderhouse.electrodomesticos;

import com.coderhouse.interfaces.ElectrodomesticoInterface;

public class Lavadora implements ElectrodomesticoInterface {

	@Override
	public void encender() {
		System.out.println("Ahora la lavadora está siendo lavada. En una hora tu ropa estará limpia.");
	}

}

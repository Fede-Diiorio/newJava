package com.coderhouse.electrodomesticos;

import com.coderhouse.interfaces.ElectrodomesticoInterface;

public class Television implements ElectrodomesticoInterface {

	@Override
	public void encender() {
		System.out.println("Ahora la tele está encendida en tu canal favorito.");

	}

}

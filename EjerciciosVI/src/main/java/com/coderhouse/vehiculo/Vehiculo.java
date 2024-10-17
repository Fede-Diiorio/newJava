package com.coderhouse.vehiculo;

import com.coderhouse.interfaces.TransporteInterface;
import com.coderhouse.interfaces.VehiculoInterface;

public class Vehiculo implements VehiculoInterface, TransporteInterface {

	public void arrancar() {
		System.out.println("El vehículo ahora está en marcha.");
	}

	public void mover() {
		System.out.println("El vehículo se mueve.");
	}

	@Override
	public void detener() {
		System.out.println("Ahora el vehículo está detenido.");

	}
}

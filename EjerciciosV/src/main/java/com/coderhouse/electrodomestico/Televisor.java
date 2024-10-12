package com.coderhouse.electrodomestico;

public class Televisor extends Electrodomestico {

	private String canalInicial;

	public String getCanalInicial() {
		return canalInicial;
	}

	public void setCanalInicial(String canalInicial) {
		this.canalInicial = canalInicial;
	}

	@Override
	public void encender() {
		System.out.println("Tu televisor se encendió en el canal " + getCanalInicial());
	}
	
	@Override
	public void apagar() {
		System.out.println("Tu programa ha terminado y te vas al gimnasio");
		super.apagar();
	}
}

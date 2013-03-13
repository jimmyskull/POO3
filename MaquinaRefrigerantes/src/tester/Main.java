package tester;

import maquina.MaquinaDeRefrigerante;

public class Main {

	public static void main(String[] args) {
		MaquinaDeRefrigerante maquina = new MaquinaDeRefrigerante();
		
		maquina.comprar(1);
		maquina.comprar(0.5);
		maquina.comprar(0.25);
		maquina.comprar(0.20);
	}

}

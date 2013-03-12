package maquina;

public class MaquinaDeRefrigerante {
	VendaDeRefrigerante refrigerante;
	
	public MaquinaDeRefrigerante() {
		VendaDeRefrigerante r1 = new Refrigerante_1(null);
		VendaDeRefrigerante r2 = new Refrigerante_2(r1);
		refrigerante = new Refrigerante_3(r2);
	}
	
	public void comprar(double entrada) {
		refrigerante.processarVenda(entrada);
	}
}

package maquina;

public class MaquinaDeRefrigerante {
	VendaDeRefrigerante refrigerante;
	
	public MaquinaDeRefrigerante() {
		VendaDeRefrigerante r0 = new ValorNaoAceito(null);
		VendaDeRefrigerante r1 = new Refrigerante_1(r0);
		VendaDeRefrigerante r2 = new Refrigerante_2(r1);
		refrigerante = new Refrigerante_3(r2);
	}
	
	public void comprar(double entrada) {
		refrigerante.processarVenda(entrada);
	}
}

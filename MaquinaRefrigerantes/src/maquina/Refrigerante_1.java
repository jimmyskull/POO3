package maquina;

public class Refrigerante_1 extends VendaDeRefrigerante {
	private final double CUSTO = 0.25;

	Refrigerante_1(VendaDeRefrigerante sucessor) {
		super(sucessor);
	}

	@Override
	public void processarVenda(double entrada) {
		if (entrada == CUSTO)
			System.out.println("Vendido um refrigerante do tipo 1.");
		else
			if (sucessor != null)
				sucessor.processarVenda(entrada);
	}

}

package maquina;

public class Refrigerante_3 extends VendaDeRefrigerante {
	private final double CUSTO = 1.00;

	Refrigerante_3(VendaDeRefrigerante sucessor) {
		super(sucessor);
	}

	@Override
	public void processarVenda(double entrada) {
		if (entrada == CUSTO)
			System.out.println("Vendido um refrigerante do tipo 3.");
		else
			if (sucessor != null)
				sucessor.processarVenda(entrada);
	}

}

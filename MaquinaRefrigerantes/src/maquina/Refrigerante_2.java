package maquina;

public class Refrigerante_2 extends VendaDeRefrigerante {
	private final double CUSTO = 0.50;	

	Refrigerante_2(VendaDeRefrigerante sucessor) {
		super(sucessor);
	}

	@Override
	public void processarVenda(double entrada) {
		if (entrada == CUSTO)
			System.out.println("Vendido um refrigerante do tipo 2.");
		else
			if (sucessor != null)
				sucessor.processarVenda(entrada);
	}

}

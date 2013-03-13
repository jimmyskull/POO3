package maquina;


public class ValorNaoAceito extends VendaDeRefrigerante {

	ValorNaoAceito(VendaDeRefrigerante sucessor) {
		super(sucessor);
	}

	@Override
	public void processarVenda(double entrada) {
		System.out.println("Valor retornado: nenhum refrigerante pode ser vendido por este valor.");
	}

}

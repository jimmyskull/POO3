package maquina;

public abstract class VendaDeRefrigerante {
	protected VendaDeRefrigerante sucessor = null;
	
	VendaDeRefrigerante(VendaDeRefrigerante sucessor) {
		setSuccessor(sucessor);
	}
	
	public void setSuccessor(VendaDeRefrigerante sucessor) {
		this.sucessor = sucessor;
	}
	
	public abstract void processarVenda(double entrada);
}

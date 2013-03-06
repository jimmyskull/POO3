package kernel;

public class KernelInfo extends KernelInfoAdapter {
	public KernelInfo() {
		super(new KernelStatistics());
	}
	
	public String toString() {
		StringBuffer buff = new StringBuffer();
		
		buff.append("Processos - executando: " + getRunningProcesses());
		buff.append(" - esperando I/O: " + getBlockedProcesses());
		buff.append("\n");
		buff.append("CPU - user: " + getCPUUser() + " - ");
		buff.append("nice: " + getCPUNice() + " - ");
		buff.append("system: " + getCPUSystem() + "\n");
		buff.append("CPU (em máquina virtual) - user: " + getCPUGuestUser() + " - ");
		buff.append("nice: " + getCPUGuestNice() + "\n");
		buff.append("Trocas de contextos: " + getContextSwitches() + "\n");
		buff.append("Trocas de swaps: " + getSwappedPagesCount() + "\n");
		return buff.toString();
	}
}

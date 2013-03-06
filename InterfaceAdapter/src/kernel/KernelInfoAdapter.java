package kernel;

public class KernelInfoAdapter {
	private KernelStatistics stat;
	
	KernelInfoAdapter(final KernelStatistics kernel_stat) {
		stat = kernel_stat;
		stat.update();
	}
	
	public Integer getContextSwitches() {
		return stat.ctxt;
	}
	
	public Integer getSwappedPagesCount() {
		return stat.swap;
	}
	
	public Integer getForkedProcessesCount() {
		return stat.processes;
	}
	
	public Integer getRunningProcesses() {
		return stat.procs_running;
	}
	
	public Integer getBlockedProcesses() {
		return stat.procs_blocked;
	}
	
	public Integer getCPUUser() {
		return stat.cpu.user;
	}

	public Integer getCPUNice() {
		return stat.cpu.user;
	}

	public Integer getCPUSystem() {
		return stat.cpu.system;
	}

	public Integer getCPUIdle() {
		return stat.cpu.idle;
	}

	public Integer getCPUIOWait() {
		return stat.cpu.iowait;
	}

	public Integer getCPUInterruptions() {
		return stat.cpu.irq;
	}

	public Integer getCPUGuestUser() {
		return stat.cpu.guest;
	}

	public Integer getCPUGuestNice() {
		return stat.cpu.guest_nice;
	}
}

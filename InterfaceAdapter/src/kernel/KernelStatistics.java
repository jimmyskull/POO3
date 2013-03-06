package kernel;

import java.util.ArrayList;

public class KernelStatistics {
	public CPUInfo cpu = new CPUInfo();
	public Integer ctxt;
	public Integer swap;
	public Integer processes;
	public Integer procs_running;
	public Integer procs_blocked;
	
	private void processLine(String[] arr) {
		if (arr[0].equals("cpu")) {
			cpu.user = Integer.parseInt(arr[2]);
			cpu.system = Integer.parseInt(arr[3]);
			cpu.idle = Integer.parseInt(arr[4]);
			cpu.iowait = Integer.parseInt(arr[5]);
			cpu.irq = Integer.parseInt(arr[6]);
			cpu.softirq = Integer.parseInt(arr[7]);
			cpu.steal = Integer.parseInt(arr[8]);
			cpu.guest = Integer.parseInt(arr[9]);
			cpu.guest_nice = Integer.parseInt(arr[10]);
			return;
		}	
		if (arr[0].equals("ctxt")) {
			ctxt = Integer.parseInt(arr[1]);
			return;
		}
		if (arr[0].equals("swap")) {
			swap = Integer.parseInt(arr[1]);
			return;
		}		
		if (arr[0].equals("processes")) {
			processes = Integer.parseInt(arr[1]);
			return;
		}		
		if (arr[0].equals("procs_running")) {
			procs_running = Integer.parseInt(arr[1]);
			return;
		}		
		if (arr[0].equals("procs_blocked")) {
			procs_blocked = Integer.parseInt(arr[1]);
			return;
		}		
	}
	
	public void update() {
		ArrayList<String> stat = new StatisticsReader().read();
		
		for (String s: stat) {
			String[] arr = s.split(" ");
			processLine(arr);
		}
		
	}
}

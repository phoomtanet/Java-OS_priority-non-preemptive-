package projeck;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Controller {
	private int clock = 0;
	private int processID = 0;
	private int maxmemorygb = 2;
	private int maxmemory = maxmemorygb * 1024;
	private int perusememory = 0;
	private int usememory = 0;
	private double avgturnaround = 0;
	private double avgwaiting = 0;
	private static final DecimalFormat df = new DecimalFormat("0.00");

	private ArrayList<Model> JobQueue = new ArrayList<Model>();
	private ArrayList<Model> ReadyQueue = new ArrayList<Model>();
	private ArrayList<Model> TerminatedQueue = new ArrayList<Model>();
	private ArrayList<Model> IOQueue = new ArrayList<Model>();

	public String TextJobQ() {
		String text = "";
		for (int i = 0; i < JobQueue.size(); i++) {
			text = text + "Process " + JobQueue.get(i).getProcessID() + "/";
			text = text + JobQueue.get(i).getPriority() + "/";
			text = text + JobQueue.get(i).getArrivalTime() + "/";
			text = text + JobQueue.get(i).getBurstTime() + "/";
			text = text + JobQueue.get(i).getWaittingTime() + "/";
			text = text + JobQueue.get(i).getStatus() + "/";
			text = text + JobQueue.get(i).getMemory() + " MB" + "/";
			text = text + ",";
		}
		return text;
	}

	public String TextReadyQ() {
		String text = "";
		for (int i = 0; i < ReadyQueue.size(); i++) {
			text = text + "Process " + ReadyQueue.get(i).getProcessID() + "/";
			text = text + ReadyQueue.get(i).getPriority() + "/";
			text = text + ReadyQueue.get(i).getArrivalTime() + "/";
			text = text + ReadyQueue.get(i).getStatus() + "/";
			text = text + ",";

		}
		return text;
	}

	public String TextIOQ() {
		String text = "";
		for (int i = 0; i < IOQueue.size(); i++) {
			text = text + "Process " + IOQueue.get(i).getProcessID() + "/";
			text = text + IOQueue.get(i).getBurstTime() + "/";
			text = text + IOQueue.get(i).getWaittingTime() + "/";
			text = text + IOQueue.get(i).getStatus() + "/";
			text = text + ",";
		}
		return text;
	}

	public String TextTerminateQ() {
		String text = "";
		for (int i = 0; i < TerminatedQueue.size(); i++) {
			text = text + "Process " + TerminatedQueue.get(i).getProcessID() + "/";
			text = text + TerminatedQueue.get(i).getPriority() + "/";
			text = text + TerminatedQueue.get(i).getArrivalTime() + "/";
			text = text + TerminatedQueue.get(i).getBurstTime() + "/";
			text = text + TerminatedQueue.get(i).getWaittingTime() + "/";
			text = text + TerminatedQueue.get(i).getStatus() + "/";
			text = text + ",";
		}

		return text;
	}
	
	
	public String TextClock() {
		clock++;
		return Integer.toString(clock);
	}

	public String textRunJOB() {
		String text = "";
		for (int i = 0; i < JobQueue.size(); i++) {
			if (JobQueue.get(i).getStatus() == "Running") {
				text = text + "Process " + JobQueue.get(i).getProcessID();
			}
		}
		return text;
	}

	public boolean getCheckrunJOB() {
		boolean haverun = false;
		for (int i = 0; i < JobQueue.size(); i++) {
			if (JobQueue.get(i).getStatus() == "Running") {
				haverun = true;
			}
		}
		return haverun;
	}

	public String textRunIO() {
		String text = "";
		for (int i = 0; i < IOQueue.size(); i++) {
			if (IOQueue.get(i).getStatus() == "Running") {
				text = text + "Process " + IOQueue.get(i).getProcessID();
			}
		}
		return text;
	}
	
	public boolean getCheckrunIO() {
		boolean haverun = false;
		for (int i = 0; i < IOQueue.size(); i++) {
			if (IOQueue.get(i).getStatus() == "Running") {
				haverun = true;
			}
		}
		return haverun;
	}


	public String textTurnaroundAGV() {
		String text = "";
		text = text + df.format(avgturnaround);
		return text;
	}

	public String textWaitingAGV() {
		String text = "";
		text = text + df.format(avgwaiting);
		return text;
	}


	public String textmaxMemoryMB() {
		return Integer.toString(maxmemory);
	}
	
	public String textPermemory() {
		return Integer.toString(perusememory);
	}

	public String textUsememoryMB() {
		return Integer.toString(usememory);
	}
	
	public int getintPermemory() {
		return perusememory;
	}

	public void creatProcess() {
		processID++;
		Model process = new Model(processID, (int) (Math.random() * (10) + 1), clock, 0, 0, 0,
				(int) (Math.random() * (30) + 130));
		JobQueue.add(process);

	}

	public void newToReady() {
		
			for (int i = 0; i < JobQueue.size(); i++) {
				if (JobQueue.get(i).getStatus() == ("New")) {
					JobQueue.get(i).setStatus(1);
				}
			}
		} 

	public void ReadyToQueue() {
		int i = 0;
		boolean sameid;
		while (i < JobQueue.size()) {
			if (JobQueue.get(i).getStatus().equals("Ready") ) { // ==
				sameid = false;
				for (int j = 0; j < ReadyQueue.size(); j++) {
					if (ReadyQueue.get(j).getProcessID() == JobQueue.get(i).getProcessID()) {
						sameid = true;
						break;
					}
				}
				if (sameid == false) {
					ReadyQueue.add(JobQueue.get(i));
					Collections.sort(ReadyQueue, Comparator.comparing(Model::getPriority));
				}
			}
			i++;
		}
	}
	
	public void RaedyToRunning() {
 
		
		boolean haveRun = false;
		for (int i = 0; i < JobQueue.size(); i++) {
			if (JobQueue.get(i).getStatus() == ("Running")) {
				haveRun = true;
			}
		}
		if (haveRun == false) {
			for (int i = 0; i < JobQueue.size(); i++) {
				if (JobQueue.get(i).getStatus() == ("Ready") && JobQueue.get(i).getPriority() == ReadyQueue.get(0).getPriority()) {
					JobQueue.get(i).setStatus(2);
					ReadyQueue.remove(JobQueue.get(i));
					break;
				}
			}
		}

	}

	public void Terminated() {
			for (int i = 0; i < JobQueue.size(); i++) {
				if (JobQueue.get(i).getStatus() == ("Running")) {
					TerminatedQueue.add(JobQueue.get(i));
					JobQueue.get(i).setStatus(4);
				
				}
			}
	}

		public void  RemoveAuto() {
				for (int i = 0; i < JobQueue.size(); i++) {
					if (JobQueue.get(i).getStatus() == ("Terminate")) {
					JobQueue.remove(i);
					}
				}
	}

	public void BurstAndWaitingTime() {
		for (int i = 0; i < JobQueue.size(); i++) {
			if (JobQueue.get(i).getStatus() == ("Running")) {
				JobQueue.get(i).setBurstTime(JobQueue.get(i).getBurstTime() + 1);
			}
			if (JobQueue.get(i).getStatus() == ("Waitting")) {
				JobQueue.get(i).setWaittingTime(JobQueue.get(i).getWaittingTime() + 1);
			} else if (JobQueue.get(i).getStatus() == ("Ready")) {
				JobQueue.get(i).setWaittingTime(JobQueue.get(i).getWaittingTime() + 1);
			}
		}
	}

	public void AddIO() {
		for (int i = 0; i < JobQueue.size(); i++) {
			if (JobQueue.get(i).getStatus() == "Running") {
				JobQueue.get(i).setStatus(3);
				Model io = new Model(JobQueue.get(i).getProcessID(), JobQueue.get(i).getPriority(),
						JobQueue.get(i).getArrivalTime(), 0, 0, 3, 0);
				this.IOQueue.add(io);

			}
		}

	}

	public void IORun() {
		boolean haverun = false;
		for (int i = 0; i < IOQueue.size(); i++) {
			if (IOQueue.get(i).getStatus() == "Running") {
				haverun = true;
			}
		}
		if (haverun == false) {
			for (int i = 0; i < IOQueue.size(); i++) {
				if (IOQueue.get(i).getStatus() == "Waitting") {
					IOQueue.get(i).setStatus(2);
					break;
				}
			}
		}
	}

	public void IOcloss() {
		for (int i = 0; i < JobQueue.size(); i++) {
			if (JobQueue.get(i).getProcessID() == IOQueue.get(0).getProcessID()) {
				JobQueue.get(i).setStatus(1);
			}
		}
		IOQueue.remove(0);
	}

	public void IOBurstAndWaitingTime() {
		for (int i = 0; i < IOQueue.size(); i++) {
			if (IOQueue.get(i).getStatus() == ("Running")) {
				IOQueue.get(i).setBurstTime(IOQueue.get(i).getBurstTime() + 1);
			} else {
				IOQueue.get(i).setWaittingTime(IOQueue.get(i).getWaittingTime() + 1);
			}
		}
	}

	public void MemoryUse() {
		int memory = 0;
		for (int i = 0; i < JobQueue.size(); i++) {
			memory = memory + JobQueue.get(i).getMemory();
		}
		perusememory = memory * 100 / maxmemory;
		usememory = memory;

	}

	public void AVGTurnaroundandWaiting() {
		try {
			double avgwait = 0;
			double avgturn = 0;
			for (int i = 0; i < TerminatedQueue.size(); i++) {
				avgturn = avgturn + TerminatedQueue.get(i).getBurstTime() + TerminatedQueue.get(i).getWaittingTime();
				avgwait = avgwait + TerminatedQueue.get(i).getWaittingTime();
			}
			if (TerminatedQueue.size() >= 1) {
				avgturnaround = avgturn / TerminatedQueue.size();
				avgwaiting = avgwait / TerminatedQueue.size();
			}
		} catch (IndexOutOfBoundsException e) {
		}
		
	}
}

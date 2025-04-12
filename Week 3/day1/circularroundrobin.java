class Process {
    int pid;
    int burstTime;
    int priority;
    int remainingTime;
    int waitingTime = 0;
    int turnAroundTime = 0;
    Process next;

    public Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }
}

class RoundRobinScheduler {
    private Process tail = null;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    public void addProcess(int pid, int burstTime, int priority) {
        Process newProcess = new Process(pid, burstTime, priority);
        if (tail == null) {
            tail = newProcess;
            tail.next = tail;
        } else {
            newProcess.next = tail.next;
            tail.next = newProcess;
            tail = newProcess;
        }
    }

    public void removeProcess(Process toRemove) {
        if (tail == null || toRemove == null) return;

        Process current = tail;
        Process prev = null;

        do {
            prev = current;
            current = current.next;
            if (current == toRemove) {
                if (current == tail && current.next == tail) {
                    tail = null;
                } else {
                    if (current == tail) {
                        tail = prev;
                    }
                    prev.next = current.next;
                }
                return;
            }
        } while (current != tail);
    }

    public void simulate() {
        if (tail == null) return;

        int time = 0;
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int processCount = 0;

        Process current = tail.next;

        while (tail != null) {
            if (current.remainingTime > 0) {
                int execTime = Math.min(current.remainingTime, timeQuantum);
                time += execTime;
                current.remainingTime -= execTime;

                if (current.remainingTime == 0) {
                    current.turnAroundTime = time;
                    current.waitingTime = time - current.burstTime;
                    totalWaitingTime += current.waitingTime;
                    totalTurnAroundTime += current.turnAroundTime;
                    processCount++;
                    Process toRemove = current;
                    current = current.next;
                    removeProcess(toRemove);
                } else {
                    current = current.next;
                }

                displayQueue();
            }
        }

        double avgWaiting = (double) totalWaitingTime / processCount;
        double avgTurnAround = (double) totalTurnAroundTime / processCount;

        System.out.println("Average Waiting Time: " + avgWaiting);
        System.out.println("Average Turnaround Time: " + avgTurnAround);
    }

    public void displayQueue() {
        if (tail == null) {
            System.out.println("No processes left.");
            return;
        }

        Process current = tail.next;
        System.out.print("Queue: ");
        do {
            System.out.print("[PID: " + current.pid + ", RT: " + current.remainingTime + "] ");
            current = current.next;
        } while (current != tail.next);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(4);
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        scheduler.simulate();
    }
}

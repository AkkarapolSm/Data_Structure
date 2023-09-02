package QueueTest;

import java.time.LocalDateTime;

public class WaitingLine {
    private static int seq = 0;
    private int queueId;
    private LocalDateTime inTime;


    public WaitingLine() {
        this.queueId = ++seq;
        this.inTime = LocalDateTime.now();
    }


    public int getQueueId() {
        return queueId;
    }


    public LocalDateTime getInTime() {
        return inTime;
    }


    @Override
    public String toString() {
        return "WaitingLine [Queue=" + queueId + ", Time=" + inTime + "]";
    }

    
}

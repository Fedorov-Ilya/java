package webService.java.Controller;

import org.springframework.beans.factory.annotation.Value;

public class PropsReader {
    private long latency;
    private int latencyInt;

    public PropsReader(@Value("${stub-latency}") long latency,@Value("${latencyInt}")int latencyInt){
        this.latency = latency;
        this.latencyInt = latencyInt;
    }

    public long getLatency() {
        return latency;
    }

    public int getLatncyInt() {
        return latencyInt;
    }
}

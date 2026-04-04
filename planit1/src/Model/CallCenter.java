package Model;

import java.util.ArrayList;
import java.util.List;

public class CallCenter {

    public int timeInterval;
    public List<Double> handleTime;
    public List<Double> serviceLevel;
    public List<Number> callData;
    private int callCount;
    private int inboundCalls;
    private int outboundCalls;

    public CallCenter() {
        this.callData = new ArrayList<>();
        this.timeInterval = 1;
        this.handleTime = new ArrayList<>();
        this.serviceLevel = new ArrayList<>();
    }

    public CallCenter(List<Number> callData, int timeInterval) {
        this.callData = callData;
        this.timeInterval = timeInterval;
        this.handleTime = new ArrayList<>();
        this.serviceLevel = new ArrayList<>();
    }

    public void processCallData() {
        for (int i = 0; i + 2 < callData.size(); i += 3) {
            callCount++;
            handleTime.add(callData.get(i + 1).doubleValue());
            serviceLevel.add(callData.get(i + 2).doubleValue());
        }
    }

    public void setCallData(List<Number> callData) {
        this.callData = callData;
    }

    public int getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(int timeInterval) {
        this.timeInterval = timeInterval;
    }

    public int getInboundCalls() {
        return inboundCalls;
    }

    public void setInboundCalls(int inboundCalls) {
        this.inboundCalls = inboundCalls;
    }

    public int getOutboundCalls() {
        return outboundCalls;
    }

    public void setOutboundCalls(int outboundCalls) {
        this.outboundCalls = outboundCalls;
    }

    public double getArrivalRate() {
        return (double) callCount / timeInterval;
    }

    public double getAverageHandleTime() {
        if (handleTime.isEmpty()) return 0;
        double sum = 0;
        for (double v : handleTime) sum += v;
        return sum / handleTime.size();
    }

    public double getAverageServiceLevel() {
        if (serviceLevel.isEmpty()) return 0;
        double sum = 0;
        for (double v : serviceLevel) sum += v;
        return sum / serviceLevel.size();
    }


}

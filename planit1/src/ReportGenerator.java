import Model.CallCenter;

import java.util.*;

public class ReportGenerator {

    int indexNumber = 0;
    double handleTime;
    double serviceLevel;

    public void GenerateReport() {
        System.out.println("Name: Call Center 1");
    }

    public void GenerateReport(String callCenter) {
        System.out.println("Name: " + callCenter);
        CallCenter cc = new CallCenter();
        List<Number> callData = new ArrayList<>();
        for (int i=0; i < 100; i++) {
            indexNumber++;
            callData.add(indexNumber);
            handleTime = Math.round((0.5 + Math.random() * 7.0) * 1000.0) / 1000.0;
            callData.add(handleTime);
            serviceLevel = Math.round(Math.random() * 1000.0) / 1000.0;
            callData.add(serviceLevel);
        }

        cc.setInboundCalls(150 + (int)(Math.random() * 51));
        System.out.println("Inbound Calls: " + cc.getInboundCalls());
        cc.setOutboundCalls(50 + (int)(Math.random() * 51));
        System.out.println("Outbound Calls: " + cc.getOutboundCalls());
    }

}

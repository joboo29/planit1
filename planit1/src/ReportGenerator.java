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
        //Create data
        for (int i=0; i < 100; i++) {
            indexNumber++;
            callData.add(indexNumber);
            handleTime = Math.round((0.5 + Math.random() * 7.0) * 1000.0) / 1000.0;
            callData.add(handleTime);
            serviceLevel = Math.round(Math.random() * 1000.0) / 1000.0;
            callData.add(serviceLevel);
        }

        int timeInterval = 24;

        CallCenter callCenter1 = new CallCenter(callData, timeInterval);
        callCenter1.processCallData();

        System.out.printf("Arrival Rate is %.3f%n", callCenter1.getArrivalRate());
        System.out.printf("Average Handle Time is %.3f%n", callCenter1.getAverageHandleTime());
        System.out.printf("Average Service Level is %.3f%n", callCenter1.getAverageServiceLevel());
        System.out.print("Thank you!");
    }

}

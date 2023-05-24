package _04_day;

import java.util.List;

public class MockTest4 {

    public  static int truckTour(List<List<Integer>> petrolpumps) {
        int truck = 0;
        int pump = 0;
        for(int i = 0; i < petrolpumps.size(); i++){
            truck += petrolpumps.get(i).get(0) - petrolpumps.get(i).get(1);
            if(truck < 0){
                pump = i + 1;
                truck = 0;
            }
        }
        return pump;
        // Write your code here

    }
}

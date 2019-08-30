package WorkDay;

import Workers.Worker;
import java.util.ArrayList;
import java.util.Collections;

public class Monday extends WeekDay {
    /**
     * Collect all available workers on Monday.
     */
    public void collectWorkers(){
        ArrayList<Worker> all = manager.getWorkerList();
        for (Worker w : all){
            int[] t = w.getTimeAvailable()[0];
            if (t[0] <= 10.45 & t[1] >= 18) {
                if (w.isOpen()) {workersToday.add(w);}
            }
            else if (10.45 < t[0] & t[0] <= 12 & t[1] >= 18) {workersToday.add(w);}
            else if (12 < t[0] & t[0] <= 15 & t[1]>= 21) {workersToday.add(w);}
            else if (15 < t[0] & t[0] <= 18 & t[1] >= 23) {workersToday.add(w);}
        }
        if (workersToday.size() >= jobs.size()) {Collections.shuffle(workersToday);}
        else {System.out.println("No enough workers today!!!");}
        for (Worker w : workersToday){
            if (w.isOpen()) {

            }
        }
    }







}

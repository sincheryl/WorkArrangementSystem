package WorkDay;

import Workers.Worker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WeekDay extends WorkDay{
    /**
     * The workers that work this day, the key is the work type and time, the value is the the worker.
     * There are four types of work:
     *  - K: kitchen
     *  - S: shake
     *  - O: order
     *  - L: long
     */
    Map<String, Worker> Arrangement = new HashMap<String, Worker>();


    /**
     *
     */
    @Override
    public void setWorkers() {
        Arrangement.put("11-18K", null);
        Arrangement.put("12-18S", null);
        Arrangement.put("12-18O", null);
        Arrangement.put("15-21L", null);
        Arrangement.put("18-23.5O", null);
        Arrangement.put("18-23.5S", null);
        Arrangement.put("18-23K", null);
    }
}

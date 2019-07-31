package WorkDay;

import Workers.Worker;

import java.util.ArrayList;

public abstract class WorkDay {
    /**
     * The list of works that work this day, sorted in chronological order.
     */
    private ArrayList<Worker> workers;

    /**
     * The method to set the workers for the work day.
     */
    abstract public void setWorkers();

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

}






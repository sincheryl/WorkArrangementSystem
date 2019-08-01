package WorkDay;

import Workers.Worker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class WorkDay {
    /**
     * The list of works that work this day, sorted in chronological order.
     */
    private ArrayList<Worker> workers;

    /**
     * The jobs that this work day requires.
     */
     ArrayList<Job> jobs;

    /**
     * The workers that work this day, the key is the work type and time, the value is the the worker.
     */
     Map<Job, Worker> Arrangement = new HashMap<Job, Worker>();

    /**
     * The method to set the workers for the work day.
     */
    abstract public void setWorkers();

    abstract public void setJobs();

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

}






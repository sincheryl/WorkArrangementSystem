package WorkDay;

import Workers.Worker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class WorkDay {
    /**
     * Which day of this workday
     */
    private  String DayofWeek;

    /**
     * The date of this workday
     */
    private String date;

    /**
     * The list of works that work this day, sorted in chronological order.
     */
    private ArrayList<Worker> workers;

    /**
     * The jobs that this work day requires.
     */
     private ArrayList<Job> jobs;

    /**
     * The workers that work this day, the key is the work type and time, the value is the the worker.
     */
     Map<Job, Worker> Arrangement = new HashMap<Job, Worker>();


    public void addJobs(int ini, int end, String type) {
        jobs.add(new Job(ini, end, type));
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    /**
     * set the jobs that required on weekdays from Mon to
     */
    abstract void setJobs();

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}






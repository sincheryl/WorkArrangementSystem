package WorkDay;

import Workers.Worker;
import Workers.WorkerManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class WorkDay {
    /*
     * Which day of this workday
     */
    String DayofWeek;

    /*
     * The date of this workday
     */
    String date;

    /*
     * The manager of this store. This is not a real person, just a tool  to deal with workers.
     */
    WorkerManager manager;

    /*
     * The list of works that work this day, sorted in chronological order.
     * THe first worker of thus list opens
     */
    ArrayList<Worker> workersToday;

    /**
     * The jobs that this work day requires.
     */
     ArrayList<Job> jobs;

    /**
     * The workers that work this day, the key is the work type and time, the value is the the worker.
     */
     Map<Job, Worker> Arrangement = new HashMap<Job, Worker>();


    void addJobs(int ini, int end, String type) {
        jobs.add(new Job(ini, end, type));
    }

    public ArrayList<Worker> getWorkers() {
        return workersToday;
    }

    /**
     * set the jobs that required on weekdays from Mon to
     */
    abstract void setJobs();

    /**
     * Get workers that available for today
     */
    abstract void collectWorkers();

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}






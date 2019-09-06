package System;

import System.Position.Position;
import System.WorkDay.WorkDay;
import System.Workers.Worker;

import java.util.ArrayList;

public class Manager {
    private ArrayList<WorkDay> week;

    private ArrayList<Worker> workers;

    /**
     * The method to add a position to a work day
     * @param start the start time of this position
     * @param end the end time of this position
     * @param type the type of this position
     * @param when add this position to which of of this week
     */
    public void setPositions(String start, String end, String type, WorkDay when){
        TimeInterval T = new TimeInterval(start, end);
        Position p = new Position(T, type);
        when.addPosition(p);
    }


    /**
     * The method for manager to delete a worker.
     */
    public void DeleteWorker(String name){
        ArrayList names = new ArrayList();
        for (Worker worker : workers) {
            names.add(worker.getName());
        }
        if (!names.contains(name)){
            System.out.printf("We do not have a worker called %s", name);
        }
        else {
            for (Worker worker : workers){
                if (name.equals(worker.getName())){
                    workers.remove(worker);
                }
            }
        }

    }

    /**
     * the method to get the available workers on the i-th of the week.
     * @param i indicates which day of the week
     * @return A collection of workers available on the i-th day of this week.
     */
    public ArrayList<Worker> getAvaWorker(int i){
        ArrayList<Position> PS = week.get(i-1).getPositions();
        for (Worker w : workers) {
            TimeInterval T = w.getTimeAvailable()[i-1];
            for (Position p : PS){
                if (TimeInterval.compareIntervals(T, p.getTime())){


                }
            }

        }

    }
}

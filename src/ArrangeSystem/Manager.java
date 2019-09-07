package ArrangeSystem;

import ArrangeSystem.Position.Position;
import ArrangeSystem.WorkDay.WorkDay;
import ArrangeSystem.Workers.Worker;

import java.util.ArrayList;
import java.util.Collections;


public class Manager {
    private ArrayList<WorkDay> week;

    private ArrayList<Worker> workers;

    /**
     * The method to add a position to a work day
     * @param start the start time of this position
     * @param end the end time of this position
     * @param type the type of this position
     * @param c the colour of this position on the final table
     * @param when add this position to which of of this week
     */
    public void setPositions(String start, String end, String type, String c,  WorkDay when){
        TimeInterval T = new TimeInterval(start, end);
        Position p = new Position(T, type, c);
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
     * the method to set the available workers on the i-th of the week.
     * @param i indicates which day of the week
     */
    public void setAvaWorker(int i){
        ArrayList<Position> PS = week.get(i-1).getPositions();
        ArrayList<Worker> all = new ArrayList<>(workers);
        ArrayList<Worker> ava = new ArrayList<>();
        for (Worker w : all) {
            TimeInterval T = w.getTimeAvailable()[i-1];
            for (Position p : PS){
                if (TimeInterval.compareIntervals(T, p.getTime())){
                    ava.add(w);
                    all.remove(w);
                }
            }
        }
        Collections.shuffle(ava);
        week.get(i-1).setWorkersToday(ava);
    }
}

package System.WorkDay;

import System.Position.Position;
import System.Workers.Worker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WorkDay {
    /*
     * Which day of this workday
     */
    String DayofWeek;

    /*
     * The date of this workday
     */
    String date;


    /*
     * The list of works that work this day, sorted in chronological order.
     * THe first worker of thus list opens
     */
    ArrayList<Worker> workersToday;

    /**
     * The jobs that this work day requires.
     */
    ArrayList<Position> positions;

    /**
     * The workers that work this day, the key is the work type and time, the value is the the worker.
     */
    Map<Position, Worker> Arrangement = new HashMap<Position, Worker>();


    /**
     * The method to add positions to this work day.
     */
    public void addPosition(Position p) {
        this.positions.add(p);
    }

    public String getDayofWeek() {
        return DayofWeek;
    }

    public void setDayofWeek(String dayofWeek) {
        DayofWeek = dayofWeek;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Worker> getWorkersToday() {
        return workersToday;
    }

    public void setWorkersToday(ArrayList<Worker> workersToday) {
        this.workersToday = workersToday;
    }

    public ArrayList<Position> getPositions() {
        return positions;
    }


    public Map<Position, Worker> getArrangement() {
        return Arrangement;
    }


}






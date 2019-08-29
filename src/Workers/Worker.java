package Workers;

import java.util.ArrayList;
import java.util.Objects;

public class Worker {
    /**
     * The name of this worker
     */
    private String name;

    /**
     * The time that the worker is available for work.
     */
    private ArrayList<Integer> TimeAvailable;

    /**
     * Whether this worker can open.
     */
    private boolean open;

    /**
     * Whether this worker can close.
     */
    private boolean close;

    /**
     * The Constructor of this worker
     * @param name
     */
    Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getTimeAvailable() {
        return TimeAvailable;
    }

    public void setTimeAvailable(ArrayList<Integer> timeAvailable) {
        TimeAvailable = timeAvailable;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isClose() {
        return close;
    }

    public void setClose(boolean close) {
        this.close = close;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return open == worker.open &&
                close == worker.close &&
                Objects.equals(name, worker.name) &&
                Objects.equals(TimeAvailable, worker.TimeAvailable);
    }

    @Override
    public String toString() {
        return this.name;
    }


}

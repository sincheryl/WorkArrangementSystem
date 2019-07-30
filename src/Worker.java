import java.util.ArrayList;

public class Worker {
    /**
     * The name of this worker
     */
    private String name;

    /**
     * The time that the worker is availiable for work.
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
     * @param timeAvailable
     */
    public Worker(String name, ArrayList<Integer> timeAvailable) {
        this.name = name;
        TimeAvailable = new ArrayList<>();
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
}

package ArrangeSystem.Workers;

import ArrangeSystem.TimeInterval;
import java.util.Objects;

public class Worker {
    /*
     * The name of this worker
     */
    private String name;

    /*
     * The time that the worker is available for work.
     */
    private TimeInterval[] TimeAvailable = new TimeInterval[7];

    /*
     * The number of days this worker worked this week.
     */
    private int DaysWorked;

    /*
     * The type of this worker, full time is "F" adn part time is "P"
     * F workers should work at least 5 days per week
     * P workers should work at least 3 days per week
     */
    private String type;

    /*
     * Whether this worker can open.
     */
    private boolean open;

    /*
     * Whether this worker can close.
     */
    private boolean close;

    /*
     * Whether this worker can checkout.
     */
    private boolean checkout;

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

    public TimeInterval[] getTimeAvailable() {
        return TimeAvailable;
    }

    public void setTimeAvailable(TimeInterval[] timeAvailable) {
        TimeAvailable = timeAvailable;
    }

    public int getDaysWorked() {
        return DaysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        DaysWorked = daysWorked;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public boolean isCheckout() {
        return checkout;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
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

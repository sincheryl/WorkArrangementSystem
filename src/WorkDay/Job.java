package WorkDay;


public class Job {
    /**
     * The time of ths WorkDay.
     */
    private double[] Time;

    /**
     * The type of this job
     *   - K: kitchen
     *   - S: shake
     *   - O: order
     *   - L: long
     */
    private String Type;

    Job(double[] time, String type) {
        Time = time;
        Type = type;
    }

    @Override
    public String toString(){
        return String.format("%f"+"-"+"%f"+"%s", Time[0], Time[1], this.Type);
    }
}

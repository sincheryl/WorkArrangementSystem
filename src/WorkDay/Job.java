package WorkDay;


public class Job {
    /**
     * The initial time of ths job.
     */
    private int ini;

    /**
     * The end time of this job.
     */
    private int end;

    /**
     * The type of this job
     *   - K: kitchen
     *   - S: shake
     *   - O: order
     *   - L: long
     */
    private String Type;

    public Job(int ini, int end, String type) {
        this.ini = ini;
        this.end = end;
        Type = type;
    }

    public double getIni() {
        return ini;
    }

    public void setIni(int ini) {
        this.ini = ini;
    }

    public double getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString(){
        return String.format("%i"+"-"+"%i"+"%s", ini, end, this.Type);
    }
}

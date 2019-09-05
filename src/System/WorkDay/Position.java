package System.WorkDay;

import System.TimeInterval;


public class Position {
    private TimeInterval Time;

    /**
     * The type of this job
     *   - K: kitchen
     *   - S: shake
     *   - O: order
     *   - L: long
     */
    private String Type;

    public Position(TimeInterval time, String type) {
        Time = time;
        Type = type;
    }

    public Position(int ini, int end, String type) {
    }


    public String getType() {
        return Type;
    }

    @Override
    public String toString(){
        return String.format("%i"+"-"+"%i"+"%s", Time.getStart(), Time.getEnd(), this.Type);
    }
}

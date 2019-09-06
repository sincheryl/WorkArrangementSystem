package System.Position;

import System.TimeInterval;


public class Position {
    /*
     * The time interval of this position.
     */
    private TimeInterval Time;

    /*
     * The type of this position
     */
    private String Type;

    /*
     * The colour to be presented on the table finally.
     */
    private String Colour;

    public Position(TimeInterval time, String type) {
        Time = time;
        Type = type;
    }


    public String getType() {
        return Type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;

        Position position = (Position) o;

        if (!Time.equals(position.Time)) return false;
        return Type.equals(position.Type);
    }


    @Override
    public String toString(){
        return String.format("%i"+"-"+"%i"+"%s", Time.getStart(), Time.getEnd(), this.Type);
    }

    public TimeInterval getTime() {
        return Time;
    }

    public void setTime(TimeInterval time) {
        Time = time;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }
}

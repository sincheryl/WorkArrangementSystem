public class TimeInterval {

    private int start, end;

    public TimeInterval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    /**
     * This method determines if the a time interval is the sub interval of another
     * @param intervalA a TimeInterval (available time of a worker)
     * @param intervalB another TimeInterval (job time interval)
     * @return true if intervalA is a sub interval of intervalB, false otherwise
     */
    public static Boolean compareIntervals(TimeInterval intervalA, TimeInterval intervalB) {
            return (intervalA.getStart() <= intervalB.getStart()
                    && intervalA.getEnd() >= intervalB.getEnd());
    }



    // ----------------- The following functions might be useful (or not) -----------------------

    /**
     * This is a helper method that parses the hour component of a time instant (start or end)
     * @param time a time instant
     * @return the hour component of time
     */
    private int getHour(int time) {
        return Integer.parseInt(String.valueOf(time).substring(0,2));
    }

    /**
     * This is a helper method that parses the minute component of a time instant (start or end)
     * @param time a time instant
     * @return the minute component of time
     */
    private int getMinute(int time) {
        return Integer.parseInt(String.valueOf(time).substring(2));
    }


    /**
     * This method validates the time interval
     * @return true if the time interval is valid, false otherwise
     */
    public boolean validate() {
        return validateHelper(start) && validateHelper(end) && (start <= end);
    }

    /**
     * This method is a helper function of validate(), which validates the time instants (start and end)
     * @param time time instants to be validated
     * @return true if time is a valid time instant, false otherwise
     */
    private boolean validateHelper(int time) {
        int minute = getMinute(time);
        return (time >= 0 && time <= 2400 && minute >= 0 && minute <= 59);
    }

    /**
     * This method calculates the length of time of the time interval in hours and minutes
     * @return a 2-element array with the first element as the number of hours
     *          and the second as the number of minutes
     */
    public int[] calculateLength() {
        int minutes = getMinute(end) - getMinute(start);
        int hours = getHour(end) - getHour(start);
        if (minutes < 0) {
            return new int[]{hours-1, minutes+60};
        }
        else {
            return new int[]{hours, minutes};
        }

    }

}

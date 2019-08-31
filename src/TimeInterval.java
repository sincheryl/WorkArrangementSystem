public class TimeInterval {

    // Decided to use string instead of int to avoid the cases when a time instant starts with 0's, e.g. 0930 -> 930
    private String start, end;

    public TimeInterval(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * This method determines if the a time interval is the sub interval of another
     * @param intervalA a TimeInterval (available time of a worker)
     * @param intervalB another TimeInterval (job time interval)
     * @return true if intervalB is a sub interval of intervalA, false otherwise
     */
    public static Boolean compareIntervals(TimeInterval intervalA, TimeInterval intervalB) {
            return (Integer.parseInt(intervalA.getStart()) <= Integer.parseInt(intervalB.getStart())
                    && Integer.parseInt(intervalA.getEnd()) >= Integer.parseInt(intervalB.getEnd()));
    }



    // ----------------- The following functions might be useful (or not) -----------------------

    /**
     * This is a helper method that parses the hour component of a time instant (start or end)
     * @param time a time instant
     * @return the hour component of time
     */
    private int getHourComponent(String time) {
        return Integer.parseInt(time.substring(0,2));
    }

    /**
     * This is a helper method that parses the minute component of a time instant (start or end)
     * @param time a time instant
     * @return the minute component of time
     */
    private int getMinuteComponent(String time) {
        return Integer.parseInt(time.substring(2));
    }


    /**
     * This method validates the time interval
     * @return true if the time interval is valid, false otherwise
     */
    public boolean validate() {
        return validateHelper(start) && validateHelper(end) && (Integer.parseInt(start) <= Integer.parseInt(end));
    }

    /**
     * This method is a helper function of validate(), which validates the time instants (start and end)
     * @param time time instants to be validated
     * @return true if time is a valid time instant, false otherwise
     */
    private boolean validateHelper(String time) {
        int minute = getMinuteComponent(time);
        int hour = getHourComponent(time);
        return (hour >= 0 && hour <= 24 && minute >= 0 && minute <= 59);
    }

    /**
     * This method calculates the length of time of the time interval in hours and minutes
     * @return a 2-element array with the first element as the number of hours
     *          and the second as the number of minutes
     */
    public int[] calculateLength() {
        int minutes = getMinuteComponent(end) - getMinuteComponent(start);
        int hours = getHourComponent(end) - getHourComponent(start);
        if (minutes < 0) {
            return new int[]{hours-1, minutes+60};
        }
        else {
            return new int[]{hours, minutes};
        }

    }

}

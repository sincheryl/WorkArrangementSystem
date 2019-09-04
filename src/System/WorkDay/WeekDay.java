package System.WorkDay;


public abstract class WeekDay extends WorkDay{
    /**
     * set the jobs that required on weekdays from Mon to Thu.
     */
    public void setJobs(){
        this.addJobs(11, 18, "K");
        this.addJobs(12, 18, "S");
        this.addJobs(12, 18, "O");
        this.addJobs(15, 21, "L");
        this.addJobs(18, 23, "K");
        this.addJobs(18, 23, "S");
        this.addJobs(18, 23, "O");
    }







}










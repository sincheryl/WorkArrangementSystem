package WorkDay;



public class WeekDay extends WorkDay{
    /**
     * set the jobs that required on weekdays
     */
    @Override
    public void setJobs(){
        double[] mk = {11,18};
        double[] m = {12,18};
        double[] l = {15,21};
        double[] nc = {18,23.5};
        double[] n = {18,23};
        jobs.add(new Job(mk, "K"));
        jobs.add(new Job(m, "S"));
        jobs.add(new Job(m, "O"));
        jobs.add(new Job(l, "L"));
        jobs.add(new Job(nc,"O"));
        jobs.add(new Job(nc,"S"));
        jobs.add(new Job(n, "K"));
    }

    /**
     * Not completed yet
     */
    @Override
    public void setWorkers() {
        for (Job j:jobs){
            Arrangement.put(j, null);
        }
    }
}

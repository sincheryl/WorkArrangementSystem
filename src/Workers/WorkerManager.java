package Workers;

import java.util.ArrayList;
import java.util.Collections;

public class WorkerManager {
    /**
     * All the worker in this store.
     */
    private ArrayList<Worker> WorkerList;

    /**
     * All workers should be randomly sorted in case that one worker do a same type of job too much times.
     * @return WorkerList
     */
    public ArrayList<Worker> getWorkerList() {
        Collections.shuffle(WorkerList);
        return WorkerList;
    }

    public void setWorkerList(ArrayList<Worker> workerList) {
        WorkerList = workerList;
    }

    /**
     * The Constructor of Workers.WorkerManager
     */
    public WorkerManager(ArrayList<Worker> workerList) {
        WorkerList = new ArrayList<>();
    }

    /**
     * The method for manager to create a worker and add to the list.
     */
    public void CreateWorker(String name) {
        WorkerList.add(new Worker(name));
    }

    /**
     * The method for manager to delete a worker.
     */
    public void DeleteWorker(String name){
        ArrayList names = new ArrayList();
        for (Worker worker : WorkerList) {
            names.add(worker.getName());
        }
        if (!names.contains(name)){
            System.out.printf("We do not have a worker called %s", name);
        }
        else {
            for (Worker worker : WorkerList){
                if (name.equals(worker.getName())){
                    WorkerList.remove(worker);
                }
            }
        }

    }


}

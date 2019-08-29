package Workers;

import java.util.ArrayList;

public class WorkerManager {
    /**
     * All the worker in this store.
     */
    private ArrayList<Worker> WorkerList;

    public ArrayList<Worker> getWorkerList() {
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
            return;
        }
        else {
            for (Worker worker : WorkerList){
                if (name == worker.getName()){
                    WorkerList.remove(worker);
                }
            }
        }

    }


}

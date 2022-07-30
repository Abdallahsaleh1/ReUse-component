import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class CalculationJobManager extends Thread implements jobManagerInterface {

//Object tempObj=null;
    int numberOfParallelJobs=2;
    public void run( Object tempObj ) {
            try {

                if(tempObj instanceof CalculationJob){
                    results.add(((CalculationJob) tempObj).run());
                } else if( tempObj instanceof PrintJob){
                    results.add(((PrintJob) tempObj).run());

                }


            }
            catch (Exception e) {
                // Throwing an exception
                System.out.println("Exception is caught");
            }

    }





    public void serveJobs(Object  job){

        jobs.add(job);
        int n =0;
        if(jobs.size() <= numberOfParallelJobs){
            n = jobs.size();
        } else{
            n = numberOfParallelJobs;
        }
        for (int i = 0; i< n; i++){
            this.run(jobs.poll());

        }

    }

    public void setNumberOfParallelJobs(int num){
        this.numberOfParallelJobs = num;
    }

    public void getResults(){
            System.out.println(results);

    }
}

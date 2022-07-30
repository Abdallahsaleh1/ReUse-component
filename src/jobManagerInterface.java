import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public interface jobManagerInterface {
    Queue<Object> jobs = new LinkedList<>();
    ArrayList<Object> results = new ArrayList<>();
    void serveJobs(Object job);

    void setNumberOfParallelJobs(int num);

    void getResults();









}

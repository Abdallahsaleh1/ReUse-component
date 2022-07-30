public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CalculationJobManager manager= new CalculationJobManager();

        CalculationJob add = new CalculationJob();
        CalculationJob add2 = new CalculationJob();
        CalculationJob add3 = new CalculationJob();

        PrintJob print = new PrintJob();
        manager.serveJobs(add);
        manager.serveJobs(add2);
        manager.serveJobs(add3);
        manager.serveJobs(add);

        manager.serveJobs(add);

        manager.serveJobs(add);

        manager.serveJobs(add);
        manager.serveJobs(add);
        manager.serveJobs(print);

        manager.getResults();

    }
}
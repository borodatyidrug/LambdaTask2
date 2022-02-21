package lamdatask2;

public class LamdaTask2 {

    public static void main(String[] args) {
        // TODO code application logic here
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener
                = () -> System.out.println("Task completed with error!");
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
    
}

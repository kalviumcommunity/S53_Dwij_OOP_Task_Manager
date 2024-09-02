import core.*;

public class Main {
    public static void main(String[] args){
        TaskManager taskManager = new TaskManager();
        Task workTask = new WorkTask("Complete milestone","Complete the oops project before CA","2024-09-13",1);
        taskManager.addTask(workTask);
        taskManager.displayTaskDetail();
    }
}

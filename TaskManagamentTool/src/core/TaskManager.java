package core;
import java.util.*;

public class TaskManager {
    private List<Task> tasks;
    public TaskManager(){
        this.tasks = new ArrayList<>(); 
       }
    public void addTask(Task task){
        tasks.add(task);
    }
    public void displayTaskDetail(){
        for(Task task:tasks){
            task.displayTaskDetail();
            System.out.println("------------------");
        }
    }
    
}

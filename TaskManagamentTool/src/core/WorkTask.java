package core;

public class WorkTask extends Task {
    public WorkTask(String title,String description,String deadline,int priority){
        super(title, description, description, priority);
    }
    public void displayTaskDetail(){
        System.out.println("[Work Task]");
        super.displayTaskDetail();
    }
}

package core;

public class PersonalTask extends Task {
    public PersonalTask(String title,String description,String deadline,int priority){
        super(title, description, description, priority);
    }
    public void displayTaskDetail(){
        System.out.println("[Work Task]");
        super.displayTaskDetail();
    }
}

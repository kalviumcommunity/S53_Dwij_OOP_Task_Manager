package core;

public class PersonalTask extends Task {
    public PersonalTask(String title,String description,String deadline,int priority){
        super(title, description, description, priority);
    }
    public void displayTaskDetail(){
        System.out.println("[Personal Task]");
        super.displayTaskDetail();
    }
    public void sendReminder() {
        System.out.println("Reminder: Complete your personal task '" + getTitle() +"' by " + getDeadline());
    }
}

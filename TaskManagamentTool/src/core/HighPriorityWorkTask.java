package core;

public class HighPriorityWorkTask extends WorkTask {
    private String alertMessage;

    public HighPriorityWorkTask(String title, String description, String deadline, int priority, String projectName, String alertMessage) {
        super(title, description, deadline, priority, projectName);
        this.alertMessage = alertMessage;
    }

    public void displayTaskDetail() {
        super.displayTaskDetail();
        System.out.println("Alert: " + alertMessage);
    }
}

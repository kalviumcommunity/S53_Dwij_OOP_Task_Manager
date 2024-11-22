package core;

public class HighPriorityWorkTask extends WorkTask {
    private String priorityMessage;

    public HighPriorityWorkTask(String title, String description, String deadline, int priority, String priorityMessage) {
        super(title, description, deadline, priority);
        this.priorityMessage = priorityMessage;
    }

    public String getPriorityMessage() {
        return priorityMessage;
    }

    public void setPriorityMessage(String priorityMessage) {
        this.priorityMessage = priorityMessage;
    }

    @Override
    public void displayTaskDetail() {
        super.displayTaskDetail();
        System.out.println("Priority Message: " + priorityMessage);
    }
}

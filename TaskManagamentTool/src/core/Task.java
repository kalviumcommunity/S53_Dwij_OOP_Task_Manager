package core;
public class Task {
    private String title;
    private String description;
    private String deadline;
    private int priority;
    private int taskId;
    private static int taskCount = 0;
    private static int nextTaskID = 1;

    // Default Constructor
    public Task() {
        this.title = "Untitled";
        this.description = "No Description";
        this.deadline = "No Deadline";
        this.priority = 0;
        taskCount++;
    }

    // Parameterized Constructor
    public Task(String title, String description, String deadline, int priority) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
        taskCount++;
    }
    // Simplified Constructor - Only title and priority; assigns default values to others
    public Task(String title, int priority) {
        this(title, "No description provided", "No deadline specified", priority);
    }
    
    public static int getTaskCount(){
            return taskCount;
    }
    public int getTaskId(){
        return taskId;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setDescription(String description){
        this.description= description;
    }
    public String getDescription(){
        return description;

    }
    public void setDeadline(String deadline){
        this.deadline = deadline;
    }
    public String getDeadline(){
        return deadline;
    }
    public void setPriority(int priority){
        this.priority = priority;
    }
    public int getPriority(){
        return priority;
    }
    public void displayTaskDetail(){
        System.out.println("Task ID: "+taskId);
        System.out.println("Task: "+title+"\nDescription: "+description+"\nDeadline: "+deadline+"\nPriority: "+priority);
    }
    
}

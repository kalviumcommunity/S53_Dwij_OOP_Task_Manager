package core;
public class Task {
    private String title;
    private String description;
    private String deadline;
    private int priority;

    public Task(String title,String description,String deadline, int priority){
        this.title= title;
        this.description = description;
        this.deadline= deadline;
        this.priority = priority;   
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
        System.out.println("Task:"+title+"\nDescription"+description+"\nDeadline"+deadline+"\nPriority"+priority);
    }
    
}

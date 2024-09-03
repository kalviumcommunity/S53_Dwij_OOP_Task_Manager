import core.*;

public class Main {
    public static void main(String[] args){
        // creating a task manager for the application which will keep a record of all the task created
        TaskManager taskManager = new TaskManager();
        // creating a work task demo 
        Task workTask = new WorkTask("Complete milestone","Complete the oops project before CA","2024-09-13",1);
        taskManager.addTask(workTask);
        //displaying the task stored inside the task manager 
        taskManager.displayTaskDetail();

        //initializing a task array to showcase the array of object concept 
        Task[] tasks = new Task[3];

        //Creating sample object to add inside the array
        tasks[0]= new Task("Car wash","Take the car out ot get a car wash","2024-09-08",2);
        tasks[1]= new Task("Doctor appointment","Go to the doctor to get your regular checkup","2024-09-05",1);
        tasks[2]= new Task("Shopping grosseries","go out to buy vegitables and fruits","2024-09-10",3);

        for(Task task:tasks){
            task.displayTaskDetail();
            System.out.println("-----------------------");
        }


    }
}
import core.*;

public class Main {
    public static void main(String[] args) {
        // Create a TaskManager instance
        TaskManager taskManager = new TaskManager();

        // Create and add a WorkTask
        Task workTask1 = new WorkTask("Complete milestone", "Complete the OOP project before CA", "2024-09-13", 1);
        taskManager.addTask(workTask1);

        // Display task details from TaskManager
        taskManager.displayTaskDetail();

        // Create a second WorkTask
        Task workTask2 = new WorkTask("Prepare Report", "Annual financial report", "2024-10-20", 2);
        workTask2.displayTaskDetail();
        workTask2.sendReminder();

        System.out.println();

        // Create a PersonalTask
        Task personalTask = new PersonalTask("Grocery Shopping", "Buy weekly groceries", "2024-10-15", 1);
        personalTask.displayTaskDetail();
        personalTask.sendReminder();

        // Array of Tasks
        Task[] tasks = new Task[5];
        tasks[0] = new WorkTask("Car wash", "Take the car out for a wash", "2024-09-08", 2);
        tasks[1] = new PersonalTask("Doctor appointment", "Go for a regular checkup", "2024-09-05", 1);
        tasks[2] = new PersonalTask("Shopping groceries", "Buy vegetables and fruits", "2024-09-10", 3);
        tasks[3] = new WorkTask("Gym Workout", "Go to the gym for a workout session", "2024-09-06", 4);
        tasks[4] = new WorkTask("Finish Project Report", "Complete and submit the project report", "2024-09-07", 5);

        // Create a HighPriorityWorkTask
        HighPriorityWorkTask highPriorityWorkTask = new HighPriorityWorkTask("Finish Urgent Report", "Urgent financial report", "2024-10-15", 1, "High Priority: Complete ASAP!");
        System.out.println("\nHigh Priority Work Task Details:");
        highPriorityWorkTask.displayTaskDetail();
        System.out.println();

        // Display all tasks
        for (Task task : tasks) {
            task.displayTaskDetail();
            System.out.println("-----------------------");
        }
        System.out.println("Total tasks created: " + Task.getTaskCount());
    }
}

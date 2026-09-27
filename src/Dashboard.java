import java.util.ArrayList;

public class Dashboard {

    private ArrayList<Task> tasks;

    public Dashboard() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void printTasks() {
        if (this.tasks.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }

        int counter = 1;

        for (Task task : this.tasks) {

            if (task.isCompleted()) {
                System.out.println(counter + ". [x] " + task.getName()
                        + " - " + task.getPriority());
            } else {
                System.out.println(counter + ". [ ] " + task.getName()
                        + " - " + task.getPriority());
            }

            counter++;
        }
    }

    public void completeTask(int taskNumber) {
        if (taskNumber < 1 || taskNumber > this.tasks.size()) {
            System.out.println("Invalid task number");
            return;
        }

        Task task = this.tasks.get(taskNumber - 1);
        task.complete();
    }

    public void removeTask(int taskNumber) {
        if (taskNumber < 1 || taskNumber > this.tasks.size()) {
            System.out.println("Invalid task number");
            return;
        }

        this.tasks.remove(taskNumber - 1);
    }
}
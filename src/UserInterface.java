import java.util.Scanner;

public class UserInterface {

    private Dashboard dashboard;
    private Scanner scanner;

    public UserInterface(Dashboard dashboard, Scanner scanner) {
        this.dashboard = dashboard;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Enter a task name: ");
            String taskName = scanner.nextLine();

            if (taskName.equals("quit")) {
                break;
            }
            Task task = new Task(taskName);
            dashboard.addTask(task);
            dashboard.printTasks();
        }

    }
}

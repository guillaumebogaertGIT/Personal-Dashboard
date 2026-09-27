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

            System.out.println("1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Complete task");
            System.out.println("4. Remove task");
            System.out.println("0. Exit");
            String command = scanner.nextLine();

            if (command.equals("0")) {
                break;
            }

            if (command.equals("1")) {
                while (true) {
                    System.out.println("Enter a task name (back to return to menu):");
                    String taskName = scanner.nextLine();

                    if (taskName.trim().isEmpty()) {
                        System.out.println("Task name cannot be empty.");
                        continue;
                    }

                    if (taskName.equals("back")) {
                        break;
                    }

                    System.out.println("Priority (LOW/MEDIUM/HIGH):");
                    String priority = scanner.nextLine();

                    Task task = new Task(taskName, priority);
                    dashboard.addTask(task);
                }
            }

            if (command.equals("2")) {
                dashboard.printTasks();
            }

            if (command.equals("3")) {
                dashboard.printTasks();

                System.out.println("Which task number do you want to complete?");
                try {
                    int taskNumber = Integer.valueOf(scanner.nextLine());
                    dashboard.completeTask(taskNumber);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a whole number.");
                }
            }

            if (command.equals("4")) {
                dashboard.printTasks();
                System.out.println("Which task number do you want to remove?");

                try {
                    int taskNumber = Integer.valueOf(scanner.nextLine());
                    dashboard.removeTask(taskNumber);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a whole number.");
                }
            }
        }
    }
}
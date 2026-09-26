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
            } else if (command.equals("1")) {
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

                    Task task = new Task(taskName);
                    dashboard.addTask(task);
                }
            } else if (command.equals("2")) {
                dashboard.printTasks();
            } else if (command.equals("3")) {
                dashboard.printTasks();
                
                System.out.println("Which task number do you want to complete?");
                try {
                    int taskNumber = Integer.valueOf(scanner.nextLine());
                    dashboard.completeTask(taskNumber);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a whole number.");
                }
            } else if (command.equals("4")) {
                dashboard.printTasks();
                System.out.println("Which task number do you want to remove?");

                try {
                    int taskNumber = Integer.valueOf(scanner.nextLine());
                    dashboard.removeTask(taskNumber);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a whole number.");
                }
            } else {
                System.out.println("Unknown command.");
            }
        
        }

    }
}

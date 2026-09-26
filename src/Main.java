public class Main {
    public static void main(String[] args) {

        Dashboard dashboard = new Dashboard(); 

        Task walk = new Task("Go for walk");
        dashboard.addTask(walk);
        Task grocery = new Task("Buy Groceries");
        dashboard.addTask(grocery);
        dashboard.completeTask(2);
        dashboard.completeTask(3);
        dashboard.completeTask(0);
        dashboard.removeTask(1);

        dashboard.printTasks();
        

        
        
    }
}

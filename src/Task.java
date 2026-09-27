public class Task {

    
    private String name;
    private boolean completed;
    private String priority;

    public Task(String name, String priority) {
        this.name = name;
        this.completed = false;
        this.priority = priority;
    }

    public String getName() {
        return this.name;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public void complete() {
        this.completed = true;
    }

    public String getPriority() {
        return this.priority;
    }


}

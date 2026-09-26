import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dashboard dashboard = new Dashboard(); 
        UserInterface userInterface = new UserInterface(dashboard, scanner);
        userInterface.start();

       
        

        
        
    }
}

import java.util.*;
public class Main {
    public static void main(String[] args) {
        boolean end = false;
        Scanner S1 = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        while (end != true) {
            System.out.println("Welcome to Task Manager!");
            System.out.println("1. List tasks");
            System.out.println("2. Add task");
            System.out.println("3. Mark Complete");
            System.out.println("4. Delete task");
            System.out.println("5. Exit");
            System.out.println("Enter an integer of your choice: \n");
            int choice = S1.nextInt();
                S1.nextLine(); 
        
                if(choice==1){
                    taskManager.listTasks();
                }
                else if(choice==2){
                    System.out.print("Enter a new task: ");
                    String content = S1.nextLine();
                    taskManager.addTask(content);
                        System.out.println("Task added. \n");
                }
                else if(choice==3){
                    System.out.print("Enter the number of the completed task: ");
                    int CT = S1.nextInt();
                    S1.nextLine();
                    System.out.println("Task marked as complete. \n");
                    taskManager.completeTask(CT);
                }
                else if(choice==4){
                    System.out.print("Which task would you like to delete: ");
                    int DI = S1.nextInt();
                    S1.nextLine();
                    taskManager.deleteTask(DI);
                        System.out.println("Task deleted. \n");
                }
                else if(choice==5){
                    end = true;
                    System.out.println("Exiting Task Manager. Goodbye!");
                }
                else{
                    System.out.println("Invalid choice. Please try again.");
                }
            
            
        }
   S1.close(); }
        
}
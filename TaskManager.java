
import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks= new ArrayList<Task>();
    public TaskManager(){
        this.tasks=new ArrayList<Task>();
    }
    public void listTasks(){
        for(int i=0;i<tasks.size();i++){
            Task task=tasks.get(i);
            boolean status=task.getStatus();
            if(status){
                System.out.println((i+1)+" [x] "+task.getContent());
            }
            else{
                System.out.println((i+1)+" [ ] "+task.getContent());
            }
        }
    }
    public void addTask(String content){
        Task task=new Task(content);
        tasks.add(task);
    }
    public void completeTask(int index){
        tasks.get(index-1).setStatus(true);
    }
    public void deleteTask(int index){
        tasks.remove(index-1);
    }

    
}
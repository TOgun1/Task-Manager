public class Task {
   private  boolean status=false;
   private String content="";
    public Task(String content){
         this.content=content;
         this.status=false;
    }

    public boolean getStatus() {
        return status;
    }
    public String getContent() {
        return content;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void setContent(String content) {
        this.content = content;
    }
}

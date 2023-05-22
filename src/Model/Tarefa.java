package Model;

public class Tarefa {

    private String Title;
    private String Description;
    private int Id;
    private boolean done;

    public Tarefa(){

        
    }
    public Tarefa(String title, String description, int id, boolean done) {
        Title = title;
        Description = description;
        Id = id;
        this.done = done;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public boolean isDone() {
        return done;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
    
}

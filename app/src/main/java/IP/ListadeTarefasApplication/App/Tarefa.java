
package IP.ListadeTarefasApplication.App;


public class Tarefa {
    private String id;
    private String title;
    private String text;
    
    public String getId(){
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getText(){
        return text;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setText (String text){
        this.text = text ;
    }
    
    public static Tarefa buildTarefa(String id, String title, String text) {
        Tarefa tarefa = new Tarefa();
        
        tarefa.setId(id);
        tarefa.setTitle(title);
        tarefa.setText(text);
        
        return tarefa;
    }
    
    @Override
    public String toString() {
        return id + title  + text;
    }
}

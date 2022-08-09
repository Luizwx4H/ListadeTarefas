
package IP.ListadeTarefasApplication.Features;
import IP.ListadeTarefasApplication.App.*;

public class MostrarTarefas extends Opções {
    
    @Override
    public void mostrarinfoopções(){
        System.out.println("");
        System.out.println("Aqui estão todas as Tarefas: ");
    }
    
    @Override 
    public String leruserinput(){
        throw new UnsupportedOperationException("Esta operação não é suportada.");
    }
    
    @Override
    public void executaropção(String command){
        ListadeTarefas.tarefas.forEach((key, tarefa)->{
             System.out.println( key + tarefa.getTitle() + tarefa.getText());
        
        });
        
    }
}


package ListadeTarefas;
import IP.ListadeTarefasApplication.App.Tarefa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TarefaTest {
     
    @Test 
    public void getID(){
        Tarefa tarefa = new Tarefa();
        tarefa.setId("1");
        String expected = "1";
        assertEquals (expected, tarefa.getId());
    }
    
    @Test
    public void getTitle(){
        Tarefa tarefa = new Tarefa();
        tarefa.setId("1");
        String expected = "1";
        assertEquals(expected, tarefa.getId());
    }   
    @Test
    public void getText(){
        Tarefa tarefa = new Tarefa();
        tarefa.setId("1");
        String expected = "1";
        assertEquals (expected, tarefa.getId());
    }
}


package IP.ListadeTarefasApplication.Features;


public abstract class Opções {
    public static final int ADD_TAREFA = 1;
    public static final int EDITAR_TAREFA = 2;
    public static final int REMOVER_TAREFA = 3;
    public static final int MOSTRAR_TAREFAS = 4;
    public static final int SALVAR_TAREFAS = 5;
    public static final int LER_TAREFAS = 6;
    public static final int SAIR = 7;
    
    public abstract void mostrarinfoopções();
    
    public abstract String leruserinput();
    
    public abstract void executaropção(String comando);
    
}

package IP.ListadeTarefasApplication.Features;
import IP.ListadeTarefasApplication.App.*;
import java.util.Scanner;


public class RemoverTarefa extends Opções {
     
    @Override
    public void mostrarinfoopções (){
        System.out.println("");
        System.out.println("Para remover uma tarefa, coloque o ID e pressione ENTER");
        System.out.println("");
        System.out.println("Coloque 0 para RETORNAR");
    }
    
    @Override 
    public String leruserinput(){
        while(true){
            System.out.println("");
            System.out.println("Coloque o ID:");
            Scanner in = new Scanner(System.in);
            try {
                String userinput = in.nextLine();
                int userinputasnum = Integer.parseInt(userinput);
                if (userinputasnum != 0){
                    Tarefa tarefa = ListadeTarefas.tarefas.get(userinput);
                    if (tarefa != null){
                        return userinput;
                    } else {
                        System.out.println("ID não existe, tente outro ID:");
                    }
                } else{
                    return userinput;
                }
                
            } catch (Exception err){
                        System.out.println("Coloque um ID válido ou aperte 0 para Retornar");
                        }
            
        }
    }
    
    @Override
    public void executaropção(String comando){
        ListadeTarefas.tarefas.remove(comando);
        System.out.println("Tarefa removida");
    }
}

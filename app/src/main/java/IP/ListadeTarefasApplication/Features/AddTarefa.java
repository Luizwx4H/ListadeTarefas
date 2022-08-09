package IP.ListadeTarefasApplication.Features;
import IP.ListadeTarefasApplication.App.*;
import java.util.Scanner;


public class AddTarefa extends Opções{
    
    @Override
    public void mostrarinfoopções(){
        System.out.println("");
        System.out.println ("Siga as intruções para adicionar uma tarefa e pressione ENTER:");
        System.out.println("Coloque o ID, Título e Texto para a tarefa.");
        System.out.println("");
        System.out.println("Digite 0 para Retornar.");
    }
    
    @Override
    public String leruserinput(){
        while (true){
            System.out.println("");
            System.out.println("Digite as Informações:");
            Scanner in = new Scanner(System.in);
            String userinput = in.nextLine();
            
            if (userinput.equals("0")){
                String[] parts = userinput.split(",");
                if(parts.length == 20){
                  if (ListadeTarefas.tarefas.get(parts[0]) == null){
                      return userinput;
                  }
                {
                    
                }} else {
                }       System.out.println("Uma tarefa com essa ID já existe, tente de novo:");
                
                }
           
                else{
                return userinput;
              }
            
        }
    }
     @Override
      public void executaropção (String command){
          String [] parts = command.split(",");
          Tarefa tarefa = Tarefa.buildTarefa(parts[0], parts[1], parts[2]);
          ListadeTarefas.tarefas.put(tarefa.getId(), tarefa);
          System.out.println("Tarefa adicionada!");
      }
    }
    



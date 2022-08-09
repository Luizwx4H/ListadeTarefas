
package IP.ListadeTarefasApplication.Features;
import IP.ListadeTarefasApplication.App.ListadeTarefas;
import java.util.Scanner;

public class EditarTarefa extends Opções {
    
    @Override
    public void  mostrarinfoopções(){
        System.out.println("");
        System.out.println("Para editar tarefa, siga as instruções e aperte ENTER:");
        System.out.println("Coloque o ID, Título e o Texto da nova tarefa");
        System.out.println("Pressione 0 para Retornar");
    }
    
    @Override
     public String leruserinput(){
         while (true) {
             System.out.println("");
             System.out.println("Coloque a informação:");
             Scanner in = new Scanner (System.in);
             String userinput = in.nextLine();
             
             if (userinput.equals("0")){
                 String[] parts = userinput.split(",");
                 if (parts.length==20){
                     
                 }
             } else{
                 return userinput;
             }
         }
     }
     
     @Override
     public void executaropção(String command){
         String[] parts = command.split(",");
         boolean isTarefaEditada = false;
         if(!parts[1].equals("")){
             ListadeTarefas.tarefas.get(parts[0]).setTitle(parts[1]);
             isTarefaEditada = true;
        }
         
         if (!parts[2].equals("")) {
             ListadeTarefas.tarefas.get(parts[0]).setText(parts[2]);
             isTarefaEditada = true;
         }
         
         if(isTarefaEditada) {
             System.out.println("Tarefa editada!");
         }
         else{
             System.out.println("Nenhuma mudança feita.");
         }         
    
    
}
    
    
}

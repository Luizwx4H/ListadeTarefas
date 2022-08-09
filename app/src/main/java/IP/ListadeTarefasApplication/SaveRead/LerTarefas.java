
package IP.ListadeTarefasApplication.SaveRead;
import IP.ListadeTarefasApplication.App.*;
import IP.ListadeTarefasApplication.Features.Opções;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerTarefas extends Opções {
    @Override
    public void mostrarinfoopções(){
    System.out.println("");
    System.out.println("Coloque um local para ler:");
    System.out.println("");
    System.out.println("Digite 0 para Retornar");
}
    @Override
    public String leruserinput(){
        while(true){
            System.out.println("");
            System.out.println("local:");
            
            Scanner scan = new Scanner(System.in);
            String userinput = scan.nextLine();
            return userinput;
        }
    }
    
    @Override
    public void executaropção(String path){
        try{
            Scanner scanner = new Scanner(new File(path));
            while(scanner.hasNextLine()){
                String file = scanner.nextLine();
                String[] parts = file.split(",");
                Tarefa tarefa = Tarefa.buildTarefa(parts[0], parts[1], parts[2]);
                if (ListadeTarefas.tarefas.get(parts[0])!= null){
                    ListadeTarefas.tarefas.replace(parts[0], tarefa);
                } else {
                    ListadeTarefas.tarefas.put(parts[0], tarefa);
                }
            }
            scanner.close();
            System.out.println("As Tarefas estão sendo lidas!");
            
        } catch(FileNotFoundException e) {
            System.out.println("O local ou arquivo não existe");
        }
    }
    
    
}

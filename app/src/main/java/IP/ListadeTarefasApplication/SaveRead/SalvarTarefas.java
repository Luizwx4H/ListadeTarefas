
package IP.ListadeTarefasApplication.SaveRead;
import IP.ListadeTarefasApplication.App.ListadeTarefas;
import IP.ListadeTarefasApplication.Features.Opções;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SalvarTarefas extends Opções {
    
    @Override
    public void mostrarinfoopções(){
        System.out.println("");
        System.out.println("Coloque uma local para o arquivo:");
        System.out.println("");
        System.out.println("Digite 0 para Retornar");
    }
    
    @Override
    public String leruserinput(){
        while(true){
            System.out.println("");
            System.out.println("local:");
            Scanner scan = new Scanner (System.in);
            String userinput = scan.nextLine();
            return userinput;
        }
    }
    
    @Override 
    public void executaropção(String path){
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(path));
            List<String> lines = ListadeTarefas.tarefas.entrySet().stream().map(entry->entry.getValue().toString()).collect(Collectors.toList());
        lines.forEach((line)->{
            pw.println(line);
        }
        
        );
        
        pw.close();
        System.out.println("Tarefa salva no arquivo" + path);
        } catch (FileNotFoundException e){
            System.out.println("Local ou arquivo não existe");
        }
    }
}

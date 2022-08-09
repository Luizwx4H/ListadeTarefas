package IP.ListadeTarefasApplication.App;
import IP.ListadeTarefasApplication.Features.*;
import IP.ListadeTarefasApplication.SaveRead.*;
import java.util.*;


public class ListadeTarefas {
    public static Map<String, Tarefa> tarefas = new LinkedHashMap<>();
    public static boolean applicationRunning = true;
      public void inicio(){
        mostrartitulodoapp();
        while (ListadeTarefas.applicationRunning){
            mostraropçõesdisponiveis();
            int numopção = leropção();
            executaropção(numopção);
        }
    }
    public void executaropção (int numopção){
        Opções opção;
        switch (numopção){
            case Opções.ADD_TAREFA:
                opção = new AddTarefa();
                opção.mostrarinfoopções();
                String command = opção.leruserinput();
                if (!command.equals ("0"))
                    opção.executaropção(command);
                break;
            case Opções.EDITAR_TAREFA:
                if (tarefas.size() > 0) {
                    opção = new EditarTarefa();
                    opção.mostrarinfoopções();
                    String editCommand = opção.leruserinput();
                    if (!editCommand.equals(0))
                        opção.executaropção (editCommand);
                    } else {
                    System.out.println("Sua lista está vazia, adicione uma tarefa primeiro");
                }
                case Opções.REMOVER_TAREFA:
                if (tarefas.size() > 0){
                    opção = new RemoverTarefa();
                    opção.mostrarinfoopções();
                    String id = opção.leruserinput();
                    if (!id.equals("0"))
                        opção.executaropção(id);
                } else {
                    System.out.println("Sua Lista está vazia, adicione uma tarefa primeiro");
                }
                break;
                case Opções.MOSTRAR_TAREFAS:
                    if (tarefas.size() > 0) {
                        opção = new MostrarTarefas();
                        opção.mostrarinfoopções();
                        opção.executaropção(null);
                } else {
                        System.out.println("Sua lista está vazia, adicione uma tarefa primeiro");
                    }
                case Opções.SALVAR_TAREFAS:
                    if (tarefas.size() > 0){
                    opção = new SalvarTarefas();
                    opção.mostrarinfoopções();
                    String path = opção.leruserinput();
                    if (!path.equals("0"))
                        opção.executaropção (path);
                    } else {
                        System.out.println("Não há tarefas para salvar");
                    }
                    break;
                case Opções.LER_TAREFAS:
                    opção = new LerTarefas();
                    opção.mostrarinfoopções();
                    String path = opção.leruserinput();
                    if (!path.equals("0"))
                        opção.executaropção (path);
                    break;
                case Opções.SAIR:
                    applicationRunning = false;
                    break;
            }
    }
    public void mostrartitulodoapp(){
     System.out.println("Lista de Tarefas");
     System.out.println("---------------");
 }
    public void mostraropçõesdisponiveis(){
        System.out.println("");
        System.out.println("1. Adicionar uma tarefa");
        System.out.println("2. Editar uma tarefa");
        System.out.println("3. Excluir uma tarefa");
        System.out.println("4. Mostrar tarefas");
        System.out.println("5. Salvar tarefas");
        System.out.println("6. Ler tarefas");
        System.out.println("7. Sair");
    }
    public int leropção(){
        List<Integer> opçõesdisponiveis = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        while (true){
            try {
                System.out.println("Escolha uma opção: ");
                Scanner scan = new Scanner (System.in);
                int opção = scan.nextInt();
                if (opçõesdisponiveis.contains(opção)){
                    return opção; 
                } else {
                    System.out.println("Coloque uma opção válida");
                }
                
            } catch (Exception e) {
                System.out.println("A opção precisa ser um número");
            }
        }
    }
} 

 
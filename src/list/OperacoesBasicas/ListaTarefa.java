package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaDeTarefas;
    public ListaTarefa() {
        this.listaDeTarefas = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){

        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : listaDeTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        listaDeTarefas.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalDeTarefas(){
        return listaDeTarefas.size();
    }
    public void obterDescricoesDasTarefas(){
        System.out.println(listaDeTarefas);

    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 4");
        listaTarefa.adicionarTarefa("Tarefa 4");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());
        listaTarefa.removerTarefa("Tarefa 4");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());
        listaTarefa.obterDescricoesDasTarefas();


    }
}

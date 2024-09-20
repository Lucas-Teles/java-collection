package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaDeTarefas;
    public listaDeTarefas() {
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
}

package leandro.dev.gestao_obras.enums;

public enum StatusChecklistItem {
    PENDENTE("Pendente"),
    EM_AMDAMENTE("Em andamento"),
    CONCLUIDO("Concluido"),
    COM_PROBLEMAS("Com problemas");

    private final String descricao;

    StatusChecklistItem(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}

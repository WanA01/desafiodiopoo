package br.com.dio.desafio.dominio;

public abstract class Conteudo{

    protected static final double XP_PADRAO = 10d;

    private String TITULO;
    private String DESCRICAO;

    public abstract double calcularXP();

    public String getTITULO() {
        return TITULO;
    }

    public void setTITULO(String TITULO) {
        this.TITULO = TITULO;
    }

    public String getDESCRICAO() {
        return DESCRICAO;
    }

    public void setDESCRICAO(String DESCRICAO){
        this.DESCRICAO = DESCRICAO;
    }
}


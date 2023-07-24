package br.com.alura.vocemusica.models;

public class Podcasts extends Audios {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }
}

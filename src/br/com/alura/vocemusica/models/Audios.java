package br.com.alura.vocemusica.models;

public class Audios {
    /* criando a superclasse que todas as outras irão herdar e seus atributos e métodos que todos
    terão (escrevendo a regra de negocio);
     */
    private String titulo;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private int classificacao;

    public void curte () {
        this.totalDeCurtidas++;
    }

    public void reproduz () {
        this.totalDeReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public void setTotalDeCurtidas(int totalDeCurtidas) {
        this.totalDeCurtidas = totalDeCurtidas;
    }

    public int getClassificacao() {
        return classificacao / 5;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
}

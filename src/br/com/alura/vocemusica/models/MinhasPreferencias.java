package br.com.alura.vocemusica.models;

public class MinhasPreferencias {
    public void inclue (Audios audio){
        if (audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " é considerado bom por todos!");
        } else {
            System.out.println(audio.getTitulo() + " é considerado mediano em geral");
        }
    }

}

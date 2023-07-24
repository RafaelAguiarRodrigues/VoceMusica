import br.com.alura.vocemusica.models.MinhasPreferencias;
import br.com.alura.vocemusica.models.Musicas;

public class Main {
    public static void main(String[] args) {
        // criando a musica e instanciando do objeto
        Musicas Faded = new Musicas();
        // populando os campos do objeto / musica
        Faded.setAlbum("Faded Remixes");
        Faded.setArtista("Alan Walker");
        Faded.setGenero("Dance/Eletronica");
        // precisei avaliar multiplas vezes pra pegar a classificacao
        Faded.setClassificacao(9);
        Faded.setTitulo("Faded");
        Faded.setTotalDeCurtidas(1000);
        Faded.setTotalDeReproducoes(10000);

        // imprimindo e conferindo se tudo ta certo
        System.out.println(Faded.getTitulo());
        System.out.println(Faded.getArtista());

        // testando metodos
        for (int i = 0; i < 234; i++) {
            Faded.curte();
        }
        for (int i = 0; i < 922; i++) {
            Faded.reproduz();
        }
        System.out.println(Faded.getTotalDeCurtidas());
        System.out.println(Faded.getTotalDeReproducoes());

        // testando o objeto minhaspreferencia
        MinhasPreferencias preferencias = new MinhasPreferencias();
        preferencias.inclue(Faded);
    }
}
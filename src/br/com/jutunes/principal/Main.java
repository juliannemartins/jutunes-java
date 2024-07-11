package br.com.jutunes.principal;
import br.com.jutunes.modelos.MinhasPreferidas;
import br.com.jutunes.modelos.Musica;
import br.com.jutunes.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        //musica
        Musica lover = new Musica();
        lover.setTitulo("Lover");
        lover.setCantor("Taylor Swift");

        //simulação de reprodução da música
        for (int i = 0; i < 1000; i++){
            lover.reproduz();
        }

        //simulação de curtida da música
        for (int i = 0; i < 50; i++){
            lover.curte();
        }

        //podcast
        Podcast podPAH = new Podcast();
        podPAH.setTitulo("PodPAH");
        podPAH.setApresentador("Igão e Mítico");

        for (int i = 0; i < 2000; i++){
            podPAH.reproduz();
        }

        for (int i = 0; i < 1000; i++){
            podPAH.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();

        lover.exibeInfos();
        preferidas.inclui(lover);

        System.out.println("""
                           
                           """);

        podPAH.exibeInfos();
        preferidas.inclui(podPAH);

    }
}
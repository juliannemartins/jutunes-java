package br.com.jutunes.modelos;

public class Audio {

    private String titulo;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    //só posso deixar mexer no nome
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /*----------------------------------*/

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    /*----------------------------------*/
    //se acionado incementa as curtidas
    public void curte(){
        this.curtidas++;
    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }

    /*----------------------------------*/

    //metodo para exiber informacoes
    public void exibeInfos(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Total De Reproducoes: " + getTotalDeReproducoes());
        System.out.println("Curtidas: " + getCurtidas());
    }


}

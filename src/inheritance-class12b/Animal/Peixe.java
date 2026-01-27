package Animal;

public class Peixe extends Animal{

    protected String corEscama;

    public Peixe(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    public void soltarBolha(){
        System.out.println("Pop, pop...");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {

        System.out.println("Nadando");

    }

    @Override
    public void alimentar() {

        System.out.println("Comendo substâncias");

    }

    @Override
    public void emitirSom() {

        System.out.println("Peixe não faz som");

    }
}

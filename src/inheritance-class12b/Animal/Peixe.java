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

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void emitirSom() {

    }
}

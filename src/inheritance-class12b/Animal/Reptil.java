package Animal;

public class Reptil extends Animal{

    protected String corEscama;

    public Reptil(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
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

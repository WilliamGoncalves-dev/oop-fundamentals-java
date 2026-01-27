package Animal;

public class Mamifero extends Animal{


    public Mamifero(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    private String corPelo;

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


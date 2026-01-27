package Animal;

public class Ave extends Animal{

    protected String corPena;

    public Ave(double peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    public void fazerNinho(){

    }

    @Override
    public void locomover() {

        System.out.println("Voando");

    }

    @Override
    public void alimentar() {

        System.out.println("Comendo frutas");

    }

    @Override
    public void emitirSom() {

        System.out.println("Som de ave");

    }
}

package Animal;

public abstract class Animal {

    protected double peso;
    protected int idade;
    protected int membros;

    public Animal(double peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

}

package Animal.Mamiferos;

import Animal.Mamifero;

public class Canguru extends Mamifero {

    public Canguru(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    @Override
    public void locomover() {
        System.out.println("Pulando");
    }

    @Override
    public void alimentar() {
        super.alimentar();
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
    }

    public void usarBolsa(){
        System.out.println("Ele agora está usando a bolsa");
    }

}

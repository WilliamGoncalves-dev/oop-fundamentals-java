import Animal.Ave;
import Animal.Mamifero;
import Animal.Mamiferos.Cachorro;
import Animal.Mamiferos.Canguru;
import Animal.Peixe;
import Animal.Repteis.Tartaruga;


public class Main {
    public static void main(String[] args) {

        Canguru c1 = new Canguru(45,4,4,"Marrom");
        Tartaruga t1 = new Tartaruga(180,110,4,"Verde");
        Cachorro beethoven = new Cachorro(25,10,4,"Preto");

        c1.usarBolsa();
        c1.locomover();
        t1.locomover();
        beethoven.emitirSom();
        beethoven.reagir("Olá");

    }
}

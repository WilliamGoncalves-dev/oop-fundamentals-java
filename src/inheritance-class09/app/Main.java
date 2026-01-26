package app;

import model.Book;
import model.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Book[] l = new Book[3];

        p[0] = new Pessoa("William",24, 'M');
        p[1] = new Pessoa("Giovanna",29, 'F');

        l[0] = new Book("1984","G. Orwell",180,p[0]);
        l[1] = new Book("A revolução dos bichos","G. Orwell",130,p[1]);
        l[2] = new Book("O mal estar na civilização","Sigman Freud",90,p[1]);


        l[0].abrir();
        l[0].folhear();
        l[0].detalhes();

        l[2].abrir();
        l[2].folhear();
        l[2].detalhes();
        l[2].fechar();
        l[2].detalhes();


    }
}

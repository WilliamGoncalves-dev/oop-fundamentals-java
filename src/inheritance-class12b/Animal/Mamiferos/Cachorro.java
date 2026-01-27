package Animal.Mamiferos;

import Animal.Mamifero;

public class Cachorro extends Mamifero {

    public Cachorro(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    public void enterrarOsso(){
        System.out.println("O cachorro está enterrando o osso");
    }

    public void abanarRabo(){
        System.out.println("O cachorro está abanando o rabo");
    }

    public void reagir (String frase){
        if(frase.equals("Toma comida") || frase.equals("Olá")){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }

    }

    public void reagir (int hora, int minuto ){
        if(hora < 12){
            System.out.println("Abanar");
        }else if (hora >=18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e latir");
        }

    }

    public void reagir (boolean dono){
        if(dono){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }

    }

    public void reagir(int idade, double peso){
        if(idade<5){
            if (peso <10) {
                System.out.println("Abanar");
            }else{
                System.out.println("Latir");
            }
        }else if (peso<10){
            System.out.println("Rosnar");
        }else{
            System.out.println("Ignorado");
        }

    }

    @Override
    public void emitirSom() {
        System.out.println("Who let the dogs out ? Who, WHO");
    }
}


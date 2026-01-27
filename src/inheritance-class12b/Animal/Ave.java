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
        
    }

    @Override
    public void alimentar() {

    }

    @Override
    public void emitirSom() {

    }
}

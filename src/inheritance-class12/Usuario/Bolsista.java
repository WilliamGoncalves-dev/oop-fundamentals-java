package Usuario;

public class Bolsista extends Aluno{

    private int bolsa;

    public Bolsista(String nome, int idade, char sexo, String curso, boolean matricula, int numMatricula, int bolsa) {
        super(nome, idade, sexo, curso, matricula, numMatricula);
        this.bolsa = bolsa;
    }

    public void RenovarBolsa(){

        System.out.println("Renovando a bolsa de " + this.getNome());

    }

    @Override
    public void pagarMensal() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");
    }
}

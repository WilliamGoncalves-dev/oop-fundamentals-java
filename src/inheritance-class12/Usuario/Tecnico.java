package Usuario;

public class Tecnico extends Aluno{


    private int regProfissional;

    public Tecnico(String nome, int idade, char sexo, String curso, boolean matricula, int numMatricula, int regProfissional) {
        super(nome, idade, sexo, curso, matricula, numMatricula);
        this.regProfissional = regProfissional;
    }

    public void praticar () {
        System.out.println("O aluno " + this.getNome() + " está praticando");
    }

    public int getRegProfissional() {
        return regProfissional;
    }

    public void setRegProfissional(int regProfissional) {
        this.regProfissional = regProfissional;
    }
}

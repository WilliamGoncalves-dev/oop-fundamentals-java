public class Aluno extends Usuario {

    private String curso;
    private boolean matricula;
    private int numMatricula;

    public Aluno(String nome, int idade, char sexo, String curso, boolean matricula, int numMatricula) {
        super(nome, idade, sexo);
        this.curso = curso;
        this.matricula = matricula;
        this.numMatricula = numMatricula;
    }

    public void pagarMensal (){

        System.out.println("Pagando mensalidade do aluno " + this.getNome());

    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public void cancelarMat() {
        this.matricula = false;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public String detalhar() {

        String statusMatricula;

        if (matricula) {
            statusMatricula = "\nE a matrícula está ativa";
        } else {
            statusMatricula = "\nE a matrícula não está ativa";
        }

        return super.detalhar()
                + "\nDo curso de " + getCurso()
                + statusMatricula;
    }
}


package domain.instituicao;

public class Instituicoes {

    private int codBanco;

    public Instituicoes(int codBanco) {
        setCodBanco(codBanco);
    }

    public int getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(int codBanco) {
        if(codBanco < 100 || codBanco > 999){
            throw new IllegalArgumentException("Código do banco inválido");
        } this.codBanco = codBanco;
    }
}

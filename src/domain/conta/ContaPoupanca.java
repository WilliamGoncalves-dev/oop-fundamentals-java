package domain.conta;

import domain.instituicao.Instituicoes;
import domain.usuario.Usuario;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(Instituicoes codBanco, int numConta, Usuario titular, int digVerificador) {
        super(codBanco, numConta, titular, digVerificador);
    }

    @Override
    public void pagarMensalidade() {
        super.pagarMensalidade();
    }

    @Override
    protected double getSaldoInicial() {
        return 50;
    }
}

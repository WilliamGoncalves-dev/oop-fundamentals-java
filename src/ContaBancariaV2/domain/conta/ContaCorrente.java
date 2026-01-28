package domain.conta;

import domain.instituicao.Instituicoes;
import domain.usuario.Usuario;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(Instituicoes codBanco, int numConta, Usuario titular, int digVerificador) {
        super(codBanco, numConta, titular, digVerificador);
    }

    @Override
    public void pagarMensalidade() {
        double valor = 12;

        if (isStatus() && getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("DÉBITO - PACOTE DE TARIFAS 001 / CONTA CORRENTE");
        } else {
            System.out.println("IMPOSSÍVEL DEBITAR A MENSALIDADE DA CONTA");
        }
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Ela é uma Conta Corrente");
        System.out.println("Saldo atual: " + getSaldo());
    }

    @Override
    public void exibirSaldo() {
        System.out.println("O saldo atual da conta é de: " + getSaldo());
    }

    @Override
    protected double getSaldoInicial() {
        return 20;
    }
}

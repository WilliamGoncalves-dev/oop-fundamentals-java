package domain.conta;

import domain.contract.Exibivel;
import domain.instituicao.Instituicoes;
import domain.usuario.Usuario;

import java.time.LocalDate;

public abstract class ContaBancaria implements Exibivel {

    public ContaBancaria(Instituicoes codBanco, int numConta, Usuario titular, int digVerificador) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = getSaldoInicial();
        this.status = true;
        this.dataAberturaConta = LocalDate.now();
        this.digVerificador = digVerificador;
        this.codBanco = codBanco;
    }

    protected abstract double getSaldoInicial();

    protected int numConta;
    protected int digVerificador;
    protected boolean status;
    protected double saldo;
    protected LocalDate dataAberturaConta;
    protected Usuario titular;
    protected Instituicoes codBanco;

    public void depositar(double valor){
        if(isStatus()){
            this.saldo += valor;
            System.out.println("Depósito de " + valor + "R$" + " para a conta " + getNumConta());
        }else{
            System.out.println("Erro, a conta está encerrada ou não permite depósitos");
        }
    }

    public void sacar(double valor) {
        if (isStatus()) {
            if (getSaldo() > 0 && valor <= getSaldo()) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.titular.getNome());
            }
            else{
                System.out.println("SALDO INSUFICIENTE");
            }
        } else {
            System.out.println("A CONTA NÃO ESTÁ ATIVA");
        }
    }

    public void fecharConta() {

        if (saldo > 0){
            System.out.println("CONTA CONTÉM SALDO, NÃO PODE SER ENCERRADA");
        }else if (saldo < 0){
            System.out.println("CONTA COM DÉBITO NÃO PODE SER ENCERRADA");
        }
        else{
            status = false;
            System.out.println("Conta fechada com sucesso");
        }

    }

    @Override
    public void exibirDetalhes() {
        System.out.println("O número da conta é: " + getNumConta());
        System.out.println("Vinculada ao banco: " + codBanco.getCodBanco());
        System.out.println("Pertence ao titular: " + titular.getNome());
    }

    @Override
    public void exibirSaldo() {

    }

    public void pagarMensalidade() {
        System.out.println("Esta conta não possui tarifa mensal.");
    }


    public LocalDate getDataAberturaConta() {
        return dataAberturaConta;
    }

    public void setDataAberturaConta(LocalDate dataAberturaConta) {
        this.dataAberturaConta = dataAberturaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getDigVerificador() {
        return digVerificador;
    }

    public void setDigVerificador(int digVerificador) {
        this.digVerificador = digVerificador;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

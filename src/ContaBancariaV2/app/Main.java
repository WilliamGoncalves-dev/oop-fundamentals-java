package app;

import domain.conta.ContaCorrente;
import domain.conta.ContaPoupanca;
import domain.instituicao.Instituicoes;
import domain.usuario.Usuario;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // ===== 1. Criando usuários =====
        Usuario u1 = new Usuario(
                "William",
                "123.456.789-11",
                LocalDate.of(1998, 12, 15)
        );

        Usuario u2 = new Usuario(
                "Ana",
                "987.654.321-00",
                LocalDate.of(2000, 5, 20)
        );

        // ===== 2. Criando instituição =====
        Instituicoes banco = new Instituicoes(123);

        // ===== 3. Criando contas =====
        ContaCorrente cc1 = new ContaCorrente(banco, 70958, u1, 0);
        ContaPoupanca cp1 = new ContaPoupanca(banco, 88801, u2, 1);

        // ===== 4. Exibindo dados iniciais =====
        System.out.println("\n--- DADOS INICIAIS ---");
        cc1.exibirDetalhes();
        System.out.println("Saldo inicial CC: R$ " + cc1.getSaldo());

        cp1.exibirDetalhes();
        System.out.println("Saldo inicial CP: R$ " + cp1.getSaldo());

        // ===== 5. Depósitos =====
        System.out.println("\n--- DEPÓSITOS ---");
        cc1.depositar(500);
        cp1.depositar(300);

        System.out.println("Saldo CC após depósito: R$ " + cc1.getSaldo());
        System.out.println("Saldo CP após depósito: R$ " + cp1.getSaldo());

        // ===== 6. Saques =====
        System.out.println("\n--- SAQUES ---");
        cc1.sacar(200);
        cp1.sacar(100);

        System.out.println("Saldo CC após saque: R$ " + cc1.getSaldo());
        System.out.println("Saldo CP após saque: R$ " + cp1.getSaldo());

        // ===== 7. Tentativa de saque inválido =====
        System.out.println("\n--- SAQUE INVÁLIDO ---");
        cp1.sacar(1000); // saldo insuficiente

        // ===== 8. Pagamento de mensalidade =====
        System.out.println("\n--- PAGAMENTO DE MENSALIDADE ---");
        cc1.pagarMensalidade(); // deve debitar
        cp1.pagarMensalidade(); // deve exibir mensagem padrão

        System.out.println("Saldo CC após mensalidade: R$ " + cc1.getSaldo());
        System.out.println("Saldo CP após tentativa de mensalidade: R$ " + cp1.getSaldo());

        // ===== 9. Tentativa de fechar conta com saldo =====
        System.out.println("\n--- FECHAMENTO DE CONTA (COM SALDO) ---");
        cc1.fecharConta();

        // ===== 10. Zerando saldo e fechando conta =====
        System.out.println("\n--- ZERANDO SALDO E FECHANDO ---");
        cc1.sacar(cc1.getSaldo());
        cc1.fecharConta();

        // ===== 11. Tentativa de operar conta encerrada =====
        System.out.println("\n--- OPERAÇÃO EM CONTA ENCERRADA ---");
        cc1.depositar(100);
        cc1.sacar(50);
    }
}

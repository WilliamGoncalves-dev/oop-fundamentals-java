package domain.usuario;

import java.time.LocalDate;

public class Usuario {

        private String nome;
        private String cpf;
        private LocalDate dataNascimento;

        public Usuario(String nome, String cpf, LocalDate dataNascimento) {
            this.nome = nome;
            this.cpf = cpf;
            this.dataNascimento = dataNascimento;
        }

        public String getNome() {
            return nome;
        }
    }

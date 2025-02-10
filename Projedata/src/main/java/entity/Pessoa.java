package entity;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dtNascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, LocalDate dtNascimento) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
}

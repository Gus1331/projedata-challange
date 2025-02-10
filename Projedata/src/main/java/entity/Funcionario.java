package entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;

    public Funcionario() {
    }

    public Funcionario(String nome, LocalDate dtNascimento, BigDecimal salario, String funcao) {
        super(nome, dtNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return """ 
                Nome: %s | Nascimento: %d/%d/%d | Salário: %s | Função: %s""".formatted(
                this.getNome(),
                this.getDtNascimento().getDayOfMonth(),
                this.getDtNascimento().getMonthValue(),
                this.getDtNascimento().getYear(),
                String.format(Locale.GERMANY, "%,.2f", this.getSalario()),
                this.getFuncao()
        );
    }
}

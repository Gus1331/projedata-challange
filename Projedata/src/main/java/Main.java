import entity.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //3.1
        List<Funcionario> funcionarios = new ArrayList<>(
                List.of(
                        new Funcionario("Maria", LocalDate.of(2000, 10, 18), BigDecimal.valueOf(2009.44), "Operador"),
                        new Funcionario("João", LocalDate.of(1990, 5, 12), BigDecimal.valueOf(2284.38), "Operador"),
                        new Funcionario("Caio", LocalDate.of(1961, 5, 2), BigDecimal.valueOf(9836.14), "Coordenador"),
                        new Funcionario("Miguel", LocalDate.of(1988, 10, 14), BigDecimal.valueOf(19119.88), "Diretor"),
                        new Funcionario("Alice", LocalDate.of(1995, 1, 5), BigDecimal.valueOf(2234.68), "Recepcionista"),
                        new Funcionario("Heitor", LocalDate.of(1999, 11, 05), BigDecimal.valueOf(1582.72), "Operador"),
                        new Funcionario("Arthur", LocalDate.of(1993, 3, 31), BigDecimal.valueOf(4071.84), "Contador"),
                        new Funcionario("Laura", LocalDate.of(1994, 7, 8), BigDecimal.valueOf(3017.45), "Gerente"),
                        new Funcionario("Heloisa", LocalDate.of(2003, 5, 24), BigDecimal.valueOf(01606.85), "Eletricista"),
                        new Funcionario("Helena", LocalDate.of(1996, 9, 2), BigDecimal.valueOf(2799.93), "Gerente")
                ));

        //3.2
        funcionarios.remove(funcionarios.stream().filter(funcionario -> funcionario.getNome().equals("João")).toList().get(0));

        //3.3 aqui decidi optar por um laço de repetição construindo a string a ser exibida ao invés de usar a lógica feita em toString() de funcionário
//        for (Funcionario f : funcionarios) {
//            System.out.printf(
//                    """
//                            Nome: %s | Nascimento: %d/%d/%d | Salário: %s | Função: %s
//                             """,
//                    f.getNome(),
//                    f.getDtNascimento().getDayOfMonth(),
//                    f.getDtNascimento().getMonthValue(),
//                    f.getDtNascimento().getYear(),
//                    String.format(Locale.GERMANY, "%,.2f", f.getSalario()),
//                    f.getFuncao()
//            );
//        }

        //3.4
        for (Funcionario f : funcionarios) {
            f.setSalario(BigDecimal.valueOf(f.getSalario().doubleValue() * 1.1));
        }

        //3.5
        Map<String, List<Funcionario>> funcionarioMap = funcionarios.stream().collect(Collectors.groupingBy(Funcionario::getFuncao));

        //3.6
        funcionarioMap.values().forEach(
                listaFuncionarios -> {
                    //listaFuncionarios.forEach(funcionario -> System.out.println(funcionario.toString()));
                }
        );

        //3.8
        funcionarios.stream().filter(funcionario -> funcionario.getDtNascimento().getMonthValue() >= 10).forEach(System.out::println);

        //3.9
        System.out.println(funcionarios.stream().min(Comparator.comparing(Funcionario::getDtNascimento)));

        //3.10
        funcionarios.stream().sorted(Comparator.comparing(Funcionario::getNome)).forEach(System.out::println);

        //3.11
        BigDecimal somaTotalSalarios = BigDecimal.valueOf(0.0);
        for(Funcionario f: funcionarios){
            somaTotalSalarios = BigDecimal.valueOf(somaTotalSalarios.doubleValue() + f.getSalario().doubleValue());
        }
        System.out.println(somaTotalSalarios);

        //3.12
        for(Funcionario f: funcionarios){
            System.out.println("""
                    O funcionário: %s, ganha %.0f salário(s) mínimo(s)""".formatted(
                    f.getNome(), Math.floor(f.getSalario().doubleValue() / 1212.0))
            );
        }
    }
}

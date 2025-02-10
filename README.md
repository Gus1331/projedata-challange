# Projedata

## Desafio Teste Prático - Iniflex

### Case: 
Considerando que uma indústria possui as pessoas/funcionários abaixo:

Diante disso, você deve desenvolver um projeto java, com os seguintes requisitos:

1– Classe Pessoa com os atributos: nome (String) e data nascimento (LocalDate).

2 – Classe Funcionário que estenda a classe Pessoa, com os atributos: salário (BigDecimal) e função (String).

3 – Deve conter uma classe Principal para executar as seguintes ações:
3.1 – Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
3.2 – Remover o funcionário “João” da lista.
3.3 – Imprimir todos os funcionários com todas suas informações, sendo que:
• informação de data deve ser exibido no formato dd/mm/aaaa;
• informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula.
3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
3.6 – Imprimir os funcionários, agrupados por função.
3.8 – Imprimir os funcionários que fazem aniversário no mês 10 e 12.
3.9 – Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
3.10 – Imprimir a lista de funcionários por ordem alfabética.
3.11 – Imprimir o total dos salários dos funcionários.
3.12 – Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.

<img src="/assets/img/tabela.png">

### Saída da aplicação Main:

Todos funcionários:
Nome: Maria | Nascimento: 18/10/2000 | Salário: 2.009,44 | Função: Operador
Nome: Caio | Nascimento: 2/5/1961 | Salário: 9.836,14 | Função: Coordenador
Nome: Miguel | Nascimento: 14/10/1988 | Salário: 19.119,88 | Função: Diretor
Nome: Alice | Nascimento: 5/1/1995 | Salário: 2.234,68 | Função: Recepcionista
Nome: Heitor | Nascimento: 5/11/1999 | Salário: 1.582,72 | Função: Operador
Nome: Arthur | Nascimento: 31/3/1993 | Salário: 4.071,84 | Função: Contador
Nome: Laura | Nascimento: 8/7/1994 | Salário: 3.017,45 | Função: Gerente
Nome: Heloisa | Nascimento: 24/5/2003 | Salário: 1.606,85 | Função: Eletricista
Nome: Helena | Nascimento: 2/9/1996 | Salário: 2.799,93 | Função: Gerente



Funcionários agrupados por função: 
Nome: Maria | Nascimento: 18/10/2000 | Salário: 2.210,38 | Função: Operador
Nome: Heitor | Nascimento: 5/11/1999 | Salário: 1.740,99 | Função: Operador
Nome: Heloisa | Nascimento: 24/5/2003 | Salário: 1.767,54 | Função: Eletricista
Nome: Alice | Nascimento: 5/1/1995 | Salário: 2.458,15 | Função: Recepcionista
Nome: Miguel | Nascimento: 14/10/1988 | Salário: 21.031,87 | Função: Diretor
Nome: Laura | Nascimento: 8/7/1994 | Salário: 3.319,20 | Função: Gerente
Nome: Helena | Nascimento: 2/9/1996 | Salário: 3.079,92 | Função: Gerente
Nome: Caio | Nascimento: 2/5/1961 | Salário: 10.819,75 | Função: Coordenador
Nome: Arthur | Nascimento: 31/3/1993 | Salário: 4.479,02 | Função: Contador



Funcionários que fazem aniversário entre mês 10 e 12
Nome: Maria | Nascimento: 18/10/2000 | Salário: 2.210,38 | Função: Operador
Nome: Miguel | Nascimento: 14/10/1988 | Salário: 21.031,87 | Função: Diretor
Nome: Heitor | Nascimento: 5/11/1999 | Salário: 1.740,99 | Função: Operador



Funcionário mais velho: Nome: Caio | Nascimento: 2/5/1961 | Salário: 10.819,75 | Função: Coordenador



Ordém alfabética: 
Nome: Alice | Nascimento: 5/1/1995 | Salário: 2.458,15 | Função: Recepcionista
Nome: Arthur | Nascimento: 31/3/1993 | Salário: 4.479,02 | Função: Contador
Nome: Caio | Nascimento: 2/5/1961 | Salário: 10.819,75 | Função: Coordenador
Nome: Heitor | Nascimento: 5/11/1999 | Salário: 1.740,99 | Função: Operador
Nome: Helena | Nascimento: 2/9/1996 | Salário: 3.079,92 | Função: Gerente
Nome: Heloisa | Nascimento: 24/5/2003 | Salário: 1.767,54 | Função: Eletricista
Nome: Laura | Nascimento: 8/7/1994 | Salário: 3.319,20 | Função: Gerente
Nome: Maria | Nascimento: 18/10/2000 | Salário: 2.210,38 | Função: Operador
Nome: Miguel | Nascimento: 14/10/1988 | Salário: 21.031,87 | Função: Diretor



Soma total dos salários: 50906,82



O funcionário: Maria, ganha 1 salário(s) mínimo(s)
O funcionário: Caio, ganha 8 salário(s) mínimo(s)
O funcionário: Miguel, ganha 17 salário(s) mínimo(s)
O funcionário: Alice, ganha 2 salário(s) mínimo(s)
O funcionário: Heitor, ganha 1 salário(s) mínimo(s)
O funcionário: Arthur, ganha 3 salário(s) mínimo(s)
O funcionário: Laura, ganha 2 salário(s) mínimo(s)
O funcionário: Heloisa, ganha 1 salário(s) mínimo(s)
O funcionário: Helena, ganha 2 salário(s) mínimo(s)

## Considerações finais

Você pode conferir o projeto neste mesmo repositório ou <a href="https://github.com/Gus1331/projedata-challange">clickando aqui.</a>

Sobre o desenvolvimento, optei por fazer de diferentes formas alternando entre utilizando formas mais eficiêntes ou de maior compreensão.

Fiz uma sobrescrita no toString da classe Pessoa para não ter que rescrever a lógica para impressão nos itens 3.6, 3.8, 3.9

Não tinha muita experiência utilizando BigDecimal para numeros reais então preferi sempre converter para double antes de manusear.

Apartir do item 3.5 não foi especificado o uso do map para a lógica dos itens seguintes então fiz conforme achei melhor.

Espero que tenham gostado do meu desenvolvimento, quaisquer dúvidas me contatem via email: gustavooliver.souza@gmail.com
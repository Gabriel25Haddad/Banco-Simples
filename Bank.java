import java.util.List;
import java.util.ArrayList;

// Classe que representa um banco, responsável por gerenciar contas bancárias
public class Bank {
    private String agencia; // Número da agência do banco
    private List<Account> contas; // Lista de contas cadastradas no banco
    private int lastAccount = 1; // Número sequencial para criação de novas contas
    
    // Construtor que inicializa o banco com uma agência
    public Bank(String agencia){
        this.agencia = agencia;
        this.contas = new ArrayList<>();
    }

    // Retorna a lista de contas do banco
    public List<Account> getContas(){
        return contas;
    }

    // Adiciona uma nova conta à lista de contas do banco
    public void inserirConta(Account conta){
        contas.add(conta);
    }

    // Gera uma nova conta com nome informado e número sequencial
    public Account gerarConta(String nome){
        Account conta = new Account(agencia, "" + lastAccount, nome);
        lastAccount++;
        return conta;
    }

    // Calcula e exibe o saldo total de todas as contas do banco
    public void totalContas(){
        double total = 0;
        for(Account conta : contas){
            double saldo = conta.getSaldo(); // Obtém o saldo da conta
            total += saldo; // Soma ao total
        }
        System.out.println("Banco possui: R$ " + total);//Imprime o total do banco
    }
}

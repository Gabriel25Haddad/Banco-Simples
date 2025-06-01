// Classe principal para testar a aplicação bancária

import java.util.Scanner;
import java.util.List;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para entrada do usuário
        Bank santander = new Bank("0001"); // Cria um banco com agência "0001"
        while (true) { // Loop principal do programa
            System.out.println("O que deseja fazer? C: Criar conta, E: Sair do programa");
            String op = scanner.nextLine(); // Lê a opção do usuário
            if(op.equals("C")){
                System.out.println("Digite o seu nome: ");
                String nome = scanner.nextLine(); // Lê o nome do usuário
                Account conta = santander.gerarConta(nome); // Gera uma nova conta
                santander.inserirConta(conta); // Adiciona a conta ao banco

                operarConta(conta); // Permite operações na conta criada
            }
            else if(op.equals("E")){
                System.out.println("Saiu da conta!"); // Sai do programa
                break;
            }
            else{
                System.out.println("Comando inválido! Tente novamente!"); // Opção inválida
            }
        }
        List<Account> contaList = santander.getContas(); // Obtém todas as contas do banco
        for(Account conta : contaList){
            System.out.println(conta); // Exibe informações de cada conta
        }

        santander.totalContas(); // Exibe o saldo total do banco

        scanner.close(); // Fecha o scanner
    }

    // Método para realizar operações em uma conta específica
    static void operarConta(Account conta){
        Scanner scanner = new Scanner(System.in); // Scanner para entrada do usuário
        while(true){
            System.out.println("O que deseja fazer? D: Deposito, S: Saque, E: Sair da conta");
            String op = scanner.nextLine(); // Lê a opção do usuário

            if(op.equals("D")){
                System.out.println("Qual o valor deseja depositar?");
                double valor = scanner.nextDouble(); // Lê o valor do depósito
                conta.deposito(valor); // Realiza o depósito
            }
            else if(op.equals("S")){
                System.out.println("Qual o valor deseja sacar?");
                double valor = scanner.nextDouble(); // Lê o valor do saque
                if(!conta.sacar(valor)){ // Tenta realizar o saque
                    System.out.println("Ops! Não foi possivel sacar o valor: R$ "+ valor);
                }
            }
            else if(op.equals("E")){
                System.out.println("Saiu da conta!"); // Sai da conta
                break;
            }
            else{
                System.out.println("Comando inválido! Tente novamente!"); // Opção inválida
            }

            scanner = new Scanner(System.in); // Limpa o buffer do scanner
        }
    }
}

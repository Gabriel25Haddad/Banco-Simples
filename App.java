// Classe principal para testar a aplicação bancária
public class App{
    public static void main(String[] args) {
        // Cria uma nova conta
        Account conta = new Account("0001", "1234", "Seu Barriga");
        
        // Realiza depósitos
        conta.deposito(100);
        conta.deposito(50);
        conta.deposito(100);

        // Tenta sacar um valor
        if(!conta.sacar(200)){
            //imprime se o valor for maior que o saldo
            System.out.println("Você não tem saldo suficiente em conta");
        }
       
        // Tenta sacar um valor novamente
        if(!conta.sacar(200)){
            //imprime se o valor for maior que o saldo
            System.out.println("Você não tem saldo suficiente em conta");
        }
        
        // Exibe o estado final da conta
        System.out.println(conta);  
    }
}

public class Account{
    // Declaração de constantes e variáveis
    private static final int MAX_LENGTH=20; // Tamanho máximo do nome
    private String agencia; // Número da agência
    private String conta;   // Número da conta
    private String nome;    // Nome do titular
    private double saldo;   // Saldo da conta
    private Log logger;     // Instância para registrar logs

    // Construtor da classe Account
    public Account(String agencia, String conta, String nome){
        this.agencia = agencia;
        this.conta = conta;
        setNome(nome); // Define o nome com verificação de tamanho
        logger=new Log(); // Inicializa o logger
    }

    // Define o nome do titular e limita o tamanho
    public void setNome(String nome) {
        if(nome.length()> MAX_LENGTH){
            this.nome = nome.substring(0, MAX_LENGTH);
        }
        else{
            this.nome = nome;
        } 
    }

    // Realizar depósito na conta
    public void deposito(double valor){
        saldo += valor;
        logger.out("DEPOSITO - R$ " + valor + " Seu saldo: R$ "+ saldo);
    }

    // Realizar saque, retorna true se for possível, false caso contrário
    public boolean sacar(double valor){
        if(saldo<valor){
            logger.out("SAQUE - R$ " + valor + " Seu saldo atual é de R$ "+ saldo);
            return false;
        }
        else{
            saldo -= valor;
            logger.out("SAQUE - R$ " + valor + " Seu saldo: R$ "+ saldo);
            return true;
        }
    }

    // Retorna uma formatação em String da conta
    @Override
    public String toString() {
        return "A conta " + this.nome + " " + this.agencia + " / " + this.conta + " possui : R$ " + saldo;
    }
}
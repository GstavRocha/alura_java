import java.util.Scanner;
public class Conta {
    Scanner entra = new Scanner(System.in);
    // atributos...
    double saldo;
    int  agencia;
    int numero;
    Cliente titular;
    
    // Métodos pode ser considerado "maneira de fazer algo".
    /*
    double valor = entrada;
    void deposita = saida;

    this é opcional e refere-se a conta qual ele está invocando.
     */
    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }
    /*
    public boolean sacar(double valor){
        System.out.println("Digite o valor do saque ");
        valor = entra.nextDouble();
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            System.out.println("Você não tem saldo "+this.saldo);
            return false;
        }
    
       
    }
     */
    public boolean transferencia(double valorD, Conta destino){
        System.out.println("Digite o valor da Transferência: ");
        valorD = entra.nextDouble();
        entra.close();
        if(this.saldo >= valorD){
            this.saldo -= valorD;
            destino.deposita(valorD);
            System.out.println(this.titular+" realizou uma transferência de "+this.saldo+" para "+destino.titular);
            return true;
        }else{
            System.out.println("Você não tem saldo para realizar esta transferência. ");
            return false;
        }
    }
}

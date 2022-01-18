public class Conta {
    // atributos...
    double saldo;
    int  agencia;
    int numero;
    String titular;
    
    // Métodos pode ser considerado "maneira de fazer algo".
    /*
    double valor = entrada;
    void deposita = saida;

    this é opcional e refere-se a conta qual ele está invocando.
     */
    void deposita(double valor){
        this.saldo = this.saldo + valor;
    }
}

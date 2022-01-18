package ByteBank;

public class CriarConta {
    public static void main(String[] args) {
        ContaAtividade gustavo = new ContaAtividade();
        gustavo.titular = "Luiz Gustavo";
        gustavo.saldo = 1000.0;
        gustavo.numero = 2721;

        System.out.println(gustavo.saldo);
        gustavo.saldo += 200;
        System.out.println(gustavo.titular);
        System.out.println(gustavo.agencia);
        System.out.println(gustavo.numero);
        System.out.println(gustavo.saldo);
        gustavo.saldo -= 500;
        System.out.println(gustavo.saldo);

        
    }
}

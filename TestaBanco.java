
public class TestaBanco {
    public static void main(String[] args) {
        Cliente gustavo = new Cliente();
        gustavo.nome = "Luiz Gustavo";
        gustavo.cpf = "000.000.000-00";
        gustavo.profissao = "programador";

        Conta gustavoConta = new Conta();
        gustavoConta.deposita(1000);

        //associa a conta a conta cliente gustavo;
        gustavoConta.titular = new Cliente();
        gustavoConta.titular.nome =" Gustavo teste";

        System.out.println(gustavoConta.titular.nome);
        //System.out.println(gustavoConta.saldo);

        
    }
}

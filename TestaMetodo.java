public class TestaMetodo {
    public static void main(String[] args){
        Conta contaTeste = new Conta();
        contaTeste.saldo = 100;
        contaTeste.deposita(300);

        System.out.println(contaTeste.saldo);

    } 
        
    
}

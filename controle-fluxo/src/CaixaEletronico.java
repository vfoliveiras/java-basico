public class CaixaEletronico {
    public static void main(String[] args) {
       double saldo = 25;
       double valorSolicitado = 7.75;

       if(valorSolicitado < saldo){

            saldo = saldo - valorSolicitado;
            System.out.println("Novo Saldo: " + saldo);
       }
       else
            System.out.println("Saldo Insuficiente.");
    }
}

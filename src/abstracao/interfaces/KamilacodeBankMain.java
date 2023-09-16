package abstracao.interfaces;

public class KamilacodeBankMain {

    public static void main(String[] args) {

        System.out.println("Seja bem vinde ao kamilacode bank");
        ContaCorrente ccKamila = new ContaCorrente();
        ccKamila.consultarSaldo();
        ccKamila.fazerPix();


        ContaPoupanca cpKamila = new ContaPoupanca();
        cpKamila.consultarSaldo();
        cpKamila.fazerPix();

    }
}

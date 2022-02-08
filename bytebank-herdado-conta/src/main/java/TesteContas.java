public class TesteContas {
    public static void main(String[] args) {


        ContaCorrente contaCorrente = new ContaCorrente(111, 111);
        contaCorrente.deposita(100.0);

        ContaPoulpanca contaPoulpanca = new ContaPoulpanca(222, 222);
        contaPoulpanca.deposita(200.0);

        contaCorrente.transfere(10.0, contaPoulpanca);

        System.out.println("Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Conta Poulpanca: " + contaPoulpanca.getSaldo());

    }
}

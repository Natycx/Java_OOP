public class ContaPoulpanca extends Conta{

    public ContaPoulpanca(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo +=  valor;
    }


}

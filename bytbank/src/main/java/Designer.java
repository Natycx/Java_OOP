// Gerente é um Funcionario, Gerente herda da Classe Funcionario
public  class Designer extends Funcionario{

    public double getBonificacao(){
        System.out.println("Chamando metodo de bonificação do Designer");
        return 200;
    }

}

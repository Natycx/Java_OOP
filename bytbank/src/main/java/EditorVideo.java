// EditorVideo é um Funcionario, Gerente herda da Classe Funcionario
public class EditorVideo extends Funcionario{


    public double getBonificacao(){
        System.out.println("chamando o método de bonificação do Editor de Video");
        return 150;
    }

}

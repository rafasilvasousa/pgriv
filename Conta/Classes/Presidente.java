package classes;

public class Presidente extends Funcionario{
    @Override
    public double getBonificacao(){
        return mSalario * 0.25;
    }

}
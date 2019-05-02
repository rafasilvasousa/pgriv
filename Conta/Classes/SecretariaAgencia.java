package classes;

public class SecretariaAgencia extends Secretaria{
    @Override
    public double getBonificacao(){
        return mSalario * 0.15;
    }

}
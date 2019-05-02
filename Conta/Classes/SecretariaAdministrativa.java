package classes;

public class SecretariaAdministrativa extends Secretaria{
    @Override
    public double getBonificacao(){
        return mSalario * 0.15;
    }

}
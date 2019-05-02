package classes;

public class ContaSalario extends Conta implements Tributavel{
    
    public double getValorImposto(){
		return mSaldo*0.0075;
    }

}

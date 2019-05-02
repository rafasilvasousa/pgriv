package classes;


public class ContaCorrente extends Conta implements Tributavel{
    
    public double getValorImposto(){
		return mSaldo*0.01;
    }

}

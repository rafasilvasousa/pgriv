package Classes;
public class Conta{
    private int    mNumConta;
    private String mNome;
    private double mSaldo;
    private double mLimite;

    private char   mTipo;
    private long   mSenha;
    private String mDataCriacao;
    
    private static int totalContasC=0;
    private static int totalContasP=0;
    private static int totalContasS=0;

    public Conta(String nome,double saldo){
        mNome = nome;
        mSaldo = saldo;

        mSenha = 12345678;
        mLimite = 200;

        mTipo = 'c';
        
        totalContasC++;
        
    }


    
    public int getmNunConta() {
    	return mNumConta;
    }
    public void setgetmNunConta(int numConta) {
    	mNumConta= numConta;
    }
    
    public String getmNome() {
		return mNome;
    }
    public void setmNome(String nome) {
		mNome = nome;
    }

    public void setSaldo(double saldo){
        mSaldo = saldo;
    }

    public double getSaldo(){
        return mSaldo;
    }
         
    public double getmLimite() {
    	return mLimite;
    }
    public void setmLimite(double limite) {
    	mLimite = limite;
    }
    
    public void getmTipo() {
		switch(mTipo){
			case 'c':
				System.out.println("Conta Corrente");	
				break;
			case 'p':
				System.out.println("Conta Poupança");			
				break;
			case 's':
				System.out.println("Conta Salário");			
				break;
			default:
				System.out.println("Conta Indefinida");				
				break;
		}

    }
    public void setmTipo (char tipo) {
		switch(mTipo){
			case 'c':
				totalContasC--;
				break;
			case 'p':
				totalContasP--;
				break;
			case 's':
				totalContasS--;
				break;
		}
		switch(tipo){
			case 'c':
				totalContasC++;
				break;
			case 'p':
				totalContasP++;
				break;
			case 's':
				totalContasS++;
				break;
		}		
    	mTipo = tipo;    	
    }

    public void setSenha(long senha){
        mSenha = senha;
    }

    public long getSenha(){
        return mSenha;
    }    
    
    public String getmDataCriacao() {
    	return mDataCriacao;
    }
    public void setmDataCriacao(String data) {
    	mDataCriacao = data;
    }
                             
 	public static int getTotalContasC(){
		return totalContasC;
 	} 
 	
 	public static int getTotalContasP(){
		return totalContasP;
 	} 
 	public static int getTotalContasS(){
		return totalContasS;
 	}  	 	
}

package Classes;
public class Conta{
    private int    mNumConta;
    private String mNome;
    private double mSaldo;
    private double mLimite;

    private char   mTipo;
    private long   mSenha;
    private String mDataCriacao;

    public Conta(String nome,double saldo){
        mNome = nome;
        mSaldo = saldo;

        mSenha = 12345678;
        mLimite = 200;

        mTipo = 'c';
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
    
    public char getmTipo() {
    	return mTipo;
    }
    public void set (char tipo) {
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
                             
  
}

package classes;

public class Conta{
    protected int    mNumConta;
    protected String mNome;
    protected double mSaldo;
    protected double mLimite;

    protected char   mTipo;
    protected long   mSenha;
    protected String mDataCriacao;

    private static int totalContas = 0;
    private static int totalContasCorrente = 0;
    private static int totalContasPoupanca = 0;
    private static int totalContasSalario = 0;

    public Conta(String nome,double saldo){
        mNome = nome;
        mSaldo = saldo;

        mSenha = 12345678;
        mLimite = 200;

        mTipo = 'c';
     
    }

    public void setSenha(long senha){
        mSenha = senha;
    }

    public long getSenha(){
        return mSenha;
    }


    public void setSaldo(double saldo){
        mSaldo = saldo;
    }

    public double getSaldo(){
        return mSaldo;
    }

    public int getNumConta(){
        return mNumConta;
    }
    public void setNumConta(int num){
        mNumConta = num;
    }

    public String getNome(){
        return mNome;
    }
    public void setNome(String nome){
        mNome = nome;
    }

    
    public double getLimite(){
        return mLimite;
    }
    public void setLimite(double limite){
        mLimite = limite;
    }

    public void setTipo(char tipo){
        switch(mTipo){
            case 'c':
                totalContasCorrente--;
                break;
            case 'p':
                totalContasPoupanca--;
                break;
            case 's':
                totalContasSalario--;
                break;
            default:
                break;

        }


        mTipo = tipo;

        switch(mTipo){
            case 'c':
                totalContasCorrente++;
                break;
            case 'p':
                totalContasPoupanca++;
                break;
            case 's':
                totalContasSalario++;
                break;
            default:
                break;

        }


    }
    public char getTipo(){
        return mTipo;
    }

    public String getDataCriacao(){
        return mDataCriacao;
    }
    public void setDataCriacao(String datac){
        mDataCriacao = datac;
    }
    
    public void getTipoConta(){
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
                System.out.println("Tipo de Conta Indefinida");

        }

    }

    public static String getTipoContaEstatico(char tipo){
        switch(tipo){
            case 'c':
                return "Conta Corrente";
            case 'p':
                return "Conta Poupança";
            case 's':
                return "Conta Salário";
            default:
                return "Tipo de Conta Indefinida";

        }

    }

    public static int getTotalContas(){
        return totalContas;
    }

    public static int getTotalContasCorrente(){
        return totalContasCorrente;
    }

    public static int getTotalContasPoupanca(){
        return totalContasPoupanca;
    }

    public static int getTotalContasSalario(){
        return totalContasSalario;
    }

    
  
}

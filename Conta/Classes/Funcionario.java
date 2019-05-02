package classes;

public abstract class Funcionario{
    protected String mNome;
    protected String mCPF;
    protected double mSalario;
   
    public abstract double getBonificacao();
}
package Classes;
public class Funcionario{
	protected String mNome;
	protected String mCpf;
	protected double mSalario;
	
	public String getmNome(){
		return mNome;
	}
	public void setmNome(String nome){
		mNome=nome;
	}
	public String getmCpf(){
		return mCpf;
	}
	public void setmCpf(String cpf){
		mCpf=cpf;
	}

	public double getmSalario(){
		return mSalario;
	}
	public void setmSalario(double salario){
		mSalario=salario;
	}
	
	public double getBonificacao(){
		return mSalario*0.1;
	}	
}

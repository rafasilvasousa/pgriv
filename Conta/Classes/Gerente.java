package Classes;
public class Gerente extends Funcionario{
	private int mSenha;
	static int mNumeroDeFuncionariosGerenciados;
	
	public int getmSenha(){
		return mSenha;
	}
	
	public String getmNome(){
		return mNome;
	}	
	
	public void setmSenha(int senha){
		mSenha = senha;
	}
	
	public static void setmNumeroDeFuncinariosGerenciados(int func){
		mNumeroDeFuncionariosGerenciados=func;
	}
	
	@Override
	public double getBonificacao(){
		return mSalario*0.15;
	}
	
	
}

package classes;

import interfaces.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel{
    private String mSenha;
    private static int numeroDeFuncionariosGerenciados;

    public Gerente(){
        mSenha = "123456";
        System.out.println("CPF: "+mCPF);
        System.out.println("Senha: "+mSenha);

    }

    public boolean autentica(){
        return true;
    }

    public String getNome(){
        return mNome;
    }

    @Override
    public double getBonificacao(){
        return mSalario * 0.15;
    }

}
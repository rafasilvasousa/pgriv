import classes.Conta;
import classes.Gerente;
import classes.Funcionario;
import classes.SecretariaAgencia;
import classes.SecretariaAdministrativa;
import classes.Diretor;
import classes.Gerente;
import classes.Secretaria;
import interfaces.Autenticavel;

public class Manipulador{
    public static void main (String arg []){
        Autenticavel c = new Gerente();
        System.out.println("Autenticou? "+c.autentica());

        // Conta conta = new Conta("Carlos",2300);
        // Conta c1 = new Conta("José",500);
        // Conta c2 = new Conta("Maria",2);
        // conta.setNome("Carlos Antoin");
        // conta.setSaldo(300);
        // System.out.println("Dados da Conta conta");
        // System.out.println("Nome da Conta: "+conta.getNome());
        // System.out.println("Limite: "+conta.getLimite());
        // System.out.println("Saldo: "+conta.getSaldo());
        // conta.getTipoConta();

        // System.out.println("-------------------");


        // System.out.println("\nDados da Conta C1");
        // System.out.println("Nome da Conta: "+c1.getNome());
        // System.out.println("Limite: "+c1.getLimite());
        // System.out.println("-------------------");
        // c1.setTipo('p');


        // System.out.println("\nDados da Conta C2");
        // System.out.println("Nome da Conta: "+c2.getNome());
        // System.out.println("Limite: "+c2.getLimite());

        // System.out.println("-------------------");
        // System.out.println(Conta.getTipoContaEstatico('s'));
        // System.out.println("Total de Contas: "+Conta.getTotalContas());
        // System.out.println("Total de Contas Correntes: "+Conta.getTotalContasCorrente());
        // System.out.println("Total de Contas Poupança: "+c1.getTotalContasPoupanca());
        // System.out.println("Total de Contas Salário: "+Conta.getTotalContasSalario());



        
    }

}
import Classes.Conta;
class Manipulator{
	    public static void main (String[] args){
		    Conta conta = new Conta("Carlos",2300);
		    Conta c1 = new Conta("José",500);
		    Conta c2 = new Conta("Maria",2);

		    conta.setSaldo(300);
		    System.out.println("Dados da Conta conta");
		    System.out.println("Nome da Conta: "+conta.getmNome());
		    System.out.println("Limite: "+conta.getmLimite());
		    System.out.println("Saldo: "+conta.getSaldo());
			System.out.print("Tipo: ");
		    conta.getmTipo();


		    System.out.println("-------------------");


		    System.out.println("\nDados da Conta C1");
		    System.out.println("Nome da Conta: "+c1.getmNome());
		    System.out.println("Limite: "+c1.getmLimite());
   			System.out.print("Tipo: ");
		    c1.getmTipo();
		    System.out.println("-------------------");


		    System.out.println("\nDados da Conta C2");
		    System.out.println("Nome da Conta: "+c2.getmNome());
		    System.out.println("Limite: "+c2.getmLimite());
			System.out.print("Tipo: ");
		    c2.getmTipo();

		    System.out.println("Numero de contas Corrente: "+Conta.getTotalContasC());
		    System.out.println("Numero de contas Poupança: "+Conta.getTotalContasP());
		    System.out.println("Numero de contas Salário: "+Conta.getTotalContasS());
		    
		    c1.setmTipo('p');
		    c2.setmTipo('s');		    		    
		    
		    System.out.println("Atualizando.");
		    System.out.println("Atualizando..");
		    System.out.println("Atualizando...");		    		    
		    System.out.println("Numero de contas Corrente: "+Conta.getTotalContasC());
		    System.out.println("Numero de contas Poupança: "+Conta.getTotalContasP());
		    System.out.println("Numero de contas Salário: "+Conta.getTotalContasS());		    
    }
}
